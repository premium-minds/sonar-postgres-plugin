// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterTableMoveAllStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterTableMoveAllStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orig_tablespacename = 1 [json_name = "orig_tablespacename"];</code>
   * @return The origTablespacename.
   */
  java.lang.String getOrigTablespacename();
  /**
   * <code>string orig_tablespacename = 1 [json_name = "orig_tablespacename"];</code>
   * @return The bytes for origTablespacename.
   */
  com.google.protobuf.ByteString
      getOrigTablespacenameBytes();

  /**
   * <code>.pg_query.ObjectType objtype = 2 [json_name = "objtype"];</code>
   * @return The enum numeric value on the wire for objtype.
   */
  int getObjtypeValue();
  /**
   * <code>.pg_query.ObjectType objtype = 2 [json_name = "objtype"];</code>
   * @return The objtype.
   */
  com.premiumminds.sonar.postgres.protobuf.ObjectType getObjtype();

  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getRolesList();
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRoles(int index);
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  int getRolesCount();
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRolesOrBuilder(
      int index);

  /**
   * <code>string new_tablespacename = 4 [json_name = "new_tablespacename"];</code>
   * @return The newTablespacename.
   */
  java.lang.String getNewTablespacename();
  /**
   * <code>string new_tablespacename = 4 [json_name = "new_tablespacename"];</code>
   * @return The bytes for newTablespacename.
   */
  com.google.protobuf.ByteString
      getNewTablespacenameBytes();

  /**
   * <code>bool nowait = 5 [json_name = "nowait"];</code>
   * @return The nowait.
   */
  boolean getNowait();
}
