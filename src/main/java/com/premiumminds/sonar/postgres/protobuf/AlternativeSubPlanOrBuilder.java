// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface AlternativeSubPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlternativeSubPlan)
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
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getSubplansList();
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getSubplans(int index);
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  int getSubplansCount();
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getSubplansOrBuilderList();
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSubplansOrBuilder(
      int index);
}