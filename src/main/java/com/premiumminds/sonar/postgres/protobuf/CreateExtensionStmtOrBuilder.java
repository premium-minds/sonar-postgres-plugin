// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CreateExtensionStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreateExtensionStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string extname = 1 [json_name = "extname"];</code>
   * @return The extname.
   */
  java.lang.String getExtname();
  /**
   * <code>string extname = 1 [json_name = "extname"];</code>
   * @return The bytes for extname.
   */
  com.google.protobuf.ByteString
      getExtnameBytes();

  /**
   * <code>bool if_not_exists = 2 [json_name = "if_not_exists"];</code>
   * @return The ifNotExists.
   */
  boolean getIfNotExists();

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
