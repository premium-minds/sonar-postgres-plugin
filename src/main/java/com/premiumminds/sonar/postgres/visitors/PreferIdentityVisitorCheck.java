package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.ColumnDef;
import com.premiumminds.sonar.postgres.protobuf.TypeName;
import java.util.Arrays;
import java.util.List;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_IDENTITY_FIELD;

@Rule(key = "prefer-identity-field")
public class PreferIdentityVisitorCheck extends AbstractVisitorCheck {

    private static final List<String> types = Arrays.asList("smallserial",
                                                            "serial",
                                                            "bigserial",
                                                            "serial2",
                                                            "serial4",
                                                            "serial8");

    @Override
    public void visit(ColumnDef columnDef) {
        final TypeName typeName = columnDef.getTypeName();
        typeName.getNamesList().forEach(name -> {
            final String str = name.getString().getSval();

            if (types.contains(str)){
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
