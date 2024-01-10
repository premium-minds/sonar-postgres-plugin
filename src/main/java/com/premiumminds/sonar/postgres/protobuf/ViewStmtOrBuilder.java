// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface ViewStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ViewStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RangeVar view = 1 [json_name = "view"];</code>
   * @return Whether the view field is set.
   */
  boolean hasView();
  /**
   * <code>.pg_query.RangeVar view = 1 [json_name = "view"];</code>
   * @return The view.
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVar getView();
  /**
   * <code>.pg_query.RangeVar view = 1 [json_name = "view"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getViewOrBuilder();

  /**
   * <code>repeated .pg_query.Node aliases = 2 [json_name = "aliases"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getAliasesList();
  /**
   * <code>repeated .pg_query.Node aliases = 2 [json_name = "aliases"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getAliases(int index);
  /**
   * <code>repeated .pg_query.Node aliases = 2 [json_name = "aliases"];</code>
   */
  int getAliasesCount();
  /**
   * <code>repeated .pg_query.Node aliases = 2 [json_name = "aliases"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getAliasesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node aliases = 2 [json_name = "aliases"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getAliasesOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   * @return The query.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getQuery();
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getQueryOrBuilder();

  /**
   * <code>bool replace = 4 [json_name = "replace"];</code>
   * @return The replace.
   */
  boolean getReplace();

  /**
   * <code>repeated .pg_query.Node options = 5 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 5 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 5 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 5 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 5 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <code>.pg_query.ViewCheckOption with_check_option = 6 [json_name = "withCheckOption"];</code>
   * @return The enum numeric value on the wire for withCheckOption.
   */
  int getWithCheckOptionValue();
  /**
   * <code>.pg_query.ViewCheckOption with_check_option = 6 [json_name = "withCheckOption"];</code>
   * @return The withCheckOption.
   */
  com.premiumminds.sonar.postgres.protobuf.ViewCheckOption getWithCheckOption();
}
