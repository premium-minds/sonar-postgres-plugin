// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface PartitionBoundSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.PartitionBoundSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string strategy = 1 [json_name = "strategy"];</code>
   * @return The strategy.
   */
  java.lang.String getStrategy();
  /**
   * <code>string strategy = 1 [json_name = "strategy"];</code>
   * @return The bytes for strategy.
   */
  com.google.protobuf.ByteString
      getStrategyBytes();

  /**
   * <code>bool is_default = 2 [json_name = "is_default"];</code>
   * @return The isDefault.
   */
  boolean getIsDefault();

  /**
   * <code>int32 modulus = 3 [json_name = "modulus"];</code>
   * @return The modulus.
   */
  int getModulus();

  /**
   * <code>int32 remainder = 4 [json_name = "remainder"];</code>
   * @return The remainder.
   */
  int getRemainder();

  /**
   * <code>repeated .pg_query.Node listdatums = 5 [json_name = "listdatums"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getListdatumsList();
  /**
   * <code>repeated .pg_query.Node listdatums = 5 [json_name = "listdatums"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getListdatums(int index);
  /**
   * <code>repeated .pg_query.Node listdatums = 5 [json_name = "listdatums"];</code>
   */
  int getListdatumsCount();
  /**
   * <code>repeated .pg_query.Node listdatums = 5 [json_name = "listdatums"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getListdatumsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node listdatums = 5 [json_name = "listdatums"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getListdatumsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node lowerdatums = 6 [json_name = "lowerdatums"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getLowerdatumsList();
  /**
   * <code>repeated .pg_query.Node lowerdatums = 6 [json_name = "lowerdatums"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getLowerdatums(int index);
  /**
   * <code>repeated .pg_query.Node lowerdatums = 6 [json_name = "lowerdatums"];</code>
   */
  int getLowerdatumsCount();
  /**
   * <code>repeated .pg_query.Node lowerdatums = 6 [json_name = "lowerdatums"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getLowerdatumsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node lowerdatums = 6 [json_name = "lowerdatums"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getLowerdatumsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node upperdatums = 7 [json_name = "upperdatums"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getUpperdatumsList();
  /**
   * <code>repeated .pg_query.Node upperdatums = 7 [json_name = "upperdatums"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getUpperdatums(int index);
  /**
   * <code>repeated .pg_query.Node upperdatums = 7 [json_name = "upperdatums"];</code>
   */
  int getUpperdatumsCount();
  /**
   * <code>repeated .pg_query.Node upperdatums = 7 [json_name = "upperdatums"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getUpperdatumsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node upperdatums = 7 [json_name = "upperdatums"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getUpperdatumsOrBuilder(
      int index);

  /**
   * <code>int32 location = 8 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}