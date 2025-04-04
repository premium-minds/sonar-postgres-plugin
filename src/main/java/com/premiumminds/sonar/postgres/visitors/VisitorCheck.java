package com.premiumminds.sonar.postgres.visitors;

import com.premiumminds.sonar.postgres.PostgreSqlFile;
import com.premiumminds.sonar.postgres.protobuf.AlterDomainStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterEnumStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt;
import com.premiumminds.sonar.postgres.protobuf.AlterTableCmd;
import com.premiumminds.sonar.postgres.protobuf.AlterTableStmt;
import com.premiumminds.sonar.postgres.protobuf.ClusterStmt;
import com.premiumminds.sonar.postgres.protobuf.ColumnDef;
import com.premiumminds.sonar.postgres.protobuf.Constraint;
import com.premiumminds.sonar.postgres.protobuf.CreateDomainStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateExtensionStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateFunctionStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateSchemaStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateSeqStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateStatsStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateStmt;
import com.premiumminds.sonar.postgres.protobuf.CreateTableAsStmt;
import com.premiumminds.sonar.postgres.protobuf.DeleteStmt;
import com.premiumminds.sonar.postgres.protobuf.DoStmt;
import com.premiumminds.sonar.postgres.protobuf.DropStmt;
import com.premiumminds.sonar.postgres.protobuf.DropdbStmt;
import com.premiumminds.sonar.postgres.protobuf.IndexStmt;
import com.premiumminds.sonar.postgres.protobuf.InsertStmt;
import com.premiumminds.sonar.postgres.protobuf.RawStmt;
import com.premiumminds.sonar.postgres.protobuf.RefreshMatViewStmt;
import com.premiumminds.sonar.postgres.protobuf.ReindexStmt;
import com.premiumminds.sonar.postgres.protobuf.RenameStmt;
import com.premiumminds.sonar.postgres.protobuf.TruncateStmt;
import com.premiumminds.sonar.postgres.protobuf.UpdateStmt;
import com.premiumminds.sonar.postgres.protobuf.VacuumStmt;
import com.premiumminds.sonar.postgres.protobuf.VariableSetStmt;
import java.util.List;
import org.sonar.api.batch.sensor.SensorContext;

public interface VisitorCheck {

    void visit(AlterSeqStmt alterSeqStmt);
    void visit(AlterTableStmt alterTableStmt);
    void visit(DropStmt dropStmt);
    void visit(CreateSeqStmt createSeqStmt);
    void visit(RenameStmt renameStmt);
    void visit(DropdbStmt dropdbStmt);
    void visit(IndexStmt indexStmt);
    void visit(ReindexStmt reindexStmt);
    void visit(CreateTableAsStmt createTableAsStmt);
    void visit(CreateStmt createStmt);
    void visit(CreateSchemaStmt createSchemaStmt);
    void visit(CreateDomainStmt createDomainStmt);
    void visit(AlterDomainStmt alterDomainStmt);
    void visit(AlterEnumStmt alterEnumStmt);
    void visit(AlterTableCmd alterTableCmd);
    void visitCreateTableColumnConstraint(Constraint constraint);
    void visitCreateTableTableConstraint(Constraint constraint);
    void visitAlterTableColumnConstraint(Constraint constraint);
    void visitAlterTableTableConstraint(Constraint constraint);
    void visit(ColumnDef columnDef);
    void visit(VacuumStmt vacuumStmt);
    void visit(CreateExtensionStmt createExtensionStmt);
    void visit(RefreshMatViewStmt refreshMatViewStmt);
    void visit(DoStmt doStmt);
    void visit(CreateStatsStmt createStatsStmt);
    void visit(ClusterStmt clusterStmt);
    void visit(VariableSetStmt variableSetStmt);
    void visit(CreateFunctionStmt createFunctionStmt);
    void visit(InsertStmt insertStmt);
    void visit(UpdateStmt updateStmt);
    void visit(DeleteStmt deleteStmt);
    void visit(TruncateStmt truncateStmt);

    void analyze(SensorContext context, PostgreSqlFile file, List<RawStmt> statements);

    void analyze(RawStmt rawStmt);
}
