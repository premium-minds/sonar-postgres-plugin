// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface CreateDomainStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CreateDomainStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node domainname = 1 [json_name = "domainname"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getDomainnameList();
  /**
   * <code>repeated .pg_query.Node domainname = 1 [json_name = "domainname"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getDomainname(int index);
  /**
   * <code>repeated .pg_query.Node domainname = 1 [json_name = "domainname"];</code>
   */
  int getDomainnameCount();
  /**
   * <code>repeated .pg_query.Node domainname = 1 [json_name = "domainname"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getDomainnameOrBuilderList();
  /**
   * <code>repeated .pg_query.Node domainname = 1 [json_name = "domainname"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getDomainnameOrBuilder(
      int index);

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
   * <code>.pg_query.CollateClause coll_clause = 3 [json_name = "collClause"];</code>
   * @return Whether the collClause field is set.
   */
  boolean hasCollClause();
  /**
   * <code>.pg_query.CollateClause coll_clause = 3 [json_name = "collClause"];</code>
   * @return The collClause.
   */
  com.premiumminds.sonar.postgres.protobuf.CollateClause getCollClause();
  /**
   * <code>.pg_query.CollateClause coll_clause = 3 [json_name = "collClause"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.CollateClauseOrBuilder getCollClauseOrBuilder();

  /**
   * <code>repeated .pg_query.Node constraints = 4 [json_name = "constraints"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getConstraintsList();
  /**
   * <code>repeated .pg_query.Node constraints = 4 [json_name = "constraints"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getConstraints(int index);
  /**
   * <code>repeated .pg_query.Node constraints = 4 [json_name = "constraints"];</code>
   */
  int getConstraintsCount();
  /**
   * <code>repeated .pg_query.Node constraints = 4 [json_name = "constraints"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getConstraintsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node constraints = 4 [json_name = "constraints"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getConstraintsOrBuilder(
      int index);
}
