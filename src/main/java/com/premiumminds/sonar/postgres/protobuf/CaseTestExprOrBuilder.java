// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CaseTestExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CaseTestExpr)
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
   * <code>uint32 type_id = 2 [json_name = "typeId"];</code>
   * @return The typeId.
   */
  int getTypeId();

  /**
   * <code>int32 type_mod = 3 [json_name = "typeMod"];</code>
   * @return The typeMod.
   */
  int getTypeMod();

  /**
   * <code>uint32 collation = 4 [json_name = "collation"];</code>
   * @return The collation.
   */
  int getCollation();
}
