// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface A_IndicesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.A_Indices)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool is_slice = 1 [json_name = "is_slice"];</code>
   * @return The isSlice.
   */
  boolean getIsSlice();

  /**
   * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
   * @return Whether the lidx field is set.
   */
  boolean hasLidx();
  /**
   * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
   * @return The lidx.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getLidx();
  /**
   * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getLidxOrBuilder();

  /**
   * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
   * @return Whether the uidx field is set.
   */
  boolean hasUidx();
  /**
   * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
   * @return The uidx.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getUidx();
  /**
   * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getUidxOrBuilder();
}
