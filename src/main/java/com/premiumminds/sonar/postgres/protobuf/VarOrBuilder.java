// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface VarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.Var)
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
   * <code>int32 varno = 2 [json_name = "varno"];</code>
   * @return The varno.
   */
  int getVarno();

  /**
   * <code>int32 varattno = 3 [json_name = "varattno"];</code>
   * @return The varattno.
   */
  int getVarattno();

  /**
   * <code>uint32 vartype = 4 [json_name = "vartype"];</code>
   * @return The vartype.
   */
  int getVartype();

  /**
   * <code>int32 vartypmod = 5 [json_name = "vartypmod"];</code>
   * @return The vartypmod.
   */
  int getVartypmod();

  /**
   * <code>uint32 varcollid = 6 [json_name = "varcollid"];</code>
   * @return The varcollid.
   */
  int getVarcollid();

  /**
   * <code>uint32 varlevelsup = 7 [json_name = "varlevelsup"];</code>
   * @return The varlevelsup.
   */
  int getVarlevelsup();

  /**
   * <code>uint32 varnosyn = 8 [json_name = "varnosyn"];</code>
   * @return The varnosyn.
   */
  int getVarnosyn();

  /**
   * <code>int32 varattnosyn = 9 [json_name = "varattnosyn"];</code>
   * @return The varattnosyn.
   */
  int getVarattnosyn();

  /**
   * <code>int32 location = 10 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
