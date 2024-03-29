// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CreateRoleStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreateRoleStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RoleStmtType stmt_type = 1 [json_name = "stmt_type"];</code>
   * @return The enum numeric value on the wire for stmtType.
   */
  int getStmtTypeValue();
  /**
   * <code>.pg_query.RoleStmtType stmt_type = 1 [json_name = "stmt_type"];</code>
   * @return The stmtType.
   */
  com.premiumminds.sonar.postgres.protobuf.RoleStmtType getStmtType();

  /**
   * <code>string role = 2 [json_name = "role"];</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 2 [json_name = "role"];</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);
}
