// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.XmlExprOp}
 */
public enum XmlExprOp
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>XML_EXPR_OP_UNDEFINED = 0;</code>
   */
  XML_EXPR_OP_UNDEFINED(0),
  /**
   * <code>IS_XMLCONCAT = 1;</code>
   */
  IS_XMLCONCAT(1),
  /**
   * <code>IS_XMLELEMENT = 2;</code>
   */
  IS_XMLELEMENT(2),
  /**
   * <code>IS_XMLFOREST = 3;</code>
   */
  IS_XMLFOREST(3),
  /**
   * <code>IS_XMLPARSE = 4;</code>
   */
  IS_XMLPARSE(4),
  /**
   * <code>IS_XMLPI = 5;</code>
   */
  IS_XMLPI(5),
  /**
   * <code>IS_XMLROOT = 6;</code>
   */
  IS_XMLROOT(6),
  /**
   * <code>IS_XMLSERIALIZE = 7;</code>
   */
  IS_XMLSERIALIZE(7),
  /**
   * <code>IS_DOCUMENT = 8;</code>
   */
  IS_DOCUMENT(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>XML_EXPR_OP_UNDEFINED = 0;</code>
   */
  public static final int XML_EXPR_OP_UNDEFINED_VALUE = 0;
  /**
   * <code>IS_XMLCONCAT = 1;</code>
   */
  public static final int IS_XMLCONCAT_VALUE = 1;
  /**
   * <code>IS_XMLELEMENT = 2;</code>
   */
  public static final int IS_XMLELEMENT_VALUE = 2;
  /**
   * <code>IS_XMLFOREST = 3;</code>
   */
  public static final int IS_XMLFOREST_VALUE = 3;
  /**
   * <code>IS_XMLPARSE = 4;</code>
   */
  public static final int IS_XMLPARSE_VALUE = 4;
  /**
   * <code>IS_XMLPI = 5;</code>
   */
  public static final int IS_XMLPI_VALUE = 5;
  /**
   * <code>IS_XMLROOT = 6;</code>
   */
  public static final int IS_XMLROOT_VALUE = 6;
  /**
   * <code>IS_XMLSERIALIZE = 7;</code>
   */
  public static final int IS_XMLSERIALIZE_VALUE = 7;
  /**
   * <code>IS_DOCUMENT = 8;</code>
   */
  public static final int IS_DOCUMENT_VALUE = 8;


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
  public static XmlExprOp valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static XmlExprOp forNumber(int value) {
    switch (value) {
      case 0: return XML_EXPR_OP_UNDEFINED;
      case 1: return IS_XMLCONCAT;
      case 2: return IS_XMLELEMENT;
      case 3: return IS_XMLFOREST;
      case 4: return IS_XMLPARSE;
      case 5: return IS_XMLPI;
      case 6: return IS_XMLROOT;
      case 7: return IS_XMLSERIALIZE;
      case 8: return IS_DOCUMENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<XmlExprOp>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      XmlExprOp> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<XmlExprOp>() {
          public XmlExprOp findValueByNumber(int number) {
            return XmlExprOp.forNumber(number);
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.getDescriptor().getEnumTypes().get(43);
  }

  private static final XmlExprOp[] VALUES = values();

  public static XmlExprOp valueOf(
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

  private XmlExprOp(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.XmlExprOp)
}

