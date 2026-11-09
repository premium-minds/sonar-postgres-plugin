package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.protobuf.IndexStmt;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_UNIQUE_INDEX_METHOD;

@Rule(key = "unique-index-method")
public class UniqueIndexMethodCheck extends AbstractVisitorCheck {

    @Override
    public void visit(IndexStmt indexStmt) {
        if (indexStmt.getConcurrent()){
            final var accessMethod = indexStmt.getAccessMethod();
            switch (accessMethod){
                case "hash" -> newIssue("Index method hash does support unique indexes.");
                case "gist" -> newIssue("Index method GiST does support unique indexes.");
                case "spgist" -> newIssue("Index method SP-GiST does support unique indexes.");
                case "gin" -> newIssue("Index method GIN does support unique indexes.");
                case "brin" -> newIssue("Index method BRIN does support unique indexes.");
            }
        }
        super.visit(indexStmt);
    }

    @Override
    protected RuleKey getRule() {
        return RULE_UNIQUE_INDEX_METHOD;
    }
}
