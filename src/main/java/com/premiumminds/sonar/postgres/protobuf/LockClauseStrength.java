// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.LockClauseStrength}
 */
public enum LockClauseStrength
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LOCK_CLAUSE_STRENGTH_UNDEFINED = 0;</code>
   */
  LOCK_CLAUSE_STRENGTH_UNDEFINED(0),
  /**
   * <code>LCS_NONE = 1;</code>
   */
  LCS_NONE(1),
  /**
   * <code>LCS_FORKEYSHARE = 2;</code>
   */
  LCS_FORKEYSHARE(2),
  /**
   * <code>LCS_FORSHARE = 3;</code>
   */
  LCS_FORSHARE(3),
  /**
   * <code>LCS_FORNOKEYUPDATE = 4;</code>
   */
  LCS_FORNOKEYUPDATE(4),
  /**
   * <code>LCS_FORUPDATE = 5;</code>
   */
  LCS_FORUPDATE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LOCK_CLAUSE_STRENGTH_UNDEFINED = 0;</code>
   */
  public static final int LOCK_CLAUSE_STRENGTH_UNDEFINED_VALUE = 0;
  /**
   * <code>LCS_NONE = 1;</code>
   */
  public static final int LCS_NONE_VALUE = 1;
  /**
   * <code>LCS_FORKEYSHARE = 2;</code>
   */
  public static final int LCS_FORKEYSHARE_VALUE = 2;
  /**
   * <code>LCS_FORSHARE = 3;</code>
   */
  public static final int LCS_FORSHARE_VALUE = 3;
  /**
   * <code>LCS_FORNOKEYUPDATE = 4;</code>
   */
  public static final int LCS_FORNOKEYUPDATE_VALUE = 4;
  /**
   * <code>LCS_FORUPDATE = 5;</code>
   */
  public static final int LCS_FORUPDATE_VALUE = 5;


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
  public static LockClauseStrength valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LockClauseStrength forNumber(int value) {
    switch (value) {
      case 0: return LOCK_CLAUSE_STRENGTH_UNDEFINED;
      case 1: return LCS_NONE;
      case 2: return LCS_FORKEYSHARE;
      case 3: return LCS_FORSHARE;
      case 4: return LCS_FORNOKEYUPDATE;
      case 5: return LCS_FORUPDATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LockClauseStrength>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LockClauseStrength> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LockClauseStrength>() {
          public LockClauseStrength findValueByNumber(int number) {
            return LockClauseStrength.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(66);
  }

  private static final LockClauseStrength[] VALUES = values();

  public static LockClauseStrength valueOf(
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

  private LockClauseStrength(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.LockClauseStrength)
}

