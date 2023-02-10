// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface ClusterStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ClusterStmt)
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
   * <code>string indexname = 2 [json_name = "indexname"];</code>
   * @return The indexname.
   */
  java.lang.String getIndexname();
  /**
   * <code>string indexname = 2 [json_name = "indexname"];</code>
   * @return The bytes for indexname.
   */
  com.google.protobuf.ByteString
      getIndexnameBytes();

  /**
   * <code>repeated .pg_query.Node params = 3 [json_name = "params"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getParamsList();
  /**
   * <code>repeated .pg_query.Node params = 3 [json_name = "params"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getParams(int index);
  /**
   * <code>repeated .pg_query.Node params = 3 [json_name = "params"];</code>
   */
  int getParamsCount();
  /**
   * <code>repeated .pg_query.Node params = 3 [json_name = "params"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getParamsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node params = 3 [json_name = "params"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getParamsOrBuilder(
      int index);
}
