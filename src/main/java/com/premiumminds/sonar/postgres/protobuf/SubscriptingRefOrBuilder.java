// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface SubscriptingRefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.SubscriptingRef)
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
   * <code>uint32 refcontainertype = 2 [json_name = "refcontainertype"];</code>
   * @return The refcontainertype.
   */
  int getRefcontainertype();

  /**
   * <code>uint32 refelemtype = 3 [json_name = "refelemtype"];</code>
   * @return The refelemtype.
   */
  int getRefelemtype();

  /**
   * <code>uint32 refrestype = 4 [json_name = "refrestype"];</code>
   * @return The refrestype.
   */
  int getRefrestype();

  /**
   * <code>int32 reftypmod = 5 [json_name = "reftypmod"];</code>
   * @return The reftypmod.
   */
  int getReftypmod();

  /**
   * <code>uint32 refcollid = 6 [json_name = "refcollid"];</code>
   * @return The refcollid.
   */
  int getRefcollid();

  /**
   * <code>repeated .pg_query.Node refupperindexpr = 7 [json_name = "refupperindexpr"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getRefupperindexprList();
  /**
   * <code>repeated .pg_query.Node refupperindexpr = 7 [json_name = "refupperindexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRefupperindexpr(int index);
  /**
   * <code>repeated .pg_query.Node refupperindexpr = 7 [json_name = "refupperindexpr"];</code>
   */
  int getRefupperindexprCount();
  /**
   * <code>repeated .pg_query.Node refupperindexpr = 7 [json_name = "refupperindexpr"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getRefupperindexprOrBuilderList();
  /**
   * <code>repeated .pg_query.Node refupperindexpr = 7 [json_name = "refupperindexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRefupperindexprOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node reflowerindexpr = 8 [json_name = "reflowerindexpr"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getReflowerindexprList();
  /**
   * <code>repeated .pg_query.Node reflowerindexpr = 8 [json_name = "reflowerindexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getReflowerindexpr(int index);
  /**
   * <code>repeated .pg_query.Node reflowerindexpr = 8 [json_name = "reflowerindexpr"];</code>
   */
  int getReflowerindexprCount();
  /**
   * <code>repeated .pg_query.Node reflowerindexpr = 8 [json_name = "reflowerindexpr"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getReflowerindexprOrBuilderList();
  /**
   * <code>repeated .pg_query.Node reflowerindexpr = 8 [json_name = "reflowerindexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getReflowerindexprOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node refexpr = 9 [json_name = "refexpr"];</code>
   * @return Whether the refexpr field is set.
   */
  boolean hasRefexpr();
  /**
   * <code>.pg_query.Node refexpr = 9 [json_name = "refexpr"];</code>
   * @return The refexpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRefexpr();
  /**
   * <code>.pg_query.Node refexpr = 9 [json_name = "refexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRefexprOrBuilder();

  /**
   * <code>.pg_query.Node refassgnexpr = 10 [json_name = "refassgnexpr"];</code>
   * @return Whether the refassgnexpr field is set.
   */
  boolean hasRefassgnexpr();
  /**
   * <code>.pg_query.Node refassgnexpr = 10 [json_name = "refassgnexpr"];</code>
   * @return The refassgnexpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRefassgnexpr();
  /**
   * <code>.pg_query.Node refassgnexpr = 10 [json_name = "refassgnexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRefassgnexprOrBuilder();
}
