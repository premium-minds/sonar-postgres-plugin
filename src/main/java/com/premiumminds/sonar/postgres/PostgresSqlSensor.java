package com.premiumminds.sonar.postgres;

import com.google.protobuf.InvalidProtocolBufferException;
import com.premiumminds.sonar.postgres.libpg_query.PGQueryLibrary;
import com.premiumminds.sonar.postgres.libpg_query.PgQueryProtobufParseResult;
import com.premiumminds.sonar.postgres.libpg_query.PgQueryScanResult;
import com.premiumminds.sonar.postgres.protobuf.ParseResult;
import com.premiumminds.sonar.postgres.protobuf.ScanResult;
import com.premiumminds.sonar.postgres.protobuf.Token;
import com.premiumminds.sonar.postgres.visitors.VisitorCheck;
import java.util.regex.Pattern;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.rule.CheckFactory;
import org.sonar.api.batch.rule.Checks;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.REPOSITORY;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_IDENTIFIER_MAX_LENGTH;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ONLY_LOWER_CASE_NAMES;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PARSE_ERROR;

public class PostgresSqlSensor implements Sensor {

    private static final String FAIL_FAST_PROPERTY_NAME = "sonar.internal.analysis.failFast";

    private final CheckFactory checkFactory;

    public PostgresSqlSensor(CheckFactory checkFactory) {
        this.checkFactory = checkFactory;
    }

    private static final Logger LOGGER = Loggers.get(PostgresSqlSensor.class);

    private static final int POSTGRESQL_MAX_IDENTIFIER_LENGTH = 63;

    @Override
    public void describe(SensorDescriptor descriptor) {
        descriptor.name("Postgresql SQL files");
        descriptor.onlyOnLanguage(PostgresSqlLanguage.KEY);
        descriptor.createIssuesForRuleRepositories(REPOSITORY);
    }

    @Override
    public void execute(SensorContext context) {
        FileSystem fs = context.fileSystem();
        Iterable<InputFile> files = fs.inputFiles(fs.predicates().hasLanguage(PostgresSqlLanguage.KEY));
        for (InputFile file : files) {

            if (context.isCancelled()) {
                LOGGER.warn("Analysis cancelled");
            }

            context.<Integer>newMeasure().on(file).withValue(file.lines()).forMetric(CoreMetrics.NCLOC).save();

            try {
                PostgreSqlFile postgreSqlFile = new PostgreSqlFile(file);
                parseContents(context, postgreSqlFile);
                scanContents(context, postgreSqlFile);
            } catch (Exception e) {
                LOGGER.error("problem parsing file: " + file.filename(), e);
                if (context.config().getBoolean(FAIL_FAST_PROPERTY_NAME).orElse(false)) {
                    throw new IllegalStateException("Exception when analyzing " + file, e);
                }
            }
        }
    }

    private void scanContents(SensorContext context, PostgreSqlFile file) throws InvalidProtocolBufferException {
        final PgQueryScanResult.ByValue result = PGQueryLibrary.INSTANCE.pg_query_scan(file.contents());
        if (result.error != null){
            LOGGER.error("problem with file " + file.filename() + " at " + result.error.cursorpos + ": " + result.error.message.getString(0));

            final TextRange textRange = file.convertAbsoluteOffsetToLine(result.error.cursorpos);
            newIssue(context, file, "Failure to scan statement", textRange, RULE_PARSE_ERROR);

            PGQueryLibrary.INSTANCE.pg_query_free_scan_result(result);

            return;
        }
        final ScanResult scanResult = ScanResult.parseFrom(result.pbuf.data.getByteArray(0, result.pbuf.len));

        Pattern pattern = Pattern.compile("[a-z0-9_]+");
        scanResult.getTokensList()
                  .stream()
                  .filter(st -> st.getToken().equals(Token.IDENT))
                  .filter(st -> !pattern.matcher(file.subContents(st.getStart(), st.getEnd())).matches())
                  .forEach(st -> {
                      final String identifier = file.subContents(st.getStart(), st.getEnd());

                      final TextRange textRange = file.convertAbsoluteOffsetsToTextRange(st.getStart(), st.getEnd());
                      final String message = "Identifier '" + identifier + "' is not lower case";
                      newIssue(context,
                               file,
                               message,
                               textRange,
                               RULE_ONLY_LOWER_CASE_NAMES);
                  });

        scanResult.getTokensList()
                .stream()
                .filter(st -> st.getToken().equals(Token.IDENT))
                .filter(st -> file.subContents(st.getStart(), st.getEnd()).length() > POSTGRESQL_MAX_IDENTIFIER_LENGTH)
                .forEach(st -> {
                    final String identifier = file.subContents(st.getStart(), st.getEnd());

                    final TextRange textRange = file.convertAbsoluteOffsetsToTextRange(st.getStart(), st.getEnd());
                    final String message = "Identifier '" +
                            identifier +
                            "' length (" +
                            identifier.length() +
                            ") is bigger than default maximum for Postgresql " +
                            POSTGRESQL_MAX_IDENTIFIER_LENGTH;
                    newIssue(context,
                            file,
                            message,
                            textRange,
                            RULE_IDENTIFIER_MAX_LENGTH);
                });

        PGQueryLibrary.INSTANCE.pg_query_free_scan_result(result);
    }

    private void parseContents(SensorContext context, PostgreSqlFile file) throws InvalidProtocolBufferException {
        final PgQueryProtobufParseResult.ByValue result = PGQueryLibrary.INSTANCE.pg_query_parse_protobuf(file.contents());
        if (result.error != null){
            LOGGER.error("problem with file " + file.filename() + " at " + result.error.cursorpos + ": " + result.error.message.getString(0));

            final TextRange textRange = file.convertAbsoluteOffsetToLine(result.error.cursorpos);
            newIssue(context, file,"Failure to parse statement", textRange, RULE_PARSE_ERROR);

            PGQueryLibrary.INSTANCE.pg_query_free_protobuf_parse_result(result);

            return;
        }

        final ParseResult parseResult = ParseResult.parseFrom(result.parse_tree.data.getByteArray(0, result.parse_tree.len));

        parseTree(context, file, parseResult);

        PGQueryLibrary.INSTANCE.pg_query_free_protobuf_parse_result(result);
    }

    private void newIssue(SensorContext context, PostgreSqlFile file, String message, TextRange textRange, RuleKey rule) {
        NewIssue newIssue = context.newIssue()
                .forRule(rule);
        NewIssueLocation primaryLocation = newIssue.newLocation()
                .on(file.getInputFile())
                .at(textRange)
                .message(message);
        newIssue.at(primaryLocation);
        newIssue.save();
    }

    private void parseTree(SensorContext context, PostgreSqlFile file, ParseResult result) {
        final Checks<VisitorCheck> checks = checkFactory.<VisitorCheck>create(REPOSITORY)
                .addAnnotatedChecks((Iterable<VisitorCheck>) PostgresSqlRulesDefinition.allChecks());

        checks.all().forEach(check -> check.analyze(context, file, result.getStmtsList()));
    }
}
