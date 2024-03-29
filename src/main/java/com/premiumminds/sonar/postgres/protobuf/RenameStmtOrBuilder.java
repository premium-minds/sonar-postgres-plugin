// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface RenameStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RenameStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.ObjectType rename_type = 1 [json_name = "renameType"];</code>
   * @return The enum numeric value on the wire for renameType.
   */
  int getRenameTypeValue();
  /**
   * <code>.pg_query.ObjectType rename_type = 1 [json_name = "renameType"];</code>
   * @return The renameType.
   */
  com.premiumminds.sonar.postgres.protobuf.ObjectType getRenameType();

  /**
   * <code>.pg_query.ObjectType relation_type = 2 [json_name = "relationType"];</code>
   * @return The enum numeric value on the wire for relationType.
   */
  int getRelationTypeValue();
  /**
   * <code>.pg_query.ObjectType relation_type = 2 [json_name = "relationType"];</code>
   * @return The relationType.
   */
  com.premiumminds.sonar.postgres.protobuf.ObjectType getRelationType();

  /**
   * <code>.pg_query.RangeVar relation = 3 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.RangeVar relation = 3 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation();
  /**
   * <code>.pg_query.RangeVar relation = 3 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder();

  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   * @return The object.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getObject();
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getObjectOrBuilder();

  /**
   * <code>string subname = 5 [json_name = "subname"];</code>
   * @return The subname.
   */
  java.lang.String getSubname();
  /**
   * <code>string subname = 5 [json_name = "subname"];</code>
   * @return The bytes for subname.
   */
  com.google.protobuf.ByteString
      getSubnameBytes();

  /**
   * <code>string newname = 6 [json_name = "newname"];</code>
   * @return The newname.
   */
  java.lang.String getNewname();
  /**
   * <code>string newname = 6 [json_name = "newname"];</code>
   * @return The bytes for newname.
   */
  com.google.protobuf.ByteString
      getNewnameBytes();

  /**
   * <code>.pg_query.DropBehavior behavior = 7 [json_name = "behavior"];</code>
   * @return The enum numeric value on the wire for behavior.
   */
  int getBehaviorValue();
  /**
   * <code>.pg_query.DropBehavior behavior = 7 [json_name = "behavior"];</code>
   * @return The behavior.
   */
  com.premiumminds.sonar.postgres.protobuf.DropBehavior getBehavior();

  /**
   * <code>bool missing_ok = 8 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  boolean getMissingOk();
}
