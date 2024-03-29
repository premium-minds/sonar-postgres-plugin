// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface JsonAggConstructorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonAggConstructor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.JsonOutput output = 1 [json_name = "output"];</code>
   * @return Whether the output field is set.
   */
  boolean hasOutput();
  /**
   * <code>.pg_query.JsonOutput output = 1 [json_name = "output"];</code>
   * @return The output.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonOutput getOutput();
  /**
   * <code>.pg_query.JsonOutput output = 1 [json_name = "output"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder getOutputOrBuilder();

  /**
   * <code>.pg_query.Node agg_filter = 2 [json_name = "agg_filter"];</code>
   * @return Whether the aggFilter field is set.
   */
  boolean hasAggFilter();
  /**
   * <code>.pg_query.Node agg_filter = 2 [json_name = "agg_filter"];</code>
   * @return The aggFilter.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getAggFilter();
  /**
   * <code>.pg_query.Node agg_filter = 2 [json_name = "agg_filter"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getAggFilterOrBuilder();

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
   * <code>.pg_query.WindowDef over = 4 [json_name = "over"];</code>
   * @return Whether the over field is set.
   */
  boolean hasOver();
  /**
   * <code>.pg_query.WindowDef over = 4 [json_name = "over"];</code>
   * @return The over.
   */
  com.premiumminds.sonar.postgres.protobuf.WindowDef getOver();
  /**
   * <code>.pg_query.WindowDef over = 4 [json_name = "over"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.WindowDefOrBuilder getOverOrBuilder();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
