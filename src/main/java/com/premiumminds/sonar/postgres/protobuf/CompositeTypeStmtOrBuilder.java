// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface CompositeTypeStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CompositeTypeStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RangeVar typevar = 1 [json_name = "typevar"];</code>
   * @return Whether the typevar field is set.
   */
  boolean hasTypevar();
  /**
   * <code>.pg_query.RangeVar typevar = 1 [json_name = "typevar"];</code>
   * @return The typevar.
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVar getTypevar();
  /**
   * <code>.pg_query.RangeVar typevar = 1 [json_name = "typevar"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getTypevarOrBuilder();

  /**
   * <code>repeated .pg_query.Node coldeflist = 2 [json_name = "coldeflist"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getColdeflistList();
  /**
   * <code>repeated .pg_query.Node coldeflist = 2 [json_name = "coldeflist"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getColdeflist(int index);
  /**
   * <code>repeated .pg_query.Node coldeflist = 2 [json_name = "coldeflist"];</code>
   */
  int getColdeflistCount();
  /**
   * <code>repeated .pg_query.Node coldeflist = 2 [json_name = "coldeflist"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getColdeflistOrBuilderList();
  /**
   * <code>repeated .pg_query.Node coldeflist = 2 [json_name = "coldeflist"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColdeflistOrBuilder(
      int index);
}