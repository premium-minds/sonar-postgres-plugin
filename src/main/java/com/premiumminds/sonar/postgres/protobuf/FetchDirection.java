// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.FetchDirection}
 */
public enum FetchDirection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FETCH_DIRECTION_UNDEFINED = 0;</code>
   */
  FETCH_DIRECTION_UNDEFINED(0),
  /**
   * <code>FETCH_FORWARD = 1;</code>
   */
  FETCH_FORWARD(1),
  /**
   * <code>FETCH_BACKWARD = 2;</code>
   */
  FETCH_BACKWARD(2),
  /**
   * <code>FETCH_ABSOLUTE = 3;</code>
   */
  FETCH_ABSOLUTE(3),
  /**
   * <code>FETCH_RELATIVE = 4;</code>
   */
  FETCH_RELATIVE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FETCH_DIRECTION_UNDEFINED = 0;</code>
   */
  public static final int FETCH_DIRECTION_UNDEFINED_VALUE = 0;
  /**
   * <code>FETCH_FORWARD = 1;</code>
   */
  public static final int FETCH_FORWARD_VALUE = 1;
  /**
   * <code>FETCH_BACKWARD = 2;</code>
   */
  public static final int FETCH_BACKWARD_VALUE = 2;
  /**
   * <code>FETCH_ABSOLUTE = 3;</code>
   */
  public static final int FETCH_ABSOLUTE_VALUE = 3;
  /**
   * <code>FETCH_RELATIVE = 4;</code>
   */
  public static final int FETCH_RELATIVE_VALUE = 4;


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
  public static FetchDirection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FetchDirection forNumber(int value) {
    switch (value) {
      case 0: return FETCH_DIRECTION_UNDEFINED;
      case 1: return FETCH_FORWARD;
      case 2: return FETCH_BACKWARD;
      case 3: return FETCH_ABSOLUTE;
      case 4: return FETCH_RELATIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FetchDirection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FetchDirection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FetchDirection>() {
          public FetchDirection findValueByNumber(int number) {
            return FetchDirection.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(25);
  }

  private static final FetchDirection[] VALUES = values();

  public static FetchDirection valueOf(
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

  private FetchDirection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.FetchDirection)
}

