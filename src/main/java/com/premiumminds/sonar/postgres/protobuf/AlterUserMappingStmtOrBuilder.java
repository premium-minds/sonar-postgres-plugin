// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface AlterUserMappingStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterUserMappingStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
   * @return The user.
   */
  com.premiumminds.sonar.postgres.protobuf.RoleSpec getUser();
  /**
   * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder getUserOrBuilder();

  /**
   * <code>string servername = 2 [json_name = "servername"];</code>
   * @return The servername.
   */
  java.lang.String getServername();
  /**
   * <code>string servername = 2 [json_name = "servername"];</code>
   * @return The bytes for servername.
   */
  com.google.protobuf.ByteString
      getServernameBytes();

  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);
}