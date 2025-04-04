// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface JsonFuncExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonFuncExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.JsonExprOp op = 1 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   * <code>.pg_query.JsonExprOp op = 1 [json_name = "op"];</code>
   * @return The op.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonExprOp getOp();

  /**
   * <code>string column_name = 2 [json_name = "column_name"];</code>
   * @return The columnName.
   */
  java.lang.String getColumnName();
  /**
   * <code>string column_name = 2 [json_name = "column_name"];</code>
   * @return The bytes for columnName.
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();

  /**
   * <code>.pg_query.JsonValueExpr context_item = 3 [json_name = "context_item"];</code>
   * @return Whether the contextItem field is set.
   */
  boolean hasContextItem();
  /**
   * <code>.pg_query.JsonValueExpr context_item = 3 [json_name = "context_item"];</code>
   * @return The contextItem.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonValueExpr getContextItem();
  /**
   * <code>.pg_query.JsonValueExpr context_item = 3 [json_name = "context_item"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder getContextItemOrBuilder();

  /**
   * <code>.pg_query.Node pathspec = 4 [json_name = "pathspec"];</code>
   * @return Whether the pathspec field is set.
   */
  boolean hasPathspec();
  /**
   * <code>.pg_query.Node pathspec = 4 [json_name = "pathspec"];</code>
   * @return The pathspec.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPathspec();
  /**
   * <code>.pg_query.Node pathspec = 4 [json_name = "pathspec"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPathspecOrBuilder();

  /**
   * <code>repeated .pg_query.Node passing = 5 [json_name = "passing"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getPassingList();
  /**
   * <code>repeated .pg_query.Node passing = 5 [json_name = "passing"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPassing(int index);
  /**
   * <code>repeated .pg_query.Node passing = 5 [json_name = "passing"];</code>
   */
  int getPassingCount();
  /**
   * <code>repeated .pg_query.Node passing = 5 [json_name = "passing"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getPassingOrBuilderList();
  /**
   * <code>repeated .pg_query.Node passing = 5 [json_name = "passing"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPassingOrBuilder(
      int index);

  /**
   * <code>.pg_query.JsonOutput output = 6 [json_name = "output"];</code>
   * @return Whether the output field is set.
   */
  boolean hasOutput();
  /**
   * <code>.pg_query.JsonOutput output = 6 [json_name = "output"];</code>
   * @return The output.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonOutput getOutput();
  /**
   * <code>.pg_query.JsonOutput output = 6 [json_name = "output"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder getOutputOrBuilder();

  /**
   * <code>.pg_query.JsonBehavior on_empty = 7 [json_name = "on_empty"];</code>
   * @return Whether the onEmpty field is set.
   */
  boolean hasOnEmpty();
  /**
   * <code>.pg_query.JsonBehavior on_empty = 7 [json_name = "on_empty"];</code>
   * @return The onEmpty.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonBehavior getOnEmpty();
  /**
   * <code>.pg_query.JsonBehavior on_empty = 7 [json_name = "on_empty"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonBehaviorOrBuilder getOnEmptyOrBuilder();

  /**
   * <code>.pg_query.JsonBehavior on_error = 8 [json_name = "on_error"];</code>
   * @return Whether the onError field is set.
   */
  boolean hasOnError();
  /**
   * <code>.pg_query.JsonBehavior on_error = 8 [json_name = "on_error"];</code>
   * @return The onError.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonBehavior getOnError();
  /**
   * <code>.pg_query.JsonBehavior on_error = 8 [json_name = "on_error"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonBehaviorOrBuilder getOnErrorOrBuilder();

  /**
   * <code>.pg_query.JsonWrapper wrapper = 9 [json_name = "wrapper"];</code>
   * @return The enum numeric value on the wire for wrapper.
   */
  int getWrapperValue();
  /**
   * <code>.pg_query.JsonWrapper wrapper = 9 [json_name = "wrapper"];</code>
   * @return The wrapper.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonWrapper getWrapper();

  /**
   * <code>.pg_query.JsonQuotes quotes = 10 [json_name = "quotes"];</code>
   * @return The enum numeric value on the wire for quotes.
   */
  int getQuotesValue();
  /**
   * <code>.pg_query.JsonQuotes quotes = 10 [json_name = "quotes"];</code>
   * @return The quotes.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonQuotes getQuotes();

  /**
   * <code>int32 location = 11 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
