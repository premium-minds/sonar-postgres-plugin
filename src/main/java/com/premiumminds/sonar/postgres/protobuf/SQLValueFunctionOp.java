// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.SQLValueFunctionOp}
 */
public enum SQLValueFunctionOp
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SQLVALUE_FUNCTION_OP_UNDEFINED = 0;</code>
   */
  SQLVALUE_FUNCTION_OP_UNDEFINED(0),
  /**
   * <code>SVFOP_CURRENT_DATE = 1;</code>
   */
  SVFOP_CURRENT_DATE(1),
  /**
   * <code>SVFOP_CURRENT_TIME = 2;</code>
   */
  SVFOP_CURRENT_TIME(2),
  /**
   * <code>SVFOP_CURRENT_TIME_N = 3;</code>
   */
  SVFOP_CURRENT_TIME_N(3),
  /**
   * <code>SVFOP_CURRENT_TIMESTAMP = 4;</code>
   */
  SVFOP_CURRENT_TIMESTAMP(4),
  /**
   * <code>SVFOP_CURRENT_TIMESTAMP_N = 5;</code>
   */
  SVFOP_CURRENT_TIMESTAMP_N(5),
  /**
   * <code>SVFOP_LOCALTIME = 6;</code>
   */
  SVFOP_LOCALTIME(6),
  /**
   * <code>SVFOP_LOCALTIME_N = 7;</code>
   */
  SVFOP_LOCALTIME_N(7),
  /**
   * <code>SVFOP_LOCALTIMESTAMP = 8;</code>
   */
  SVFOP_LOCALTIMESTAMP(8),
  /**
   * <code>SVFOP_LOCALTIMESTAMP_N = 9;</code>
   */
  SVFOP_LOCALTIMESTAMP_N(9),
  /**
   * <code>SVFOP_CURRENT_ROLE = 10;</code>
   */
  SVFOP_CURRENT_ROLE(10),
  /**
   * <code>SVFOP_CURRENT_USER = 11;</code>
   */
  SVFOP_CURRENT_USER(11),
  /**
   * <code>SVFOP_USER = 12;</code>
   */
  SVFOP_USER(12),
  /**
   * <code>SVFOP_SESSION_USER = 13;</code>
   */
  SVFOP_SESSION_USER(13),
  /**
   * <code>SVFOP_CURRENT_CATALOG = 14;</code>
   */
  SVFOP_CURRENT_CATALOG(14),
  /**
   * <code>SVFOP_CURRENT_SCHEMA = 15;</code>
   */
  SVFOP_CURRENT_SCHEMA(15),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SQLVALUE_FUNCTION_OP_UNDEFINED = 0;</code>
   */
  public static final int SQLVALUE_FUNCTION_OP_UNDEFINED_VALUE = 0;
  /**
   * <code>SVFOP_CURRENT_DATE = 1;</code>
   */
  public static final int SVFOP_CURRENT_DATE_VALUE = 1;
  /**
   * <code>SVFOP_CURRENT_TIME = 2;</code>
   */
  public static final int SVFOP_CURRENT_TIME_VALUE = 2;
  /**
   * <code>SVFOP_CURRENT_TIME_N = 3;</code>
   */
  public static final int SVFOP_CURRENT_TIME_N_VALUE = 3;
  /**
   * <code>SVFOP_CURRENT_TIMESTAMP = 4;</code>
   */
  public static final int SVFOP_CURRENT_TIMESTAMP_VALUE = 4;
  /**
   * <code>SVFOP_CURRENT_TIMESTAMP_N = 5;</code>
   */
  public static final int SVFOP_CURRENT_TIMESTAMP_N_VALUE = 5;
  /**
   * <code>SVFOP_LOCALTIME = 6;</code>
   */
  public static final int SVFOP_LOCALTIME_VALUE = 6;
  /**
   * <code>SVFOP_LOCALTIME_N = 7;</code>
   */
  public static final int SVFOP_LOCALTIME_N_VALUE = 7;
  /**
   * <code>SVFOP_LOCALTIMESTAMP = 8;</code>
   */
  public static final int SVFOP_LOCALTIMESTAMP_VALUE = 8;
  /**
   * <code>SVFOP_LOCALTIMESTAMP_N = 9;</code>
   */
  public static final int SVFOP_LOCALTIMESTAMP_N_VALUE = 9;
  /**
   * <code>SVFOP_CURRENT_ROLE = 10;</code>
   */
  public static final int SVFOP_CURRENT_ROLE_VALUE = 10;
  /**
   * <code>SVFOP_CURRENT_USER = 11;</code>
   */
  public static final int SVFOP_CURRENT_USER_VALUE = 11;
  /**
   * <code>SVFOP_USER = 12;</code>
   */
  public static final int SVFOP_USER_VALUE = 12;
  /**
   * <code>SVFOP_SESSION_USER = 13;</code>
   */
  public static final int SVFOP_SESSION_USER_VALUE = 13;
  /**
   * <code>SVFOP_CURRENT_CATALOG = 14;</code>
   */
  public static final int SVFOP_CURRENT_CATALOG_VALUE = 14;
  /**
   * <code>SVFOP_CURRENT_SCHEMA = 15;</code>
   */
  public static final int SVFOP_CURRENT_SCHEMA_VALUE = 15;


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
  public static SQLValueFunctionOp valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SQLValueFunctionOp forNumber(int value) {
    switch (value) {
      case 0: return SQLVALUE_FUNCTION_OP_UNDEFINED;
      case 1: return SVFOP_CURRENT_DATE;
      case 2: return SVFOP_CURRENT_TIME;
      case 3: return SVFOP_CURRENT_TIME_N;
      case 4: return SVFOP_CURRENT_TIMESTAMP;
      case 5: return SVFOP_CURRENT_TIMESTAMP_N;
      case 6: return SVFOP_LOCALTIME;
      case 7: return SVFOP_LOCALTIME_N;
      case 8: return SVFOP_LOCALTIMESTAMP;
      case 9: return SVFOP_LOCALTIMESTAMP_N;
      case 10: return SVFOP_CURRENT_ROLE;
      case 11: return SVFOP_CURRENT_USER;
      case 12: return SVFOP_USER;
      case 13: return SVFOP_SESSION_USER;
      case 14: return SVFOP_CURRENT_CATALOG;
      case 15: return SVFOP_CURRENT_SCHEMA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SQLValueFunctionOp>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SQLValueFunctionOp> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SQLValueFunctionOp>() {
          public SQLValueFunctionOp findValueByNumber(int number) {
            return SQLValueFunctionOp.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(41);
  }

  private static final SQLValueFunctionOp[] VALUES = values();

  public static SQLValueFunctionOp valueOf(
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

  private SQLValueFunctionOp(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.SQLValueFunctionOp)
}

