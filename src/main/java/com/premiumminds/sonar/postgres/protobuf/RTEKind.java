// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.RTEKind}
 */
public enum RTEKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RTEKIND_UNDEFINED = 0;</code>
   */
  RTEKIND_UNDEFINED(0),
  /**
   * <code>RTE_RELATION = 1;</code>
   */
  RTE_RELATION(1),
  /**
   * <code>RTE_SUBQUERY = 2;</code>
   */
  RTE_SUBQUERY(2),
  /**
   * <code>RTE_JOIN = 3;</code>
   */
  RTE_JOIN(3),
  /**
   * <code>RTE_FUNCTION = 4;</code>
   */
  RTE_FUNCTION(4),
  /**
   * <code>RTE_TABLEFUNC = 5;</code>
   */
  RTE_TABLEFUNC(5),
  /**
   * <code>RTE_VALUES = 6;</code>
   */
  RTE_VALUES(6),
  /**
   * <code>RTE_CTE = 7;</code>
   */
  RTE_CTE(7),
  /**
   * <code>RTE_NAMEDTUPLESTORE = 8;</code>
   */
  RTE_NAMEDTUPLESTORE(8),
  /**
   * <code>RTE_RESULT = 9;</code>
   */
  RTE_RESULT(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RTEKIND_UNDEFINED = 0;</code>
   */
  public static final int RTEKIND_UNDEFINED_VALUE = 0;
  /**
   * <code>RTE_RELATION = 1;</code>
   */
  public static final int RTE_RELATION_VALUE = 1;
  /**
   * <code>RTE_SUBQUERY = 2;</code>
   */
  public static final int RTE_SUBQUERY_VALUE = 2;
  /**
   * <code>RTE_JOIN = 3;</code>
   */
  public static final int RTE_JOIN_VALUE = 3;
  /**
   * <code>RTE_FUNCTION = 4;</code>
   */
  public static final int RTE_FUNCTION_VALUE = 4;
  /**
   * <code>RTE_TABLEFUNC = 5;</code>
   */
  public static final int RTE_TABLEFUNC_VALUE = 5;
  /**
   * <code>RTE_VALUES = 6;</code>
   */
  public static final int RTE_VALUES_VALUE = 6;
  /**
   * <code>RTE_CTE = 7;</code>
   */
  public static final int RTE_CTE_VALUE = 7;
  /**
   * <code>RTE_NAMEDTUPLESTORE = 8;</code>
   */
  public static final int RTE_NAMEDTUPLESTORE_VALUE = 8;
  /**
   * <code>RTE_RESULT = 9;</code>
   */
  public static final int RTE_RESULT_VALUE = 9;


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
  public static RTEKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RTEKind forNumber(int value) {
    switch (value) {
      case 0: return RTEKIND_UNDEFINED;
      case 1: return RTE_RELATION;
      case 2: return RTE_SUBQUERY;
      case 3: return RTE_JOIN;
      case 4: return RTE_FUNCTION;
      case 5: return RTE_TABLEFUNC;
      case 6: return RTE_VALUES;
      case 7: return RTE_CTE;
      case 8: return RTE_NAMEDTUPLESTORE;
      case 9: return RTE_RESULT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RTEKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RTEKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RTEKind>() {
          public RTEKind findValueByNumber(int number) {
            return RTEKind.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(10);
  }

  private static final RTEKind[] VALUES = values();

  public static RTEKind valueOf(
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

  private RTEKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.RTEKind)
}

