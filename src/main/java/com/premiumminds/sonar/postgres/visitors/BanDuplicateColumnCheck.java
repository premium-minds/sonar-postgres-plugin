package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.AlterTableStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateForeignTableStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateFunctionStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateTableAsStmt;
import com.premiumminds.sonar.postgres.protobuf.InsertStmt;
import com.premiumminds.sonar.postgres.protobuf.SelectStmt;
import com.premiumminds.sonar.postgres.protobuf.UpdateStmt;
import com.premiumminds.sonar.postgres.protobuf.ViewStmt;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_BAN_DUPLICATE_COLUMN;

@Rule(key = "ban-duplicate-column")
public class BanDuplicateColumnCheck extends AbstractVisitorCheck {

    @Override
    public void visit(CreateForeignTableStmt createForeignTableStmt) {
        final var duplicates = createForeignTableStmt.getBaseStmt().getTableEltsList()
                .stream()
                .map(cmd -> cmd.getColumnDef().getColname())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        if (!duplicates.isEmpty()) {
            newIssue("Duplicate columns found: " + String.join(",", duplicates));
        }

        super.visit(createForeignTableStmt);
    }

    @Override
    public void visit(CreateTableAsStmt createTableAsStmt) {
        if (createTableAsStmt.getInto().getColNamesCount() > 1){
            final var duplicates = createTableAsStmt.getInto().getColNamesList()
                    .stream()
                    .map(cmd -> cmd.getString().getSval())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        } else {
            final var duplicates = createTableAsStmt.getQuery().getSelectStmt().getTargetListList()
                    .stream()
                    .map(cmd -> cmd.getResTarget().getName())
                    .map(s -> !s.isEmpty() ? s : "?column?")
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        }


        super.visit(createTableAsStmt);
    }

    @Override
    public void visit(CreateStmt createStmt) {
        final var duplicates = createStmt.getTableEltsList()
                .stream()
                .map(cmd -> cmd.getColumnDef().getColname())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        if (!duplicates.isEmpty()) {
            newIssue("Duplicate columns found: " + String.join(",", duplicates));
        }
        super.visit(createStmt);
    }

    @Override
    public void visit(AlterTableStmt alterTableStmt) {
        final var duplicates = alterTableStmt.getCmdsList()
                .stream()
                .map(cmd -> cmd.getAlterTableCmd().getDef().getColumnDef().getColname())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        if (!duplicates.isEmpty()) {
            newIssue("Duplicate columns found: " + String.join(",", duplicates));
        }

        super.visit(alterTableStmt);
    }

    @Override
    public void visit(ViewStmt viewStmt) {
        if (viewStmt.getAliasesCount() > 1){
            final var duplicates = viewStmt.getAliasesList()
                    .stream()
                    .map(cmd -> cmd.getString().getSval())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        } else {
            final var duplicates = viewStmt.getQuery().getSelectStmt().getTargetListList()
                    .stream()
                    .map(t -> t.getResTarget().getName())
                    .map(s -> !s.isEmpty() ? s : "?column?")
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        }

        super.visit(viewStmt);
    }

    @Override
    public void visit(SelectStmt selectStmt) {
        if (selectStmt.hasIntoClause()){
            final var duplicates = selectStmt.getTargetListList()
                    .stream()
                    .map(t -> t.getResTarget().getName())
                    .map(s -> !s.isEmpty() ? s : "?column?")
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        }
        super.visit(selectStmt);
    }

    @Override
    public void visit(UpdateStmt updateStmt) {
        final var duplicates = updateStmt.getTargetListList()
                .stream()
                .map(t -> t.getResTarget().getName())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        if (!duplicates.isEmpty()) {
            newIssue("Duplicate columns found: " + String.join(",", duplicates));
        }

        super.visit(updateStmt);
    }

    @Override
    public void visit(InsertStmt insertStmt) {
        {
            final var duplicates = insertStmt.getColsList()
                    .stream()
                    .map(t -> t.getResTarget().getName())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        }

        if (insertStmt.hasOnConflictClause()){
            final var duplicates = insertStmt.getOnConflictClause().getTargetListList()
                    .stream()
                    .map(t -> t.getResTarget().getName())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
                newIssue("Duplicate columns found: " + String.join(",", duplicates));
            }
        }

        super.visit(insertStmt);
    }

    @Override
    public void visit(CreateFunctionStmt createFunctionStmt) {
        final var duplicates = createFunctionStmt.getParametersList()
                .stream()
                .map(t -> t.getFunctionParameter().getName())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        if (!duplicates.isEmpty()) {
            newIssue("Duplicate arguments found: " + String.join(",", duplicates));
        }
        super.visit(createFunctionStmt);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_BAN_DUPLICATE_COLUMN;
    }
}
