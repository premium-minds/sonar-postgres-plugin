// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterRoleSetStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterRoleSetStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RoleSpec role = 1 [json_name = "role"];</code>
   * @return Whether the role field is set.
   */
  boolean hasRole();
  /**
   * <code>.pg_query.RoleSpec role = 1 [json_name = "role"];</code>
   * @return The role.
   */
  com.premiumminds.sonar.postgres.protobuf.RoleSpec getRole();
  /**
   * <code>.pg_query.RoleSpec role = 1 [json_name = "role"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder getRoleOrBuilder();

  /**
   * <code>string database = 2 [json_name = "database"];</code>
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   * <code>string database = 2 [json_name = "database"];</code>
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString
      getDatabaseBytes();

  /**
   * <code>.pg_query.VariableSetStmt setstmt = 3 [json_name = "setstmt"];</code>
   * @return Whether the setstmt field is set.
   */
  boolean hasSetstmt();
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 3 [json_name = "setstmt"];</code>
   * @return The setstmt.
   */
  com.premiumminds.sonar.postgres.protobuf.VariableSetStmt getSetstmt();
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 3 [json_name = "setstmt"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder getSetstmtOrBuilder();
}
