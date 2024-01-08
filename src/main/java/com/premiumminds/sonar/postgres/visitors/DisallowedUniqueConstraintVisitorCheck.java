package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.ConstrType;
import com.premiumminds.sonar.postgres.protobuf.Constraint;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_DISALLOWED_UNIQUE_CONSTRAINT;

@Rule(key = "disallowed-unique-constraint")
public class DisallowedUniqueConstraintVisitorCheck extends AbstractVisitorCheck {

    @Override
    public void visitAlterTableTableConstraint(Constraint constraint) {
        final ConstrType contype = constraint.getContype();
        if (ConstrType.CONSTR_UNIQUE.equals(contype) && constraint.getIndexname().isEmpty()){
            newIssue("Adding a UNIQUE constraint requires an ACCESS EXCLUSIVE lock which blocks reads and writes to the table while the index is built.");
        }

        super.visitAlterTableTableConstraint(constraint);
    }

    @Override
    public void visitAlterTableColumnConstraint(Constraint constraint) {
        final ConstrType contype = constraint.getContype();
        if (ConstrType.CONSTR_UNIQUE.equals(contype) && constraint.getIndexname().isEmpty()){
            newIssue("Adding a UNIQUE constraint requires an ACCESS EXCLUSIVE lock which blocks reads and writes to the table while the index is built.");
        }

        super.visitAlterTableColumnConstraint(constraint);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_DISALLOWED_UNIQUE_CONSTRAINT;
    }
}
