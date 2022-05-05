package com.premiumminds.sonar.postgres.visitors;

import java.util.List;
import java.util.stream.Collectors;

import com.premiumminds.sonar.postgres.protobuf.AlterDomainStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterEnumStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterTableCmd;
import com.premiumminds.sonar.postgres.protobuf.AlterTableStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterTableType;
import com.premiumminds.sonar.postgres.protobuf.ColumnDef;
import com.premiumminds.sonar.postgres.protobuf.CreateExtensionStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateSchemaStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateSeqStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateTableAsStmt;
import com.premiumminds.sonar.postgres.protobuf.DropStmt;
import com.premiumminds.sonar.postgres.protobuf.IndexStmt;
import com.premiumminds.sonar.postgres.protobuf.ObjectType;
import com.premiumminds.sonar.postgres.protobuf.RenameStmt;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import static com.premiumminds.sonar.postgres.PostgresSqlRulesDefinition.RULE_PREFER_ROBUST_STMTS;

@Rule(key = "prefer-robust-stmts")
public class RobustStatementsVisitorCheck extends AbstractVisitorCheck {

    @Override
    public void visit(DropStmt dropStmt) {

        final List<String> names = dropStmt.getObjectsList()
                .stream()
                .map(y -> y.getList()
                        .getItemsList())
                .flatMap(List::stream)
                .map(x -> x.getString().getStr())
                .collect(Collectors.toList());

        final List<String> schemas = dropStmt.getObjectsList()
                .stream()
                .map(y -> y.getString().getStr())
                .collect(Collectors.toList());

        final List<String> domains = dropStmt.getObjectsList()
                .stream()
                .map(y -> y.getTypeName()
                        .getNamesList())
                .flatMap(List::stream)
                .map(x -> x.getString().getStr())
                .collect(Collectors.toList());

        if(!dropStmt.getMissingOk()){
            final ObjectType removeType = dropStmt.getRemoveType();
            switch (removeType){
                case OBJECT_TABLE:
                    newIssue("Add IF EXISTS to DROP TABLE " + String.join(", ", names));
                    break;
                case OBJECT_SEQUENCE:
                    newIssue("Add IF EXISTS to DROP SEQUENCE " + String.join(", ", names));
                    break;
                case OBJECT_INDEX:
                    newIssue("Add IF EXISTS to DROP INDEX " + String.join(", ", names));
                    break;
                case OBJECT_VIEW:
                    newIssue("Add IF EXISTS to DROP VIEW " + String.join(", ", names));
                    break;
                case OBJECT_SCHEMA:
                    newIssue("Add IF EXISTS to DROP SCHEMA " + String.join(", ", schemas));
                    break;
                case OBJECT_DOMAIN:
                    newIssue("Add IF EXISTS to DROP DOMAIN " + String.join(", ", domains));
                    break;
                case OBJECT_MATVIEW:
                    newIssue("Add IF EXISTS to DROP MATERIALIZED VIEW " + String.join(", ", names));
                    break;
                case OBJECT_TYPE:
                    newIssue("Add IF EXISTS to DROP TYPE " + String.join(", ", domains));
                    break;
                case OBJECT_EXTENSION:
                    newIssue("Add IF EXISTS to DROP EXTENSION " + String.join(", ", schemas));
                    break;
                default:
                    newIssue("Add IF EXISTS");
                    break;
            }
        }

        super.visit(dropStmt);
    }

    @Override
    public void visit(RenameStmt renameStmt) {
        final ObjectType renameType = renameStmt.getRenameType();
        if (!renameStmt.getMissingOk()){
            switch (renameType){
                case OBJECT_INDEX:
                    newIssue("Add IF EXISTS to ALTER INDEX " + renameStmt.getRelation().getRelname());
                    break;
                case OBJECT_VIEW:
                    newIssue("Add IF EXISTS to ALTER VIEW " + renameStmt.getRelation().getRelname());
                    break;
                case OBJECT_MATVIEW:
                    newIssue("Add IF EXISTS to ALTER MATERIALIZED VIEW " + renameStmt.getRelation().getRelname());
                    break;
            }
        }

        super.visit(renameStmt);
    }

    @Override
    public void visit(IndexStmt indexStmt) {
        if (!indexStmt.getIfNotExists()){
            newIssue("Add IF NOT EXISTS to CREATE INDEX " + indexStmt.getIdxname());
        }

        super.visit(indexStmt);
    }

    @Override
    public void visit(AlterSeqStmt alterSeqStmt) {
        if (!alterSeqStmt.getMissingOk()){
            newIssue("Add IF EXISTS to ALTER SEQUENCE " + alterSeqStmt.getSequence().getRelname());
        }

        super.visit(alterSeqStmt);
    }

    @Override
    public void visit(CreateSeqStmt createSeqStmt) {
        if (!createSeqStmt.getIfNotExists()){
            newIssue("Add IF NOT EXISTS to CREATE SEQUENCE " + createSeqStmt.getSequence().getRelname());
        }
        super.visit(createSeqStmt);
    }

    @Override
    public void visit(CreateTableAsStmt createTableAsStmt) {

        final ObjectType relkind = createTableAsStmt.getRelkind();
        if (!createTableAsStmt.getIfNotExists()){
            switch (relkind){
                case OBJECT_TABLE:
                    newIssue("Add IF NOT EXISTS to CREATE TABLE " + createTableAsStmt.getInto().getRel().getRelname() + " AS ");
                    break;
                case OBJECT_MATVIEW:
                    newIssue("Add IF NOT EXISTS to CREATE MATERIALIZED VIEW " + createTableAsStmt.getInto().getRel().getRelname());
                    break;
            }
        }

        super.visit(createTableAsStmt);
    }

    @Override
    public void visit(CreateStmt createStmt) {
        if (!createStmt.getIfNotExists()){
            newIssue("Add IF NOT EXISTS to CREATE TABLE " + createStmt.getRelation().getRelname());
        }
        super.visit(createStmt);
    }

    @Override
    public void visit(CreateSchemaStmt createSchemaStmt) {
        if (!createSchemaStmt.getIfNotExists()){
            newIssue("Add IF NOT EXISTS to CREATE SCHEMA " + createSchemaStmt.getSchemaname());
        }
        super.visit(createSchemaStmt);
    }

    @Override
    public void visit(AlterDomainStmt alterDomainStmt) {
        if (!alterDomainStmt.getMissingOk()){
            newIssue("Add IF EXISTS to DROP CONSTRAINT " + alterDomainStmt.getName());
        }
    }

    @Override
    public void visit(AlterEnumStmt alterEnumStmt) {
        if (!alterEnumStmt.getSkipIfNewValExists()){
            newIssue("Add IF NOT EXISTS to ADD VALUE " + alterEnumStmt.getNewVal());
        }
        super.visit(alterEnumStmt);
    }

    @Override
    public void visit(AlterTableStmt alterTableStmt) {
        if(!alterTableStmt.getMissingOk()){
            final ObjectType relkind = alterTableStmt.getRelkind();
            switch (relkind){
                case OBJECT_TABLE:
                    newIssue("Add IF EXISTS to ALTER TABLE " + alterTableStmt.getRelation().getRelname());
                    break;
                case OBJECT_INDEX:
                    newIssue("Add IF EXISTS to ALTER INDEX " + alterTableStmt.getRelation().getRelname());
                    break;
                default:
                    newIssue("Add IF EXISTS");
                    break;
            }
        }

        super.visit(alterTableStmt);
    }

    @Override
    public void visit(CreateExtensionStmt createExtensionStmt) {

        if(!createExtensionStmt.getIfNotExists()){
            newIssue("Add IF NOT EXISTS to CREATE EXTENSION " + createExtensionStmt.getExtname());
        }
        super.visit(createExtensionStmt);
    }

    @Override
    public void visit(AlterTableCmd alterTableCmd) {
        final AlterTableType subtype = alterTableCmd.getSubtype();
        switch (subtype){
            case AT_DropConstraint:
                dropConstraint(getContext(), getFile(), getTextRange(), alterTableCmd);
                break;
            case AT_DropColumn:
                dropColumn(getContext(), getFile(), getTextRange(), alterTableCmd);
                break;
            case AT_AddColumn:
                addColumn(getContext(), getFile(), getTextRange(), alterTableCmd);
                break;
            case AT_DropExpression:
                dropExpression(getContext(), getFile(), getTextRange(), alterTableCmd);
                break;
        }

        super.visit(alterTableCmd);
    }

    private void dropExpression(SensorContext context, InputFile file, TextRange textRange, AlterTableCmd alterTableCmd) {
        final String name = alterTableCmd.getName();
        if(!alterTableCmd.getMissingOk()){
            newIssue("Add IF EXISTS to DROP EXPRESSION " + name);
        }
    }

    private void dropConstraint(SensorContext context, InputFile file, TextRange textRange, AlterTableCmd alterTableCmd) {
        final String name = alterTableCmd.getName();

        if(!alterTableCmd.getMissingOk()){
            newIssue("Add IF EXISTS to DROP CONSTRAINT " + name);
        }
    }

    private void dropColumn(SensorContext context, InputFile file, TextRange textRange, AlterTableCmd alterTableCmd) {
        final String name = alterTableCmd.getName();

        if(!alterTableCmd.getMissingOk()){
            newIssue("Add IF EXISTS to DROP COLUMN " + name);
        }
    }

    private void addColumn(SensorContext context, InputFile file, TextRange textRange, AlterTableCmd alterTableCmd) {
        final ColumnDef columnDef = alterTableCmd.getDef().getColumnDef();
        final String colname = columnDef.getColname();

        if (!alterTableCmd.getMissingOk()){
            newIssue("Add IF NOT EXISTS to ADD COLUMN " + colname);
        }
    }

    @Override
    protected RuleKey getRule() {
        return RULE_PREFER_ROBUST_STMTS;
    }
}
