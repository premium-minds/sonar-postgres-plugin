// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.XmlOptionType}
 */
public enum XmlOptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>XML_OPTION_TYPE_UNDEFINED = 0;</code>
   */
  XML_OPTION_TYPE_UNDEFINED(0),
  /**
   * <code>XMLOPTION_DOCUMENT = 1;</code>
   */
  XMLOPTION_DOCUMENT(1),
  /**
   * <code>XMLOPTION_CONTENT = 2;</code>
   */
  XMLOPTION_CONTENT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>XML_OPTION_TYPE_UNDEFINED = 0;</code>
   */
  public static final int XML_OPTION_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>XMLOPTION_DOCUMENT = 1;</code>
   */
  public static final int XMLOPTION_DOCUMENT_VALUE = 1;
  /**
   * <code>XMLOPTION_CONTENT = 2;</code>
   */
  public static final int XMLOPTION_CONTENT_VALUE = 2;


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
  public static XmlOptionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static XmlOptionType forNumber(int value) {
    switch (value) {
      case 0: return XML_OPTION_TYPE_UNDEFINED;
      case 1: return XMLOPTION_DOCUMENT;
      case 2: return XMLOPTION_CONTENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<XmlOptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      XmlOptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<XmlOptionType>() {
          public XmlOptionType findValueByNumber(int number) {
            return XmlOptionType.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(41);
  }

  private static final XmlOptionType[] VALUES = values();

  public static XmlOptionType valueOf(
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

  private XmlOptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.XmlOptionType)
}
