// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CollateExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CollateExpr)
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
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  boolean hasArg();
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return The arg.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArg();
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgOrBuilder();

  /**
   * <code>uint32 coll_oid = 3 [json_name = "collOid"];</code>
   * @return The collOid.
   */
  int getCollOid();

  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
