// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface JsonFormatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonFormat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.JsonFormatType format_type = 1 [json_name = "format_type"];</code>
   * @return The enum numeric value on the wire for formatType.
   */
  int getFormatTypeValue();
  /**
   * <code>.pg_query.JsonFormatType format_type = 1 [json_name = "format_type"];</code>
   * @return The formatType.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonFormatType getFormatType();

  /**
   * <code>.pg_query.JsonEncoding encoding = 2 [json_name = "encoding"];</code>
   * @return The enum numeric value on the wire for encoding.
   */
  int getEncodingValue();
  /**
   * <code>.pg_query.JsonEncoding encoding = 2 [json_name = "encoding"];</code>
   * @return The encoding.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonEncoding getEncoding();

  /**
   * <code>int32 location = 3 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}