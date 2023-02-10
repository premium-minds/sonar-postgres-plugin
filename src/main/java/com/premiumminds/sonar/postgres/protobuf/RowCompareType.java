// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.RowCompareType}
 */
public enum RowCompareType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROW_COMPARE_TYPE_UNDEFINED = 0;</code>
   */
  ROW_COMPARE_TYPE_UNDEFINED(0),
  /**
   * <code>ROWCOMPARE_LT = 1;</code>
   */
  ROWCOMPARE_LT(1),
  /**
   * <code>ROWCOMPARE_LE = 2;</code>
   */
  ROWCOMPARE_LE(2),
  /**
   * <code>ROWCOMPARE_EQ = 3;</code>
   */
  ROWCOMPARE_EQ(3),
  /**
   * <code>ROWCOMPARE_GE = 4;</code>
   */
  ROWCOMPARE_GE(4),
  /**
   * <code>ROWCOMPARE_GT = 5;</code>
   */
  ROWCOMPARE_GT(5),
  /**
   * <code>ROWCOMPARE_NE = 6;</code>
   */
  ROWCOMPARE_NE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROW_COMPARE_TYPE_UNDEFINED = 0;</code>
   */
  public static final int ROW_COMPARE_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>ROWCOMPARE_LT = 1;</code>
   */
  public static final int ROWCOMPARE_LT_VALUE = 1;
  /**
   * <code>ROWCOMPARE_LE = 2;</code>
   */
  public static final int ROWCOMPARE_LE_VALUE = 2;
  /**
   * <code>ROWCOMPARE_EQ = 3;</code>
   */
  public static final int ROWCOMPARE_EQ_VALUE = 3;
  /**
   * <code>ROWCOMPARE_GE = 4;</code>
   */
  public static final int ROWCOMPARE_GE_VALUE = 4;
  /**
   * <code>ROWCOMPARE_GT = 5;</code>
   */
  public static final int ROWCOMPARE_GT_VALUE = 5;
  /**
   * <code>ROWCOMPARE_NE = 6;</code>
   */
  public static final int ROWCOMPARE_NE_VALUE = 6;


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
  public static RowCompareType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RowCompareType forNumber(int value) {
    switch (value) {
      case 0: return ROW_COMPARE_TYPE_UNDEFINED;
      case 1: return ROWCOMPARE_LT;
      case 2: return ROWCOMPARE_LE;
      case 3: return ROWCOMPARE_EQ;
      case 4: return ROWCOMPARE_GE;
      case 5: return ROWCOMPARE_GT;
      case 6: return ROWCOMPARE_NE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RowCompareType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RowCompareType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RowCompareType>() {
          public RowCompareType findValueByNumber(int number) {
            return RowCompareType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(39);
  }

  private static final RowCompareType[] VALUES = values();

  public static RowCompareType valueOf(
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

  private RowCompareType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.RowCompareType)
}

