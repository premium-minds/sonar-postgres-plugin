// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.SortByDir}
 */
public enum SortByDir
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SORT_BY_DIR_UNDEFINED = 0;</code>
   */
  SORT_BY_DIR_UNDEFINED(0),
  /**
   * <code>SORTBY_DEFAULT = 1;</code>
   */
  SORTBY_DEFAULT(1),
  /**
   * <code>SORTBY_ASC = 2;</code>
   */
  SORTBY_ASC(2),
  /**
   * <code>SORTBY_DESC = 3;</code>
   */
  SORTBY_DESC(3),
  /**
   * <code>SORTBY_USING = 4;</code>
   */
  SORTBY_USING(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SORT_BY_DIR_UNDEFINED = 0;</code>
   */
  public static final int SORT_BY_DIR_UNDEFINED_VALUE = 0;
  /**
   * <code>SORTBY_DEFAULT = 1;</code>
   */
  public static final int SORTBY_DEFAULT_VALUE = 1;
  /**
   * <code>SORTBY_ASC = 2;</code>
   */
  public static final int SORTBY_ASC_VALUE = 2;
  /**
   * <code>SORTBY_DESC = 3;</code>
   */
  public static final int SORTBY_DESC_VALUE = 3;
  /**
   * <code>SORTBY_USING = 4;</code>
   */
  public static final int SORTBY_USING_VALUE = 4;


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
  public static SortByDir valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SortByDir forNumber(int value) {
    switch (value) {
      case 0: return SORT_BY_DIR_UNDEFINED;
      case 1: return SORTBY_DEFAULT;
      case 2: return SORTBY_ASC;
      case 3: return SORTBY_DESC;
      case 4: return SORTBY_USING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SortByDir>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SortByDir> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SortByDir>() {
          public SortByDir findValueByNumber(int number) {
            return SortByDir.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(2);
  }

  private static final SortByDir[] VALUES = values();

  public static SortByDir valueOf(
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

  private SortByDir(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.SortByDir)
}

