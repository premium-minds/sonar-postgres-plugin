// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

public interface RangeTblEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RangeTblEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RTEKind rtekind = 1 [json_name = "rtekind"];</code>
   * @return The enum numeric value on the wire for rtekind.
   */
  int getRtekindValue();
  /**
   * <code>.pg_query.RTEKind rtekind = 1 [json_name = "rtekind"];</code>
   * @return The rtekind.
   */
  com.premiumminds.sonar.postgres.protobuf.RTEKind getRtekind();

  /**
   * <code>uint32 relid = 2 [json_name = "relid"];</code>
   * @return The relid.
   */
  int getRelid();

  /**
   * <code>string relkind = 3 [json_name = "relkind"];</code>
   * @return The relkind.
   */
  java.lang.String getRelkind();
  /**
   * <code>string relkind = 3 [json_name = "relkind"];</code>
   * @return The bytes for relkind.
   */
  com.google.protobuf.ByteString
      getRelkindBytes();

  /**
   * <code>int32 rellockmode = 4 [json_name = "rellockmode"];</code>
   * @return The rellockmode.
   */
  int getRellockmode();

  /**
   * <code>.pg_query.TableSampleClause tablesample = 5 [json_name = "tablesample"];</code>
   * @return Whether the tablesample field is set.
   */
  boolean hasTablesample();
  /**
   * <code>.pg_query.TableSampleClause tablesample = 5 [json_name = "tablesample"];</code>
   * @return The tablesample.
   */
  com.premiumminds.sonar.postgres.protobuf.TableSampleClause getTablesample();
  /**
   * <code>.pg_query.TableSampleClause tablesample = 5 [json_name = "tablesample"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.TableSampleClauseOrBuilder getTablesampleOrBuilder();

  /**
   * <code>.pg_query.Query subquery = 6 [json_name = "subquery"];</code>
   * @return Whether the subquery field is set.
   */
  boolean hasSubquery();
  /**
   * <code>.pg_query.Query subquery = 6 [json_name = "subquery"];</code>
   * @return The subquery.
   */
  com.premiumminds.sonar.postgres.protobuf.Query getSubquery();
  /**
   * <code>.pg_query.Query subquery = 6 [json_name = "subquery"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.QueryOrBuilder getSubqueryOrBuilder();

  /**
   * <code>bool security_barrier = 7 [json_name = "security_barrier"];</code>
   * @return The securityBarrier.
   */
  boolean getSecurityBarrier();

  /**
   * <code>.pg_query.JoinType jointype = 8 [json_name = "jointype"];</code>
   * @return The enum numeric value on the wire for jointype.
   */
  int getJointypeValue();
  /**
   * <code>.pg_query.JoinType jointype = 8 [json_name = "jointype"];</code>
   * @return The jointype.
   */
  com.premiumminds.sonar.postgres.protobuf.JoinType getJointype();

  /**
   * <code>int32 joinmergedcols = 9 [json_name = "joinmergedcols"];</code>
   * @return The joinmergedcols.
   */
  int getJoinmergedcols();

  /**
   * <code>repeated .pg_query.Node joinaliasvars = 10 [json_name = "joinaliasvars"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getJoinaliasvarsList();
  /**
   * <code>repeated .pg_query.Node joinaliasvars = 10 [json_name = "joinaliasvars"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getJoinaliasvars(int index);
  /**
   * <code>repeated .pg_query.Node joinaliasvars = 10 [json_name = "joinaliasvars"];</code>
   */
  int getJoinaliasvarsCount();
  /**
   * <code>repeated .pg_query.Node joinaliasvars = 10 [json_name = "joinaliasvars"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getJoinaliasvarsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node joinaliasvars = 10 [json_name = "joinaliasvars"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getJoinaliasvarsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node joinleftcols = 11 [json_name = "joinleftcols"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getJoinleftcolsList();
  /**
   * <code>repeated .pg_query.Node joinleftcols = 11 [json_name = "joinleftcols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getJoinleftcols(int index);
  /**
   * <code>repeated .pg_query.Node joinleftcols = 11 [json_name = "joinleftcols"];</code>
   */
  int getJoinleftcolsCount();
  /**
   * <code>repeated .pg_query.Node joinleftcols = 11 [json_name = "joinleftcols"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getJoinleftcolsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node joinleftcols = 11 [json_name = "joinleftcols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getJoinleftcolsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node joinrightcols = 12 [json_name = "joinrightcols"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getJoinrightcolsList();
  /**
   * <code>repeated .pg_query.Node joinrightcols = 12 [json_name = "joinrightcols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getJoinrightcols(int index);
  /**
   * <code>repeated .pg_query.Node joinrightcols = 12 [json_name = "joinrightcols"];</code>
   */
  int getJoinrightcolsCount();
  /**
   * <code>repeated .pg_query.Node joinrightcols = 12 [json_name = "joinrightcols"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getJoinrightcolsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node joinrightcols = 12 [json_name = "joinrightcols"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getJoinrightcolsOrBuilder(
      int index);

  /**
   * <code>.pg_query.Alias join_using_alias = 13 [json_name = "join_using_alias"];</code>
   * @return Whether the joinUsingAlias field is set.
   */
  boolean hasJoinUsingAlias();
  /**
   * <code>.pg_query.Alias join_using_alias = 13 [json_name = "join_using_alias"];</code>
   * @return The joinUsingAlias.
   */
  com.premiumminds.sonar.postgres.protobuf.Alias getJoinUsingAlias();
  /**
   * <code>.pg_query.Alias join_using_alias = 13 [json_name = "join_using_alias"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getJoinUsingAliasOrBuilder();

  /**
   * <code>repeated .pg_query.Node functions = 14 [json_name = "functions"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getFunctionsList();
  /**
   * <code>repeated .pg_query.Node functions = 14 [json_name = "functions"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getFunctions(int index);
  /**
   * <code>repeated .pg_query.Node functions = 14 [json_name = "functions"];</code>
   */
  int getFunctionsCount();
  /**
   * <code>repeated .pg_query.Node functions = 14 [json_name = "functions"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getFunctionsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node functions = 14 [json_name = "functions"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getFunctionsOrBuilder(
      int index);

  /**
   * <code>bool funcordinality = 15 [json_name = "funcordinality"];</code>
   * @return The funcordinality.
   */
  boolean getFuncordinality();

  /**
   * <code>.pg_query.TableFunc tablefunc = 16 [json_name = "tablefunc"];</code>
   * @return Whether the tablefunc field is set.
   */
  boolean hasTablefunc();
  /**
   * <code>.pg_query.TableFunc tablefunc = 16 [json_name = "tablefunc"];</code>
   * @return The tablefunc.
   */
  com.premiumminds.sonar.postgres.protobuf.TableFunc getTablefunc();
  /**
   * <code>.pg_query.TableFunc tablefunc = 16 [json_name = "tablefunc"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.TableFuncOrBuilder getTablefuncOrBuilder();

  /**
   * <code>repeated .pg_query.Node values_lists = 17 [json_name = "values_lists"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getValuesListsList();
  /**
   * <code>repeated .pg_query.Node values_lists = 17 [json_name = "values_lists"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getValuesLists(int index);
  /**
   * <code>repeated .pg_query.Node values_lists = 17 [json_name = "values_lists"];</code>
   */
  int getValuesListsCount();
  /**
   * <code>repeated .pg_query.Node values_lists = 17 [json_name = "values_lists"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getValuesListsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node values_lists = 17 [json_name = "values_lists"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getValuesListsOrBuilder(
      int index);

  /**
   * <code>string ctename = 18 [json_name = "ctename"];</code>
   * @return The ctename.
   */
  java.lang.String getCtename();
  /**
   * <code>string ctename = 18 [json_name = "ctename"];</code>
   * @return The bytes for ctename.
   */
  com.google.protobuf.ByteString
      getCtenameBytes();

  /**
   * <code>uint32 ctelevelsup = 19 [json_name = "ctelevelsup"];</code>
   * @return The ctelevelsup.
   */
  int getCtelevelsup();

  /**
   * <code>bool self_reference = 20 [json_name = "self_reference"];</code>
   * @return The selfReference.
   */
  boolean getSelfReference();

  /**
   * <code>repeated .pg_query.Node coltypes = 21 [json_name = "coltypes"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getColtypesList();
  /**
   * <code>repeated .pg_query.Node coltypes = 21 [json_name = "coltypes"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getColtypes(int index);
  /**
   * <code>repeated .pg_query.Node coltypes = 21 [json_name = "coltypes"];</code>
   */
  int getColtypesCount();
  /**
   * <code>repeated .pg_query.Node coltypes = 21 [json_name = "coltypes"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getColtypesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node coltypes = 21 [json_name = "coltypes"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColtypesOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node coltypmods = 22 [json_name = "coltypmods"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getColtypmodsList();
  /**
   * <code>repeated .pg_query.Node coltypmods = 22 [json_name = "coltypmods"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getColtypmods(int index);
  /**
   * <code>repeated .pg_query.Node coltypmods = 22 [json_name = "coltypmods"];</code>
   */
  int getColtypmodsCount();
  /**
   * <code>repeated .pg_query.Node coltypmods = 22 [json_name = "coltypmods"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getColtypmodsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node coltypmods = 22 [json_name = "coltypmods"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColtypmodsOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node colcollations = 23 [json_name = "colcollations"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getColcollationsList();
  /**
   * <code>repeated .pg_query.Node colcollations = 23 [json_name = "colcollations"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getColcollations(int index);
  /**
   * <code>repeated .pg_query.Node colcollations = 23 [json_name = "colcollations"];</code>
   */
  int getColcollationsCount();
  /**
   * <code>repeated .pg_query.Node colcollations = 23 [json_name = "colcollations"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getColcollationsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node colcollations = 23 [json_name = "colcollations"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColcollationsOrBuilder(
      int index);

  /**
   * <code>string enrname = 24 [json_name = "enrname"];</code>
   * @return The enrname.
   */
  java.lang.String getEnrname();
  /**
   * <code>string enrname = 24 [json_name = "enrname"];</code>
   * @return The bytes for enrname.
   */
  com.google.protobuf.ByteString
      getEnrnameBytes();

  /**
   * <code>double enrtuples = 25 [json_name = "enrtuples"];</code>
   * @return The enrtuples.
   */
  double getEnrtuples();

  /**
   * <code>.pg_query.Alias alias = 26 [json_name = "alias"];</code>
   * @return Whether the alias field is set.
   */
  boolean hasAlias();
  /**
   * <code>.pg_query.Alias alias = 26 [json_name = "alias"];</code>
   * @return The alias.
   */
  com.premiumminds.sonar.postgres.protobuf.Alias getAlias();
  /**
   * <code>.pg_query.Alias alias = 26 [json_name = "alias"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getAliasOrBuilder();

  /**
   * <code>.pg_query.Alias eref = 27 [json_name = "eref"];</code>
   * @return Whether the eref field is set.
   */
  boolean hasEref();
  /**
   * <code>.pg_query.Alias eref = 27 [json_name = "eref"];</code>
   * @return The eref.
   */
  com.premiumminds.sonar.postgres.protobuf.Alias getEref();
  /**
   * <code>.pg_query.Alias eref = 27 [json_name = "eref"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getErefOrBuilder();

  /**
   * <code>bool lateral = 28 [json_name = "lateral"];</code>
   * @return The lateral.
   */
  boolean getLateral();

  /**
   * <code>bool inh = 29 [json_name = "inh"];</code>
   * @return The inh.
   */
  boolean getInh();

  /**
   * <code>bool in_from_cl = 30 [json_name = "inFromCl"];</code>
   * @return The inFromCl.
   */
  boolean getInFromCl();

  /**
   * <code>uint32 required_perms = 31 [json_name = "requiredPerms"];</code>
   * @return The requiredPerms.
   */
  int getRequiredPerms();

  /**
   * <code>uint32 check_as_user = 32 [json_name = "checkAsUser"];</code>
   * @return The checkAsUser.
   */
  int getCheckAsUser();

  /**
   * <code>repeated uint64 selected_cols = 33 [json_name = "selectedCols"];</code>
   * @return A list containing the selectedCols.
   */
  java.util.List<java.lang.Long> getSelectedColsList();
  /**
   * <code>repeated uint64 selected_cols = 33 [json_name = "selectedCols"];</code>
   * @return The count of selectedCols.
   */
  int getSelectedColsCount();
  /**
   * <code>repeated uint64 selected_cols = 33 [json_name = "selectedCols"];</code>
   * @param index The index of the element to return.
   * @return The selectedCols at the given index.
   */
  long getSelectedCols(int index);

  /**
   * <code>repeated uint64 inserted_cols = 34 [json_name = "insertedCols"];</code>
   * @return A list containing the insertedCols.
   */
  java.util.List<java.lang.Long> getInsertedColsList();
  /**
   * <code>repeated uint64 inserted_cols = 34 [json_name = "insertedCols"];</code>
   * @return The count of insertedCols.
   */
  int getInsertedColsCount();
  /**
   * <code>repeated uint64 inserted_cols = 34 [json_name = "insertedCols"];</code>
   * @param index The index of the element to return.
   * @return The insertedCols at the given index.
   */
  long getInsertedCols(int index);

  /**
   * <code>repeated uint64 updated_cols = 35 [json_name = "updatedCols"];</code>
   * @return A list containing the updatedCols.
   */
  java.util.List<java.lang.Long> getUpdatedColsList();
  /**
   * <code>repeated uint64 updated_cols = 35 [json_name = "updatedCols"];</code>
   * @return The count of updatedCols.
   */
  int getUpdatedColsCount();
  /**
   * <code>repeated uint64 updated_cols = 35 [json_name = "updatedCols"];</code>
   * @param index The index of the element to return.
   * @return The updatedCols at the given index.
   */
  long getUpdatedCols(int index);

  /**
   * <code>repeated uint64 extra_updated_cols = 36 [json_name = "extraUpdatedCols"];</code>
   * @return A list containing the extraUpdatedCols.
   */
  java.util.List<java.lang.Long> getExtraUpdatedColsList();
  /**
   * <code>repeated uint64 extra_updated_cols = 36 [json_name = "extraUpdatedCols"];</code>
   * @return The count of extraUpdatedCols.
   */
  int getExtraUpdatedColsCount();
  /**
   * <code>repeated uint64 extra_updated_cols = 36 [json_name = "extraUpdatedCols"];</code>
   * @param index The index of the element to return.
   * @return The extraUpdatedCols at the given index.
   */
  long getExtraUpdatedCols(int index);

  /**
   * <code>repeated .pg_query.Node security_quals = 37 [json_name = "securityQuals"];</code>
   */
  java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> 
      getSecurityQualsList();
  /**
   * <code>repeated .pg_query.Node security_quals = 37 [json_name = "securityQuals"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.Node getSecurityQuals(int index);
  /**
   * <code>repeated .pg_query.Node security_quals = 37 [json_name = "securityQuals"];</code>
   */
  int getSecurityQualsCount();
  /**
   * <code>repeated .pg_query.Node security_quals = 37 [json_name = "securityQuals"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getSecurityQualsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node security_quals = 37 [json_name = "securityQuals"];</code>
   */
  com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSecurityQualsOrBuilder(
      int index);
}
