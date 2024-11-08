// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.AlterTSConfigType}
 */
public enum AlterTSConfigType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALTER_TSCONFIG_TYPE_UNDEFINED = 0;</code>
   */
  ALTER_TSCONFIG_TYPE_UNDEFINED(0),
  /**
   * <code>ALTER_TSCONFIG_ADD_MAPPING = 1;</code>
   */
  ALTER_TSCONFIG_ADD_MAPPING(1),
  /**
   * <code>ALTER_TSCONFIG_ALTER_MAPPING_FOR_TOKEN = 2;</code>
   */
  ALTER_TSCONFIG_ALTER_MAPPING_FOR_TOKEN(2),
  /**
   * <code>ALTER_TSCONFIG_REPLACE_DICT = 3;</code>
   */
  ALTER_TSCONFIG_REPLACE_DICT(3),
  /**
   * <code>ALTER_TSCONFIG_REPLACE_DICT_FOR_TOKEN = 4;</code>
   */
  ALTER_TSCONFIG_REPLACE_DICT_FOR_TOKEN(4),
  /**
   * <code>ALTER_TSCONFIG_DROP_MAPPING = 5;</code>
   */
  ALTER_TSCONFIG_DROP_MAPPING(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALTER_TSCONFIG_TYPE_UNDEFINED = 0;</code>
   */
  public static final int ALTER_TSCONFIG_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>ALTER_TSCONFIG_ADD_MAPPING = 1;</code>
   */
  public static final int ALTER_TSCONFIG_ADD_MAPPING_VALUE = 1;
  /**
   * <code>ALTER_TSCONFIG_ALTER_MAPPING_FOR_TOKEN = 2;</code>
   */
  public static final int ALTER_TSCONFIG_ALTER_MAPPING_FOR_TOKEN_VALUE = 2;
  /**
   * <code>ALTER_TSCONFIG_REPLACE_DICT = 3;</code>
   */
  public static final int ALTER_TSCONFIG_REPLACE_DICT_VALUE = 3;
  /**
   * <code>ALTER_TSCONFIG_REPLACE_DICT_FOR_TOKEN = 4;</code>
   */
  public static final int ALTER_TSCONFIG_REPLACE_DICT_FOR_TOKEN_VALUE = 4;
  /**
   * <code>ALTER_TSCONFIG_DROP_MAPPING = 5;</code>
   */
  public static final int ALTER_TSCONFIG_DROP_MAPPING_VALUE = 5;


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
  public static AlterTSConfigType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AlterTSConfigType forNumber(int value) {
    switch (value) {
      case 0: return ALTER_TSCONFIG_TYPE_UNDEFINED;
      case 1: return ALTER_TSCONFIG_ADD_MAPPING;
      case 2: return ALTER_TSCONFIG_ALTER_MAPPING_FOR_TOKEN;
      case 3: return ALTER_TSCONFIG_REPLACE_DICT;
      case 4: return ALTER_TSCONFIG_REPLACE_DICT_FOR_TOKEN;
      case 5: return ALTER_TSCONFIG_DROP_MAPPING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AlterTSConfigType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AlterTSConfigType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AlterTSConfigType>() {
          public AlterTSConfigType findValueByNumber(int number) {
            return AlterTSConfigType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(31);
  }

  private static final AlterTSConfigType[] VALUES = values();

  public static AlterTSConfigType valueOf(
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

  private AlterTSConfigType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.AlterTSConfigType)
}

