// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface VariableSetStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.VariableSetStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.VariableSetKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <code>.pg_query.VariableSetKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  com.premiumminds.sonar.postgres.protobuf.VariableSetKind getKind();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 3 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>bool is_local = 4 [json_name = "is_local"];</code>
   * @return The isLocal.
   */
  boolean getIsLocal();
}
