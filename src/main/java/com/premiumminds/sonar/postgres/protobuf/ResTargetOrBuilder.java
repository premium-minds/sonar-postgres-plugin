// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface ResTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ResTarget)
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
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getIndirectionList();
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getIndirection(int index);
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  int getIndirectionCount();
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getIndirectionOrBuilderList();
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getIndirectionOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
   * @return Whether the val field is set.
   */
  boolean hasVal();
  /**
   * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
   * @return The val.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getVal();
  /**
   * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getValOrBuilder();

  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
