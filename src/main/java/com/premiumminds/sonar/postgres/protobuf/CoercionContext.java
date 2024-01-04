// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.CoercionContext}
 */
public enum CoercionContext
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COERCION_CONTEXT_UNDEFINED = 0;</code>
   */
  COERCION_CONTEXT_UNDEFINED(0),
  /**
   * <code>COERCION_IMPLICIT = 1;</code>
   */
  COERCION_IMPLICIT(1),
  /**
   * <code>COERCION_ASSIGNMENT = 2;</code>
   */
  COERCION_ASSIGNMENT(2),
  /**
   * <code>COERCION_PLPGSQL = 3;</code>
   */
  COERCION_PLPGSQL(3),
  /**
   * <code>COERCION_EXPLICIT = 4;</code>
   */
  COERCION_EXPLICIT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COERCION_CONTEXT_UNDEFINED = 0;</code>
   */
  public static final int COERCION_CONTEXT_UNDEFINED_VALUE = 0;
  /**
   * <code>COERCION_IMPLICIT = 1;</code>
   */
  public static final int COERCION_IMPLICIT_VALUE = 1;
  /**
   * <code>COERCION_ASSIGNMENT = 2;</code>
   */
  public static final int COERCION_ASSIGNMENT_VALUE = 2;
  /**
   * <code>COERCION_PLPGSQL = 3;</code>
   */
  public static final int COERCION_PLPGSQL_VALUE = 3;
  /**
   * <code>COERCION_EXPLICIT = 4;</code>
   */
  public static final int COERCION_EXPLICIT_VALUE = 4;


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
  public static CoercionContext valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CoercionContext forNumber(int value) {
    switch (value) {
      case 0: return COERCION_CONTEXT_UNDEFINED;
      case 1: return COERCION_IMPLICIT;
      case 2: return COERCION_ASSIGNMENT;
      case 3: return COERCION_PLPGSQL;
      case 4: return COERCION_EXPLICIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CoercionContext>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CoercionContext> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CoercionContext>() {
          public CoercionContext findValueByNumber(int number) {
            return CoercionContext.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(36);
  }

  private static final CoercionContext[] VALUES = values();

  public static CoercionContext valueOf(
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

  private CoercionContext(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.CoercionContext)
}

