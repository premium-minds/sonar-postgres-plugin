// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface ParamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.Param)
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
   * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
   * @return The enum numeric value on the wire for paramkind.
   */
  int getParamkindValue();
  /**
   * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
   * @return The paramkind.
   */
  com.premiumminds.sonar.plpgsql.protobuf.ParamKind getParamkind();

  /**
   * <code>int32 paramid = 3 [json_name = "paramid"];</code>
   * @return The paramid.
   */
  int getParamid();

  /**
   * <code>uint32 paramtype = 4 [json_name = "paramtype"];</code>
   * @return The paramtype.
   */
  int getParamtype();

  /**
   * <code>int32 paramtypmod = 5 [json_name = "paramtypmod"];</code>
   * @return The paramtypmod.
   */
  int getParamtypmod();

  /**
   * <code>uint32 paramcollid = 6 [json_name = "paramcollid"];</code>
   * @return The paramcollid.
   */
  int getParamcollid();

  /**
   * <code>int32 location = 7 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}