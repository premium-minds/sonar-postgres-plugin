// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.AggSplit}
 */
public enum AggSplit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AGG_SPLIT_UNDEFINED = 0;</code>
   */
  AGG_SPLIT_UNDEFINED(0),
  /**
   * <code>AGGSPLIT_SIMPLE = 1;</code>
   */
  AGGSPLIT_SIMPLE(1),
  /**
   * <code>AGGSPLIT_INITIAL_SERIAL = 2;</code>
   */
  AGGSPLIT_INITIAL_SERIAL(2),
  /**
   * <code>AGGSPLIT_FINAL_DESERIAL = 3;</code>
   */
  AGGSPLIT_FINAL_DESERIAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AGG_SPLIT_UNDEFINED = 0;</code>
   */
  public static final int AGG_SPLIT_UNDEFINED_VALUE = 0;
  /**
   * <code>AGGSPLIT_SIMPLE = 1;</code>
   */
  public static final int AGGSPLIT_SIMPLE_VALUE = 1;
  /**
   * <code>AGGSPLIT_INITIAL_SERIAL = 2;</code>
   */
  public static final int AGGSPLIT_INITIAL_SERIAL_VALUE = 2;
  /**
   * <code>AGGSPLIT_FINAL_DESERIAL = 3;</code>
   */
  public static final int AGGSPLIT_FINAL_DESERIAL_VALUE = 3;


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
  public static AggSplit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AggSplit forNumber(int value) {
    switch (value) {
      case 0: return AGG_SPLIT_UNDEFINED;
      case 1: return AGGSPLIT_SIMPLE;
      case 2: return AGGSPLIT_INITIAL_SERIAL;
      case 3: return AGGSPLIT_FINAL_DESERIAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AggSplit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AggSplit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AggSplit>() {
          public AggSplit findValueByNumber(int number) {
            return AggSplit.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(54);
  }

  private static final AggSplit[] VALUES = values();

  public static AggSplit valueOf(
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

  private AggSplit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.AggSplit)
}

