// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface JoinExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.JoinExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.JoinType jointype = 1 [json_name = "jointype"];</code>
   * @return The enum numeric value on the wire for jointype.
   */
  int getJointypeValue();
  /**
   * <code>.pg_query.JoinType jointype = 1 [json_name = "jointype"];</code>
   * @return The jointype.
   */
  com.premiumminds.sonar.postgres.protobuf.JoinType getJointype();

  /**
   * <code>bool is_natural = 2 [json_name = "isNatural"];</code>
   * @return The isNatural.
   */
  boolean getIsNatural();

  /**
   * <code>.pg_query.Node larg = 3 [json_name = "larg"];</code>
   * @return Whether the larg field is set.
   */
  boolean hasLarg();
  /**
   * <code>.pg_query.Node larg = 3 [json_name = "larg"];</code>
   * @return The larg.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getLarg();
  /**
   * <code>.pg_query.Node larg = 3 [json_name = "larg"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getLargOrBuilder();

  /**
   * <code>.pg_query.Node rarg = 4 [json_name = "rarg"];</code>
   * @return Whether the rarg field is set.
   */
  boolean hasRarg();
  /**
   * <code>.pg_query.Node rarg = 4 [json_name = "rarg"];</code>
   * @return The rarg.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRarg();
  /**
   * <code>.pg_query.Node rarg = 4 [json_name = "rarg"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRargOrBuilder();

  /**
   * <code>repeated .pg_query.Node using_clause = 5 [json_name = "usingClause"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getUsingClauseList();
  /**
   * <code>repeated .pg_query.Node using_clause = 5 [json_name = "usingClause"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getUsingClause(int index);
  /**
   * <code>repeated .pg_query.Node using_clause = 5 [json_name = "usingClause"];</code>
   */
  int getUsingClauseCount();
  /**
   * <code>repeated .pg_query.Node using_clause = 5 [json_name = "usingClause"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getUsingClauseOrBuilderList();
  /**
   * <code>repeated .pg_query.Node using_clause = 5 [json_name = "usingClause"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getUsingClauseOrBuilder(
      int index);

  /**
   * <code>.pg_query.Alias join_using_alias = 6 [json_name = "join_using_alias"];</code>
   * @return Whether the joinUsingAlias field is set.
   */
  boolean hasJoinUsingAlias();
  /**
   * <code>.pg_query.Alias join_using_alias = 6 [json_name = "join_using_alias"];</code>
   * @return The joinUsingAlias.
   */
  com.premiumminds.sonar.postgres.protobuf.Alias getJoinUsingAlias();
  /**
   * <code>.pg_query.Alias join_using_alias = 6 [json_name = "join_using_alias"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getJoinUsingAliasOrBuilder();

  /**
   * <code>.pg_query.Node quals = 7 [json_name = "quals"];</code>
   * @return Whether the quals field is set.
   */
  boolean hasQuals();
  /**
   * <code>.pg_query.Node quals = 7 [json_name = "quals"];</code>
   * @return The quals.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getQuals();
  /**
   * <code>.pg_query.Node quals = 7 [json_name = "quals"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getQualsOrBuilder();

  /**
   * <code>.pg_query.Alias alias = 8 [json_name = "alias"];</code>
   * @return Whether the alias field is set.
   */
  boolean hasAlias();
  /**
   * <code>.pg_query.Alias alias = 8 [json_name = "alias"];</code>
   * @return The alias.
   */
  com.premiumminds.sonar.postgres.protobuf.Alias getAlias();
  /**
   * <code>.pg_query.Alias alias = 8 [json_name = "alias"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getAliasOrBuilder();

  /**
   * <code>int32 rtindex = 9 [json_name = "rtindex"];</code>
   * @return The rtindex.
   */
  int getRtindex();
}
