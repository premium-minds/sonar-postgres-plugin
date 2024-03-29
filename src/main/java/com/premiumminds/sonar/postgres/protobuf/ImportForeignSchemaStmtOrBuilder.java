// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface ImportForeignSchemaStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ImportForeignSchemaStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string server_name = 1 [json_name = "server_name"];</code>
   * @return The serverName.
   */
  java.lang.String getServerName();
  /**
   * <code>string server_name = 1 [json_name = "server_name"];</code>
   * @return The bytes for serverName.
   */
  com.google.protobuf.ByteString
      getServerNameBytes();

  /**
   * <code>string remote_schema = 2 [json_name = "remote_schema"];</code>
   * @return The remoteSchema.
   */
  java.lang.String getRemoteSchema();
  /**
   * <code>string remote_schema = 2 [json_name = "remote_schema"];</code>
   * @return The bytes for remoteSchema.
   */
  com.google.protobuf.ByteString
      getRemoteSchemaBytes();

  /**
   * <code>string local_schema = 3 [json_name = "local_schema"];</code>
   * @return The localSchema.
   */
  java.lang.String getLocalSchema();
  /**
   * <code>string local_schema = 3 [json_name = "local_schema"];</code>
   * @return The bytes for localSchema.
   */
  com.google.protobuf.ByteString
      getLocalSchemaBytes();

  /**
   * <code>.pg_query.ImportForeignSchemaType list_type = 4 [json_name = "list_type"];</code>
   * @return The enum numeric value on the wire for listType.
   */
  int getListTypeValue();
  /**
   * <code>.pg_query.ImportForeignSchemaType list_type = 4 [json_name = "list_type"];</code>
   * @return The listType.
   */
  com.premiumminds.sonar.postgres.protobuf.ImportForeignSchemaType getListType();

  /**
   * <code>repeated .pg_query.Node table_list = 5 [json_name = "table_list"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getTableListList();
  /**
   * <code>repeated .pg_query.Node table_list = 5 [json_name = "table_list"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getTableList(int index);
  /**
   * <code>repeated .pg_query.Node table_list = 5 [json_name = "table_list"];</code>
   */
  int getTableListCount();
  /**
   * <code>repeated .pg_query.Node table_list = 5 [json_name = "table_list"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getTableListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node table_list = 5 [json_name = "table_list"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getTableListOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node options = 6 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 6 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 6 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 6 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 6 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);
}
