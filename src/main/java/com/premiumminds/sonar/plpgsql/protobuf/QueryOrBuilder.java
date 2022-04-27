// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface QueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.Query)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.CmdType command_type = 1 [json_name = "commandType"];</code>
   * @return The enum numeric value on the wire for commandType.
   */
  int getCommandTypeValue();
  /**
   * <code>.pg_query.CmdType command_type = 1 [json_name = "commandType"];</code>
   * @return The commandType.
   */
  com.premiumminds.sonar.plpgsql.protobuf.CmdType getCommandType();

  /**
   * <code>.pg_query.QuerySource query_source = 2 [json_name = "querySource"];</code>
   * @return The enum numeric value on the wire for querySource.
   */
  int getQuerySourceValue();
  /**
   * <code>.pg_query.QuerySource query_source = 2 [json_name = "querySource"];</code>
   * @return The querySource.
   */
  com.premiumminds.sonar.plpgsql.protobuf.QuerySource getQuerySource();

  /**
   * <code>bool can_set_tag = 3 [json_name = "canSetTag"];</code>
   * @return The canSetTag.
   */
  boolean getCanSetTag();

  /**
   * <code>.pg_query.Node utility_stmt = 4 [json_name = "utilityStmt"];</code>
   * @return Whether the utilityStmt field is set.
   */
  boolean hasUtilityStmt();
  /**
   * <code>.pg_query.Node utility_stmt = 4 [json_name = "utilityStmt"];</code>
   * @return The utilityStmt.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getUtilityStmt();
  /**
   * <code>.pg_query.Node utility_stmt = 4 [json_name = "utilityStmt"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getUtilityStmtOrBuilder();

  /**
   * <code>int32 result_relation = 5 [json_name = "resultRelation"];</code>
   * @return The resultRelation.
   */
  int getResultRelation();

  /**
   * <code>bool has_aggs = 6 [json_name = "hasAggs"];</code>
   * @return The hasAggs.
   */
  boolean getHasAggs();

  /**
   * <code>bool has_window_funcs = 7 [json_name = "hasWindowFuncs"];</code>
   * @return The hasWindowFuncs.
   */
  boolean getHasWindowFuncs();

  /**
   * <code>bool has_target_srfs = 8 [json_name = "hasTargetSRFs"];</code>
   * @return The hasTargetSrfs.
   */
  boolean getHasTargetSrfs();

  /**
   * <code>bool has_sub_links = 9 [json_name = "hasSubLinks"];</code>
   * @return The hasSubLinks.
   */
  boolean getHasSubLinks();

  /**
   * <code>bool has_distinct_on = 10 [json_name = "hasDistinctOn"];</code>
   * @return The hasDistinctOn.
   */
  boolean getHasDistinctOn();

  /**
   * <code>bool has_recursive = 11 [json_name = "hasRecursive"];</code>
   * @return The hasRecursive.
   */
  boolean getHasRecursive();

  /**
   * <code>bool has_modifying_cte = 12 [json_name = "hasModifyingCTE"];</code>
   * @return The hasModifyingCte.
   */
  boolean getHasModifyingCte();

  /**
   * <code>bool has_for_update = 13 [json_name = "hasForUpdate"];</code>
   * @return The hasForUpdate.
   */
  boolean getHasForUpdate();

  /**
   * <code>bool has_row_security = 14 [json_name = "hasRowSecurity"];</code>
   * @return The hasRowSecurity.
   */
  boolean getHasRowSecurity();

  /**
   * <code>repeated .pg_query.Node cte_list = 15 [json_name = "cteList"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getCteListList();
  /**
   * <code>repeated .pg_query.Node cte_list = 15 [json_name = "cteList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCteList(int index);
  /**
   * <code>repeated .pg_query.Node cte_list = 15 [json_name = "cteList"];</code>
   */
  int getCteListCount();
  /**
   * <code>repeated .pg_query.Node cte_list = 15 [json_name = "cteList"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getCteListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node cte_list = 15 [json_name = "cteList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCteListOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node rtable = 16 [json_name = "rtable"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getRtableList();
  /**
   * <code>repeated .pg_query.Node rtable = 16 [json_name = "rtable"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getRtable(int index);
  /**
   * <code>repeated .pg_query.Node rtable = 16 [json_name = "rtable"];</code>
   */
  int getRtableCount();
  /**
   * <code>repeated .pg_query.Node rtable = 16 [json_name = "rtable"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getRtableOrBuilderList();
  /**
   * <code>repeated .pg_query.Node rtable = 16 [json_name = "rtable"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRtableOrBuilder(
      int index);

  /**
   * <code>.pg_query.FromExpr jointree = 17 [json_name = "jointree"];</code>
   * @return Whether the jointree field is set.
   */
  boolean hasJointree();
  /**
   * <code>.pg_query.FromExpr jointree = 17 [json_name = "jointree"];</code>
   * @return The jointree.
   */
  com.premiumminds.sonar.plpgsql.protobuf.FromExpr getJointree();
  /**
   * <code>.pg_query.FromExpr jointree = 17 [json_name = "jointree"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.FromExprOrBuilder getJointreeOrBuilder();

  /**
   * <code>repeated .pg_query.Node target_list = 18 [json_name = "targetList"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getTargetListList();
  /**
   * <code>repeated .pg_query.Node target_list = 18 [json_name = "targetList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getTargetList(int index);
  /**
   * <code>repeated .pg_query.Node target_list = 18 [json_name = "targetList"];</code>
   */
  int getTargetListCount();
  /**
   * <code>repeated .pg_query.Node target_list = 18 [json_name = "targetList"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getTargetListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node target_list = 18 [json_name = "targetList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getTargetListOrBuilder(
      int index);

  /**
   * <code>.pg_query.OverridingKind override = 19 [json_name = "override"];</code>
   * @return The enum numeric value on the wire for override.
   */
  int getOverrideValue();
  /**
   * <code>.pg_query.OverridingKind override = 19 [json_name = "override"];</code>
   * @return The override.
   */
  com.premiumminds.sonar.plpgsql.protobuf.OverridingKind getOverride();

  /**
   * <code>.pg_query.OnConflictExpr on_conflict = 20 [json_name = "onConflict"];</code>
   * @return Whether the onConflict field is set.
   */
  boolean hasOnConflict();
  /**
   * <code>.pg_query.OnConflictExpr on_conflict = 20 [json_name = "onConflict"];</code>
   * @return The onConflict.
   */
  com.premiumminds.sonar.plpgsql.protobuf.OnConflictExpr getOnConflict();
  /**
   * <code>.pg_query.OnConflictExpr on_conflict = 20 [json_name = "onConflict"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.OnConflictExprOrBuilder getOnConflictOrBuilder();

  /**
   * <code>repeated .pg_query.Node returning_list = 21 [json_name = "returningList"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getReturningListList();
  /**
   * <code>repeated .pg_query.Node returning_list = 21 [json_name = "returningList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getReturningList(int index);
  /**
   * <code>repeated .pg_query.Node returning_list = 21 [json_name = "returningList"];</code>
   */
  int getReturningListCount();
  /**
   * <code>repeated .pg_query.Node returning_list = 21 [json_name = "returningList"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getReturningListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node returning_list = 21 [json_name = "returningList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getReturningListOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node group_clause = 22 [json_name = "groupClause"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getGroupClauseList();
  /**
   * <code>repeated .pg_query.Node group_clause = 22 [json_name = "groupClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getGroupClause(int index);
  /**
   * <code>repeated .pg_query.Node group_clause = 22 [json_name = "groupClause"];</code>
   */
  int getGroupClauseCount();
  /**
   * <code>repeated .pg_query.Node group_clause = 22 [json_name = "groupClause"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getGroupClauseOrBuilderList();
  /**
   * <code>repeated .pg_query.Node group_clause = 22 [json_name = "groupClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getGroupClauseOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node grouping_sets = 23 [json_name = "groupingSets"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getGroupingSetsList();
  /**
   * <code>repeated .pg_query.Node grouping_sets = 23 [json_name = "groupingSets"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getGroupingSets(int index);
  /**
   * <code>repeated .pg_query.Node grouping_sets = 23 [json_name = "groupingSets"];</code>
   */
  int getGroupingSetsCount();
  /**
   * <code>repeated .pg_query.Node grouping_sets = 23 [json_name = "groupingSets"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getGroupingSetsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node grouping_sets = 23 [json_name = "groupingSets"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getGroupingSetsOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node having_qual = 24 [json_name = "havingQual"];</code>
   * @return Whether the havingQual field is set.
   */
  boolean hasHavingQual();
  /**
   * <code>.pg_query.Node having_qual = 24 [json_name = "havingQual"];</code>
   * @return The havingQual.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getHavingQual();
  /**
   * <code>.pg_query.Node having_qual = 24 [json_name = "havingQual"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getHavingQualOrBuilder();

  /**
   * <code>repeated .pg_query.Node window_clause = 25 [json_name = "windowClause"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getWindowClauseList();
  /**
   * <code>repeated .pg_query.Node window_clause = 25 [json_name = "windowClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getWindowClause(int index);
  /**
   * <code>repeated .pg_query.Node window_clause = 25 [json_name = "windowClause"];</code>
   */
  int getWindowClauseCount();
  /**
   * <code>repeated .pg_query.Node window_clause = 25 [json_name = "windowClause"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getWindowClauseOrBuilderList();
  /**
   * <code>repeated .pg_query.Node window_clause = 25 [json_name = "windowClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getWindowClauseOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node distinct_clause = 26 [json_name = "distinctClause"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getDistinctClauseList();
  /**
   * <code>repeated .pg_query.Node distinct_clause = 26 [json_name = "distinctClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getDistinctClause(int index);
  /**
   * <code>repeated .pg_query.Node distinct_clause = 26 [json_name = "distinctClause"];</code>
   */
  int getDistinctClauseCount();
  /**
   * <code>repeated .pg_query.Node distinct_clause = 26 [json_name = "distinctClause"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getDistinctClauseOrBuilderList();
  /**
   * <code>repeated .pg_query.Node distinct_clause = 26 [json_name = "distinctClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getDistinctClauseOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node sort_clause = 27 [json_name = "sortClause"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getSortClauseList();
  /**
   * <code>repeated .pg_query.Node sort_clause = 27 [json_name = "sortClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getSortClause(int index);
  /**
   * <code>repeated .pg_query.Node sort_clause = 27 [json_name = "sortClause"];</code>
   */
  int getSortClauseCount();
  /**
   * <code>repeated .pg_query.Node sort_clause = 27 [json_name = "sortClause"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getSortClauseOrBuilderList();
  /**
   * <code>repeated .pg_query.Node sort_clause = 27 [json_name = "sortClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getSortClauseOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node limit_offset = 28 [json_name = "limitOffset"];</code>
   * @return Whether the limitOffset field is set.
   */
  boolean hasLimitOffset();
  /**
   * <code>.pg_query.Node limit_offset = 28 [json_name = "limitOffset"];</code>
   * @return The limitOffset.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getLimitOffset();
  /**
   * <code>.pg_query.Node limit_offset = 28 [json_name = "limitOffset"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getLimitOffsetOrBuilder();

  /**
   * <code>.pg_query.Node limit_count = 29 [json_name = "limitCount"];</code>
   * @return Whether the limitCount field is set.
   */
  boolean hasLimitCount();
  /**
   * <code>.pg_query.Node limit_count = 29 [json_name = "limitCount"];</code>
   * @return The limitCount.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getLimitCount();
  /**
   * <code>.pg_query.Node limit_count = 29 [json_name = "limitCount"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getLimitCountOrBuilder();

  /**
   * <code>.pg_query.LimitOption limit_option = 30 [json_name = "limitOption"];</code>
   * @return The enum numeric value on the wire for limitOption.
   */
  int getLimitOptionValue();
  /**
   * <code>.pg_query.LimitOption limit_option = 30 [json_name = "limitOption"];</code>
   * @return The limitOption.
   */
  com.premiumminds.sonar.plpgsql.protobuf.LimitOption getLimitOption();

  /**
   * <code>repeated .pg_query.Node row_marks = 31 [json_name = "rowMarks"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getRowMarksList();
  /**
   * <code>repeated .pg_query.Node row_marks = 31 [json_name = "rowMarks"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getRowMarks(int index);
  /**
   * <code>repeated .pg_query.Node row_marks = 31 [json_name = "rowMarks"];</code>
   */
  int getRowMarksCount();
  /**
   * <code>repeated .pg_query.Node row_marks = 31 [json_name = "rowMarks"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getRowMarksOrBuilderList();
  /**
   * <code>repeated .pg_query.Node row_marks = 31 [json_name = "rowMarks"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRowMarksOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node set_operations = 32 [json_name = "setOperations"];</code>
   * @return Whether the setOperations field is set.
   */
  boolean hasSetOperations();
  /**
   * <code>.pg_query.Node set_operations = 32 [json_name = "setOperations"];</code>
   * @return The setOperations.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getSetOperations();
  /**
   * <code>.pg_query.Node set_operations = 32 [json_name = "setOperations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getSetOperationsOrBuilder();

  /**
   * <code>repeated .pg_query.Node constraint_deps = 33 [json_name = "constraintDeps"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getConstraintDepsList();
  /**
   * <code>repeated .pg_query.Node constraint_deps = 33 [json_name = "constraintDeps"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getConstraintDeps(int index);
  /**
   * <code>repeated .pg_query.Node constraint_deps = 33 [json_name = "constraintDeps"];</code>
   */
  int getConstraintDepsCount();
  /**
   * <code>repeated .pg_query.Node constraint_deps = 33 [json_name = "constraintDeps"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getConstraintDepsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node constraint_deps = 33 [json_name = "constraintDeps"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getConstraintDepsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node with_check_options = 34 [json_name = "withCheckOptions"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getWithCheckOptionsList();
  /**
   * <code>repeated .pg_query.Node with_check_options = 34 [json_name = "withCheckOptions"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getWithCheckOptions(int index);
  /**
   * <code>repeated .pg_query.Node with_check_options = 34 [json_name = "withCheckOptions"];</code>
   */
  int getWithCheckOptionsCount();
  /**
   * <code>repeated .pg_query.Node with_check_options = 34 [json_name = "withCheckOptions"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getWithCheckOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node with_check_options = 34 [json_name = "withCheckOptions"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getWithCheckOptionsOrBuilder(
      int index);

  /**
   * <code>int32 stmt_location = 35 [json_name = "stmt_location"];</code>
   * @return The stmtLocation.
   */
  int getStmtLocation();

  /**
   * <code>int32 stmt_len = 36 [json_name = "stmt_len"];</code>
   * @return The stmtLen.
   */
  int getStmtLen();
}