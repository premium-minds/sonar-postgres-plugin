// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface ScanTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ScanToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 start = 1;</code>
   * @return The start.
   */
  int getStart();

  /**
   * <code>int32 end = 2;</code>
   * @return The end.
   */
  int getEnd();

  /**
   * <code>.pg_query.Token token = 4;</code>
   * @return The enum numeric value on the wire for token.
   */
  int getTokenValue();
  /**
   * <code>.pg_query.Token token = 4;</code>
   * @return The token.
   */
  com.premiumminds.sonar.postgres.protobuf.Token getToken();

  /**
   * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
   * @return The enum numeric value on the wire for keywordKind.
   */
  int getKeywordKindValue();
  /**
   * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
   * @return The keywordKind.
   */
  com.premiumminds.sonar.postgres.protobuf.KeywordKind getKeywordKind();
}
