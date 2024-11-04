// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.PartitionStrategy}
 */
public enum PartitionStrategy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PARTITION_STRATEGY_UNDEFINED = 0;</code>
   */
  PARTITION_STRATEGY_UNDEFINED(0),
  /**
   * <code>PARTITION_STRATEGY_LIST = 1;</code>
   */
  PARTITION_STRATEGY_LIST(1),
  /**
   * <code>PARTITION_STRATEGY_RANGE = 2;</code>
   */
  PARTITION_STRATEGY_RANGE(2),
  /**
   * <code>PARTITION_STRATEGY_HASH = 3;</code>
   */
  PARTITION_STRATEGY_HASH(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PARTITION_STRATEGY_UNDEFINED = 0;</code>
   */
  public static final int PARTITION_STRATEGY_UNDEFINED_VALUE = 0;
  /**
   * <code>PARTITION_STRATEGY_LIST = 1;</code>
   */
  public static final int PARTITION_STRATEGY_LIST_VALUE = 1;
  /**
   * <code>PARTITION_STRATEGY_RANGE = 2;</code>
   */
  public static final int PARTITION_STRATEGY_RANGE_VALUE = 2;
  /**
   * <code>PARTITION_STRATEGY_HASH = 3;</code>
   */
  public static final int PARTITION_STRATEGY_HASH_VALUE = 3;


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
  public static PartitionStrategy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PartitionStrategy forNumber(int value) {
    switch (value) {
      case 0: return PARTITION_STRATEGY_UNDEFINED;
      case 1: return PARTITION_STRATEGY_LIST;
      case 2: return PARTITION_STRATEGY_RANGE;
      case 3: return PARTITION_STRATEGY_HASH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartitionStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>() {
          public PartitionStrategy findValueByNumber(int number) {
            return PartitionStrategy.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(8);
  }

  private static final PartitionStrategy[] VALUES = values();

  public static PartitionStrategy valueOf(
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

  private PartitionStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.PartitionStrategy)
}

