// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.ConstrType}
 */
public enum ConstrType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONSTR_TYPE_UNDEFINED = 0;</code>
   */
  CONSTR_TYPE_UNDEFINED(0),
  /**
   * <code>CONSTR_NULL = 1;</code>
   */
  CONSTR_NULL(1),
  /**
   * <code>CONSTR_NOTNULL = 2;</code>
   */
  CONSTR_NOTNULL(2),
  /**
   * <code>CONSTR_DEFAULT = 3;</code>
   */
  CONSTR_DEFAULT(3),
  /**
   * <code>CONSTR_IDENTITY = 4;</code>
   */
  CONSTR_IDENTITY(4),
  /**
   * <code>CONSTR_GENERATED = 5;</code>
   */
  CONSTR_GENERATED(5),
  /**
   * <code>CONSTR_CHECK = 6;</code>
   */
  CONSTR_CHECK(6),
  /**
   * <code>CONSTR_PRIMARY = 7;</code>
   */
  CONSTR_PRIMARY(7),
  /**
   * <code>CONSTR_UNIQUE = 8;</code>
   */
  CONSTR_UNIQUE(8),
  /**
   * <code>CONSTR_EXCLUSION = 9;</code>
   */
  CONSTR_EXCLUSION(9),
  /**
   * <code>CONSTR_FOREIGN = 10;</code>
   */
  CONSTR_FOREIGN(10),
  /**
   * <code>CONSTR_ATTR_DEFERRABLE = 11;</code>
   */
  CONSTR_ATTR_DEFERRABLE(11),
  /**
   * <code>CONSTR_ATTR_NOT_DEFERRABLE = 12;</code>
   */
  CONSTR_ATTR_NOT_DEFERRABLE(12),
  /**
   * <code>CONSTR_ATTR_DEFERRED = 13;</code>
   */
  CONSTR_ATTR_DEFERRED(13),
  /**
   * <code>CONSTR_ATTR_IMMEDIATE = 14;</code>
   */
  CONSTR_ATTR_IMMEDIATE(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONSTR_TYPE_UNDEFINED = 0;</code>
   */
  public static final int CONSTR_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>CONSTR_NULL = 1;</code>
   */
  public static final int CONSTR_NULL_VALUE = 1;
  /**
   * <code>CONSTR_NOTNULL = 2;</code>
   */
  public static final int CONSTR_NOTNULL_VALUE = 2;
  /**
   * <code>CONSTR_DEFAULT = 3;</code>
   */
  public static final int CONSTR_DEFAULT_VALUE = 3;
  /**
   * <code>CONSTR_IDENTITY = 4;</code>
   */
  public static final int CONSTR_IDENTITY_VALUE = 4;
  /**
   * <code>CONSTR_GENERATED = 5;</code>
   */
  public static final int CONSTR_GENERATED_VALUE = 5;
  /**
   * <code>CONSTR_CHECK = 6;</code>
   */
  public static final int CONSTR_CHECK_VALUE = 6;
  /**
   * <code>CONSTR_PRIMARY = 7;</code>
   */
  public static final int CONSTR_PRIMARY_VALUE = 7;
  /**
   * <code>CONSTR_UNIQUE = 8;</code>
   */
  public static final int CONSTR_UNIQUE_VALUE = 8;
  /**
   * <code>CONSTR_EXCLUSION = 9;</code>
   */
  public static final int CONSTR_EXCLUSION_VALUE = 9;
  /**
   * <code>CONSTR_FOREIGN = 10;</code>
   */
  public static final int CONSTR_FOREIGN_VALUE = 10;
  /**
   * <code>CONSTR_ATTR_DEFERRABLE = 11;</code>
   */
  public static final int CONSTR_ATTR_DEFERRABLE_VALUE = 11;
  /**
   * <code>CONSTR_ATTR_NOT_DEFERRABLE = 12;</code>
   */
  public static final int CONSTR_ATTR_NOT_DEFERRABLE_VALUE = 12;
  /**
   * <code>CONSTR_ATTR_DEFERRED = 13;</code>
   */
  public static final int CONSTR_ATTR_DEFERRED_VALUE = 13;
  /**
   * <code>CONSTR_ATTR_IMMEDIATE = 14;</code>
   */
  public static final int CONSTR_ATTR_IMMEDIATE_VALUE = 14;


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
  public static ConstrType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConstrType forNumber(int value) {
    switch (value) {
      case 0: return CONSTR_TYPE_UNDEFINED;
      case 1: return CONSTR_NULL;
      case 2: return CONSTR_NOTNULL;
      case 3: return CONSTR_DEFAULT;
      case 4: return CONSTR_IDENTITY;
      case 5: return CONSTR_GENERATED;
      case 6: return CONSTR_CHECK;
      case 7: return CONSTR_PRIMARY;
      case 8: return CONSTR_UNIQUE;
      case 9: return CONSTR_EXCLUSION;
      case 10: return CONSTR_FOREIGN;
      case 11: return CONSTR_ATTR_DEFERRABLE;
      case 12: return CONSTR_ATTR_NOT_DEFERRABLE;
      case 13: return CONSTR_ATTR_DEFERRED;
      case 14: return CONSTR_ATTR_IMMEDIATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConstrType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConstrType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConstrType>() {
          public ConstrType findValueByNumber(int number) {
            return ConstrType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(20);
  }

  private static final ConstrType[] VALUES = values();

  public static ConstrType valueOf(
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

  private ConstrType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.ConstrType)
}

