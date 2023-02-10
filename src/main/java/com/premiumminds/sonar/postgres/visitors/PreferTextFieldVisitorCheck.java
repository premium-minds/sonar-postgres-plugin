package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.ColumnDef;
import com.premiumminds.sonar.postgres.protobuf.TypeName;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_TEXT_FIELD;

@Rule(key = "prefer-text-field")
public class PreferTextFieldVisitorCheck extends AbstractVisitorCheck {

    @Override
    public void visit(ColumnDef columnDef) {
        final TypeName typeName = columnDef.getTypeName();
        typeName.getNamesList().forEach(name -> {
            final String str = name.getString().getSval();

            if ("varchar".equals(str) && typeName.getTypmodsList().size() != 0){
                newIssue("Changing the size of a varchar field requires an ACCESS EXCLUSIVE lock, that will prevent all reads and writes to the table.");
            }
        });

        super.visit(columnDef);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_PREFER_TEXT_FIELD;
    }
}
