// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.JsonTableColumnType}
 */
public enum JsonTableColumnType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JSON_TABLE_COLUMN_TYPE_UNDEFINED = 0;</code>
   */
  JSON_TABLE_COLUMN_TYPE_UNDEFINED(0),
  /**
   * <code>JTC_FOR_ORDINALITY = 1;</code>
   */
  JTC_FOR_ORDINALITY(1),
  /**
   * <code>JTC_REGULAR = 2;</code>
   */
  JTC_REGULAR(2),
  /**
   * <code>JTC_EXISTS = 3;</code>
   */
  JTC_EXISTS(3),
  /**
   * <code>JTC_FORMATTED = 4;</code>
   */
  JTC_FORMATTED(4),
  /**
   * <code>JTC_NESTED = 5;</code>
   */
  JTC_NESTED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JSON_TABLE_COLUMN_TYPE_UNDEFINED = 0;</code>
   */
  public static final int JSON_TABLE_COLUMN_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>JTC_FOR_ORDINALITY = 1;</code>
   */
  public static final int JTC_FOR_ORDINALITY_VALUE = 1;
  /**
   * <code>JTC_REGULAR = 2;</code>
   */
  public static final int JTC_REGULAR_VALUE = 2;
  /**
   * <code>JTC_EXISTS = 3;</code>
   */
  public static final int JTC_EXISTS_VALUE = 3;
  /**
   * <code>JTC_FORMATTED = 4;</code>
   */
  public static final int JTC_FORMATTED_VALUE = 4;
  /**
   * <code>JTC_NESTED = 5;</code>
   */
  public static final int JTC_NESTED_VALUE = 5;


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
  public static JsonTableColumnType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JsonTableColumnType forNumber(int value) {
    switch (value) {
      case 0: return JSON_TABLE_COLUMN_TYPE_UNDEFINED;
      case 1: return JTC_FOR_ORDINALITY;
      case 2: return JTC_REGULAR;
      case 3: return JTC_EXISTS;
      case 4: return JTC_FORMATTED;
      case 5: return JTC_NESTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JsonTableColumnType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JsonTableColumnType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JsonTableColumnType>() {
          public JsonTableColumnType findValueByNumber(int number) {
            return JsonTableColumnType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(15);
  }

  private static final JsonTableColumnType[] VALUES = values();

  public static JsonTableColumnType valueOf(
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

  private JsonTableColumnType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.JsonTableColumnType)
}

