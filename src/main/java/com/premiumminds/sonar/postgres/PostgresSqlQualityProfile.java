package com.premiumminds.sonar.postgres;

import org.sonar.api.rule.RuleKey;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADDING_SERIAL_PRIMARY_KEY_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADD_FIELD_WITH_DEFAULT;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADD_FOREIGN_KEY;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_ALTER_DOMAIN_WITH_CONSTRAINT;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_CHAR_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_CREATE_DOMAIN_WITH_CONSTRAINT;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_DROP_DATABASE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CHANGING_COLUMN_TYPE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CLUSTER;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CONCURRENTLY;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_CONSTRAINT_MISSING_NOT_VALID;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_DISALLOWED_DO;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_DISALLOWED_UNIQUE_CONSTRAINT;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_DROP_CONSTRAINT_DROPS_INDEX;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_IDENTIFIER_MAX_LENGTH;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ONE_MIGRATION_PER_FILE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ONLY_LOWER_CASE_NAMES;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ONLY_SCHEMA_MIGRATIONS;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PARSE_ERROR;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_IDENTITY_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_ROBUST_STMTS;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_TEXT_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_RENAMING_COLUMN;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_RENAMING_TABLE;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_SETTING_NOT_NULLABLE_FIELD;
import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_VACUUM_FULL;

public class PostgresSqlQualityProfile implements BuiltInQualityProfilesDefinition {
    @Override
    public void define(Context context) {
        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("Postgres SQL Rules", PostgresSqlLanguage.KEY);
        profile.setDefault(true);

        activateRule(profile, RULE_PARSE_ERROR);
        activateRule(profile, RULE_PREFER_ROBUST_STMTS);
        activateRule(profile, RULE_CONCURRENTLY);
        activateRule(profile, RULE_ADD_FIELD_WITH_DEFAULT);
        activateRule(profile, RULE_ADD_FOREIGN_KEY);
        activateRule(profile, RULE_SETTING_NOT_NULLABLE_FIELD);
        activateRule(profile, RULE_ADDING_SERIAL_PRIMARY_KEY_FIELD);
        activateRule(profile, RULE_BAN_CHAR_FIELD);
        activateRule(profile, RULE_BAN_ALTER_DOMAIN_WITH_CONSTRAINT);
        activateRule(profile, RULE_BAN_CREATE_DOMAIN_WITH_CONSTRAINT);
        activateRule(profile, RULE_BAN_DROP_DATABASE);
        activateRule(profile, RULE_CHANGING_COLUMN_TYPE);
        activateRule(profile, RULE_CONSTRAINT_MISSING_NOT_VALID);
        activateRule(profile, RULE_DISALLOWED_UNIQUE_CONSTRAINT);
        activateRule(profile, RULE_PREFER_TEXT_FIELD);
        activateRule(profile, RULE_RENAMING_COLUMN);
        activateRule(profile, RULE_RENAMING_TABLE);
        activateRule(profile, RULE_IDENTIFIER_MAX_LENGTH);
        activateRule(profile, RULE_DROP_CONSTRAINT_DROPS_INDEX);
        activateRule(profile, RULE_VACUUM_FULL);
        activateRule(profile, RULE_CLUSTER);
        activateRule(profile, RULE_PREFER_IDENTITY_FIELD);
        activateRule(profile, RULE_ONE_MIGRATION_PER_FILE);
        activateRule(profile, RULE_DISALLOWED_DO);
        activateRule(profile, RULE_ONLY_SCHEMA_MIGRATIONS);
        activateRule(profile, RULE_ONLY_LOWER_CASE_NAMES);

        profile.done();
    }
    private void activateRule(NewBuiltInQualityProfile profile, RuleKey ruleKey){
        profile.activateRule(ruleKey.repository(), ruleKey.rule());
    }
}
