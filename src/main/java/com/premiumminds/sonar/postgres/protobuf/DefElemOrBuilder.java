// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface DefElemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.DefElem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string defnamespace = 1 [json_name = "defnamespace"];</code>
   * @return The defnamespace.
   */
  java.lang.String getDefnamespace();
  /**
   * <code>string defnamespace = 1 [json_name = "defnamespace"];</code>
   * @return The bytes for defnamespace.
   */
  com.google.protobuf.ByteString
      getDefnamespaceBytes();

  /**
   * <code>string defname = 2 [json_name = "defname"];</code>
   * @return The defname.
   */
  java.lang.String getDefname();
  /**
   * <code>string defname = 2 [json_name = "defname"];</code>
   * @return The bytes for defname.
   */
  com.google.protobuf.ByteString
      getDefnameBytes();

  /**
   * <code>.pg_query.Node arg = 3 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  boolean hasArg();
  /**
   * <code>.pg_query.Node arg = 3 [json_name = "arg"];</code>
   * @return The arg.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getArg();
  /**
   * <code>.pg_query.Node arg = 3 [json_name = "arg"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgOrBuilder();

  /**
   * <code>.pg_query.DefElemAction defaction = 4 [json_name = "defaction"];</code>
   * @return The enum numeric value on the wire for defaction.
   */
  int getDefactionValue();
  /**
   * <code>.pg_query.DefElemAction defaction = 4 [json_name = "defaction"];</code>
   * @return The defaction.
   */
  com.premiumminds.sonar.postgres.protobuf.DefElemAction getDefaction();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
