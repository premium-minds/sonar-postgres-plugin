package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.CreateDomainStmt;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_CREATE_DOMAIN_WITH_CONSTRAINT;

@Rule(key = "ban-create-domain-with-constraint")
public class BanCreateDomainWithConstraintCheck extends AbstractVisitorCheck {

    @Override
    public void visit(CreateDomainStmt createDomainStmt) {

        if (createDomainStmt.getConstraintsCount() > 0){
            newIssue("Domains with constraints have poor support for online migrations");
        }

        super.visit(createDomainStmt);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_BAN_CREATE_DOMAIN_WITH_CONSTRAINT;
    }
}
