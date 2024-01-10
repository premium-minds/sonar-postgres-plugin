// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

public interface RTEPermissionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RTEPermissionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 relid = 1 [json_name = "relid"];</code>
   * @return The relid.
   */
  int getRelid();

  /**
   * <code>bool inh = 2 [json_name = "inh"];</code>
   * @return The inh.
   */
  boolean getInh();

  /**
   * <code>uint64 required_perms = 3 [json_name = "requiredPerms"];</code>
   * @return The requiredPerms.
   */
  long getRequiredPerms();

  /**
   * <code>uint32 check_as_user = 4 [json_name = "checkAsUser"];</code>
   * @return The checkAsUser.
   */
  int getCheckAsUser();

  /**
   * <code>repeated uint64 selected_cols = 5 [json_name = "selectedCols"];</code>
   * @return A list containing the selectedCols.
   */
  java.util.List<java.lang.Long> getSelectedColsList();
  /**
   * <code>repeated uint64 selected_cols = 5 [json_name = "selectedCols"];</code>
   * @return The count of selectedCols.
   */
  int getSelectedColsCount();
  /**
   * <code>repeated uint64 selected_cols = 5 [json_name = "selectedCols"];</code>
   * @param index The index of the element to return.
   * @return The selectedCols at the given index.
   */
  long getSelectedCols(int index);

  /**
   * <code>repeated uint64 inserted_cols = 6 [json_name = "insertedCols"];</code>
   * @return A list containing the insertedCols.
   */
  java.util.List<java.lang.Long> getInsertedColsList();
  /**
   * <code>repeated uint64 inserted_cols = 6 [json_name = "insertedCols"];</code>
   * @return The count of insertedCols.
   */
  int getInsertedColsCount();
  /**
   * <code>repeated uint64 inserted_cols = 6 [json_name = "insertedCols"];</code>
   * @param index The index of the element to return.
   * @return The insertedCols at the given index.
   */
  long getInsertedCols(int index);

  /**
   * <code>repeated uint64 updated_cols = 7 [json_name = "updatedCols"];</code>
   * @return A list containing the updatedCols.
   */
  java.util.List<java.lang.Long> getUpdatedColsList();
  /**
   * <code>repeated uint64 updated_cols = 7 [json_name = "updatedCols"];</code>
   * @return The count of updatedCols.
   */
  int getUpdatedColsCount();
  /**
   * <code>repeated uint64 updated_cols = 7 [json_name = "updatedCols"];</code>
   * @param index The index of the element to return.
   * @return The updatedCols at the given index.
   */
  long getUpdatedCols(int index);
}
