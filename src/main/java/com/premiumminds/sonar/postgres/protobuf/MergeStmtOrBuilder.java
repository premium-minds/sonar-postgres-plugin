// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface MergeStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.MergeStmt)
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
   * <code>.pg_query.Node source_relation = 2 [json_name = "sourceRelation"];</code>
   * @return Whether the sourceRelation field is set.
   */
  boolean hasSourceRelation();
  /**
   * <code>.pg_query.Node source_relation = 2 [json_name = "sourceRelation"];</code>
   * @return The sourceRelation.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getSourceRelation();
  /**
   * <code>.pg_query.Node source_relation = 2 [json_name = "sourceRelation"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSourceRelationOrBuilder();

  /**
   * <code>.pg_query.Node join_condition = 3 [json_name = "joinCondition"];</code>
   * @return Whether the joinCondition field is set.
   */
  boolean hasJoinCondition();
  /**
   * <code>.pg_query.Node join_condition = 3 [json_name = "joinCondition"];</code>
   * @return The joinCondition.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getJoinCondition();
  /**
   * <code>.pg_query.Node join_condition = 3 [json_name = "joinCondition"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getJoinConditionOrBuilder();

  /**
   * <code>repeated .pg_query.Node merge_when_clauses = 4 [json_name = "mergeWhenClauses"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getMergeWhenClausesList();
  /**
   * <code>repeated .pg_query.Node merge_when_clauses = 4 [json_name = "mergeWhenClauses"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getMergeWhenClauses(int index);
  /**
   * <code>repeated .pg_query.Node merge_when_clauses = 4 [json_name = "mergeWhenClauses"];</code>
   */
  int getMergeWhenClausesCount();
  /**
   * <code>repeated .pg_query.Node merge_when_clauses = 4 [json_name = "mergeWhenClauses"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getMergeWhenClausesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node merge_when_clauses = 4 [json_name = "mergeWhenClauses"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getMergeWhenClausesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node returning_list = 5 [json_name = "returningList"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getReturningListList();
  /**
   * <code>repeated .pg_query.Node returning_list = 5 [json_name = "returningList"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getReturningList(int index);
  /**
   * <code>repeated .pg_query.Node returning_list = 5 [json_name = "returningList"];</code>
   */
  int getReturningListCount();
  /**
   * <code>repeated .pg_query.Node returning_list = 5 [json_name = "returningList"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getReturningListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node returning_list = 5 [json_name = "returningList"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getReturningListOrBuilder(
      int index);

  /**
   * <code>.pg_query.WithClause with_clause = 6 [json_name = "withClause"];</code>
   * @return Whether the withClause field is set.
   */
  boolean hasWithClause();
  /**
   * <code>.pg_query.WithClause with_clause = 6 [json_name = "withClause"];</code>
   * @return The withClause.
   */
  com.premiumminds.sonar.postgres.protobuf.WithClause getWithClause();
  /**
   * <code>.pg_query.WithClause with_clause = 6 [json_name = "withClause"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.WithClauseOrBuilder getWithClauseOrBuilder();
}
