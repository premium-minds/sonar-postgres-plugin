// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface JsonSerializeExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonSerializeExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
   * @return The expr.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonValueExpr getExpr();
  /**
   * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder getExprOrBuilder();

  /**
   * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
   * @return Whether the output field is set.
   */
  boolean hasOutput();
  /**
   * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
   * @return The output.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonOutput getOutput();
  /**
   * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder getOutputOrBuilder();

  /**
   * <code>int32 location = 3 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}