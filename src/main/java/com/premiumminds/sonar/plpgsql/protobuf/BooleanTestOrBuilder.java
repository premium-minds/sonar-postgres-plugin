// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface BooleanTestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.BooleanTest)
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
  com.premiumminds.sonar.plpgsql.protobuf.Node getXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getXprOrBuilder();

  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  boolean hasArg();
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return The arg.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getArg();
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgOrBuilder();

  /**
   * <code>.pg_query.BoolTestType booltesttype = 3 [json_name = "booltesttype"];</code>
   * @return The enum numeric value on the wire for booltesttype.
   */
  int getBooltesttypeValue();
  /**
   * <code>.pg_query.BoolTestType booltesttype = 3 [json_name = "booltesttype"];</code>
   * @return The booltesttype.
   */
  com.premiumminds.sonar.plpgsql.protobuf.BoolTestType getBooltesttype();

  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}