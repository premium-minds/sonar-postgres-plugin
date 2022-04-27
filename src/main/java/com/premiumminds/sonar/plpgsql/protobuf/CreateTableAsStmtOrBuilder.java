// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface CreateTableAsStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreateTableAsStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node query = 1 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <code>.pg_query.Node query = 1 [json_name = "query"];</code>
   * @return The query.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getQuery();
  /**
   * <code>.pg_query.Node query = 1 [json_name = "query"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getQueryOrBuilder();

  /**
   * <code>.pg_query.IntoClause into = 2 [json_name = "into"];</code>
   * @return Whether the into field is set.
   */
  boolean hasInto();
  /**
   * <code>.pg_query.IntoClause into = 2 [json_name = "into"];</code>
   * @return The into.
   */
  com.premiumminds.sonar.plpgsql.protobuf.IntoClause getInto();
  /**
   * <code>.pg_query.IntoClause into = 2 [json_name = "into"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.IntoClauseOrBuilder getIntoOrBuilder();

  /**
   * <code>.pg_query.ObjectType relkind = 3 [json_name = "relkind"];</code>
   * @return The enum numeric value on the wire for relkind.
   */
  int getRelkindValue();
  /**
   * <code>.pg_query.ObjectType relkind = 3 [json_name = "relkind"];</code>
   * @return The relkind.
   */
  com.premiumminds.sonar.plpgsql.protobuf.ObjectType getRelkind();

  /**
   * <code>bool is_select_into = 4 [json_name = "is_select_into"];</code>
   * @return The isSelectInto.
   */
  boolean getIsSelectInto();

  /**
   * <code>bool if_not_exists = 5 [json_name = "if_not_exists"];</code>
   * @return The ifNotExists.
   */
  boolean getIfNotExists();
}