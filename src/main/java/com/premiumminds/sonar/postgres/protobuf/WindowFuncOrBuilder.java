// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface WindowFuncOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.WindowFunc)
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
   * <code>uint32 winfnoid = 2 [json_name = "winfnoid"];</code>
   * @return The winfnoid.
   */
  int getWinfnoid();

  /**
   * <code>uint32 wintype = 3 [json_name = "wintype"];</code>
   * @return The wintype.
   */
  int getWintype();

  /**
   * <code>uint32 wincollid = 4 [json_name = "wincollid"];</code>
   * @return The wincollid.
   */
  int getWincollid();

  /**
   * <code>uint32 inputcollid = 5 [json_name = "inputcollid"];</code>
   * @return The inputcollid.
   */
  int getInputcollid();

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
   * <code>.pg_query.Node aggfilter = 7 [json_name = "aggfilter"];</code>
   * @return Whether the aggfilter field is set.
   */
  boolean hasAggfilter();
  /**
   * <code>.pg_query.Node aggfilter = 7 [json_name = "aggfilter"];</code>
   * @return The aggfilter.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getAggfilter();
  /**
   * <code>.pg_query.Node aggfilter = 7 [json_name = "aggfilter"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getAggfilterOrBuilder();

  /**
   * <code>uint32 winref = 8 [json_name = "winref"];</code>
   * @return The winref.
   */
  int getWinref();

  /**
   * <code>bool winstar = 9 [json_name = "winstar"];</code>
   * @return The winstar.
   */
  boolean getWinstar();

  /**
   * <code>bool winagg = 10 [json_name = "winagg"];</code>
   * @return The winagg.
   */
  boolean getWinagg();

  /**
   * <code>int32 location = 11 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
