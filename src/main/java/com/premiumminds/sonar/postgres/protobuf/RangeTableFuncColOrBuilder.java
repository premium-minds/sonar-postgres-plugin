// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface RangeTableFuncColOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RangeTableFuncCol)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string colname = 1 [json_name = "colname"];</code>
   * @return The colname.
   */
  java.lang.String getColname();
  /**
   * <code>string colname = 1 [json_name = "colname"];</code>
   * @return The bytes for colname.
   */
  com.google.protobuf.ByteString
      getColnameBytes();

  /**
   * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
   * @return Whether the typeName field is set.
   */
  boolean hasTypeName();
  /**
   * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
   * @return The typeName.
   */
  com.premiumminds.sonar.postgres.protobuf.TypeName getTypeName();
  /**
   * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getTypeNameOrBuilder();

  /**
   * <code>bool for_ordinality = 3 [json_name = "for_ordinality"];</code>
   * @return The forOrdinality.
   */
  boolean getForOrdinality();

  /**
   * <code>bool is_not_null = 4 [json_name = "is_not_null"];</code>
   * @return The isNotNull.
   */
  boolean getIsNotNull();

  /**
   * <code>.pg_query.Node colexpr = 5 [json_name = "colexpr"];</code>
   * @return Whether the colexpr field is set.
   */
  boolean hasColexpr();
  /**
   * <code>.pg_query.Node colexpr = 5 [json_name = "colexpr"];</code>
   * @return The colexpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getColexpr();
  /**
   * <code>.pg_query.Node colexpr = 5 [json_name = "colexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColexprOrBuilder();

  /**
   * <code>.pg_query.Node coldefexpr = 6 [json_name = "coldefexpr"];</code>
   * @return Whether the coldefexpr field is set.
   */
  boolean hasColdefexpr();
  /**
   * <code>.pg_query.Node coldefexpr = 6 [json_name = "coldefexpr"];</code>
   * @return The coldefexpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getColdefexpr();
  /**
   * <code>.pg_query.Node coldefexpr = 6 [json_name = "coldefexpr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColdefexprOrBuilder();

  /**
   * <code>int32 location = 7 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
