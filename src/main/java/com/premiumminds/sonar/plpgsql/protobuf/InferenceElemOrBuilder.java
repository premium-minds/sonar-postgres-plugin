// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface InferenceElemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.InferenceElem)
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
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getExpr();
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getExprOrBuilder();

  /**
   * <code>uint32 infercollid = 3 [json_name = "infercollid"];</code>
   * @return The infercollid.
   */
  int getInfercollid();

  /**
   * <code>uint32 inferopclass = 4 [json_name = "inferopclass"];</code>
   * @return The inferopclass.
   */
  int getInferopclass();
}