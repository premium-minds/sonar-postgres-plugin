// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CreatePLangStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreatePLangStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool replace = 1 [json_name = "replace"];</code>
   * @return The replace.
   */
  boolean getReplace();

  /**
   * <code>string plname = 2 [json_name = "plname"];</code>
   * @return The plname.
   */
  java.lang.String getPlname();
  /**
   * <code>string plname = 2 [json_name = "plname"];</code>
   * @return The bytes for plname.
   */
  com.google.protobuf.ByteString
      getPlnameBytes();

  /**
   * <code>repeated .pg_query.Node plhandler = 3 [json_name = "plhandler"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getPlhandlerList();
  /**
   * <code>repeated .pg_query.Node plhandler = 3 [json_name = "plhandler"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPlhandler(int index);
  /**
   * <code>repeated .pg_query.Node plhandler = 3 [json_name = "plhandler"];</code>
   */
  int getPlhandlerCount();
  /**
   * <code>repeated .pg_query.Node plhandler = 3 [json_name = "plhandler"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getPlhandlerOrBuilderList();
  /**
   * <code>repeated .pg_query.Node plhandler = 3 [json_name = "plhandler"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPlhandlerOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node plinline = 4 [json_name = "plinline"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getPlinlineList();
  /**
   * <code>repeated .pg_query.Node plinline = 4 [json_name = "plinline"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPlinline(int index);
  /**
   * <code>repeated .pg_query.Node plinline = 4 [json_name = "plinline"];</code>
   */
  int getPlinlineCount();
  /**
   * <code>repeated .pg_query.Node plinline = 4 [json_name = "plinline"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getPlinlineOrBuilderList();
  /**
   * <code>repeated .pg_query.Node plinline = 4 [json_name = "plinline"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPlinlineOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node plvalidator = 5 [json_name = "plvalidator"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getPlvalidatorList();
  /**
   * <code>repeated .pg_query.Node plvalidator = 5 [json_name = "plvalidator"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPlvalidator(int index);
  /**
   * <code>repeated .pg_query.Node plvalidator = 5 [json_name = "plvalidator"];</code>
   */
  int getPlvalidatorCount();
  /**
   * <code>repeated .pg_query.Node plvalidator = 5 [json_name = "plvalidator"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getPlvalidatorOrBuilderList();
  /**
   * <code>repeated .pg_query.Node plvalidator = 5 [json_name = "plvalidator"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPlvalidatorOrBuilder(
      int index);

  /**
   * <code>bool pltrusted = 6 [json_name = "pltrusted"];</code>
   * @return The pltrusted.
   */
  boolean getPltrusted();
}
