// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.OverridingKind}
 */
public enum OverridingKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OVERRIDING_KIND_UNDEFINED = 0;</code>
   */
  OVERRIDING_KIND_UNDEFINED(0),
  /**
   * <code>OVERRIDING_NOT_SET = 1;</code>
   */
  OVERRIDING_NOT_SET(1),
  /**
   * <code>OVERRIDING_USER_VALUE = 2;</code>
   */
  OVERRIDING_USER_VALUE(2),
  /**
   * <code>OVERRIDING_SYSTEM_VALUE = 3;</code>
   */
  OVERRIDING_SYSTEM_VALUE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OVERRIDING_KIND_UNDEFINED = 0;</code>
   */
  public static final int OVERRIDING_KIND_UNDEFINED_VALUE = 0;
  /**
   * <code>OVERRIDING_NOT_SET = 1;</code>
   */
  public static final int OVERRIDING_NOT_SET_VALUE = 1;
  /**
   * <code>OVERRIDING_USER_VALUE = 2;</code>
   */
  public static final int OVERRIDING_USER_VALUE_VALUE = 2;
  /**
   * <code>OVERRIDING_SYSTEM_VALUE = 3;</code>
   */
  public static final int OVERRIDING_SYSTEM_VALUE_VALUE = 3;


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
  public static OverridingKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OverridingKind forNumber(int value) {
    switch (value) {
      case 0: return OVERRIDING_KIND_UNDEFINED;
      case 1: return OVERRIDING_NOT_SET;
      case 2: return OVERRIDING_USER_VALUE;
      case 3: return OVERRIDING_SYSTEM_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OverridingKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OverridingKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OverridingKind>() {
          public OverridingKind findValueByNumber(int number) {
            return OverridingKind.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(0);
  }

  private static final OverridingKind[] VALUES = values();

  public static OverridingKind valueOf(
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

  private OverridingKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.OverridingKind)
}
