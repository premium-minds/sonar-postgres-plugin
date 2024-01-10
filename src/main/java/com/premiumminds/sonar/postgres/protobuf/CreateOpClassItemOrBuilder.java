// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CreateOpClassItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreateOpClassItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 itemtype = 1 [json_name = "itemtype"];</code>
   * @return The itemtype.
   */
  int getItemtype();

  /**
   * <code>.pg_query.ObjectWithArgs name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>.pg_query.ObjectWithArgs name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  com.premiumminds.sonar.postgres.protobuf.ObjectWithArgs getName();
  /**
   * <code>.pg_query.ObjectWithArgs name = 2 [json_name = "name"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.ObjectWithArgsOrBuilder getNameOrBuilder();

  /**
   * <code>int32 number = 3 [json_name = "number"];</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>repeated .pg_query.Node order_family = 4 [json_name = "order_family"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOrderFamilyList();
  /**
   * <code>repeated .pg_query.Node order_family = 4 [json_name = "order_family"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOrderFamily(int index);
  /**
   * <code>repeated .pg_query.Node order_family = 4 [json_name = "order_family"];</code>
   */
  int getOrderFamilyCount();
  /**
   * <code>repeated .pg_query.Node order_family = 4 [json_name = "order_family"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOrderFamilyOrBuilderList();
  /**
   * <code>repeated .pg_query.Node order_family = 4 [json_name = "order_family"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOrderFamilyOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node class_args = 5 [json_name = "class_args"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getClassArgsList();
  /**
   * <code>repeated .pg_query.Node class_args = 5 [json_name = "class_args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getClassArgs(int index);
  /**
   * <code>repeated .pg_query.Node class_args = 5 [json_name = "class_args"];</code>
   */
  int getClassArgsCount();
  /**
   * <code>repeated .pg_query.Node class_args = 5 [json_name = "class_args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getClassArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node class_args = 5 [json_name = "class_args"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getClassArgsOrBuilder(
      int index);

  /**
   * <code>.pg_query.TypeName storedtype = 6 [json_name = "storedtype"];</code>
   * @return Whether the storedtype field is set.
   */
  boolean hasStoredtype();
  /**
   * <code>.pg_query.TypeName storedtype = 6 [json_name = "storedtype"];</code>
   * @return The storedtype.
   */
  com.premiumminds.sonar.postgres.protobuf.TypeName getStoredtype();
  /**
   * <code>.pg_query.TypeName storedtype = 6 [json_name = "storedtype"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getStoredtypeOrBuilder();
}
