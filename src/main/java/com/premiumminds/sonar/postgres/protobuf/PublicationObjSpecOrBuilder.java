// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface PublicationObjSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.PublicationObjSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.PublicationObjSpecType pubobjtype = 1 [json_name = "pubobjtype"];</code>
   * @return The enum numeric value on the wire for pubobjtype.
   */
  int getPubobjtypeValue();
  /**
   * <code>.pg_query.PublicationObjSpecType pubobjtype = 1 [json_name = "pubobjtype"];</code>
   * @return The pubobjtype.
   */
  com.premiumminds.sonar.postgres.protobuf.PublicationObjSpecType getPubobjtype();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.pg_query.PublicationTable pubtable = 3 [json_name = "pubtable"];</code>
   * @return Whether the pubtable field is set.
   */
  boolean hasPubtable();
  /**
   * <code>.pg_query.PublicationTable pubtable = 3 [json_name = "pubtable"];</code>
   * @return The pubtable.
   */
  com.premiumminds.sonar.postgres.protobuf.PublicationTable getPubtable();
  /**
   * <code>.pg_query.PublicationTable pubtable = 3 [json_name = "pubtable"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.PublicationTableOrBuilder getPubtableOrBuilder();

  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}