// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface JsonReturningOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JsonReturning)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.JsonFormat format = 1 [json_name = "format"];</code>
   * @return Whether the format field is set.
   */
  boolean hasFormat();
  /**
   * <code>.pg_query.JsonFormat format = 1 [json_name = "format"];</code>
   * @return The format.
   */
  com.premiumminds.sonar.postgres.protobuf.JsonFormat getFormat();
  /**
   * <code>.pg_query.JsonFormat format = 1 [json_name = "format"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.JsonFormatOrBuilder getFormatOrBuilder();

  /**
   * <code>uint32 typid = 2 [json_name = "typid"];</code>
   * @return The typid.
   */
  int getTypid();

  /**
   * <code>int32 typmod = 3 [json_name = "typmod"];</code>
   * @return The typmod.
   */
  int getTypmod();
}
