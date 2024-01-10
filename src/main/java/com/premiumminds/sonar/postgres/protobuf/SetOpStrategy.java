// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.SetOpStrategy}
 */
public enum SetOpStrategy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SET_OP_STRATEGY_UNDEFINED = 0;</code>
   */
  SET_OP_STRATEGY_UNDEFINED(0),
  /**
   * <code>SETOP_SORTED = 1;</code>
   */
  SETOP_SORTED(1),
  /**
   * <code>SETOP_HASHED = 2;</code>
   */
  SETOP_HASHED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SET_OP_STRATEGY_UNDEFINED = 0;</code>
   */
  public static final int SET_OP_STRATEGY_UNDEFINED_VALUE = 0;
  /**
   * <code>SETOP_SORTED = 1;</code>
   */
  public static final int SETOP_SORTED_VALUE = 1;
  /**
   * <code>SETOP_HASHED = 2;</code>
   */
  public static final int SETOP_HASHED_VALUE = 2;


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
  public static SetOpStrategy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SetOpStrategy forNumber(int value) {
    switch (value) {
      case 0: return SET_OP_STRATEGY_UNDEFINED;
      case 1: return SETOP_SORTED;
      case 2: return SETOP_HASHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SetOpStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SetOpStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SetOpStrategy>() {
          public SetOpStrategy findValueByNumber(int number) {
            return SetOpStrategy.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(56);
  }

  private static final SetOpStrategy[] VALUES = values();

  public static SetOpStrategy valueOf(
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

  private SetOpStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.SetOpStrategy)
}

