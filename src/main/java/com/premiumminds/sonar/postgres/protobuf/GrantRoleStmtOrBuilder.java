// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface GrantRoleStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.GrantRoleStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node granted_roles = 1 [json_name = "granted_roles"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getGrantedRolesList();
  /**
   * <code>repeated .pg_query.Node granted_roles = 1 [json_name = "granted_roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getGrantedRoles(int index);
  /**
   * <code>repeated .pg_query.Node granted_roles = 1 [json_name = "granted_roles"];</code>
   */
  int getGrantedRolesCount();
  /**
   * <code>repeated .pg_query.Node granted_roles = 1 [json_name = "granted_roles"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getGrantedRolesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node granted_roles = 1 [json_name = "granted_roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getGrantedRolesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node grantee_roles = 2 [json_name = "grantee_roles"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getGranteeRolesList();
  /**
   * <code>repeated .pg_query.Node grantee_roles = 2 [json_name = "grantee_roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getGranteeRoles(int index);
  /**
   * <code>repeated .pg_query.Node grantee_roles = 2 [json_name = "grantee_roles"];</code>
   */
  int getGranteeRolesCount();
  /**
   * <code>repeated .pg_query.Node grantee_roles = 2 [json_name = "grantee_roles"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getGranteeRolesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node grantee_roles = 2 [json_name = "grantee_roles"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getGranteeRolesOrBuilder(
      int index);

  /**
   * <code>bool is_grant = 3 [json_name = "is_grant"];</code>
   * @return The isGrant.
   */
  boolean getIsGrant();

  /**
   * <code>repeated .pg_query.Node opt = 4 [json_name = "opt"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptList();
  /**
   * <code>repeated .pg_query.Node opt = 4 [json_name = "opt"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOpt(int index);
  /**
   * <code>repeated .pg_query.Node opt = 4 [json_name = "opt"];</code>
   */
  int getOptCount();
  /**
   * <code>repeated .pg_query.Node opt = 4 [json_name = "opt"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptOrBuilderList();
  /**
   * <code>repeated .pg_query.Node opt = 4 [json_name = "opt"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptOrBuilder(
      int index);

  /**
   * <code>.pg_query.RoleSpec grantor = 5 [json_name = "grantor"];</code>
   * @return Whether the grantor field is set.
   */
  boolean hasGrantor();
  /**
   * <code>.pg_query.RoleSpec grantor = 5 [json_name = "grantor"];</code>
   * @return The grantor.
   */
  com.premiumminds.sonar.postgres.protobuf.RoleSpec getGrantor();
  /**
   * <code>.pg_query.RoleSpec grantor = 5 [json_name = "grantor"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder getGrantorOrBuilder();

  /**
   * <code>.pg_query.DropBehavior behavior = 6 [json_name = "behavior"];</code>
   * @return The enum numeric value on the wire for behavior.
   */
  int getBehaviorValue();
  /**
   * <code>.pg_query.DropBehavior behavior = 6 [json_name = "behavior"];</code>
   * @return The behavior.
   */
  com.premiumminds.sonar.postgres.protobuf.DropBehavior getBehavior();
}
