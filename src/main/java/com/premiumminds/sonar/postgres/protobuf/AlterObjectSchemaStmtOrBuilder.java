// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface AlterObjectSchemaStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterObjectSchemaStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The enum numeric value on the wire for objectType.
   */
  int getObjectTypeValue();
  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  com.premiumminds.sonar.postgres.protobuf.ObjectType getObjectType();

  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation();
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder();

  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getObject();
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getObjectOrBuilder();

  /**
   * <code>string newschema = 4 [json_name = "newschema"];</code>
   * @return The newschema.
   */
  java.lang.String getNewschema();
  /**
   * <code>string newschema = 4 [json_name = "newschema"];</code>
   * @return The bytes for newschema.
   */
  com.google.protobuf.ByteString
      getNewschemaBytes();

  /**
   * <code>bool missing_ok = 5 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  boolean getMissingOk();
}
