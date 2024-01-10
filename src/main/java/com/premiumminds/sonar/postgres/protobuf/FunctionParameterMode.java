// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.FunctionParameterMode}
 */
public enum FunctionParameterMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FUNCTION_PARAMETER_MODE_UNDEFINED = 0;</code>
   */
  FUNCTION_PARAMETER_MODE_UNDEFINED(0),
  /**
   * <code>FUNC_PARAM_IN = 1;</code>
   */
  FUNC_PARAM_IN(1),
  /**
   * <code>FUNC_PARAM_OUT = 2;</code>
   */
  FUNC_PARAM_OUT(2),
  /**
   * <code>FUNC_PARAM_INOUT = 3;</code>
   */
  FUNC_PARAM_INOUT(3),
  /**
   * <code>FUNC_PARAM_VARIADIC = 4;</code>
   */
  FUNC_PARAM_VARIADIC(4),
  /**
   * <code>FUNC_PARAM_TABLE = 5;</code>
   */
  FUNC_PARAM_TABLE(5),
  /**
   * <code>FUNC_PARAM_DEFAULT = 6;</code>
   */
  FUNC_PARAM_DEFAULT(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FUNCTION_PARAMETER_MODE_UNDEFINED = 0;</code>
   */
  public static final int FUNCTION_PARAMETER_MODE_UNDEFINED_VALUE = 0;
  /**
   * <code>FUNC_PARAM_IN = 1;</code>
   */
  public static final int FUNC_PARAM_IN_VALUE = 1;
  /**
   * <code>FUNC_PARAM_OUT = 2;</code>
   */
  public static final int FUNC_PARAM_OUT_VALUE = 2;
  /**
   * <code>FUNC_PARAM_INOUT = 3;</code>
   */
  public static final int FUNC_PARAM_INOUT_VALUE = 3;
  /**
   * <code>FUNC_PARAM_VARIADIC = 4;</code>
   */
  public static final int FUNC_PARAM_VARIADIC_VALUE = 4;
  /**
   * <code>FUNC_PARAM_TABLE = 5;</code>
   */
  public static final int FUNC_PARAM_TABLE_VALUE = 5;
  /**
   * <code>FUNC_PARAM_DEFAULT = 6;</code>
   */
  public static final int FUNC_PARAM_DEFAULT_VALUE = 6;


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
  public static FunctionParameterMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FunctionParameterMode forNumber(int value) {
    switch (value) {
      case 0: return FUNCTION_PARAMETER_MODE_UNDEFINED;
      case 1: return FUNC_PARAM_IN;
      case 2: return FUNC_PARAM_OUT;
      case 3: return FUNC_PARAM_INOUT;
      case 4: return FUNC_PARAM_VARIADIC;
      case 5: return FUNC_PARAM_TABLE;
      case 6: return FUNC_PARAM_DEFAULT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FunctionParameterMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FunctionParameterMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FunctionParameterMode>() {
          public FunctionParameterMode findValueByNumber(int number) {
            return FunctionParameterMode.forNumber(number);
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

  private static final FunctionParameterMode[] VALUES = values();

  public static FunctionParameterMode valueOf(
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

  private FunctionParameterMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.FunctionParameterMode)
}

