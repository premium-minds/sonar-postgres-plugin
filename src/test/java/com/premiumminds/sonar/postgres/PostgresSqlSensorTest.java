package com.premiumminds.sonar.postgres;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.rule.CheckFactory;
import org.sonar.api.batch.rule.internal.ActiveRulesBuilder;
import org.sonar.api.batch.rule.internal.DefaultActiveRules;
import org.sonar.api.batch.rule.internal.NewActiveRule;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.IIssue;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.rule.RuleKey;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADDING_SERIAL_PRIMARY_KEY_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADD_FIELD_WITH_DEFAULT;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADD_FOREIGN_KEY;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_CHAR_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_DROP_DATABASE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CHANGING_COLUMN_TYPE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CONCURRENTLY;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CONSTRAINT_MISSING_NOT_VALID;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_DISALLOWED_UNIQUE_CONSTRAINT;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_DROP_CONSTRAINT_DROPS_INDEX;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_IDENTIFIER_MAX_LENGTH;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PARSE_ERROR;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_ROBUST_STMTS;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_TEXT_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_RENAMING_COLUMN;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_RENAMING_TABLE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_SETTING_NOT_NULLABLE_FIELD;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PostgresSqlSensorTest {

    SensorContextTester contextTester;

    @BeforeEach
    void before(){
        final Path file = Paths.get("");
        contextTester = SensorContextTester.create(file);
    }

    @Test
    void parseError() {

        createFile(contextTester, "file1.sql", "not valid sql;");

        final RuleKey rule = RULE_PARSE_ERROR;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Failure to parse statement",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    void maxIdentifierLength() {

        createFile(contextTester, "file1.sql",
                "create table if not exists a23456789_123456789_123456789_123456789_123456789_123456789_123456789_ (id int);");
        createFile(contextTester, "file2.sql",
                "create table if not exists foo (a23456789_123456789_123456789_123456789_123456789_123456789_123456789_ int);");
        createFile(contextTester, "file3.sql",
                "create index concurrently if not exists a23456789_123456789_123456789_123456789_123456789_123456789_123456789_ on foo (id);");

        final RuleKey rule = RULE_IDENTIFIER_MAX_LENGTH;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Identifier 'a23456789_123456789_123456789_123456789_123456789_123456789_123456789_' length (70) is bigger than default maximum for Postgresql 63",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals("Identifier 'a23456789_123456789_123456789_123456789_123456789_123456789_123456789_' length (70) is bigger than default maximum for Postgresql 63",
                fileMap.get(":file2.sql").primaryLocation().message());

        assertEquals("Identifier 'a23456789_123456789_123456789_123456789_123456789_123456789_123456789_' length (70) is bigger than default maximum for Postgresql 63",
                fileMap.get(":file3.sql").primaryLocation().message());

        assertEquals(3, fileMap.size());
    }

    @Test
    public void preferRobustStmts() {
        createFile(contextTester, "file1.sql", "CREATE SEQUENCE foo START 101;");
        createFile(contextTester, "file2.sql", "ALTER SEQUENCE foo RESTART WITH 105;");
        createFile(contextTester, "file3.sql", "ALTER INDEX foo RENAME TO bar;");
        createFile(contextTester, "file4.sql", "drop table foo, bar;");
        createFile(contextTester, "file5.sql", "DROP INDEX CONCURRENTLY idx1;");
        createFile(contextTester, "file6.sql", "DROP SEQUENCE foo, bar;");
        createFile(contextTester, "file7.sql", "create table foo (id int);");
        createFile(contextTester, "file8.sql", "create index concurrently idx1 on foo (id);");
        createFile(contextTester, "file9.sql", "ALTER TABLE IF EXISTS foo ADD COLUMN bar integer;");
        createFile(contextTester, "file10.sql", "ALTER TABLE IF EXISTS foo DROP COLUMN bar;");
        createFile(contextTester, "file11.sql", "ALTER TABLE foo ADD COLUMN IF NOT EXISTS id int;");
        createFile(contextTester, "file12.sql", "ALTER TABLE IF EXISTS foo DROP CONSTRAINT bar_constraint;");
        createFile(contextTester, "file13.sql", "ALTER INDEX foo SET (fillfactor = 75);");
        createFile(contextTester, "file14.sql", "ALTER VIEW foo RENAME TO bar;");
        createFile(contextTester, "file15.sql", "DROP VIEW foo, bar;");
        createFile(contextTester, "file16.sql", "CREATE SCHEMA foo;");
        createFile(contextTester, "file17.sql", "DROP SCHEMA foo, bar;");
        createFile(contextTester, "file18.sql", "DROP DOMAIN foo, bar;");
        createFile(contextTester, "file19.sql", "ALTER DOMAIN foo DROP CONSTRAINT bar;");
        createFile(contextTester, "file20.sql", "CREATE MATERIALIZED VIEW foo AS SELECT 1;");
        createFile(contextTester, "file21.sql", "DROP MATERIALIZED VIEW foo, bar;");
        createFile(contextTester, "file22.sql", "ALTER MATERIALIZED VIEW foo RENAME TO bar;");

        final RuleKey rule = RULE_PREFER_ROBUST_STMTS;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Add IF NOT EXISTS to CREATE SEQUENCE foo",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to ALTER SEQUENCE foo",
                fileMap.get(":file2.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to ALTER INDEX foo",
                fileMap.get(":file3.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP TABLE foo, bar",
                fileMap.get(":file4.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP INDEX idx1",
                fileMap.get(":file5.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP SEQUENCE foo, bar",
                fileMap.get(":file6.sql").primaryLocation().message());

        assertEquals("Add IF NOT EXISTS to CREATE TABLE foo",
                fileMap.get(":file7.sql").primaryLocation().message());

        assertEquals("Add IF NOT EXISTS to CREATE INDEX idx1",
                fileMap.get(":file8.sql").primaryLocation().message());

        assertEquals("Add IF NOT EXISTS to ADD COLUMN bar",
                fileMap.get(":file9.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP COLUMN bar",
                fileMap.get(":file10.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to ALTER TABLE foo",
                fileMap.get(":file11.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP CONSTRAINT bar_constraint",
                fileMap.get(":file12.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to ALTER INDEX foo",
                fileMap.get(":file13.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to ALTER VIEW foo",
                fileMap.get(":file14.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP VIEW foo, bar",
                fileMap.get(":file15.sql").primaryLocation().message());

        assertEquals("Add IF NOT EXISTS to CREATE SCHEMA foo",
                fileMap.get(":file16.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP SCHEMA foo, bar",
                fileMap.get(":file17.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP DOMAIN foo, bar",
                fileMap.get(":file18.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP CONSTRAINT bar",
                fileMap.get(":file19.sql").primaryLocation().message());

        assertEquals("Add IF NOT EXISTS to CREATE MATERIALIZED VIEW foo",
                fileMap.get(":file20.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to DROP MATERIALIZED VIEW foo, bar",
                fileMap.get(":file21.sql").primaryLocation().message());

        assertEquals("Add IF EXISTS to ALTER MATERIALIZED VIEW foo",
                fileMap.get(":file22.sql").primaryLocation().message());

        assertEquals(22, fileMap.size());
    }

    @Test
    public void banDropDatabase() {
        createFile(contextTester, "file1.sql", "DROP DATABASE foo;");

        final RuleKey rule = RULE_BAN_DROP_DATABASE;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Dropping a database may break existing clients.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void concurrently() {
        createFile(contextTester, "file1.sql", "DROP INDEX IF EXISTS idx1, idx2;");
        createFile(contextTester, "file2.sql", "create index if not exists idx1 on foo (id);");

        final RuleKey rule = RULE_CONCURRENTLY;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Add CONCURRENTLY to DROP INDEX idx1, idx2",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals("Add CONCURRENTLY to CREATE INDEX idx1",
                fileMap.get(":file2.sql").primaryLocation().message());

        assertEquals(2, fileMap.size());
    }

    @Test
    public void addingForeignKeyConstraint() {

        createFile(contextTester, "file1.sql", "create table if not exists foo (id int, CONSTRAINT id_fk FOREIGN KEY (id) REFERENCES bar(id) );");
        createFile(contextTester, "file2.sql", "create table if not exists foo (id int REFERENCES bar(id) );");
        createFile(contextTester, "file3.sql", "ALTER TABLE IF EXISTS foo ADD CONSTRAINT fk_bar FOREIGN KEY (bar_id) REFERENCES bar (id);");
        createFile(contextTester, "file4.sql", "ALTER TABLE IF EXISTS foo ADD COLUMN IF NOT EXISTS bar_id int4 REFERENCES bar(id);");
        createFile(contextTester, "file5-ok.sql", "ALTER TABLE IF EXISTS foo ADD CONSTRAINT fk_bar FOREIGN KEY (bar_id) REFERENCES bar (id) NOT VALID;" +
                                                                "ALTER TABLE IF EXISTS foo VALIDATE CONSTRAINT fk_bar;");

        final RuleKey rule = RULE_ADD_FOREIGN_KEY;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);
        
        assertEquals("Adding a foreign key constraint requires a table scan and a SHARE ROW EXCLUSIVE lock on both tables, which blocks writes to each table.",
                fileMap.get(":file1.sql").primaryLocation().message());
        
        assertEquals("Adding a foreign key constraint requires a table scan and a SHARE ROW EXCLUSIVE lock on both tables, which blocks writes to each table.",
                fileMap.get(":file2.sql").primaryLocation().message());
        
        assertEquals("Adding a foreign key constraint requires a table scan and a SHARE ROW EXCLUSIVE lock on both tables, which blocks writes to each table.",
                fileMap.get(":file3.sql").primaryLocation().message());
        
        assertEquals("Adding a foreign key constraint requires a table scan and a SHARE ROW EXCLUSIVE lock on both tables, which blocks writes to each table.",
                fileMap.get(":file4.sql").primaryLocation().message());

        assertEquals(4, fileMap.size());
    }

    @Test
    public void banCharField() {
        createFile(contextTester, "file1.sql", "create table if not exists foo (id int, name char(100) NOT NULL);");
        createFile(contextTester, "file2.sql", "ALTER TABLE IF EXISTS foo ADD COLUMN IF NOT EXISTS name character;");

        final RuleKey rule = RULE_BAN_CHAR_FIELD;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Using character is likely a mistake and should almost always be replaced by text or varchar.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals("Using character is likely a mistake and should almost always be replaced by text or varchar.",
                fileMap.get(":file2.sql").primaryLocation().message());

        assertEquals(2, fileMap.size());
    }

    @Test
    public void preferTextField() {

        createFile(contextTester, "file1.sql", "create table if not exists foo (id int, name varchar(100) NOT NULL);");
        createFile(contextTester, "file2.sql", "ALTER TABLE IF EXISTS foo ADD COLUMN IF NOT EXISTS name varchar(100);");
        createFile(contextTester, "file3-ok.sql", "create table if not exists foo (id int, name varchar NOT NULL);");
        createFile(contextTester, "file4-ok.sql", "ALTER TABLE IF EXISTS foo ADD COLUMN IF NOT EXISTS name varchar;");

        final RuleKey rule = RULE_PREFER_TEXT_FIELD;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Changing the size of a varchar field requires an ACCESS EXCLUSIVE lock, that will prevent all reads and writes to the table.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals("Changing the size of a varchar field requires an ACCESS EXCLUSIVE lock, that will prevent all reads and writes to the table.",
                fileMap.get(":file2.sql").primaryLocation().message());

        assertEquals(2, fileMap.size());
    }

    @Test
    public void addingFieldWithDefault() {
        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo ADD COLUMN IF NOT EXISTS bar integer DEFAULT random();");
        createFile(contextTester, "file2-ok.sql", "ALTER TABLE IF EXISTS foo ALTER COLUMN bar SET DEFAULT -1;");
        createFile(contextTester, "file3-ok.sql", "ALTER TABLE IF EXISTS foo ALTER COLUMN bar SET DEFAULT random();");

        final RuleKey rule = RULE_ADD_FIELD_WITH_DEFAULT;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Adding a field with a VOLATILE default can cause table rewrites, which will take an ACCESS EXCLUSIVE lock on the table, blocking reads / writes while the statement is running.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void settingNotNullableField() {

        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo ALTER COLUMN id SET NOT NULL;");

        final RuleKey rule = RULE_SETTING_NOT_NULLABLE_FIELD;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Setting a column as NOT NULL will require a scan of the entire table. However, if a valid CHECK constraint is found which proves no NULL can exist, then the table scan is skipped.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void addingSerialPrimaryKeyField() {

        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo ADD PRIMARY KEY (id);");
        createFile(contextTester, "file2-ok.sql", "CREATE UNIQUE INDEX CONCURRENTLY IF NOT EXISTS foo_pk_idx ON foo (id); " +
                                                                "ALTER TABLE IF EXISTS foo ADD CONSTRAINT foo_pk PRIMARY KEY USING INDEX foo_pk_idx;");

        final RuleKey rule = RULE_ADDING_SERIAL_PRIMARY_KEY_FIELD;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("If PRIMARY KEY is specified, and the index's columns are not already marked NOT NULL, then this command will attempt to do ALTER COLUMN SET NOT NULL against each such column. That requires a full table scan to verify the column(s) contain no nulls. In all other cases, this is a fast operation.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void dropConstraintDropsIndex() {

        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo DROP CONSTRAINT bar_constraint;");

        final RuleKey rule = RULE_DROP_CONSTRAINT_DROPS_INDEX;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Dropping a primary or unique constraint also drops any index underlying the constraint",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void changingColumnType() {
        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo ALTER COLUMN id TYPE bigint;");

        final RuleKey rule = RULE_CHANGING_COLUMN_TYPE;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Changing a column type requires an ACCESS EXCLUSIVE lock on the table which blocks reads and writes while the table is rewritten.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void constraintMissingNotValid() {
        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo ADD CONSTRAINT positive_balance CHECK (balance >= 0);");
        createFile(contextTester, "file2-ok.sql", "ALTER TABLE IF EXISTS foo ADD CONSTRAINT positive_balance CHECK (balance >= 0) NOT VALID;" +
                                                                "ALTER TABLE IF EXISTS foo VALIDATE CONSTRAINT positive_balance;");

        final RuleKey rule = RULE_CONSTRAINT_MISSING_NOT_VALID;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("By default new constraints require a table scan and block writes to the table while that scan occurs.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void disallowedUniqueConstraint() {
        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo ADD CONSTRAINT field_name_constraint UNIQUE (field_name);");
        createFile(contextTester, "file2-ok.sql", "CREATE UNIQUE INDEX CONCURRENTLY IF NOT EXISTS foo_name_temp_idx ON foo (name);" +
                                                                "ALTER TABLE IF EXISTS foo " +
                                                                "   DROP CONSTRAINT IF EXISTS name_constraint," +
                                                                "   ADD CONSTRAINT name_constraint UNIQUE USING INDEX foo_name_temp_idx;");

        final RuleKey rule = RULE_DISALLOWED_UNIQUE_CONSTRAINT;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Adding a UNIQUE constraint requires an ACCESS EXCLUSIVE lock which blocks reads and writes to the table while the index is built.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void renamingColumn() {

        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo RENAME COLUMN bar TO baz;");

        final RuleKey rule = RULE_RENAMING_COLUMN;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Renaming a column may break existing clients.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    @Test
    public void renamingTable() {
        createFile(contextTester, "file1.sql", "ALTER TABLE IF EXISTS foo RENAME TO bar;");

        final RuleKey rule = RULE_RENAMING_TABLE;
        PostgresSqlSensor sensor = getPostgresSqlSensor(rule);
        sensor.execute(contextTester);

        final Map<RuleKey, Map<String, Issue>> issueMap = groupByRuleAndFile(contextTester.allIssues());

        final Map<String, Issue> fileMap = issueMap.get(rule);

        assertEquals("Renaming a table may break existing clients that depend on the old table name.",
                fileMap.get(":file1.sql").primaryLocation().message());

        assertEquals(1, fileMap.size());
    }

    private PostgresSqlSensor getPostgresSqlSensor(RuleKey ruleKey) {
        ActiveRulesBuilder activeRulesBuilder = new ActiveRulesBuilder();

        activeRulesBuilder
                .addRule(new NewActiveRule.Builder()
                        .setRuleKey(ruleKey)
                        .build());

        final DefaultActiveRules activeRules = activeRulesBuilder.build();

        CheckFactory checkFactory = new CheckFactory(activeRules);

        return new PostgresSqlSensor(checkFactory);
    }

    private Map<RuleKey, Map<String, Issue>> groupByRuleAndFile(Collection<Issue> allIssues) {
        return allIssues.stream()
                .collect(Collectors.groupingBy(IIssue::ruleKey,
                        Collectors.toMap(issue -> issue.primaryLocation().inputComponent().key(), issue -> issue)));
    }

    private void createFile(SensorContextTester contextTester, String relativePath, String content) {
        contextTester.fileSystem().add(TestInputFileBuilder.create("", relativePath)
                .setLanguage(PostgresSqlLanguage.KEY)
                .setContents(content)
                .build());
    }
}