// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface AggrefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.Aggref)
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
   * <code>uint32 aggfnoid = 2 [json_name = "aggfnoid"];</code>
   * @return The aggfnoid.
   */
  int getAggfnoid();

  /**
   * <code>uint32 aggtype = 3 [json_name = "aggtype"];</code>
   * @return The aggtype.
   */
  int getAggtype();

  /**
   * <code>uint32 aggcollid = 4 [json_name = "aggcollid"];</code>
   * @return The aggcollid.
   */
  int getAggcollid();

  /**
   * <code>uint32 inputcollid = 5 [json_name = "inputcollid"];</code>
   * @return The inputcollid.
   */
  int getInputcollid();

  /**
   * <code>uint32 aggtranstype = 6 [json_name = "aggtranstype"];</code>
   * @return The aggtranstype.
   */
  int getAggtranstype();

  /**
   * <code>repeated .pg_query.Node aggargtypes = 7 [json_name = "aggargtypes"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getAggargtypesList();
  /**
   * <code>repeated .pg_query.Node aggargtypes = 7 [json_name = "aggargtypes"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getAggargtypes(int index);
  /**
   * <code>repeated .pg_query.Node aggargtypes = 7 [json_name = "aggargtypes"];</code>
   */
  int getAggargtypesCount();
  /**
   * <code>repeated .pg_query.Node aggargtypes = 7 [json_name = "aggargtypes"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getAggargtypesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node aggargtypes = 7 [json_name = "aggargtypes"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getAggargtypesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node aggdirectargs = 8 [json_name = "aggdirectargs"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getAggdirectargsList();
  /**
   * <code>repeated .pg_query.Node aggdirectargs = 8 [json_name = "aggdirectargs"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getAggdirectargs(int index);
  /**
   * <code>repeated .pg_query.Node aggdirectargs = 8 [json_name = "aggdirectargs"];</code>
   */
  int getAggdirectargsCount();
  /**
   * <code>repeated .pg_query.Node aggdirectargs = 8 [json_name = "aggdirectargs"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getAggdirectargsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node aggdirectargs = 8 [json_name = "aggdirectargs"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getAggdirectargsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node args = 9 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 9 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 9 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 9 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 9 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node aggorder = 10 [json_name = "aggorder"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getAggorderList();
  /**
   * <code>repeated .pg_query.Node aggorder = 10 [json_name = "aggorder"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getAggorder(int index);
  /**
   * <code>repeated .pg_query.Node aggorder = 10 [json_name = "aggorder"];</code>
   */
  int getAggorderCount();
  /**
   * <code>repeated .pg_query.Node aggorder = 10 [json_name = "aggorder"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getAggorderOrBuilderList();
  /**
   * <code>repeated .pg_query.Node aggorder = 10 [json_name = "aggorder"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getAggorderOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node aggdistinct = 11 [json_name = "aggdistinct"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getAggdistinctList();
  /**
   * <code>repeated .pg_query.Node aggdistinct = 11 [json_name = "aggdistinct"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getAggdistinct(int index);
  /**
   * <code>repeated .pg_query.Node aggdistinct = 11 [json_name = "aggdistinct"];</code>
   */
  int getAggdistinctCount();
  /**
   * <code>repeated .pg_query.Node aggdistinct = 11 [json_name = "aggdistinct"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getAggdistinctOrBuilderList();
  /**
   * <code>repeated .pg_query.Node aggdistinct = 11 [json_name = "aggdistinct"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getAggdistinctOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node aggfilter = 12 [json_name = "aggfilter"];</code>
   * @return Whether the aggfilter field is set.
   */
  boolean hasAggfilter();
  /**
   * <code>.pg_query.Node aggfilter = 12 [json_name = "aggfilter"];</code>
   * @return The aggfilter.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getAggfilter();
  /**
   * <code>.pg_query.Node aggfilter = 12 [json_name = "aggfilter"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getAggfilterOrBuilder();

  /**
   * <code>bool aggstar = 13 [json_name = "aggstar"];</code>
   * @return The aggstar.
   */
  boolean getAggstar();

  /**
   * <code>bool aggvariadic = 14 [json_name = "aggvariadic"];</code>
   * @return The aggvariadic.
   */
  boolean getAggvariadic();

  /**
   * <code>string aggkind = 15 [json_name = "aggkind"];</code>
   * @return The aggkind.
   */
  java.lang.String getAggkind();
  /**
   * <code>string aggkind = 15 [json_name = "aggkind"];</code>
   * @return The bytes for aggkind.
   */
  com.google.protobuf.ByteString
      getAggkindBytes();

  /**
   * <code>uint32 agglevelsup = 16 [json_name = "agglevelsup"];</code>
   * @return The agglevelsup.
   */
  int getAgglevelsup();

  /**
   * <code>.pg_query.AggSplit aggsplit = 17 [json_name = "aggsplit"];</code>
   * @return The enum numeric value on the wire for aggsplit.
   */
  int getAggsplitValue();
  /**
   * <code>.pg_query.AggSplit aggsplit = 17 [json_name = "aggsplit"];</code>
   * @return The aggsplit.
   */
  com.premiumminds.sonar.plpgsql.protobuf.AggSplit getAggsplit();

  /**
   * <code>int32 location = 18 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}