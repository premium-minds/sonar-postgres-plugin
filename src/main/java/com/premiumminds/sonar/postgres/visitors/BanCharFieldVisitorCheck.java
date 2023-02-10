package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.ColumnDef;
import com.premiumminds.sonar.postgres.protobuf.TypeName;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_CHAR_FIELD;

@Rule(key = "ban-char-field")
public class BanCharFieldVisitorCheck extends AbstractVisitorCheck {

    @Override
    public void visit(ColumnDef columnDef) {

        final TypeName typeName = columnDef.getTypeName();
        typeName.getNamesList().forEach(name -> {
            final String str = name.getString().getSval();
            if ("bpchar".equals(str)){
                newIssue("Using character is likely a mistake and should almost always be replaced by text or varchar.");
            }
        });

        super.visit(columnDef);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_BAN_CHAR_FIELD;
    }
}
