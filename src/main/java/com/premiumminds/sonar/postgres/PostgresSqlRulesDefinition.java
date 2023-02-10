package com.premiumminds.sonar.postgres;

import java.util.Arrays;
import java.util.List;

import com.premiumminds.sonar.postgres.visitors.AddFieldWithDefaultVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.AddForeignKeyVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.AddingSerialPrimaryKeyfieldvisitorCheck;
import com.premiumminds.sonar.postgres.visitors.BanCharFieldVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.BanDropDatabaseVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.ChangingColumnTypeVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.ClusterVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.ConcurrentVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.ConstraintMissingNotValidVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.DisallowedDoVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.DisallowedUniqueConstraintVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.DropConstraintDropsIndexVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.OneMigrationPerFileVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.OnlySchemaMigrationsVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.PreferIdentityVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.PreferTextFieldVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.RenameColumnVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.RenameTableVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.RobustStatementsVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.SettingNotNullVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.VacuumFullVisitorCheck;
import com.premiumminds.sonar.postgres.visitors.VisitorCheck;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.rule.Severity;
import org.sonar.api.rules.RuleType;
import org.sonar.api.server.rule.RulesDefinition;

public class PostgresSqlRulesDefinition implements RulesDefinition {

    public static final String REPOSITORY = "postgres-repository";

    public static final RuleKey RULE_PARSE_ERROR = RuleKey.of(REPOSITORY, "parse-error");
    public static final RuleKey RULE_PREFER_ROBUST_STMTS = RuleKey.of(REPOSITORY, "prefer-robust-stmts");
    public static final RuleKey RULE_CONCURRENTLY = RuleKey.of(REPOSITORY, "concurrently");
    public static final RuleKey RULE_ADD_FIELD_WITH_DEFAULT = RuleKey.of(REPOSITORY, "adding-field-with-default");
    public static final RuleKey RULE_ADD_FOREIGN_KEY = RuleKey.of(REPOSITORY, "adding-foreign-key-constraint");
    public static final RuleKey RULE_SETTING_NOT_NULLABLE_FIELD = RuleKey.of(REPOSITORY, "setting-not-nullable-field");
    public static final RuleKey RULE_ADDING_SERIAL_PRIMARY_KEY_FIELD = RuleKey.of(REPOSITORY, "adding-serial-primary-key-field");
    public static final RuleKey RULE_BAN_CHAR_FIELD = RuleKey.of(REPOSITORY, "ban-char-field");
    public static final RuleKey RULE_BAN_DROP_DATABASE = RuleKey.of(REPOSITORY, "ban-drop-database");
    public static final RuleKey RULE_CHANGING_COLUMN_TYPE = RuleKey.of(REPOSITORY, "changing-column-type");
    public static final RuleKey RULE_CONSTRAINT_MISSING_NOT_VALID = RuleKey.of(REPOSITORY, "constraint-missing-not-valid");
    public static final RuleKey RULE_DISALLOWED_UNIQUE_CONSTRAINT = RuleKey.of(REPOSITORY, "disallowed-unique-constraint");
    public static final RuleKey RULE_PREFER_TEXT_FIELD = RuleKey.of(REPOSITORY, "prefer-text-field");
    public static final RuleKey RULE_RENAMING_COLUMN = RuleKey.of(REPOSITORY, "renaming-column");
    public static final RuleKey RULE_RENAMING_TABLE = RuleKey.of(REPOSITORY, "renaming-table");
    public static final RuleKey RULE_IDENTIFIER_MAX_LENGTH = RuleKey.of(REPOSITORY, "identifier-max-length");
    public static final RuleKey RULE_DROP_CONSTRAINT_DROPS_INDEX = RuleKey.of(REPOSITORY, "drop-constraint-drops-index");
    public static final RuleKey RULE_VACUUM_FULL = RuleKey.of(REPOSITORY, "vacuum-full");
    public static final RuleKey RULE_CLUSTER = RuleKey.of(REPOSITORY, "cluster");
    public static final RuleKey RULE_PREFER_IDENTITY_FIELD = RuleKey.of(REPOSITORY, "prefer-identity-field");
    public static final RuleKey RULE_ONE_MIGRATION_PER_FILE = RuleKey.of(REPOSITORY, "one-migration-per-file");
    public static final RuleKey RULE_DISALLOWED_DO = RuleKey.of(REPOSITORY, "disallowed-do");
    public static final RuleKey RULE_ONLY_SCHEMA_MIGRATIONS = RuleKey.of(REPOSITORY, "only-schema-migrations");
    public static final RuleKey RULE_ONLY_LOWER_CASE_NAMES = RuleKey.of(REPOSITORY, "only-lower-case-names");

    @Override
    public void define(Context context) {

        NewRepository repository = context.createRepository(REPOSITORY, PostgresSqlLanguage.KEY);

        repository.createRule(RULE_PARSE_ERROR.rule())
                .setName("parse error rule")
                .setType(RuleType.BUG)
                .setSeverity(Severity.BLOCKER)
                .setMarkdownDescription(getClass().getResource("parse-error.md"));

        repository.createRule(RULE_PREFER_ROBUST_STMTS.rule())
                .setName("prefer-robust-stmts rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("prefer-robust-stmts.md"));

        repository.createRule(RULE_CONCURRENTLY.rule())
                .setName("concurrently rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("concurrently.md"));

        repository.createRule(RULE_ADD_FIELD_WITH_DEFAULT.rule())
                .setName("adding-field-with-default rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("adding-field-with-default.md"));

        repository.createRule(RULE_ADD_FOREIGN_KEY.rule())
                .setName("adding-foreign-key-constraint rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("adding-foreign-key-constraint.md"));

        repository.createRule(RULE_SETTING_NOT_NULLABLE_FIELD.rule())
                .setName("setting-not-nullable-field rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("setting-not-nullable-field.md"));

        repository.createRule(RULE_ADDING_SERIAL_PRIMARY_KEY_FIELD.rule())
                .setName("adding-serial-primary-key-field rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("adding-serial-primary-key-field.md"));

        repository.createRule(RULE_BAN_CHAR_FIELD.rule())
                .setName("ban-char-field rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("ban-char-field.md"));

        repository.createRule(RULE_BAN_DROP_DATABASE.rule())
                .setName("ban-drop-database rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("ban-drop-database.md"));

        repository.createRule(RULE_CHANGING_COLUMN_TYPE.rule())
                .setName("changing-column-type rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("changing-column-type.md"));

        repository.createRule(RULE_CONSTRAINT_MISSING_NOT_VALID.rule())
                .setName("constraint-missing-not-valid rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("constraint-missing-not-valid.md"));

        repository.createRule(RULE_DISALLOWED_UNIQUE_CONSTRAINT.rule())
                .setName("disallowed-unique-constraint rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("disallowed-unique-constraint.md"));

        repository.createRule(RULE_PREFER_TEXT_FIELD.rule())
                .setName("prefer-text-field rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("prefer-text-field.md"));

        repository.createRule(RULE_RENAMING_COLUMN.rule())
                .setName("renaming-column rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("renaming-column.md"));

        repository.createRule(RULE_RENAMING_TABLE.rule())
                .setName("renaming-table rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("renaming-table.md"));

        repository.createRule(RULE_IDENTIFIER_MAX_LENGTH.rule())
                .setName("identifier-max-length rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("identifier-max-length.md"));

        repository.createRule(RULE_DROP_CONSTRAINT_DROPS_INDEX.rule())
                .setName("drop-constraint-drops-index rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("drop-constraint-drops-index.md"));

        repository.createRule(RULE_VACUUM_FULL.rule())
                .setName("vacuum-full rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("vacuum-full.md"));

        repository.createRule(RULE_CLUSTER.rule())
                .setName("cluster rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("cluster.md"));

        repository.createRule(RULE_PREFER_IDENTITY_FIELD.rule())
                .setName("prefer-identity-field rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("prefer-identity-field.md"));

        repository.createRule(RULE_ONE_MIGRATION_PER_FILE.rule())
                .setName("one-migration-per-file rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("one-migration-per-file.md"));

        repository.createRule(RULE_DISALLOWED_DO.rule())
                .setName("disallowed-do rule")
                .setType(RuleType.BUG)
                .setMarkdownDescription(getClass().getResource("disallowed-do.md"));

        repository.createRule(RULE_ONLY_SCHEMA_MIGRATIONS.rule())
                  .setName("only-schema-migrations rule")
                  .setType(RuleType.BUG)
                  .setMarkdownDescription(getClass().getResource("only-schema-migrations.md"));

        repository.createRule(RULE_ONLY_LOWER_CASE_NAMES.rule())
                  .setName("only-lower-case-names rule")
                  .setType(RuleType.BUG)
                  .setMarkdownDescription(getClass().getResource("only-lower-case-names.md"));

        repository.done();
    }

    public static List<VisitorCheck> allChecks(){
        return Arrays.asList(
                new BanDropDatabaseVisitorCheck(),
                new ConcurrentVisitorCheck(),
                new RenameColumnVisitorCheck(),
                new RenameTableVisitorCheck(),
                new RobustStatementsVisitorCheck(),
                new SettingNotNullVisitorCheck(),
                new DropConstraintDropsIndexVisitorCheck(),
                new ChangingColumnTypeVisitorCheck(),
                new DisallowedUniqueConstraintVisitorCheck(),
                new AddingSerialPrimaryKeyfieldvisitorCheck(),
                new ConstraintMissingNotValidVisitorCheck(),
                new AddForeignKeyVisitorCheck(),
                new AddFieldWithDefaultVisitorCheck(),
                new BanCharFieldVisitorCheck(),
                new PreferTextFieldVisitorCheck(),
                new VacuumFullVisitorCheck(),
                new ClusterVisitorCheck(),
                new PreferIdentityVisitorCheck(),
                new DisallowedDoVisitorCheck(),
                new OneMigrationPerFileVisitorCheck(),
                new OnlySchemaMigrationsVisitorCheck());
    }
}
