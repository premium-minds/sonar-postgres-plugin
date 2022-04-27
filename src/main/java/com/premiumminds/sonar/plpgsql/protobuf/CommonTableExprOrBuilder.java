// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface CommonTableExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CommonTableExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ctename = 1 [json_name = "ctename"];</code>
   * @return The ctename.
   */
  java.lang.String getCtename();
  /**
   * <code>string ctename = 1 [json_name = "ctename"];</code>
   * @return The bytes for ctename.
   */
  com.google.protobuf.ByteString
      getCtenameBytes();

  /**
   * <code>repeated .pg_query.Node aliascolnames = 2 [json_name = "aliascolnames"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getAliascolnamesList();
  /**
   * <code>repeated .pg_query.Node aliascolnames = 2 [json_name = "aliascolnames"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getAliascolnames(int index);
  /**
   * <code>repeated .pg_query.Node aliascolnames = 2 [json_name = "aliascolnames"];</code>
   */
  int getAliascolnamesCount();
  /**
   * <code>repeated .pg_query.Node aliascolnames = 2 [json_name = "aliascolnames"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getAliascolnamesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node aliascolnames = 2 [json_name = "aliascolnames"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getAliascolnamesOrBuilder(
      int index);

  /**
   * <code>.pg_query.CTEMaterialize ctematerialized = 3 [json_name = "ctematerialized"];</code>
   * @return The enum numeric value on the wire for ctematerialized.
   */
  int getCtematerializedValue();
  /**
   * <code>.pg_query.CTEMaterialize ctematerialized = 3 [json_name = "ctematerialized"];</code>
   * @return The ctematerialized.
   */
  com.premiumminds.sonar.plpgsql.protobuf.CTEMaterialize getCtematerialized();

  /**
   * <code>.pg_query.Node ctequery = 4 [json_name = "ctequery"];</code>
   * @return Whether the ctequery field is set.
   */
  boolean hasCtequery();
  /**
   * <code>.pg_query.Node ctequery = 4 [json_name = "ctequery"];</code>
   * @return The ctequery.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCtequery();
  /**
   * <code>.pg_query.Node ctequery = 4 [json_name = "ctequery"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCtequeryOrBuilder();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();

  /**
   * <code>bool cterecursive = 6 [json_name = "cterecursive"];</code>
   * @return The cterecursive.
   */
  boolean getCterecursive();

  /**
   * <code>int32 cterefcount = 7 [json_name = "cterefcount"];</code>
   * @return The cterefcount.
   */
  int getCterefcount();

  /**
   * <code>repeated .pg_query.Node ctecolnames = 8 [json_name = "ctecolnames"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getCtecolnamesList();
  /**
   * <code>repeated .pg_query.Node ctecolnames = 8 [json_name = "ctecolnames"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCtecolnames(int index);
  /**
   * <code>repeated .pg_query.Node ctecolnames = 8 [json_name = "ctecolnames"];</code>
   */
  int getCtecolnamesCount();
  /**
   * <code>repeated .pg_query.Node ctecolnames = 8 [json_name = "ctecolnames"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getCtecolnamesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node ctecolnames = 8 [json_name = "ctecolnames"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCtecolnamesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node ctecoltypes = 9 [json_name = "ctecoltypes"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getCtecoltypesList();
  /**
   * <code>repeated .pg_query.Node ctecoltypes = 9 [json_name = "ctecoltypes"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCtecoltypes(int index);
  /**
   * <code>repeated .pg_query.Node ctecoltypes = 9 [json_name = "ctecoltypes"];</code>
   */
  int getCtecoltypesCount();
  /**
   * <code>repeated .pg_query.Node ctecoltypes = 9 [json_name = "ctecoltypes"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getCtecoltypesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node ctecoltypes = 9 [json_name = "ctecoltypes"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCtecoltypesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node ctecoltypmods = 10 [json_name = "ctecoltypmods"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getCtecoltypmodsList();
  /**
   * <code>repeated .pg_query.Node ctecoltypmods = 10 [json_name = "ctecoltypmods"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCtecoltypmods(int index);
  /**
   * <code>repeated .pg_query.Node ctecoltypmods = 10 [json_name = "ctecoltypmods"];</code>
   */
  int getCtecoltypmodsCount();
  /**
   * <code>repeated .pg_query.Node ctecoltypmods = 10 [json_name = "ctecoltypmods"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getCtecoltypmodsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node ctecoltypmods = 10 [json_name = "ctecoltypmods"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCtecoltypmodsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node ctecolcollations = 11 [json_name = "ctecolcollations"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getCtecolcollationsList();
  /**
   * <code>repeated .pg_query.Node ctecolcollations = 11 [json_name = "ctecolcollations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCtecolcollations(int index);
  /**
   * <code>repeated .pg_query.Node ctecolcollations = 11 [json_name = "ctecolcollations"];</code>
   */
  int getCtecolcollationsCount();
  /**
   * <code>repeated .pg_query.Node ctecolcollations = 11 [json_name = "ctecolcollations"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getCtecolcollationsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node ctecolcollations = 11 [json_name = "ctecolcollations"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCtecolcollationsOrBuilder(
      int index);
}