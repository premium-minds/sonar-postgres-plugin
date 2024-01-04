// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.CmdType}
 */
public enum CmdType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CMD_TYPE_UNDEFINED = 0;</code>
   */
  CMD_TYPE_UNDEFINED(0),
  /**
   * <code>CMD_UNKNOWN = 1;</code>
   */
  CMD_UNKNOWN(1),
  /**
   * <code>CMD_SELECT = 2;</code>
   */
  CMD_SELECT(2),
  /**
   * <code>CMD_UPDATE = 3;</code>
   */
  CMD_UPDATE(3),
  /**
   * <code>CMD_INSERT = 4;</code>
   */
  CMD_INSERT(4),
  /**
   * <code>CMD_DELETE = 5;</code>
   */
  CMD_DELETE(5),
  /**
   * <code>CMD_MERGE = 6;</code>
   */
  CMD_MERGE(6),
  /**
   * <code>CMD_UTILITY = 7;</code>
   */
  CMD_UTILITY(7),
  /**
   * <code>CMD_NOTHING = 8;</code>
   */
  CMD_NOTHING(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CMD_TYPE_UNDEFINED = 0;</code>
   */
  public static final int CMD_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>CMD_UNKNOWN = 1;</code>
   */
  public static final int CMD_UNKNOWN_VALUE = 1;
  /**
   * <code>CMD_SELECT = 2;</code>
   */
  public static final int CMD_SELECT_VALUE = 2;
  /**
   * <code>CMD_UPDATE = 3;</code>
   */
  public static final int CMD_UPDATE_VALUE = 3;
  /**
   * <code>CMD_INSERT = 4;</code>
   */
  public static final int CMD_INSERT_VALUE = 4;
  /**
   * <code>CMD_DELETE = 5;</code>
   */
  public static final int CMD_DELETE_VALUE = 5;
  /**
   * <code>CMD_MERGE = 6;</code>
   */
  public static final int CMD_MERGE_VALUE = 6;
  /**
   * <code>CMD_UTILITY = 7;</code>
   */
  public static final int CMD_UTILITY_VALUE = 7;
  /**
   * <code>CMD_NOTHING = 8;</code>
   */
  public static final int CMD_NOTHING_VALUE = 8;


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
  public static CmdType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CmdType forNumber(int value) {
    switch (value) {
      case 0: return CMD_TYPE_UNDEFINED;
      case 1: return CMD_UNKNOWN;
      case 2: return CMD_SELECT;
      case 3: return CMD_UPDATE;
      case 4: return CMD_INSERT;
      case 5: return CMD_DELETE;
      case 6: return CMD_MERGE;
      case 7: return CMD_UTILITY;
      case 8: return CMD_NOTHING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CmdType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CmdType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CmdType>() {
          public CmdType findValueByNumber(int number) {
            return CmdType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(51);
  }

  private static final CmdType[] VALUES = values();

  public static CmdType valueOf(
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

  private CmdType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.CmdType)
}

