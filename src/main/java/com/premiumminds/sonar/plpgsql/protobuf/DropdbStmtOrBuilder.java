// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface DropdbStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.DropdbStmt)
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
   * <code>bool missing_ok = 2 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  boolean getMissingOk();

  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);
}