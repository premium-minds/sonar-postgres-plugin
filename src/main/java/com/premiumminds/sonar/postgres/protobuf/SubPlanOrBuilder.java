// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface SubPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.SubPlan)
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
   * <code>.pg_query.SubLinkType sub_link_type = 2 [json_name = "subLinkType"];</code>
   * @return The enum numeric value on the wire for subLinkType.
   */
  int getSubLinkTypeValue();
  /**
   * <code>.pg_query.SubLinkType sub_link_type = 2 [json_name = "subLinkType"];</code>
   * @return The subLinkType.
   */
  com.premiumminds.sonar.postgres.protobuf.SubLinkType getSubLinkType();

  /**
   * <code>.pg_query.Node testexpr = 3 [json_name = "testexpr"];</code>
   * @return Whether the testexpr field is set.
   */
  boolean hasTestexpr();
  /**
   * <code>.pg_query.Node testexpr = 3 [json_name = "testexpr"];</code>
   * @return The testexpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getTestexpr();
  /**
   * <code>.pg_query.Node testexpr = 3 [json_name = "testexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getTestexprOrBuilder();

  /**
   * <code>repeated .pg_query.Node param_ids = 4 [json_name = "paramIds"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getParamIdsList();
  /**
   * <code>repeated .pg_query.Node param_ids = 4 [json_name = "paramIds"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getParamIds(int index);
  /**
   * <code>repeated .pg_query.Node param_ids = 4 [json_name = "paramIds"];</code>
   */
  int getParamIdsCount();
  /**
   * <code>repeated .pg_query.Node param_ids = 4 [json_name = "paramIds"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getParamIdsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node param_ids = 4 [json_name = "paramIds"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getParamIdsOrBuilder(
      int index);

  /**
   * <code>int32 plan_id = 5 [json_name = "plan_id"];</code>
   * @return The planId.
   */
  int getPlanId();

  /**
   * <code>string plan_name = 6 [json_name = "plan_name"];</code>
   * @return The planName.
   */
  java.lang.String getPlanName();
  /**
   * <code>string plan_name = 6 [json_name = "plan_name"];</code>
   * @return The bytes for planName.
   */
  com.google.protobuf.ByteString
      getPlanNameBytes();

  /**
   * <code>uint32 first_col_type = 7 [json_name = "firstColType"];</code>
   * @return The firstColType.
   */
  int getFirstColType();

  /**
   * <code>int32 first_col_typmod = 8 [json_name = "firstColTypmod"];</code>
   * @return The firstColTypmod.
   */
  int getFirstColTypmod();

  /**
   * <code>uint32 first_col_collation = 9 [json_name = "firstColCollation"];</code>
   * @return The firstColCollation.
   */
  int getFirstColCollation();

  /**
   * <code>bool use_hash_table = 10 [json_name = "useHashTable"];</code>
   * @return The useHashTable.
   */
  boolean getUseHashTable();

  /**
   * <code>bool unknown_eq_false = 11 [json_name = "unknownEqFalse"];</code>
   * @return The unknownEqFalse.
   */
  boolean getUnknownEqFalse();

  /**
   * <code>bool parallel_safe = 12 [json_name = "parallel_safe"];</code>
   * @return The parallelSafe.
   */
  boolean getParallelSafe();

  /**
   * <code>repeated .pg_query.Node set_param = 13 [json_name = "setParam"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getSetParamList();
  /**
   * <code>repeated .pg_query.Node set_param = 13 [json_name = "setParam"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getSetParam(int index);
  /**
   * <code>repeated .pg_query.Node set_param = 13 [json_name = "setParam"];</code>
   */
  int getSetParamCount();
  /**
   * <code>repeated .pg_query.Node set_param = 13 [json_name = "setParam"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getSetParamOrBuilderList();
  /**
   * <code>repeated .pg_query.Node set_param = 13 [json_name = "setParam"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSetParamOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node par_param = 14 [json_name = "parParam"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getParParamList();
  /**
   * <code>repeated .pg_query.Node par_param = 14 [json_name = "parParam"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getParParam(int index);
  /**
   * <code>repeated .pg_query.Node par_param = 14 [json_name = "parParam"];</code>
   */
  int getParParamCount();
  /**
   * <code>repeated .pg_query.Node par_param = 14 [json_name = "parParam"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getParParamOrBuilderList();
  /**
   * <code>repeated .pg_query.Node par_param = 14 [json_name = "parParam"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getParParamOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node args = 15 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 15 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 15 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 15 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 15 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>double startup_cost = 16 [json_name = "startup_cost"];</code>
   * @return The startupCost.
   */
  double getStartupCost();

  /**
   * <code>double per_call_cost = 17 [json_name = "per_call_cost"];</code>
   * @return The perCallCost.
   */
  double getPerCallCost();
}
