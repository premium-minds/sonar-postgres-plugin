// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.JsonEncoding}
 */
public enum JsonEncoding
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JSON_ENCODING_UNDEFINED = 0;</code>
   */
  JSON_ENCODING_UNDEFINED(0),
  /**
   * <code>JS_ENC_DEFAULT = 1;</code>
   */
  JS_ENC_DEFAULT(1),
  /**
   * <code>JS_ENC_UTF8 = 2;</code>
   */
  JS_ENC_UTF8(2),
  /**
   * <code>JS_ENC_UTF16 = 3;</code>
   */
  JS_ENC_UTF16(3),
  /**
   * <code>JS_ENC_UTF32 = 4;</code>
   */
  JS_ENC_UTF32(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JSON_ENCODING_UNDEFINED = 0;</code>
   */
  public static final int JSON_ENCODING_UNDEFINED_VALUE = 0;
  /**
   * <code>JS_ENC_DEFAULT = 1;</code>
   */
  public static final int JS_ENC_DEFAULT_VALUE = 1;
  /**
   * <code>JS_ENC_UTF8 = 2;</code>
   */
  public static final int JS_ENC_UTF8_VALUE = 2;
  /**
   * <code>JS_ENC_UTF16 = 3;</code>
   */
  public static final int JS_ENC_UTF16_VALUE = 3;
  /**
   * <code>JS_ENC_UTF32 = 4;</code>
   */
  public static final int JS_ENC_UTF32_VALUE = 4;


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
  public static JsonEncoding valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JsonEncoding forNumber(int value) {
    switch (value) {
      case 0: return JSON_ENCODING_UNDEFINED;
      case 1: return JS_ENC_DEFAULT;
      case 2: return JS_ENC_UTF8;
      case 3: return JS_ENC_UTF16;
      case 4: return JS_ENC_UTF32;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JsonEncoding>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JsonEncoding> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JsonEncoding>() {
          public JsonEncoding findValueByNumber(int number) {
            return JsonEncoding.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(45);
  }

  private static final JsonEncoding[] VALUES = values();

  public static JsonEncoding valueOf(
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

  private JsonEncoding(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.JsonEncoding)
}

