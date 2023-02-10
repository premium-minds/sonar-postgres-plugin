package com.premiumminds.sonar.postgres.visitors;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_ADD_FIELD_WITH_DEFAULT;
import static com.premiumminds.sonar.postgres.protobuf.ConstrType.CONSTR_DEFAULT;

import com.premiumminds.sonar.postgres.protobuf.ConstrType;
import com.premiumminds.sonar.postgres.protobuf.Constraint;
import com.premiumminds.sonar.postgres.protobuf.FuncCall;
import com.premiumminds.sonar.postgres.protobuf.Node;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = "adding-field-with-default")
public class AddFieldWithDefaultVisitorCheck extends AbstractVisitorCheck {

    /*
        Generated via the following Postgres query:
            select proname from pg_proc where provolatile <> 'v';
    */
    private static final String NON_VOLATILE_BUILT_IN_FUNCTIONS = "non_volatile_built_in_functions.txt";
    private static final List<String> nonVolatileFunctions;

    static {
        final URL resource = AddFieldWithDefaultVisitorCheck.class.getClassLoader().getResource(
            NON_VOLATILE_BUILT_IN_FUNCTIONS);

        try (Stream<String> lines = Files.lines(Paths.get(resource.toURI()))) {
            nonVolatileFunctions = lines.collect(Collectors.toList());
        } catch (Exception e){
          throw new RuntimeException("Could not load resource " + NON_VOLATILE_BUILT_IN_FUNCTIONS + " from classpath", e);
        }
    }

    @Override
    public void visitAlterTableColumnConstraint(Constraint constraint) {
        final ConstrType contype = constraint.getContype();
        if (CONSTR_DEFAULT.equals(contype)){
            final Node rawExpr = constraint.getRawExpr();
            if (rawExpr.hasFuncCall()){
                if (isVolatileFuncCall(rawExpr.getFuncCall())){
                    newIssue("Adding a field with a VOLATILE default can cause table rewrites, which will take an ACCESS EXCLUSIVE lock on the table, blocking reads / writes while the statement is running.");
                }
            }
        }

        super.visitAlterTableColumnConstraint(constraint);
    }

    private boolean isVolatileFuncCall(FuncCall funcCall){

        final Boolean argsAreVolatile = funcCall
            .getArgsList()
            .stream()
            .reduce(false, (intermediateResult, node) -> {
                    if (node.hasFuncCall()) {
                        return intermediateResult || isVolatileFuncCall(node.getFuncCall());
                    }
                    return false;
                }, Boolean::logicalOr);

        return argsAreVolatile || !nonVolatileFunctions.contains(funcCall.getFuncname(0).getString().getSval());
    }

    @Override
    protected RuleKey getRule() {
        return RULE_ADD_FIELD_WITH_DEFAULT;
    }
}
