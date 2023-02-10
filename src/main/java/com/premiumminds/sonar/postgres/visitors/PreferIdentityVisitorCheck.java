package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.ColumnDef;
import com.premiumminds.sonar.postgres.protobuf.TypeName;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_IDENTITY_FIELD;

@Rule(key = "prefer-identity-field")
public class PreferIdentityVisitorCheck extends AbstractVisitorCheck {

    @Override
    public void visit(ColumnDef columnDef) {
        final TypeName typeName = columnDef.getTypeName();
        typeName.getNamesList().forEach(name -> {
            final String str = name.getString().getSval();

            if ("serial".equals(str)){
                newIssue("For new applications, identity columns should be used instead.");
            }
        });

        super.visit(columnDef);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_PREFER_IDENTITY_FIELD;
    }
}
