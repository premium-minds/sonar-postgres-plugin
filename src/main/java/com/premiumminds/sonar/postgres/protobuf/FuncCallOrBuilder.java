// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface FuncCallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.FuncCall)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node funcname = 1 [json_name = "funcname"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getFuncnameList();
  /**
   * <code>repeated .pg_query.Node funcname = 1 [json_name = "funcname"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getFuncname(int index);
  /**
   * <code>repeated .pg_query.Node funcname = 1 [json_name = "funcname"];</code>
   */
  int getFuncnameCount();
  /**
   * <code>repeated .pg_query.Node funcname = 1 [json_name = "funcname"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getFuncnameOrBuilderList();
  /**
   * <code>repeated .pg_query.Node funcname = 1 [json_name = "funcname"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getFuncnameOrBuilder(
      int index);

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
   * <code>repeated .pg_query.Node agg_order = 3 [json_name = "agg_order"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getAggOrderList();
  /**
   * <code>repeated .pg_query.Node agg_order = 3 [json_name = "agg_order"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getAggOrder(int index);
  /**
   * <code>repeated .pg_query.Node agg_order = 3 [json_name = "agg_order"];</code>
   */
  int getAggOrderCount();
  /**
   * <code>repeated .pg_query.Node agg_order = 3 [json_name = "agg_order"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getAggOrderOrBuilderList();
  /**
   * <code>repeated .pg_query.Node agg_order = 3 [json_name = "agg_order"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getAggOrderOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node agg_filter = 4 [json_name = "agg_filter"];</code>
   * @return Whether the aggFilter field is set.
   */
  boolean hasAggFilter();
  /**
   * <code>.pg_query.Node agg_filter = 4 [json_name = "agg_filter"];</code>
   * @return The aggFilter.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getAggFilter();
  /**
   * <code>.pg_query.Node agg_filter = 4 [json_name = "agg_filter"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getAggFilterOrBuilder();

  /**
   * <code>bool agg_within_group = 5 [json_name = "agg_within_group"];</code>
   * @return The aggWithinGroup.
   */
  boolean getAggWithinGroup();

  /**
   * <code>bool agg_star = 6 [json_name = "agg_star"];</code>
   * @return The aggStar.
   */
  boolean getAggStar();

  /**
   * <code>bool agg_distinct = 7 [json_name = "agg_distinct"];</code>
   * @return The aggDistinct.
   */
  boolean getAggDistinct();

  /**
   * <code>bool func_variadic = 8 [json_name = "func_variadic"];</code>
   * @return The funcVariadic.
   */
  boolean getFuncVariadic();

  /**
   * <code>.pg_query.WindowDef over = 9 [json_name = "over"];</code>
   * @return Whether the over field is set.
   */
  boolean hasOver();
  /**
   * <code>.pg_query.WindowDef over = 9 [json_name = "over"];</code>
   * @return The over.
   */
  com.premiumminds.sonar.postgres.protobuf.WindowDef getOver();
  /**
   * <code>.pg_query.WindowDef over = 9 [json_name = "over"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.WindowDefOrBuilder getOverOrBuilder();

  /**
   * <code>int32 location = 10 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}