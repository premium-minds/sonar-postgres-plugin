// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.PartitionRangeDatumKind}
 */
public enum PartitionRangeDatumKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PARTITION_RANGE_DATUM_KIND_UNDEFINED = 0;</code>
   */
  PARTITION_RANGE_DATUM_KIND_UNDEFINED(0),
  /**
   * <code>PARTITION_RANGE_DATUM_MINVALUE = 1;</code>
   */
  PARTITION_RANGE_DATUM_MINVALUE(1),
  /**
   * <code>PARTITION_RANGE_DATUM_VALUE = 2;</code>
   */
  PARTITION_RANGE_DATUM_VALUE(2),
  /**
   * <code>PARTITION_RANGE_DATUM_MAXVALUE = 3;</code>
   */
  PARTITION_RANGE_DATUM_MAXVALUE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PARTITION_RANGE_DATUM_KIND_UNDEFINED = 0;</code>
   */
  public static final int PARTITION_RANGE_DATUM_KIND_UNDEFINED_VALUE = 0;
  /**
   * <code>PARTITION_RANGE_DATUM_MINVALUE = 1;</code>
   */
  public static final int PARTITION_RANGE_DATUM_MINVALUE_VALUE = 1;
  /**
   * <code>PARTITION_RANGE_DATUM_VALUE = 2;</code>
   */
  public static final int PARTITION_RANGE_DATUM_VALUE_VALUE = 2;
  /**
   * <code>PARTITION_RANGE_DATUM_MAXVALUE = 3;</code>
   */
  public static final int PARTITION_RANGE_DATUM_MAXVALUE_VALUE = 3;


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
  public static PartitionRangeDatumKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PartitionRangeDatumKind forNumber(int value) {
    switch (value) {
      case 0: return PARTITION_RANGE_DATUM_KIND_UNDEFINED;
      case 1: return PARTITION_RANGE_DATUM_MINVALUE;
      case 2: return PARTITION_RANGE_DATUM_VALUE;
      case 3: return PARTITION_RANGE_DATUM_MAXVALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartitionRangeDatumKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartitionRangeDatumKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartitionRangeDatumKind>() {
          public PartitionRangeDatumKind findValueByNumber(int number) {
            return PartitionRangeDatumKind.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(9);
  }

  private static final PartitionRangeDatumKind[] VALUES = values();

  public static PartitionRangeDatumKind valueOf(
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

  private PartitionRangeDatumKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.PartitionRangeDatumKind)
}

