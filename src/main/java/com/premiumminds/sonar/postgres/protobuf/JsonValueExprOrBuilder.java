// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface JsonValueExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonValueExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node raw_expr = 1 [json_name = "raw_expr"];</code>
   * @return Whether the rawExpr field is set.
   */
  boolean hasRawExpr();
  /**
   * <code>.pg_query.Node raw_expr = 1 [json_name = "raw_expr"];</code>
   * @return The rawExpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRawExpr();
  /**
   * <code>.pg_query.Node raw_expr = 1 [json_name = "raw_expr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRawExprOrBuilder();

  /**
   * <code>.pg_query.Node formatted_expr = 2 [json_name = "formatted_expr"];</code>
   * @return Whether the formattedExpr field is set.
   */
  boolean hasFormattedExpr();
  /**
   * <code>.pg_query.Node formatted_expr = 2 [json_name = "formatted_expr"];</code>
   * @return The formattedExpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getFormattedExpr();
  /**
   * <code>.pg_query.Node formatted_expr = 2 [json_name = "formatted_expr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getFormattedExprOrBuilder();

  /**
   * <code>.pg_query.JsonFormat format = 3 [json_name = "format"];</code>
   * @return Whether the format field is set.
   */
  boolean hasFormat();
  /**
   * <code>.pg_query.JsonFormat format = 3 [json_name = "format"];</code>
   * @return The format.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonFormat getFormat();
  /**
   * <code>.pg_query.JsonFormat format = 3 [json_name = "format"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonFormatOrBuilder getFormatOrBuilder();
}
