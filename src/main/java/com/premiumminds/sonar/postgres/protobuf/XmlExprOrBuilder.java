// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface XmlExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.XmlExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  boolean hasXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return The xpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getXprOrBuilder();

  /**
   * <code>.pg_query.XmlExprOp op = 2 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   * <code>.pg_query.XmlExprOp op = 2 [json_name = "op"];</code>
   * @return The op.
   */
  com.premiumminds.sonar.postgres.protobuf.XmlExprOp getOp();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .pg_query.Node named_args = 4 [json_name = "named_args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getNamedArgsList();
  /**
   * <code>repeated .pg_query.Node named_args = 4 [json_name = "named_args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getNamedArgs(int index);
  /**
   * <code>repeated .pg_query.Node named_args = 4 [json_name = "named_args"];</code>
   */
  int getNamedArgsCount();
  /**
   * <code>repeated .pg_query.Node named_args = 4 [json_name = "named_args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getNamedArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node named_args = 4 [json_name = "named_args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getNamedArgsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node arg_names = 5 [json_name = "arg_names"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgNamesList();
  /**
   * <code>repeated .pg_query.Node arg_names = 5 [json_name = "arg_names"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgNames(int index);
  /**
   * <code>repeated .pg_query.Node arg_names = 5 [json_name = "arg_names"];</code>
   */
  int getArgNamesCount();
  /**
   * <code>repeated .pg_query.Node arg_names = 5 [json_name = "arg_names"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgNamesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node arg_names = 5 [json_name = "arg_names"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgNamesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node args = 6 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 6 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 6 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 6 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 6 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>.pg_query.XmlOptionType xmloption = 7 [json_name = "xmloption"];</code>
   * @return The enum numeric value on the wire for xmloption.
   */
  int getXmloptionValue();
  /**
   * <code>.pg_query.XmlOptionType xmloption = 7 [json_name = "xmloption"];</code>
   * @return The xmloption.
   */
  com.premiumminds.sonar.postgres.protobuf.XmlOptionType getXmloption();

  /**
   * <code>bool indent = 8 [json_name = "indent"];</code>
   * @return The indent.
   */
  boolean getIndent();

  /**
   * <code>uint32 type = 9 [json_name = "type"];</code>
   * @return The type.
   */
  int getType();

  /**
   * <code>int32 typmod = 10 [json_name = "typmod"];</code>
   * @return The typmod.
   */
  int getTypmod();

  /**
   * <code>int32 location = 11 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
