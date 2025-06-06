// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.ViewCheckOption}
 */
public enum ViewCheckOption
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VIEW_CHECK_OPTION_UNDEFINED = 0;</code>
   */
  VIEW_CHECK_OPTION_UNDEFINED(0),
  /**
   * <code>NO_CHECK_OPTION = 1;</code>
   */
  NO_CHECK_OPTION(1),
  /**
   * <code>LOCAL_CHECK_OPTION = 2;</code>
   */
  LOCAL_CHECK_OPTION(2),
  /**
   * <code>CASCADED_CHECK_OPTION = 3;</code>
   */
  CASCADED_CHECK_OPTION(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VIEW_CHECK_OPTION_UNDEFINED = 0;</code>
   */
  public static final int VIEW_CHECK_OPTION_UNDEFINED_VALUE = 0;
  /**
   * <code>NO_CHECK_OPTION = 1;</code>
   */
  public static final int NO_CHECK_OPTION_VALUE = 1;
  /**
   * <code>LOCAL_CHECK_OPTION = 2;</code>
   */
  public static final int LOCAL_CHECK_OPTION_VALUE = 2;
  /**
   * <code>CASCADED_CHECK_OPTION = 3;</code>
   */
  public static final int CASCADED_CHECK_OPTION_VALUE = 3;


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
  public static ViewCheckOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ViewCheckOption forNumber(int value) {
    switch (value) {
      case 0: return VIEW_CHECK_OPTION_UNDEFINED;
      case 1: return NO_CHECK_OPTION;
      case 2: return LOCAL_CHECK_OPTION;
      case 3: return CASCADED_CHECK_OPTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ViewCheckOption>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ViewCheckOption> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ViewCheckOption>() {
          public ViewCheckOption findValueByNumber(int number) {
            return ViewCheckOption.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(28);
  }

  private static final ViewCheckOption[] VALUES = values();

  public static ViewCheckOption valueOf(
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

  private ViewCheckOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.ViewCheckOption)
}

