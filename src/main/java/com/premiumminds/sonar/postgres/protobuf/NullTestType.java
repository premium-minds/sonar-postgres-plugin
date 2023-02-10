// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.NullTestType}
 */
public enum NullTestType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NULL_TEST_TYPE_UNDEFINED = 0;</code>
   */
  NULL_TEST_TYPE_UNDEFINED(0),
  /**
   * <code>IS_NULL = 1;</code>
   */
  IS_NULL(1),
  /**
   * <code>IS_NOT_NULL = 2;</code>
   */
  IS_NOT_NULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NULL_TEST_TYPE_UNDEFINED = 0;</code>
   */
  public static final int NULL_TEST_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>IS_NULL = 1;</code>
   */
  public static final int IS_NULL_VALUE = 1;
  /**
   * <code>IS_NOT_NULL = 2;</code>
   */
  public static final int IS_NOT_NULL_VALUE = 2;


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
  public static NullTestType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NullTestType forNumber(int value) {
    switch (value) {
      case 0: return NULL_TEST_TYPE_UNDEFINED;
      case 1: return IS_NULL;
      case 2: return IS_NOT_NULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NullTestType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NullTestType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NullTestType>() {
          public NullTestType findValueByNumber(int number) {
            return NullTestType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(44);
  }

  private static final NullTestType[] VALUES = values();

  public static NullTestType valueOf(
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

  private NullTestType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.NullTestType)
}

