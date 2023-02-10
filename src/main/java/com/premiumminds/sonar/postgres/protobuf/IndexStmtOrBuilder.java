// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface IndexStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.IndexStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string idxname = 1 [json_name = "idxname"];</code>
   * @return The idxname.
   */
  java.lang.String getIdxname();
  /**
   * <code>string idxname = 1 [json_name = "idxname"];</code>
   * @return The bytes for idxname.
   */
  com.google.protobuf.ByteString
      getIdxnameBytes();

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
   * <code>string access_method = 3 [json_name = "accessMethod"];</code>
   * @return The accessMethod.
   */
  java.lang.String getAccessMethod();
  /**
   * <code>string access_method = 3 [json_name = "accessMethod"];</code>
   * @return The bytes for accessMethod.
   */
  com.google.protobuf.ByteString
      getAccessMethodBytes();

  /**
   * <code>string table_space = 4 [json_name = "tableSpace"];</code>
   * @return The tableSpace.
   */
  java.lang.String getTableSpace();
  /**
   * <code>string table_space = 4 [json_name = "tableSpace"];</code>
   * @return The bytes for tableSpace.
   */
  com.google.protobuf.ByteString
      getTableSpaceBytes();

  /**
   * <code>repeated .pg_query.Node index_params = 5 [json_name = "indexParams"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getIndexParamsList();
  /**
   * <code>repeated .pg_query.Node index_params = 5 [json_name = "indexParams"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getIndexParams(int index);
  /**
   * <code>repeated .pg_query.Node index_params = 5 [json_name = "indexParams"];</code>
   */
  int getIndexParamsCount();
  /**
   * <code>repeated .pg_query.Node index_params = 5 [json_name = "indexParams"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getIndexParamsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node index_params = 5 [json_name = "indexParams"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getIndexParamsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node index_including_params = 6 [json_name = "indexIncludingParams"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getIndexIncludingParamsList();
  /**
   * <code>repeated .pg_query.Node index_including_params = 6 [json_name = "indexIncludingParams"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getIndexIncludingParams(int index);
  /**
   * <code>repeated .pg_query.Node index_including_params = 6 [json_name = "indexIncludingParams"];</code>
   */
  int getIndexIncludingParamsCount();
  /**
   * <code>repeated .pg_query.Node index_including_params = 6 [json_name = "indexIncludingParams"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getIndexIncludingParamsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node index_including_params = 6 [json_name = "indexIncludingParams"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getIndexIncludingParamsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node options = 7 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 7 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 7 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 7 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 7 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node where_clause = 8 [json_name = "whereClause"];</code>
   * @return Whether the whereClause field is set.
   */
  boolean hasWhereClause();
  /**
   * <code>.pg_query.Node where_clause = 8 [json_name = "whereClause"];</code>
   * @return The whereClause.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getWhereClause();
  /**
   * <code>.pg_query.Node where_clause = 8 [json_name = "whereClause"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getWhereClauseOrBuilder();

  /**
   * <code>repeated .pg_query.Node exclude_op_names = 9 [json_name = "excludeOpNames"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getExcludeOpNamesList();
  /**
   * <code>repeated .pg_query.Node exclude_op_names = 9 [json_name = "excludeOpNames"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getExcludeOpNames(int index);
  /**
   * <code>repeated .pg_query.Node exclude_op_names = 9 [json_name = "excludeOpNames"];</code>
   */
  int getExcludeOpNamesCount();
  /**
   * <code>repeated .pg_query.Node exclude_op_names = 9 [json_name = "excludeOpNames"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getExcludeOpNamesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node exclude_op_names = 9 [json_name = "excludeOpNames"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getExcludeOpNamesOrBuilder(
      int index);

  /**
   * <code>string idxcomment = 10 [json_name = "idxcomment"];</code>
   * @return The idxcomment.
   */
  java.lang.String getIdxcomment();
  /**
   * <code>string idxcomment = 10 [json_name = "idxcomment"];</code>
   * @return The bytes for idxcomment.
   */
  com.google.protobuf.ByteString
      getIdxcommentBytes();

  /**
   * <code>uint32 index_oid = 11 [json_name = "indexOid"];</code>
   * @return The indexOid.
   */
  int getIndexOid();

  /**
   * <code>uint32 old_node = 12 [json_name = "oldNode"];</code>
   * @return The oldNode.
   */
  int getOldNode();

  /**
   * <code>uint32 old_create_subid = 13 [json_name = "oldCreateSubid"];</code>
   * @return The oldCreateSubid.
   */
  int getOldCreateSubid();

  /**
   * <code>uint32 old_first_relfilenode_subid = 14 [json_name = "oldFirstRelfilenodeSubid"];</code>
   * @return The oldFirstRelfilenodeSubid.
   */
  int getOldFirstRelfilenodeSubid();

  /**
   * <code>bool unique = 15 [json_name = "unique"];</code>
   * @return The unique.
   */
  boolean getUnique();

  /**
   * <code>bool nulls_not_distinct = 16 [json_name = "nulls_not_distinct"];</code>
   * @return The nullsNotDistinct.
   */
  boolean getNullsNotDistinct();

  /**
   * <code>bool primary = 17 [json_name = "primary"];</code>
   * @return The primary.
   */
  boolean getPrimary();

  /**
   * <code>bool isconstraint = 18 [json_name = "isconstraint"];</code>
   * @return The isconstraint.
   */
  boolean getIsconstraint();

  /**
   * <code>bool deferrable = 19 [json_name = "deferrable"];</code>
   * @return The deferrable.
   */
  boolean getDeferrable();

  /**
   * <code>bool initdeferred = 20 [json_name = "initdeferred"];</code>
   * @return The initdeferred.
   */
  boolean getInitdeferred();

  /**
   * <code>bool transformed = 21 [json_name = "transformed"];</code>
   * @return The transformed.
   */
  boolean getTransformed();

  /**
   * <code>bool concurrent = 22 [json_name = "concurrent"];</code>
   * @return The concurrent.
   */
  boolean getConcurrent();

  /**
   * <code>bool if_not_exists = 23 [json_name = "if_not_exists"];</code>
   * @return The ifNotExists.
   */
  boolean getIfNotExists();

  /**
   * <code>bool reset_default_tblspc = 24 [json_name = "reset_default_tblspc"];</code>
   * @return The resetDefaultTblspc.
   */
  boolean getResetDefaultTblspc();
}
