// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface TruncateStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.TruncateStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getRelationsList();
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getRelations(int index);
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  int getRelationsCount();
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getRelationsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRelationsOrBuilder(
      int index);

  /**
   * <code>bool restart_seqs = 2 [json_name = "restart_seqs"];</code>
   * @return The restartSeqs.
   */
  boolean getRestartSeqs();

  /**
   * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
   * @return The enum numeric value on the wire for behavior.
   */
  int getBehaviorValue();
  /**
   * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
   * @return The behavior.
   */
  com.premiumminds.sonar.plpgsql.protobuf.DropBehavior getBehavior();
}