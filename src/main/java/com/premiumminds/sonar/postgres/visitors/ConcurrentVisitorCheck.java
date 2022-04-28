package com.premiumminds.sonar.postgres.visitors;

import java.util.List;
import java.util.stream.Collectors;

import com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition;
import com.premiumminds.sonar.postgres.protobuf.DropStmt;
import com.premiumminds.sonar.postgres.protobuf.IndexStmt;
import com.premiumminds.sonar.postgres.protobuf.ObjectType;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;

public class ConcurrentVisitorCheck extends AbstractVisitorCheck {

    @Override
    public void visit(DropStmt dropStmt) {

        final List<String> names = dropStmt.getObjectsList()
                .stream()
                .map(y -> y.getList()
                        .getItemsList())
                .flatMap(List::stream)
                .map(x -> x.getString().getStr())
                .collect(Collectors.toList());

        if (dropStmt.getRemoveType().equals(ObjectType.OBJECT_INDEX) && !dropStmt.getConcurrent()){
            NewIssue newIssue = getContext().newIssue()
                    .forRule(PostgresSqlRulesDefinition.RULE_CONCURRENTLY);
            NewIssueLocation primaryLocation = newIssue.newLocation()
                    .on(getFile())
                    .at(getTextRange())
                    .message("Add CONCURRENTLY to DROP INDEX " + String.join(", ", names));
            newIssue.at(primaryLocation);
            newIssue.save();
        }

        super.visit(dropStmt);
    }

    @Override
    public void visit(IndexStmt indexStmt) {
        if (!indexStmt.getConcurrent()){
            NewIssue newIssue = getContext().newIssue()
                    .forRule(PostgresSqlRulesDefinition.RULE_CONCURRENTLY);
            NewIssueLocation primaryLocation = newIssue.newLocation()
                    .on(getFile())
                    .at(getTextRange())
                    .message("Add CONCURRENTLY to CREATE INDEX " + indexStmt.getIdxname());
            newIssue.at(primaryLocation);
            newIssue.save();
        }
        super.visit(indexStmt);
    }
}
