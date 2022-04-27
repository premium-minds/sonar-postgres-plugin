// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf enum {@code pg_query.RoleSpecType}
 */
public enum RoleSpecType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROLE_SPEC_TYPE_UNDEFINED = 0;</code>
   */
  ROLE_SPEC_TYPE_UNDEFINED(0),
  /**
   * <code>ROLESPEC_CSTRING = 1;</code>
   */
  ROLESPEC_CSTRING(1),
  /**
   * <code>ROLESPEC_CURRENT_USER = 2;</code>
   */
  ROLESPEC_CURRENT_USER(2),
  /**
   * <code>ROLESPEC_SESSION_USER = 3;</code>
   */
  ROLESPEC_SESSION_USER(3),
  /**
   * <code>ROLESPEC_PUBLIC = 4;</code>
   */
  ROLESPEC_PUBLIC(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROLE_SPEC_TYPE_UNDEFINED = 0;</code>
   */
  public static final int ROLE_SPEC_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>ROLESPEC_CSTRING = 1;</code>
   */
  public static final int ROLESPEC_CSTRING_VALUE = 1;
  /**
   * <code>ROLESPEC_CURRENT_USER = 2;</code>
   */
  public static final int ROLESPEC_CURRENT_USER_VALUE = 2;
  /**
   * <code>ROLESPEC_SESSION_USER = 3;</code>
   */
  public static final int ROLESPEC_SESSION_USER_VALUE = 3;
  /**
   * <code>ROLESPEC_PUBLIC = 4;</code>
   */
  public static final int ROLESPEC_PUBLIC_VALUE = 4;


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
  public static RoleSpecType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RoleSpecType forNumber(int value) {
    switch (value) {
      case 0: return ROLE_SPEC_TYPE_UNDEFINED;
      case 1: return ROLESPEC_CSTRING;
      case 2: return ROLESPEC_CURRENT_USER;
      case 3: return ROLESPEC_SESSION_USER;
      case 4: return ROLESPEC_PUBLIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RoleSpecType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RoleSpecType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RoleSpecType>() {
          public RoleSpecType findValueByNumber(int number) {
            return RoleSpecType.forNumber(number);
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.getDescriptor().getEnumTypes().get(5);
  }

  private static final RoleSpecType[] VALUES = values();

  public static RoleSpecType valueOf(
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

  private RoleSpecType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.RoleSpecType)
}
