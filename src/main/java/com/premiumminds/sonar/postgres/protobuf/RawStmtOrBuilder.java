// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface RawStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RawStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node stmt = 1 [json_name = "stmt"];</code>
   * @return Whether the stmt field is set.
   */
  boolean hasStmt();
  /**
   * <code>.pg_query.Node stmt = 1 [json_name = "stmt"];</code>
   * @return The stmt.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getStmt();
  /**
   * <code>.pg_query.Node stmt = 1 [json_name = "stmt"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getStmtOrBuilder();

  /**
   * <code>int32 stmt_location = 2 [json_name = "stmt_location"];</code>
   * @return The stmtLocation.
   */
  int getStmtLocation();

  /**
   * <code>int32 stmt_len = 3 [json_name = "stmt_len"];</code>
   * @return The stmtLen.
   */
  int getStmtLen();
}
