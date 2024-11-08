// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.WCOKind}
 */
public enum WCOKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WCOKIND_UNDEFINED = 0;</code>
   */
  WCOKIND_UNDEFINED(0),
  /**
   * <code>WCO_VIEW_CHECK = 1;</code>
   */
  WCO_VIEW_CHECK(1),
  /**
   * <code>WCO_RLS_INSERT_CHECK = 2;</code>
   */
  WCO_RLS_INSERT_CHECK(2),
  /**
   * <code>WCO_RLS_UPDATE_CHECK = 3;</code>
   */
  WCO_RLS_UPDATE_CHECK(3),
  /**
   * <code>WCO_RLS_CONFLICT_CHECK = 4;</code>
   */
  WCO_RLS_CONFLICT_CHECK(4),
  /**
   * <code>WCO_RLS_MERGE_UPDATE_CHECK = 5;</code>
   */
  WCO_RLS_MERGE_UPDATE_CHECK(5),
  /**
   * <code>WCO_RLS_MERGE_DELETE_CHECK = 6;</code>
   */
  WCO_RLS_MERGE_DELETE_CHECK(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WCOKIND_UNDEFINED = 0;</code>
   */
  public static final int WCOKIND_UNDEFINED_VALUE = 0;
  /**
   * <code>WCO_VIEW_CHECK = 1;</code>
   */
  public static final int WCO_VIEW_CHECK_VALUE = 1;
  /**
   * <code>WCO_RLS_INSERT_CHECK = 2;</code>
   */
  public static final int WCO_RLS_INSERT_CHECK_VALUE = 2;
  /**
   * <code>WCO_RLS_UPDATE_CHECK = 3;</code>
   */
  public static final int WCO_RLS_UPDATE_CHECK_VALUE = 3;
  /**
   * <code>WCO_RLS_CONFLICT_CHECK = 4;</code>
   */
  public static final int WCO_RLS_CONFLICT_CHECK_VALUE = 4;
  /**
   * <code>WCO_RLS_MERGE_UPDATE_CHECK = 5;</code>
   */
  public static final int WCO_RLS_MERGE_UPDATE_CHECK_VALUE = 5;
  /**
   * <code>WCO_RLS_MERGE_DELETE_CHECK = 6;</code>
   */
  public static final int WCO_RLS_MERGE_DELETE_CHECK_VALUE = 6;


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
  public static WCOKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WCOKind forNumber(int value) {
    switch (value) {
      case 0: return WCOKIND_UNDEFINED;
      case 1: return WCO_VIEW_CHECK;
      case 2: return WCO_RLS_INSERT_CHECK;
      case 3: return WCO_RLS_UPDATE_CHECK;
      case 4: return WCO_RLS_CONFLICT_CHECK;
      case 5: return WCO_RLS_MERGE_UPDATE_CHECK;
      case 6: return WCO_RLS_MERGE_DELETE_CHECK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WCOKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WCOKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WCOKind>() {
          public WCOKind findValueByNumber(int number) {
            return WCOKind.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(11);
  }

  private static final WCOKind[] VALUES = values();

  public static WCOKind valueOf(
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

  private WCOKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.WCOKind)
}

