// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface GroupingFuncOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.GroupingFunc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  boolean hasXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return The xpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getXprOrBuilder();

  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node refs = 3 [json_name = "refs"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getRefsList();
  /**
   * <code>repeated .pg_query.Node refs = 3 [json_name = "refs"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRefs(int index);
  /**
   * <code>repeated .pg_query.Node refs = 3 [json_name = "refs"];</code>
   */
  int getRefsCount();
  /**
   * <code>repeated .pg_query.Node refs = 3 [json_name = "refs"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getRefsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node refs = 3 [json_name = "refs"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRefsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node cols = 4 [json_name = "cols"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getColsList();
  /**
   * <code>repeated .pg_query.Node cols = 4 [json_name = "cols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getCols(int index);
  /**
   * <code>repeated .pg_query.Node cols = 4 [json_name = "cols"];</code>
   */
  int getColsCount();
  /**
   * <code>repeated .pg_query.Node cols = 4 [json_name = "cols"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getColsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node cols = 4 [json_name = "cols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColsOrBuilder(
      int index);

  /**
   * <code>uint32 agglevelsup = 5 [json_name = "agglevelsup"];</code>
   * @return The agglevelsup.
   */
  int getAgglevelsup();

  /**
   * <code>int32 location = 6 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
