// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.BoolExprType}
 */
public enum BoolExprType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BOOL_EXPR_TYPE_UNDEFINED = 0;</code>
   */
  BOOL_EXPR_TYPE_UNDEFINED(0),
  /**
   * <code>AND_EXPR = 1;</code>
   */
  AND_EXPR(1),
  /**
   * <code>OR_EXPR = 2;</code>
   */
  OR_EXPR(2),
  /**
   * <code>NOT_EXPR = 3;</code>
   */
  NOT_EXPR(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BOOL_EXPR_TYPE_UNDEFINED = 0;</code>
   */
  public static final int BOOL_EXPR_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>AND_EXPR = 1;</code>
   */
  public static final int AND_EXPR_VALUE = 1;
  /**
   * <code>OR_EXPR = 2;</code>
   */
  public static final int OR_EXPR_VALUE = 2;
  /**
   * <code>NOT_EXPR = 3;</code>
   */
  public static final int NOT_EXPR_VALUE = 3;


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
  public static BoolExprType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BoolExprType forNumber(int value) {
    switch (value) {
      case 0: return BOOL_EXPR_TYPE_UNDEFINED;
      case 1: return AND_EXPR;
      case 2: return OR_EXPR;
      case 3: return NOT_EXPR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BoolExprType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BoolExprType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BoolExprType>() {
          public BoolExprType findValueByNumber(int number) {
            return BoolExprType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(38);
  }

  private static final BoolExprType[] VALUES = values();

  public static BoolExprType valueOf(
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

  private BoolExprType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.BoolExprType)
}

