// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface CTESearchClauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CTESearchClause)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node search_col_list = 1 [json_name = "search_col_list"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getSearchColListList();
  /**
   * <code>repeated .pg_query.Node search_col_list = 1 [json_name = "search_col_list"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getSearchColList(int index);
  /**
   * <code>repeated .pg_query.Node search_col_list = 1 [json_name = "search_col_list"];</code>
   */
  int getSearchColListCount();
  /**
   * <code>repeated .pg_query.Node search_col_list = 1 [json_name = "search_col_list"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getSearchColListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node search_col_list = 1 [json_name = "search_col_list"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSearchColListOrBuilder(
      int index);

  /**
   * <code>bool search_breadth_first = 2 [json_name = "search_breadth_first"];</code>
   * @return The searchBreadthFirst.
   */
  boolean getSearchBreadthFirst();

  /**
   * <code>string search_seq_column = 3 [json_name = "search_seq_column"];</code>
   * @return The searchSeqColumn.
   */
  java.lang.String getSearchSeqColumn();
  /**
   * <code>string search_seq_column = 3 [json_name = "search_seq_column"];</code>
   * @return The bytes for searchSeqColumn.
   */
  com.google.protobuf.ByteString
      getSearchSeqColumnBytes();

  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}