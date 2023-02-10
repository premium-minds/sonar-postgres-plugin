// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface AlterPublicationStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterPublicationStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pubname = 1 [json_name = "pubname"];</code>
   * @return The pubname.
   */
  java.lang.String getPubname();
  /**
   * <code>string pubname = 1 [json_name = "pubname"];</code>
   * @return The bytes for pubname.
   */
  com.google.protobuf.ByteString
      getPubnameBytes();

  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node pubobjects = 3 [json_name = "pubobjects"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getPubobjectsList();
  /**
   * <code>repeated .pg_query.Node pubobjects = 3 [json_name = "pubobjects"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPubobjects(int index);
  /**
   * <code>repeated .pg_query.Node pubobjects = 3 [json_name = "pubobjects"];</code>
   */
  int getPubobjectsCount();
  /**
   * <code>repeated .pg_query.Node pubobjects = 3 [json_name = "pubobjects"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getPubobjectsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node pubobjects = 3 [json_name = "pubobjects"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPubobjectsOrBuilder(
      int index);

  /**
   * <code>bool for_all_tables = 4 [json_name = "for_all_tables"];</code>
   * @return The forAllTables.
   */
  boolean getForAllTables();

  /**
   * <code>.pg_query.AlterPublicationAction action = 5 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <code>.pg_query.AlterPublicationAction action = 5 [json_name = "action"];</code>
   * @return The action.
   */
  com.premiumminds.sonar.postgres.protobuf.AlterPublicationAction getAction();
}
