// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.AlterTableType}
 */
public enum AlterTableType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALTER_TABLE_TYPE_UNDEFINED = 0;</code>
   */
  ALTER_TABLE_TYPE_UNDEFINED(0),
  /**
   * <code>AT_AddColumn = 1;</code>
   */
  AT_AddColumn(1),
  /**
   * <code>AT_AddColumnToView = 2;</code>
   */
  AT_AddColumnToView(2),
  /**
   * <code>AT_ColumnDefault = 3;</code>
   */
  AT_ColumnDefault(3),
  /**
   * <code>AT_CookedColumnDefault = 4;</code>
   */
  AT_CookedColumnDefault(4),
  /**
   * <code>AT_DropNotNull = 5;</code>
   */
  AT_DropNotNull(5),
  /**
   * <code>AT_SetNotNull = 6;</code>
   */
  AT_SetNotNull(6),
  /**
   * <code>AT_DropExpression = 7;</code>
   */
  AT_DropExpression(7),
  /**
   * <code>AT_CheckNotNull = 8;</code>
   */
  AT_CheckNotNull(8),
  /**
   * <code>AT_SetStatistics = 9;</code>
   */
  AT_SetStatistics(9),
  /**
   * <code>AT_SetOptions = 10;</code>
   */
  AT_SetOptions(10),
  /**
   * <code>AT_ResetOptions = 11;</code>
   */
  AT_ResetOptions(11),
  /**
   * <code>AT_SetStorage = 12;</code>
   */
  AT_SetStorage(12),
  /**
   * <code>AT_SetCompression = 13;</code>
   */
  AT_SetCompression(13),
  /**
   * <code>AT_DropColumn = 14;</code>
   */
  AT_DropColumn(14),
  /**
   * <code>AT_AddIndex = 15;</code>
   */
  AT_AddIndex(15),
  /**
   * <code>AT_ReAddIndex = 16;</code>
   */
  AT_ReAddIndex(16),
  /**
   * <code>AT_AddConstraint = 17;</code>
   */
  AT_AddConstraint(17),
  /**
   * <code>AT_ReAddConstraint = 18;</code>
   */
  AT_ReAddConstraint(18),
  /**
   * <code>AT_ReAddDomainConstraint = 19;</code>
   */
  AT_ReAddDomainConstraint(19),
  /**
   * <code>AT_AlterConstraint = 20;</code>
   */
  AT_AlterConstraint(20),
  /**
   * <code>AT_ValidateConstraint = 21;</code>
   */
  AT_ValidateConstraint(21),
  /**
   * <code>AT_AddIndexConstraint = 22;</code>
   */
  AT_AddIndexConstraint(22),
  /**
   * <code>AT_DropConstraint = 23;</code>
   */
  AT_DropConstraint(23),
  /**
   * <code>AT_ReAddComment = 24;</code>
   */
  AT_ReAddComment(24),
  /**
   * <code>AT_AlterColumnType = 25;</code>
   */
  AT_AlterColumnType(25),
  /**
   * <code>AT_AlterColumnGenericOptions = 26;</code>
   */
  AT_AlterColumnGenericOptions(26),
  /**
   * <code>AT_ChangeOwner = 27;</code>
   */
  AT_ChangeOwner(27),
  /**
   * <code>AT_ClusterOn = 28;</code>
   */
  AT_ClusterOn(28),
  /**
   * <code>AT_DropCluster = 29;</code>
   */
  AT_DropCluster(29),
  /**
   * <code>AT_SetLogged = 30;</code>
   */
  AT_SetLogged(30),
  /**
   * <code>AT_SetUnLogged = 31;</code>
   */
  AT_SetUnLogged(31),
  /**
   * <code>AT_DropOids = 32;</code>
   */
  AT_DropOids(32),
  /**
   * <code>AT_SetAccessMethod = 33;</code>
   */
  AT_SetAccessMethod(33),
  /**
   * <code>AT_SetTableSpace = 34;</code>
   */
  AT_SetTableSpace(34),
  /**
   * <code>AT_SetRelOptions = 35;</code>
   */
  AT_SetRelOptions(35),
  /**
   * <code>AT_ResetRelOptions = 36;</code>
   */
  AT_ResetRelOptions(36),
  /**
   * <code>AT_ReplaceRelOptions = 37;</code>
   */
  AT_ReplaceRelOptions(37),
  /**
   * <code>AT_EnableTrig = 38;</code>
   */
  AT_EnableTrig(38),
  /**
   * <code>AT_EnableAlwaysTrig = 39;</code>
   */
  AT_EnableAlwaysTrig(39),
  /**
   * <code>AT_EnableReplicaTrig = 40;</code>
   */
  AT_EnableReplicaTrig(40),
  /**
   * <code>AT_DisableTrig = 41;</code>
   */
  AT_DisableTrig(41),
  /**
   * <code>AT_EnableTrigAll = 42;</code>
   */
  AT_EnableTrigAll(42),
  /**
   * <code>AT_DisableTrigAll = 43;</code>
   */
  AT_DisableTrigAll(43),
  /**
   * <code>AT_EnableTrigUser = 44;</code>
   */
  AT_EnableTrigUser(44),
  /**
   * <code>AT_DisableTrigUser = 45;</code>
   */
  AT_DisableTrigUser(45),
  /**
   * <code>AT_EnableRule = 46;</code>
   */
  AT_EnableRule(46),
  /**
   * <code>AT_EnableAlwaysRule = 47;</code>
   */
  AT_EnableAlwaysRule(47),
  /**
   * <code>AT_EnableReplicaRule = 48;</code>
   */
  AT_EnableReplicaRule(48),
  /**
   * <code>AT_DisableRule = 49;</code>
   */
  AT_DisableRule(49),
  /**
   * <code>AT_AddInherit = 50;</code>
   */
  AT_AddInherit(50),
  /**
   * <code>AT_DropInherit = 51;</code>
   */
  AT_DropInherit(51),
  /**
   * <code>AT_AddOf = 52;</code>
   */
  AT_AddOf(52),
  /**
   * <code>AT_DropOf = 53;</code>
   */
  AT_DropOf(53),
  /**
   * <code>AT_ReplicaIdentity = 54;</code>
   */
  AT_ReplicaIdentity(54),
  /**
   * <code>AT_EnableRowSecurity = 55;</code>
   */
  AT_EnableRowSecurity(55),
  /**
   * <code>AT_DisableRowSecurity = 56;</code>
   */
  AT_DisableRowSecurity(56),
  /**
   * <code>AT_ForceRowSecurity = 57;</code>
   */
  AT_ForceRowSecurity(57),
  /**
   * <code>AT_NoForceRowSecurity = 58;</code>
   */
  AT_NoForceRowSecurity(58),
  /**
   * <code>AT_GenericOptions = 59;</code>
   */
  AT_GenericOptions(59),
  /**
   * <code>AT_AttachPartition = 60;</code>
   */
  AT_AttachPartition(60),
  /**
   * <code>AT_DetachPartition = 61;</code>
   */
  AT_DetachPartition(61),
  /**
   * <code>AT_DetachPartitionFinalize = 62;</code>
   */
  AT_DetachPartitionFinalize(62),
  /**
   * <code>AT_AddIdentity = 63;</code>
   */
  AT_AddIdentity(63),
  /**
   * <code>AT_SetIdentity = 64;</code>
   */
  AT_SetIdentity(64),
  /**
   * <code>AT_DropIdentity = 65;</code>
   */
  AT_DropIdentity(65),
  /**
   * <code>AT_ReAddStatistics = 66;</code>
   */
  AT_ReAddStatistics(66),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALTER_TABLE_TYPE_UNDEFINED = 0;</code>
   */
  public static final int ALTER_TABLE_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>AT_AddColumn = 1;</code>
   */
  public static final int AT_AddColumn_VALUE = 1;
  /**
   * <code>AT_AddColumnToView = 2;</code>
   */
  public static final int AT_AddColumnToView_VALUE = 2;
  /**
   * <code>AT_ColumnDefault = 3;</code>
   */
  public static final int AT_ColumnDefault_VALUE = 3;
  /**
   * <code>AT_CookedColumnDefault = 4;</code>
   */
  public static final int AT_CookedColumnDefault_VALUE = 4;
  /**
   * <code>AT_DropNotNull = 5;</code>
   */
  public static final int AT_DropNotNull_VALUE = 5;
  /**
   * <code>AT_SetNotNull = 6;</code>
   */
  public static final int AT_SetNotNull_VALUE = 6;
  /**
   * <code>AT_DropExpression = 7;</code>
   */
  public static final int AT_DropExpression_VALUE = 7;
  /**
   * <code>AT_CheckNotNull = 8;</code>
   */
  public static final int AT_CheckNotNull_VALUE = 8;
  /**
   * <code>AT_SetStatistics = 9;</code>
   */
  public static final int AT_SetStatistics_VALUE = 9;
  /**
   * <code>AT_SetOptions = 10;</code>
   */
  public static final int AT_SetOptions_VALUE = 10;
  /**
   * <code>AT_ResetOptions = 11;</code>
   */
  public static final int AT_ResetOptions_VALUE = 11;
  /**
   * <code>AT_SetStorage = 12;</code>
   */
  public static final int AT_SetStorage_VALUE = 12;
  /**
   * <code>AT_SetCompression = 13;</code>
   */
  public static final int AT_SetCompression_VALUE = 13;
  /**
   * <code>AT_DropColumn = 14;</code>
   */
  public static final int AT_DropColumn_VALUE = 14;
  /**
   * <code>AT_AddIndex = 15;</code>
   */
  public static final int AT_AddIndex_VALUE = 15;
  /**
   * <code>AT_ReAddIndex = 16;</code>
   */
  public static final int AT_ReAddIndex_VALUE = 16;
  /**
   * <code>AT_AddConstraint = 17;</code>
   */
  public static final int AT_AddConstraint_VALUE = 17;
  /**
   * <code>AT_ReAddConstraint = 18;</code>
   */
  public static final int AT_ReAddConstraint_VALUE = 18;
  /**
   * <code>AT_ReAddDomainConstraint = 19;</code>
   */
  public static final int AT_ReAddDomainConstraint_VALUE = 19;
  /**
   * <code>AT_AlterConstraint = 20;</code>
   */
  public static final int AT_AlterConstraint_VALUE = 20;
  /**
   * <code>AT_ValidateConstraint = 21;</code>
   */
  public static final int AT_ValidateConstraint_VALUE = 21;
  /**
   * <code>AT_AddIndexConstraint = 22;</code>
   */
  public static final int AT_AddIndexConstraint_VALUE = 22;
  /**
   * <code>AT_DropConstraint = 23;</code>
   */
  public static final int AT_DropConstraint_VALUE = 23;
  /**
   * <code>AT_ReAddComment = 24;</code>
   */
  public static final int AT_ReAddComment_VALUE = 24;
  /**
   * <code>AT_AlterColumnType = 25;</code>
   */
  public static final int AT_AlterColumnType_VALUE = 25;
  /**
   * <code>AT_AlterColumnGenericOptions = 26;</code>
   */
  public static final int AT_AlterColumnGenericOptions_VALUE = 26;
  /**
   * <code>AT_ChangeOwner = 27;</code>
   */
  public static final int AT_ChangeOwner_VALUE = 27;
  /**
   * <code>AT_ClusterOn = 28;</code>
   */
  public static final int AT_ClusterOn_VALUE = 28;
  /**
   * <code>AT_DropCluster = 29;</code>
   */
  public static final int AT_DropCluster_VALUE = 29;
  /**
   * <code>AT_SetLogged = 30;</code>
   */
  public static final int AT_SetLogged_VALUE = 30;
  /**
   * <code>AT_SetUnLogged = 31;</code>
   */
  public static final int AT_SetUnLogged_VALUE = 31;
  /**
   * <code>AT_DropOids = 32;</code>
   */
  public static final int AT_DropOids_VALUE = 32;
  /**
   * <code>AT_SetAccessMethod = 33;</code>
   */
  public static final int AT_SetAccessMethod_VALUE = 33;
  /**
   * <code>AT_SetTableSpace = 34;</code>
   */
  public static final int AT_SetTableSpace_VALUE = 34;
  /**
   * <code>AT_SetRelOptions = 35;</code>
   */
  public static final int AT_SetRelOptions_VALUE = 35;
  /**
   * <code>AT_ResetRelOptions = 36;</code>
   */
  public static final int AT_ResetRelOptions_VALUE = 36;
  /**
   * <code>AT_ReplaceRelOptions = 37;</code>
   */
  public static final int AT_ReplaceRelOptions_VALUE = 37;
  /**
   * <code>AT_EnableTrig = 38;</code>
   */
  public static final int AT_EnableTrig_VALUE = 38;
  /**
   * <code>AT_EnableAlwaysTrig = 39;</code>
   */
  public static final int AT_EnableAlwaysTrig_VALUE = 39;
  /**
   * <code>AT_EnableReplicaTrig = 40;</code>
   */
  public static final int AT_EnableReplicaTrig_VALUE = 40;
  /**
   * <code>AT_DisableTrig = 41;</code>
   */
  public static final int AT_DisableTrig_VALUE = 41;
  /**
   * <code>AT_EnableTrigAll = 42;</code>
   */
  public static final int AT_EnableTrigAll_VALUE = 42;
  /**
   * <code>AT_DisableTrigAll = 43;</code>
   */
  public static final int AT_DisableTrigAll_VALUE = 43;
  /**
   * <code>AT_EnableTrigUser = 44;</code>
   */
  public static final int AT_EnableTrigUser_VALUE = 44;
  /**
   * <code>AT_DisableTrigUser = 45;</code>
   */
  public static final int AT_DisableTrigUser_VALUE = 45;
  /**
   * <code>AT_EnableRule = 46;</code>
   */
  public static final int AT_EnableRule_VALUE = 46;
  /**
   * <code>AT_EnableAlwaysRule = 47;</code>
   */
  public static final int AT_EnableAlwaysRule_VALUE = 47;
  /**
   * <code>AT_EnableReplicaRule = 48;</code>
   */
  public static final int AT_EnableReplicaRule_VALUE = 48;
  /**
   * <code>AT_DisableRule = 49;</code>
   */
  public static final int AT_DisableRule_VALUE = 49;
  /**
   * <code>AT_AddInherit = 50;</code>
   */
  public static final int AT_AddInherit_VALUE = 50;
  /**
   * <code>AT_DropInherit = 51;</code>
   */
  public static final int AT_DropInherit_VALUE = 51;
  /**
   * <code>AT_AddOf = 52;</code>
   */
  public static final int AT_AddOf_VALUE = 52;
  /**
   * <code>AT_DropOf = 53;</code>
   */
  public static final int AT_DropOf_VALUE = 53;
  /**
   * <code>AT_ReplicaIdentity = 54;</code>
   */
  public static final int AT_ReplicaIdentity_VALUE = 54;
  /**
   * <code>AT_EnableRowSecurity = 55;</code>
   */
  public static final int AT_EnableRowSecurity_VALUE = 55;
  /**
   * <code>AT_DisableRowSecurity = 56;</code>
   */
  public static final int AT_DisableRowSecurity_VALUE = 56;
  /**
   * <code>AT_ForceRowSecurity = 57;</code>
   */
  public static final int AT_ForceRowSecurity_VALUE = 57;
  /**
   * <code>AT_NoForceRowSecurity = 58;</code>
   */
  public static final int AT_NoForceRowSecurity_VALUE = 58;
  /**
   * <code>AT_GenericOptions = 59;</code>
   */
  public static final int AT_GenericOptions_VALUE = 59;
  /**
   * <code>AT_AttachPartition = 60;</code>
   */
  public static final int AT_AttachPartition_VALUE = 60;
  /**
   * <code>AT_DetachPartition = 61;</code>
   */
  public static final int AT_DetachPartition_VALUE = 61;
  /**
   * <code>AT_DetachPartitionFinalize = 62;</code>
   */
  public static final int AT_DetachPartitionFinalize_VALUE = 62;
  /**
   * <code>AT_AddIdentity = 63;</code>
   */
  public static final int AT_AddIdentity_VALUE = 63;
  /**
   * <code>AT_SetIdentity = 64;</code>
   */
  public static final int AT_SetIdentity_VALUE = 64;
  /**
   * <code>AT_DropIdentity = 65;</code>
   */
  public static final int AT_DropIdentity_VALUE = 65;
  /**
   * <code>AT_ReAddStatistics = 66;</code>
   */
  public static final int AT_ReAddStatistics_VALUE = 66;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AlterTableType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AlterTableType forNumber(int value) {
    switch (value) {
      case 0: return ALTER_TABLE_TYPE_UNDEFINED;
      case 1: return AT_AddColumn;
      case 2: return AT_AddColumnToView;
      case 3: return AT_ColumnDefault;
      case 4: return AT_CookedColumnDefault;
      case 5: return AT_DropNotNull;
      case 6: return AT_SetNotNull;
      case 7: return AT_DropExpression;
      case 8: return AT_CheckNotNull;
      case 9: return AT_SetStatistics;
      case 10: return AT_SetOptions;
      case 11: return AT_ResetOptions;
      case 12: return AT_SetStorage;
      case 13: return AT_SetCompression;
      case 14: return AT_DropColumn;
      case 15: return AT_AddIndex;
      case 16: return AT_ReAddIndex;
      case 17: return AT_AddConstraint;
      case 18: return AT_ReAddConstraint;
      case 19: return AT_ReAddDomainConstraint;
      case 20: return AT_AlterConstraint;
      case 21: return AT_ValidateConstraint;
      case 22: return AT_AddIndexConstraint;
      case 23: return AT_DropConstraint;
      case 24: return AT_ReAddComment;
      case 25: return AT_AlterColumnType;
      case 26: return AT_AlterColumnGenericOptions;
      case 27: return AT_ChangeOwner;
      case 28: return AT_ClusterOn;
      case 29: return AT_DropCluster;
      case 30: return AT_SetLogged;
      case 31: return AT_SetUnLogged;
      case 32: return AT_DropOids;
      case 33: return AT_SetAccessMethod;
      case 34: return AT_SetTableSpace;
      case 35: return AT_SetRelOptions;
      case 36: return AT_ResetRelOptions;
      case 37: return AT_ReplaceRelOptions;
      case 38: return AT_EnableTrig;
      case 39: return AT_EnableAlwaysTrig;
      case 40: return AT_EnableReplicaTrig;
      case 41: return AT_DisableTrig;
      case 42: return AT_EnableTrigAll;
      case 43: return AT_DisableTrigAll;
      case 44: return AT_EnableTrigUser;
      case 45: return AT_DisableTrigUser;
      case 46: return AT_EnableRule;
      case 47: return AT_EnableAlwaysRule;
      case 48: return AT_EnableReplicaRule;
      case 49: return AT_DisableRule;
      case 50: return AT_AddInherit;
      case 51: return AT_DropInherit;
      case 52: return AT_AddOf;
      case 53: return AT_DropOf;
      case 54: return AT_ReplicaIdentity;
      case 55: return AT_EnableRowSecurity;
      case 56: return AT_DisableRowSecurity;
      case 57: return AT_ForceRowSecurity;
      case 58: return AT_NoForceRowSecurity;
      case 59: return AT_GenericOptions;
      case 60: return AT_AttachPartition;
      case 61: return AT_DetachPartition;
      case 62: return AT_DetachPartitionFinalize;
      case 63: return AT_AddIdentity;
      case 64: return AT_SetIdentity;
      case 65: return AT_DropIdentity;
      case 66: return AT_ReAddStatistics;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AlterTableType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AlterTableType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AlterTableType>() {
          public AlterTableType findValueByNumber(int number) {
            return AlterTableType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(18);
  }

  private static final AlterTableType[] VALUES = values();

  public static AlterTableType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AlterTableType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.AlterTableType)
}

