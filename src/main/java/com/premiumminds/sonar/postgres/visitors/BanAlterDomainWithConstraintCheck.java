package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.AlterDomainStmt;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_ALTER_DOMAIN_WITH_CONSTRAINT;

@Rule(key = "ban-alter-domain-with-add-constraint")
public class BanAlterDomainWithConstraintCheck extends AbstractVisitorCheck {

    @Override
    public void visit(AlterDomainStmt alterDomainStmt) {

        if (alterDomainStmt.getSubtype().equals("C")){
            newIssue("Domains with constraints have poor support for online migrations");
        }

        super.visit(alterDomainStmt);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_BAN_ALTER_DOMAIN_WITH_CONSTRAINT;
    }
}
