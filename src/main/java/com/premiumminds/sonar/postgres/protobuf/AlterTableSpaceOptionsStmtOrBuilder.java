// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterTableSpaceOptionsStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterTableSpaceOptionsStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
   * @return The tablespacename.
   */
  java.lang.String getTablespacename();
  /**
   * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
   * @return The bytes for tablespacename.
   */
  com.google.protobuf.ByteString
      getTablespacenameBytes();

  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <code>bool is_reset = 3 [json_name = "isReset"];</code>
   * @return The isReset.
   */
  boolean getIsReset();
}
