// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CreateRangeStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreateRangeStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getTypeNameList();
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getTypeName(int index);
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  int getTypeNameCount();
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getTypeNameOrBuilderList();
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getTypeNameOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getParamsList();
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getParams(int index);
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  int getParamsCount();
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getParamsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getParamsOrBuilder(
      int index);
}
