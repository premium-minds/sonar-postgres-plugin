// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.JsonQuotes}
 */
public enum JsonQuotes
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JSON_QUOTES_UNDEFINED = 0;</code>
   */
  JSON_QUOTES_UNDEFINED(0),
  /**
   * <code>JS_QUOTES_UNSPEC = 1;</code>
   */
  JS_QUOTES_UNSPEC(1),
  /**
   * <code>JS_QUOTES_KEEP = 2;</code>
   */
  JS_QUOTES_KEEP(2),
  /**
   * <code>JS_QUOTES_OMIT = 3;</code>
   */
  JS_QUOTES_OMIT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JSON_QUOTES_UNDEFINED = 0;</code>
   */
  public static final int JSON_QUOTES_UNDEFINED_VALUE = 0;
  /**
   * <code>JS_QUOTES_UNSPEC = 1;</code>
   */
  public static final int JS_QUOTES_UNSPEC_VALUE = 1;
  /**
   * <code>JS_QUOTES_KEEP = 2;</code>
   */
  public static final int JS_QUOTES_KEEP_VALUE = 2;
  /**
   * <code>JS_QUOTES_OMIT = 3;</code>
   */
  public static final int JS_QUOTES_OMIT_VALUE = 3;


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
  public static JsonQuotes valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JsonQuotes forNumber(int value) {
    switch (value) {
      case 0: return JSON_QUOTES_UNDEFINED;
      case 1: return JS_QUOTES_UNSPEC;
      case 2: return JS_QUOTES_KEEP;
      case 3: return JS_QUOTES_OMIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JsonQuotes>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JsonQuotes> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JsonQuotes>() {
          public JsonQuotes findValueByNumber(int number) {
            return JsonQuotes.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(14);
  }

  private static final JsonQuotes[] VALUES = values();

  public static JsonQuotes valueOf(
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

  private JsonQuotes(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.JsonQuotes)
}

