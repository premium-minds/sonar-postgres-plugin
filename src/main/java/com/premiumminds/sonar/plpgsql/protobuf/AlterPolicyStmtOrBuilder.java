// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface AlterPolicyStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterPolicyStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string policy_name = 1 [json_name = "policy_name"];</code>
   * @return The policyName.
   */
  java.lang.String getPolicyName();
  /**
   * <code>string policy_name = 1 [json_name = "policy_name"];</code>
   * @return The bytes for policyName.
   */
  com.google.protobuf.ByteString
      getPolicyNameBytes();

  /**
   * <code>.pg_query.RangeVar table = 2 [json_name = "table"];</code>
   * @return Whether the table field is set.
   */
  boolean hasTable();
  /**
   * <code>.pg_query.RangeVar table = 2 [json_name = "table"];</code>
   * @return The table.
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVar getTable();
  /**
   * <code>.pg_query.RangeVar table = 2 [json_name = "table"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getTableOrBuilder();

  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getRolesList();
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getRoles(int index);
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  int getRolesCount();
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node roles = 3 [json_name = "roles"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRolesOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node qual = 4 [json_name = "qual"];</code>
   * @return Whether the qual field is set.
   */
  boolean hasQual();
  /**
   * <code>.pg_query.Node qual = 4 [json_name = "qual"];</code>
   * @return The qual.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getQual();
  /**
   * <code>.pg_query.Node qual = 4 [json_name = "qual"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getQualOrBuilder();

  /**
   * <code>.pg_query.Node with_check = 5 [json_name = "with_check"];</code>
   * @return Whether the withCheck field is set.
   */
  boolean hasWithCheck();
  /**
   * <code>.pg_query.Node with_check = 5 [json_name = "with_check"];</code>
   * @return The withCheck.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getWithCheck();
  /**
   * <code>.pg_query.Node with_check = 5 [json_name = "with_check"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getWithCheckOrBuilder();
}