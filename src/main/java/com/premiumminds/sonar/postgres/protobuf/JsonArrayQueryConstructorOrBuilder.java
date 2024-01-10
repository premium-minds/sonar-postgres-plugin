// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface JsonArrayQueryConstructorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonArrayQueryConstructor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node query = 1 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <code>.pg_query.Node query = 1 [json_name = "query"];</code>
   * @return The query.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getQuery();
  /**
   * <code>.pg_query.Node query = 1 [json_name = "query"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getQueryOrBuilder();

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

  /**
   * <code>bool absent_on_null = 4 [json_name = "absent_on_null"];</code>
   * @return The absentOnNull.
   */
  boolean getAbsentOnNull();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
