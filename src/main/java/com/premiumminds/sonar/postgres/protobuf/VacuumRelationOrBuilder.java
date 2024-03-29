// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface VacuumRelationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.VacuumRelation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation();
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder();

  /**
   * <code>uint32 oid = 2 [json_name = "oid"];</code>
   * @return The oid.
   */
  int getOid();

  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getVaColsList();
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getVaCols(int index);
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  int getVaColsCount();
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getVaColsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getVaColsOrBuilder(
      int index);
}
