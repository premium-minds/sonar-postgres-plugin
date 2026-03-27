package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.AlterEnumStmt;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_REQUIRE_ENUM_VALUE_ORDERING;

@Rule(key = "require-enum-value-ordering")
public class RequireEnumValueOrderingCheck extends AbstractVisitorCheck {

    @Override
    public void visit(AlterEnumStmt alterEnumStmt) {

        System.out.println(alterEnumStmt);
        if (alterEnumStmt.getNewValNeighbor() == null || alterEnumStmt.getNewValNeighbor().isBlank()){
            newIssue("ADD VALUE without BEFORE or AFTER appends the value to the end of the enum, which may result in unexpected ordering.");
        }

        super.visit(alterEnumStmt);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_REQUIRE_ENUM_VALUE_ORDERING;
    }
}
