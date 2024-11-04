// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.DefElemAction}
 */
public enum DefElemAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEF_ELEM_ACTION_UNDEFINED = 0;</code>
   */
  DEF_ELEM_ACTION_UNDEFINED(0),
  /**
   * <code>DEFELEM_UNSPEC = 1;</code>
   */
  DEFELEM_UNSPEC(1),
  /**
   * <code>DEFELEM_SET = 2;</code>
   */
  DEFELEM_SET(2),
  /**
   * <code>DEFELEM_ADD = 3;</code>
   */
  DEFELEM_ADD(3),
  /**
   * <code>DEFELEM_DROP = 4;</code>
   */
  DEFELEM_DROP(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEF_ELEM_ACTION_UNDEFINED = 0;</code>
   */
  public static final int DEF_ELEM_ACTION_UNDEFINED_VALUE = 0;
  /**
   * <code>DEFELEM_UNSPEC = 1;</code>
   */
  public static final int DEFELEM_UNSPEC_VALUE = 1;
  /**
   * <code>DEFELEM_SET = 2;</code>
   */
  public static final int DEFELEM_SET_VALUE = 2;
  /**
   * <code>DEFELEM_ADD = 3;</code>
   */
  public static final int DEFELEM_ADD_VALUE = 3;
  /**
   * <code>DEFELEM_DROP = 4;</code>
   */
  public static final int DEFELEM_DROP_VALUE = 4;


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
  public static DefElemAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DefElemAction forNumber(int value) {
    switch (value) {
      case 0: return DEF_ELEM_ACTION_UNDEFINED;
      case 1: return DEFELEM_UNSPEC;
      case 2: return DEFELEM_SET;
      case 3: return DEFELEM_ADD;
      case 4: return DEFELEM_DROP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DefElemAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DefElemAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DefElemAction>() {
          public DefElemAction findValueByNumber(int number) {
            return DefElemAction.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(7);
  }

  private static final DefElemAction[] VALUES = values();

  public static DefElemAction valueOf(
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

  private DefElemAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.DefElemAction)
}

