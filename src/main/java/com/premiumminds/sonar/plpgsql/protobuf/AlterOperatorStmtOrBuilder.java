// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface AlterOperatorStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterOperatorStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
   * @return Whether the opername field is set.
   */
  boolean hasOpername();
  /**
   * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
   * @return The opername.
   */
  com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs getOpername();
  /**
   * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgsOrBuilder getOpernameOrBuilder();

  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);
}