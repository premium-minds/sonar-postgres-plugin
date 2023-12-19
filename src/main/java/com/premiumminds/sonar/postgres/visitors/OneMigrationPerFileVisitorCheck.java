package com.premiumminds.sonar.postgres.visitors;

import java.util.List;

import com.premiumminds.sonar.postgres.PostgreSqlFile;
import com.premiumminds.sonar.postgres.protobuf.AlterTableStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateStmt;
import com.premiumminds.sonar.postgres.protobuf.DoStmt;
import com.premiumminds.sonar.postgres.protobuf.DropStmt;
import com.premiumminds.sonar.postgres.protobuf.IndexStmt;
import com.premiumminds.sonar.postgres.protobuf.RawStmt;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ONE_MIGRATION_PER_FILE;

@Rule(key = "one-migration-per-file")
public class OneMigrationPerFileVisitorCheck extends AbstractVisitorCheck {

    private int createIndexCounter = 0;
    private int createStmtCounter = 0;
    private int alterTableStmtCounter = 0;
    private int dropStmtCounter = 0;
    private int doStmtCounter = 0;

    @Override
    public void visit(CreateStmt createStmt) {
        super.visit(createStmt);
        createStmtCounter++;
    }

    @Override
    public void visit(final AlterTableStmt alterTableStmt) {
        super.visit(alterTableStmt);
        alterTableStmtCounter++;
    }

    @Override
    public void visit(DropStmt dropStmt) {
        super.visit(dropStmt);
        dropStmtCounter++;
    }

    @Override
    public void visit(final IndexStmt indexStmt) {
        super.visit(indexStmt);
        createIndexCounter++;
    }

    @Override
    public void visit(final DoStmt doStmt) {
        super.visit(doStmt);
        doStmtCounter++;
    }

    @Override
    public void analyze(SensorContext context, PostgreSqlFile file, List<RawStmt> statements) {
        super.analyze(context, file, statements);
        if (createStmtCounter + alterTableStmtCounter + dropStmtCounter + createIndexCounter + doStmtCounter > 1){
            newIssue("Use one migration per file");
        }
    }

    @Override
    protected RuleKey getRule() {
        return RULE_ONE_MIGRATION_PER_FILE;
    }
}
