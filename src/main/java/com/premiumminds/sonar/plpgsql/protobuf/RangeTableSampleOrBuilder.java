// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

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
  com.premiumminds.sonar.plpgsql.protobuf.Node getRelation();
  /**
   * <code>.pg_query.Node relation = 1 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRelationOrBuilder();

  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getMethodList();
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getMethod(int index);
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  int getMethodCount();
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getMethodOrBuilderList();
  /**
   * <code>repeated .pg_query.Node method = 2 [json_name = "method"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getMethodOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgsOrBuilder(
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
  com.premiumminds.sonar.plpgsql.protobuf.Node getRepeatable();
  /**
   * <code>.pg_query.Node repeatable = 4 [json_name = "repeatable"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRepeatableOrBuilder();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}