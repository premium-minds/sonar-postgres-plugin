// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterStatsStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterStatsStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node defnames = 1 [json_name = "defnames"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getDefnamesList();
  /**
   * <code>repeated .pg_query.Node defnames = 1 [json_name = "defnames"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getDefnames(int index);
  /**
   * <code>repeated .pg_query.Node defnames = 1 [json_name = "defnames"];</code>
   */
  int getDefnamesCount();
  /**
   * <code>repeated .pg_query.Node defnames = 1 [json_name = "defnames"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getDefnamesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node defnames = 1 [json_name = "defnames"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getDefnamesOrBuilder(
      int index);

  /**
   * <code>int32 stxstattarget = 2 [json_name = "stxstattarget"];</code>
   * @return The stxstattarget.
   */
  int getStxstattarget();

  /**
   * <code>bool missing_ok = 3 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  boolean getMissingOk();
}
