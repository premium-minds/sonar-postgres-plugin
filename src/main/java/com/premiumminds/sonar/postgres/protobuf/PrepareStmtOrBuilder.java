// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface PrepareStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.PrepareStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgtypesList();
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgtypes(int index);
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  int getArgtypesCount();
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgtypesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgtypesOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   * @return The query.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getQuery();
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getQueryOrBuilder();
}
