// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.GrantTargetType}
 */
public enum GrantTargetType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GRANT_TARGET_TYPE_UNDEFINED = 0;</code>
   */
  GRANT_TARGET_TYPE_UNDEFINED(0),
  /**
   * <code>ACL_TARGET_OBJECT = 1;</code>
   */
  ACL_TARGET_OBJECT(1),
  /**
   * <code>ACL_TARGET_ALL_IN_SCHEMA = 2;</code>
   */
  ACL_TARGET_ALL_IN_SCHEMA(2),
  /**
   * <code>ACL_TARGET_DEFAULTS = 3;</code>
   */
  ACL_TARGET_DEFAULTS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GRANT_TARGET_TYPE_UNDEFINED = 0;</code>
   */
  public static final int GRANT_TARGET_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>ACL_TARGET_OBJECT = 1;</code>
   */
  public static final int ACL_TARGET_OBJECT_VALUE = 1;
  /**
   * <code>ACL_TARGET_ALL_IN_SCHEMA = 2;</code>
   */
  public static final int ACL_TARGET_ALL_IN_SCHEMA_VALUE = 2;
  /**
   * <code>ACL_TARGET_DEFAULTS = 3;</code>
   */
  public static final int ACL_TARGET_DEFAULTS_VALUE = 3;


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
  public static GrantTargetType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GrantTargetType forNumber(int value) {
    switch (value) {
      case 0: return GRANT_TARGET_TYPE_UNDEFINED;
      case 1: return ACL_TARGET_OBJECT;
      case 2: return ACL_TARGET_ALL_IN_SCHEMA;
      case 3: return ACL_TARGET_DEFAULTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GrantTargetType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GrantTargetType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GrantTargetType>() {
          public GrantTargetType findValueByNumber(int number) {
            return GrantTargetType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(20);
  }

  private static final GrantTargetType[] VALUES = values();

  public static GrantTargetType valueOf(
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

  private GrantTargetType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.GrantTargetType)
}

