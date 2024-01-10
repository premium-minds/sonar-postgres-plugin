// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.JsonValueType}
 */
public enum JsonValueType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JSON_VALUE_TYPE_UNDEFINED = 0;</code>
   */
  JSON_VALUE_TYPE_UNDEFINED(0),
  /**
   * <code>JS_TYPE_ANY = 1;</code>
   */
  JS_TYPE_ANY(1),
  /**
   * <code>JS_TYPE_OBJECT = 2;</code>
   */
  JS_TYPE_OBJECT(2),
  /**
   * <code>JS_TYPE_ARRAY = 3;</code>
   */
  JS_TYPE_ARRAY(3),
  /**
   * <code>JS_TYPE_SCALAR = 4;</code>
   */
  JS_TYPE_SCALAR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JSON_VALUE_TYPE_UNDEFINED = 0;</code>
   */
  public static final int JSON_VALUE_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>JS_TYPE_ANY = 1;</code>
   */
  public static final int JS_TYPE_ANY_VALUE = 1;
  /**
   * <code>JS_TYPE_OBJECT = 2;</code>
   */
  public static final int JS_TYPE_OBJECT_VALUE = 2;
  /**
   * <code>JS_TYPE_ARRAY = 3;</code>
   */
  public static final int JS_TYPE_ARRAY_VALUE = 3;
  /**
   * <code>JS_TYPE_SCALAR = 4;</code>
   */
  public static final int JS_TYPE_SCALAR_VALUE = 4;


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
  public static JsonValueType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JsonValueType forNumber(int value) {
    switch (value) {
      case 0: return JSON_VALUE_TYPE_UNDEFINED;
      case 1: return JS_TYPE_ANY;
      case 2: return JS_TYPE_OBJECT;
      case 3: return JS_TYPE_ARRAY;
      case 4: return JS_TYPE_SCALAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JsonValueType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JsonValueType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JsonValueType>() {
          public JsonValueType findValueByNumber(int number) {
            return JsonValueType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(48);
  }

  private static final JsonValueType[] VALUES = values();

  public static JsonValueType valueOf(
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

  private JsonValueType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.JsonValueType)
}

