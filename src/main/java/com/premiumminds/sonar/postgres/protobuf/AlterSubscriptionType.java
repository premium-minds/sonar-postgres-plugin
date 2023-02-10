// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.AlterSubscriptionType}
 */
public enum AlterSubscriptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALTER_SUBSCRIPTION_TYPE_UNDEFINED = 0;</code>
   */
  ALTER_SUBSCRIPTION_TYPE_UNDEFINED(0),
  /**
   * <code>ALTER_SUBSCRIPTION_OPTIONS = 1;</code>
   */
  ALTER_SUBSCRIPTION_OPTIONS(1),
  /**
   * <code>ALTER_SUBSCRIPTION_CONNECTION = 2;</code>
   */
  ALTER_SUBSCRIPTION_CONNECTION(2),
  /**
   * <code>ALTER_SUBSCRIPTION_SET_PUBLICATION = 3;</code>
   */
  ALTER_SUBSCRIPTION_SET_PUBLICATION(3),
  /**
   * <code>ALTER_SUBSCRIPTION_ADD_PUBLICATION = 4;</code>
   */
  ALTER_SUBSCRIPTION_ADD_PUBLICATION(4),
  /**
   * <code>ALTER_SUBSCRIPTION_DROP_PUBLICATION = 5;</code>
   */
  ALTER_SUBSCRIPTION_DROP_PUBLICATION(5),
  /**
   * <code>ALTER_SUBSCRIPTION_REFRESH = 6;</code>
   */
  ALTER_SUBSCRIPTION_REFRESH(6),
  /**
   * <code>ALTER_SUBSCRIPTION_ENABLED = 7;</code>
   */
  ALTER_SUBSCRIPTION_ENABLED(7),
  /**
   * <code>ALTER_SUBSCRIPTION_SKIP = 8;</code>
   */
  ALTER_SUBSCRIPTION_SKIP(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALTER_SUBSCRIPTION_TYPE_UNDEFINED = 0;</code>
   */
  public static final int ALTER_SUBSCRIPTION_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>ALTER_SUBSCRIPTION_OPTIONS = 1;</code>
   */
  public static final int ALTER_SUBSCRIPTION_OPTIONS_VALUE = 1;
  /**
   * <code>ALTER_SUBSCRIPTION_CONNECTION = 2;</code>
   */
  public static final int ALTER_SUBSCRIPTION_CONNECTION_VALUE = 2;
  /**
   * <code>ALTER_SUBSCRIPTION_SET_PUBLICATION = 3;</code>
   */
  public static final int ALTER_SUBSCRIPTION_SET_PUBLICATION_VALUE = 3;
  /**
   * <code>ALTER_SUBSCRIPTION_ADD_PUBLICATION = 4;</code>
   */
  public static final int ALTER_SUBSCRIPTION_ADD_PUBLICATION_VALUE = 4;
  /**
   * <code>ALTER_SUBSCRIPTION_DROP_PUBLICATION = 5;</code>
   */
  public static final int ALTER_SUBSCRIPTION_DROP_PUBLICATION_VALUE = 5;
  /**
   * <code>ALTER_SUBSCRIPTION_REFRESH = 6;</code>
   */
  public static final int ALTER_SUBSCRIPTION_REFRESH_VALUE = 6;
  /**
   * <code>ALTER_SUBSCRIPTION_ENABLED = 7;</code>
   */
  public static final int ALTER_SUBSCRIPTION_ENABLED_VALUE = 7;
  /**
   * <code>ALTER_SUBSCRIPTION_SKIP = 8;</code>
   */
  public static final int ALTER_SUBSCRIPTION_SKIP_VALUE = 8;


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
  public static AlterSubscriptionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AlterSubscriptionType forNumber(int value) {
    switch (value) {
      case 0: return ALTER_SUBSCRIPTION_TYPE_UNDEFINED;
      case 1: return ALTER_SUBSCRIPTION_OPTIONS;
      case 2: return ALTER_SUBSCRIPTION_CONNECTION;
      case 3: return ALTER_SUBSCRIPTION_SET_PUBLICATION;
      case 4: return ALTER_SUBSCRIPTION_ADD_PUBLICATION;
      case 5: return ALTER_SUBSCRIPTION_DROP_PUBLICATION;
      case 6: return ALTER_SUBSCRIPTION_REFRESH;
      case 7: return ALTER_SUBSCRIPTION_ENABLED;
      case 8: return ALTER_SUBSCRIPTION_SKIP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AlterSubscriptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AlterSubscriptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AlterSubscriptionType>() {
          public AlterSubscriptionType findValueByNumber(int number) {
            return AlterSubscriptionType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(32);
  }

  private static final AlterSubscriptionType[] VALUES = values();

  public static AlterSubscriptionType valueOf(
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

  private AlterSubscriptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.AlterSubscriptionType)
}

