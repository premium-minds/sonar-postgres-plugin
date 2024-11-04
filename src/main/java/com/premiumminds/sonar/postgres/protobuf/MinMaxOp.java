// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.MinMaxOp}
 */
public enum MinMaxOp
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MIN_MAX_OP_UNDEFINED = 0;</code>
   */
  MIN_MAX_OP_UNDEFINED(0),
  /**
   * <code>IS_GREATEST = 1;</code>
   */
  IS_GREATEST(1),
  /**
   * <code>IS_LEAST = 2;</code>
   */
  IS_LEAST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MIN_MAX_OP_UNDEFINED = 0;</code>
   */
  public static final int MIN_MAX_OP_UNDEFINED_VALUE = 0;
  /**
   * <code>IS_GREATEST = 1;</code>
   */
  public static final int IS_GREATEST_VALUE = 1;
  /**
   * <code>IS_LEAST = 2;</code>
   */
  public static final int IS_LEAST_VALUE = 2;


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
  public static MinMaxOp valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MinMaxOp forNumber(int value) {
    switch (value) {
      case 0: return MIN_MAX_OP_UNDEFINED;
      case 1: return IS_GREATEST;
      case 2: return IS_LEAST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MinMaxOp>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MinMaxOp> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MinMaxOp>() {
          public MinMaxOp findValueByNumber(int number) {
            return MinMaxOp.forNumber(number);
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

  private static final MinMaxOp[] VALUES = values();

  public static MinMaxOp valueOf(
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

  private MinMaxOp(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.MinMaxOp)
}

