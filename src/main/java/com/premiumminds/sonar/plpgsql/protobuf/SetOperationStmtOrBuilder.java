// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface SetOperationStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.SetOperationStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.SetOperation op = 1 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   * <code>.pg_query.SetOperation op = 1 [json_name = "op"];</code>
   * @return The op.
   */
  com.premiumminds.sonar.plpgsql.protobuf.SetOperation getOp();

  /**
   * <code>bool all = 2 [json_name = "all"];</code>
   * @return The all.
   */
  boolean getAll();

  /**
   * <code>.pg_query.Node larg = 3 [json_name = "larg"];</code>
   * @return Whether the larg field is set.
   */
  boolean hasLarg();
  /**
   * <code>.pg_query.Node larg = 3 [json_name = "larg"];</code>
   * @return The larg.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getLarg();
  /**
   * <code>.pg_query.Node larg = 3 [json_name = "larg"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getLargOrBuilder();

  /**
   * <code>.pg_query.Node rarg = 4 [json_name = "rarg"];</code>
   * @return Whether the rarg field is set.
   */
  boolean hasRarg();
  /**
   * <code>.pg_query.Node rarg = 4 [json_name = "rarg"];</code>
   * @return The rarg.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getRarg();
  /**
   * <code>.pg_query.Node rarg = 4 [json_name = "rarg"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRargOrBuilder();

  /**
   * <code>repeated .pg_query.Node col_types = 5 [json_name = "colTypes"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getColTypesList();
  /**
   * <code>repeated .pg_query.Node col_types = 5 [json_name = "colTypes"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getColTypes(int index);
  /**
   * <code>repeated .pg_query.Node col_types = 5 [json_name = "colTypes"];</code>
   */
  int getColTypesCount();
  /**
   * <code>repeated .pg_query.Node col_types = 5 [json_name = "colTypes"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getColTypesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node col_types = 5 [json_name = "colTypes"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getColTypesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node col_typmods = 6 [json_name = "colTypmods"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getColTypmodsList();
  /**
   * <code>repeated .pg_query.Node col_typmods = 6 [json_name = "colTypmods"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getColTypmods(int index);
  /**
   * <code>repeated .pg_query.Node col_typmods = 6 [json_name = "colTypmods"];</code>
   */
  int getColTypmodsCount();
  /**
   * <code>repeated .pg_query.Node col_typmods = 6 [json_name = "colTypmods"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getColTypmodsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node col_typmods = 6 [json_name = "colTypmods"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getColTypmodsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node col_collations = 7 [json_name = "colCollations"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getColCollationsList();
  /**
   * <code>repeated .pg_query.Node col_collations = 7 [json_name = "colCollations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getColCollations(int index);
  /**
   * <code>repeated .pg_query.Node col_collations = 7 [json_name = "colCollations"];</code>
   */
  int getColCollationsCount();
  /**
   * <code>repeated .pg_query.Node col_collations = 7 [json_name = "colCollations"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getColCollationsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node col_collations = 7 [json_name = "colCollations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getColCollationsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node group_clauses = 8 [json_name = "groupClauses"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getGroupClausesList();
  /**
   * <code>repeated .pg_query.Node group_clauses = 8 [json_name = "groupClauses"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getGroupClauses(int index);
  /**
   * <code>repeated .pg_query.Node group_clauses = 8 [json_name = "groupClauses"];</code>
   */
  int getGroupClausesCount();
  /**
   * <code>repeated .pg_query.Node group_clauses = 8 [json_name = "groupClauses"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getGroupClausesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node group_clauses = 8 [json_name = "groupClauses"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getGroupClausesOrBuilder(
      int index);
}