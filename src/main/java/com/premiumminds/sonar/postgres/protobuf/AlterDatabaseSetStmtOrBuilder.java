// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterDatabaseSetStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterDatabaseSetStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string dbname = 1 [json_name = "dbname"];</code>
   * @return The dbname.
   */
  java.lang.String getDbname();
  /**
   * <code>string dbname = 1 [json_name = "dbname"];</code>
   * @return The bytes for dbname.
   */
  com.google.protobuf.ByteString
      getDbnameBytes();

  /**
   * <code>.pg_query.VariableSetStmt setstmt = 2 [json_name = "setstmt"];</code>
   * @return Whether the setstmt field is set.
   */
  boolean hasSetstmt();
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 2 [json_name = "setstmt"];</code>
   * @return The setstmt.
   */
  com.premiumminds.sonar.postgres.protobuf.VariableSetStmt getSetstmt();
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 2 [json_name = "setstmt"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder getSetstmtOrBuilder();
}
