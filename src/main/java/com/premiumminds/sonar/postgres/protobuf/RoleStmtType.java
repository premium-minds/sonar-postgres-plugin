// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.RoleStmtType}
 */
public enum RoleStmtType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROLE_STMT_TYPE_UNDEFINED = 0;</code>
   */
  ROLE_STMT_TYPE_UNDEFINED(0),
  /**
   * <code>ROLESTMT_ROLE = 1;</code>
   */
  ROLESTMT_ROLE(1),
  /**
   * <code>ROLESTMT_USER = 2;</code>
   */
  ROLESTMT_USER(2),
  /**
   * <code>ROLESTMT_GROUP = 3;</code>
   */
  ROLESTMT_GROUP(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROLE_STMT_TYPE_UNDEFINED = 0;</code>
   */
  public static final int ROLE_STMT_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>ROLESTMT_ROLE = 1;</code>
   */
  public static final int ROLESTMT_ROLE_VALUE = 1;
  /**
   * <code>ROLESTMT_USER = 2;</code>
   */
  public static final int ROLESTMT_USER_VALUE = 2;
  /**
   * <code>ROLESTMT_GROUP = 3;</code>
   */
  public static final int ROLESTMT_GROUP_VALUE = 3;


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
  public static RoleStmtType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RoleStmtType forNumber(int value) {
    switch (value) {
      case 0: return ROLE_STMT_TYPE_UNDEFINED;
      case 1: return ROLESTMT_ROLE;
      case 2: return ROLESTMT_USER;
      case 3: return ROLESTMT_GROUP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RoleStmtType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RoleStmtType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RoleStmtType>() {
          public RoleStmtType findValueByNumber(int number) {
            return RoleStmtType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(21);
  }

  private static final RoleStmtType[] VALUES = values();

  public static RoleStmtType valueOf(
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

  private RoleStmtType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.RoleStmtType)
}
