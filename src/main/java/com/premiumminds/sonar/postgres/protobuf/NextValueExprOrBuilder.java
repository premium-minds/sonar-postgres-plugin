// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface NextValueExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.NextValueExpr)
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
   * <code>uint32 seqid = 2 [json_name = "seqid"];</code>
   * @return The seqid.
   */
  int getSeqid();

  /**
   * <code>uint32 type_id = 3 [json_name = "typeId"];</code>
   * @return The typeId.
   */
  int getTypeId();
}