// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface ConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.Constraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.ConstrType contype = 1 [json_name = "contype"];</code>
   * @return The enum numeric value on the wire for contype.
   */
  int getContypeValue();
  /**
   * <code>.pg_query.ConstrType contype = 1 [json_name = "contype"];</code>
   * @return The contype.
   */
  com.premiumminds.sonar.postgres.protobuf.ConstrType getContype();

  /**
   * <code>string conname = 2 [json_name = "conname"];</code>
   * @return The conname.
   */
  java.lang.String getConname();
  /**
   * <code>string conname = 2 [json_name = "conname"];</code>
   * @return The bytes for conname.
   */
  com.google.protobuf.ByteString
      getConnameBytes();

  /**
   * <code>bool deferrable = 3 [json_name = "deferrable"];</code>
   * @return The deferrable.
   */
  boolean getDeferrable();

  /**
   * <code>bool initdeferred = 4 [json_name = "initdeferred"];</code>
   * @return The initdeferred.
   */
  boolean getInitdeferred();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();

  /**
   * <code>bool is_no_inherit = 6 [json_name = "is_no_inherit"];</code>
   * @return The isNoInherit.
   */
  boolean getIsNoInherit();

  /**
   * <code>.pg_query.Node raw_expr = 7 [json_name = "raw_expr"];</code>
   * @return Whether the rawExpr field is set.
   */
  boolean hasRawExpr();
  /**
   * <code>.pg_query.Node raw_expr = 7 [json_name = "raw_expr"];</code>
   * @return The rawExpr.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getRawExpr();
  /**
   * <code>.pg_query.Node raw_expr = 7 [json_name = "raw_expr"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRawExprOrBuilder();

  /**
   * <code>string cooked_expr = 8 [json_name = "cooked_expr"];</code>
   * @return The cookedExpr.
   */
  java.lang.String getCookedExpr();
  /**
   * <code>string cooked_expr = 8 [json_name = "cooked_expr"];</code>
   * @return The bytes for cookedExpr.
   */
  com.google.protobuf.ByteString
      getCookedExprBytes();

  /**
   * <code>string generated_when = 9 [json_name = "generated_when"];</code>
   * @return The generatedWhen.
   */
  java.lang.String getGeneratedWhen();
  /**
   * <code>string generated_when = 9 [json_name = "generated_when"];</code>
   * @return The bytes for generatedWhen.
   */
  com.google.protobuf.ByteString
      getGeneratedWhenBytes();

  /**
   * <code>bool nulls_not_distinct = 10 [json_name = "nulls_not_distinct"];</code>
   * @return The nullsNotDistinct.
   */
  boolean getNullsNotDistinct();

  /**
   * <code>repeated .pg_query.Node keys = 11 [json_name = "keys"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getKeysList();
  /**
   * <code>repeated .pg_query.Node keys = 11 [json_name = "keys"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getKeys(int index);
  /**
   * <code>repeated .pg_query.Node keys = 11 [json_name = "keys"];</code>
   */
  int getKeysCount();
  /**
   * <code>repeated .pg_query.Node keys = 11 [json_name = "keys"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <code>repeated .pg_query.Node keys = 11 [json_name = "keys"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getKeysOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node including = 12 [json_name = "including"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getIncludingList();
  /**
   * <code>repeated .pg_query.Node including = 12 [json_name = "including"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getIncluding(int index);
  /**
   * <code>repeated .pg_query.Node including = 12 [json_name = "including"];</code>
   */
  int getIncludingCount();
  /**
   * <code>repeated .pg_query.Node including = 12 [json_name = "including"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getIncludingOrBuilderList();
  /**
   * <code>repeated .pg_query.Node including = 12 [json_name = "including"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getIncludingOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node exclusions = 13 [json_name = "exclusions"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getExclusionsList();
  /**
   * <code>repeated .pg_query.Node exclusions = 13 [json_name = "exclusions"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getExclusions(int index);
  /**
   * <code>repeated .pg_query.Node exclusions = 13 [json_name = "exclusions"];</code>
   */
  int getExclusionsCount();
  /**
   * <code>repeated .pg_query.Node exclusions = 13 [json_name = "exclusions"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getExclusionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node exclusions = 13 [json_name = "exclusions"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getExclusionsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node options = 14 [json_name = "options"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOptionsList();
  /**
   * <code>repeated .pg_query.Node options = 14 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index);
  /**
   * <code>repeated .pg_query.Node options = 14 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <code>repeated .pg_query.Node options = 14 [json_name = "options"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node options = 14 [json_name = "options"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <code>string indexname = 15 [json_name = "indexname"];</code>
   * @return The indexname.
   */
  java.lang.String getIndexname();
  /**
   * <code>string indexname = 15 [json_name = "indexname"];</code>
   * @return The bytes for indexname.
   */
  com.google.protobuf.ByteString
      getIndexnameBytes();

  /**
   * <code>string indexspace = 16 [json_name = "indexspace"];</code>
   * @return The indexspace.
   */
  java.lang.String getIndexspace();
  /**
   * <code>string indexspace = 16 [json_name = "indexspace"];</code>
   * @return The bytes for indexspace.
   */
  com.google.protobuf.ByteString
      getIndexspaceBytes();

  /**
   * <code>bool reset_default_tblspc = 17 [json_name = "reset_default_tblspc"];</code>
   * @return The resetDefaultTblspc.
   */
  boolean getResetDefaultTblspc();

  /**
   * <code>string access_method = 18 [json_name = "access_method"];</code>
   * @return The accessMethod.
   */
  java.lang.String getAccessMethod();
  /**
   * <code>string access_method = 18 [json_name = "access_method"];</code>
   * @return The bytes for accessMethod.
   */
  com.google.protobuf.ByteString
      getAccessMethodBytes();

  /**
   * <code>.pg_query.Node where_clause = 19 [json_name = "where_clause"];</code>
   * @return Whether the whereClause field is set.
   */
  boolean hasWhereClause();
  /**
   * <code>.pg_query.Node where_clause = 19 [json_name = "where_clause"];</code>
   * @return The whereClause.
   */
  com.premiumminds.sonar.postgres.protobuf.Node getWhereClause();
  /**
   * <code>.pg_query.Node where_clause = 19 [json_name = "where_clause"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getWhereClauseOrBuilder();

  /**
   * <code>.pg_query.RangeVar pktable = 20 [json_name = "pktable"];</code>
   * @return Whether the pktable field is set.
   */
  boolean hasPktable();
  /**
   * <code>.pg_query.RangeVar pktable = 20 [json_name = "pktable"];</code>
   * @return The pktable.
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVar getPktable();
  /**
   * <code>.pg_query.RangeVar pktable = 20 [json_name = "pktable"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getPktableOrBuilder();

  /**
   * <code>repeated .pg_query.Node fk_attrs = 21 [json_name = "fk_attrs"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getFkAttrsList();
  /**
   * <code>repeated .pg_query.Node fk_attrs = 21 [json_name = "fk_attrs"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getFkAttrs(int index);
  /**
   * <code>repeated .pg_query.Node fk_attrs = 21 [json_name = "fk_attrs"];</code>
   */
  int getFkAttrsCount();
  /**
   * <code>repeated .pg_query.Node fk_attrs = 21 [json_name = "fk_attrs"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getFkAttrsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node fk_attrs = 21 [json_name = "fk_attrs"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getFkAttrsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node pk_attrs = 22 [json_name = "pk_attrs"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getPkAttrsList();
  /**
   * <code>repeated .pg_query.Node pk_attrs = 22 [json_name = "pk_attrs"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getPkAttrs(int index);
  /**
   * <code>repeated .pg_query.Node pk_attrs = 22 [json_name = "pk_attrs"];</code>
   */
  int getPkAttrsCount();
  /**
   * <code>repeated .pg_query.Node pk_attrs = 22 [json_name = "pk_attrs"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getPkAttrsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node pk_attrs = 22 [json_name = "pk_attrs"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getPkAttrsOrBuilder(
      int index);

  /**
   * <code>string fk_matchtype = 23 [json_name = "fk_matchtype"];</code>
   * @return The fkMatchtype.
   */
  java.lang.String getFkMatchtype();
  /**
   * <code>string fk_matchtype = 23 [json_name = "fk_matchtype"];</code>
   * @return The bytes for fkMatchtype.
   */
  com.google.protobuf.ByteString
      getFkMatchtypeBytes();

  /**
   * <code>string fk_upd_action = 24 [json_name = "fk_upd_action"];</code>
   * @return The fkUpdAction.
   */
  java.lang.String getFkUpdAction();
  /**
   * <code>string fk_upd_action = 24 [json_name = "fk_upd_action"];</code>
   * @return The bytes for fkUpdAction.
   */
  com.google.protobuf.ByteString
      getFkUpdActionBytes();

  /**
   * <code>string fk_del_action = 25 [json_name = "fk_del_action"];</code>
   * @return The fkDelAction.
   */
  java.lang.String getFkDelAction();
  /**
   * <code>string fk_del_action = 25 [json_name = "fk_del_action"];</code>
   * @return The bytes for fkDelAction.
   */
  com.google.protobuf.ByteString
      getFkDelActionBytes();

  /**
   * <code>repeated .pg_query.Node fk_del_set_cols = 26 [json_name = "fk_del_set_cols"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getFkDelSetColsList();
  /**
   * <code>repeated .pg_query.Node fk_del_set_cols = 26 [json_name = "fk_del_set_cols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getFkDelSetCols(int index);
  /**
   * <code>repeated .pg_query.Node fk_del_set_cols = 26 [json_name = "fk_del_set_cols"];</code>
   */
  int getFkDelSetColsCount();
  /**
   * <code>repeated .pg_query.Node fk_del_set_cols = 26 [json_name = "fk_del_set_cols"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getFkDelSetColsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node fk_del_set_cols = 26 [json_name = "fk_del_set_cols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getFkDelSetColsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node old_conpfeqop = 27 [json_name = "old_conpfeqop"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getOldConpfeqopList();
  /**
   * <code>repeated .pg_query.Node old_conpfeqop = 27 [json_name = "old_conpfeqop"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getOldConpfeqop(int index);
  /**
   * <code>repeated .pg_query.Node old_conpfeqop = 27 [json_name = "old_conpfeqop"];</code>
   */
  int getOldConpfeqopCount();
  /**
   * <code>repeated .pg_query.Node old_conpfeqop = 27 [json_name = "old_conpfeqop"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOldConpfeqopOrBuilderList();
  /**
   * <code>repeated .pg_query.Node old_conpfeqop = 27 [json_name = "old_conpfeqop"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOldConpfeqopOrBuilder(
      int index);

  /**
   * <code>uint32 old_pktable_oid = 28 [json_name = "old_pktable_oid"];</code>
   * @return The oldPktableOid.
   */
  int getOldPktableOid();

  /**
   * <code>bool skip_validation = 29 [json_name = "skip_validation"];</code>
   * @return The skipValidation.
   */
  boolean getSkipValidation();

  /**
   * <code>bool initially_valid = 30 [json_name = "initially_valid"];</code>
   * @return The initiallyValid.
   */
  boolean getInitiallyValid();
}
