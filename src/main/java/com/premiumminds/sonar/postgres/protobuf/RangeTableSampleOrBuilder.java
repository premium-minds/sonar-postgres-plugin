// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface RangeTableSampleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RangeTableSample)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node relation = 1 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.Node relation = 1 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRelation();
  /**
   * <code>.pg_query.Node relation = 1 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRelationOrBuilder();

  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getMethodList();
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getMethod(int index);
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  int getMethodCount();
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getMethodOrBuilderList();
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getMethodOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node repeatable = 4 [json_name = "repeatable"];</code>
   * @return Whether the repeatable field is set.
   */
  boolean hasRepeatable();
  /**
   * <code>.pg_query.Node repeatable = 4 [json_name = "repeatable"];</code>
   * @return The repeatable.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRepeatable();
  /**
   * <code>.pg_query.Node repeatable = 4 [json_name = "repeatable"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRepeatableOrBuilder();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
