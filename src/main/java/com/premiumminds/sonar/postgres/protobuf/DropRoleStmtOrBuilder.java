// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface DropRoleStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.DropRoleStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getRolesList();
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRoles(int index);
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  int getRolesCount();
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRolesOrBuilder(
      int index);

  /**
   * <code>bool missing_ok = 2 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  boolean getMissingOk();
}
