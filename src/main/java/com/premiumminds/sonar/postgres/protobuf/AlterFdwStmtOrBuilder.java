// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterFdwStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterFdwStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fdwname = 1 [json_name = "fdwname"];</code>
   * @return The fdwname.
   */
  java.lang.String getFdwname();
  /**
   * <code>string fdwname = 1 [json_name = "fdwname"];</code>
   * @return The bytes for fdwname.
   */
  com.google.protobuf.ByteString
      getFdwnameBytes();

  /**
   * <code>repeated .pg_query.Node func_options = 2 [json_name = "func_options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getFuncOptionsList();
  /**
   * <code>repeated .pg_query.Node func_options = 2 [json_name = "func_options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getFuncOptions(int index);
  /**
   * <code>repeated .pg_query.Node func_options = 2 [json_name = "func_options"];</code>
   */
  int getFuncOptionsCount();
  /**
   * <code>repeated .pg_query.Node func_options = 2 [json_name = "func_options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getFuncOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node func_options = 2 [json_name = "func_options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getFuncOptionsOrBuilder(
      int index);

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
