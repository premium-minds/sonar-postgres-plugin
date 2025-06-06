// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf enum {@code pg_query.PublicationObjSpecType}
 */
public enum PublicationObjSpecType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PUBLICATION_OBJ_SPEC_TYPE_UNDEFINED = 0;</code>
   */
  PUBLICATION_OBJ_SPEC_TYPE_UNDEFINED(0),
  /**
   * <code>PUBLICATIONOBJ_TABLE = 1;</code>
   */
  PUBLICATIONOBJ_TABLE(1),
  /**
   * <code>PUBLICATIONOBJ_TABLES_IN_SCHEMA = 2;</code>
   */
  PUBLICATIONOBJ_TABLES_IN_SCHEMA(2),
  /**
   * <code>PUBLICATIONOBJ_TABLES_IN_CUR_SCHEMA = 3;</code>
   */
  PUBLICATIONOBJ_TABLES_IN_CUR_SCHEMA(3),
  /**
   * <code>PUBLICATIONOBJ_CONTINUATION = 4;</code>
   */
  PUBLICATIONOBJ_CONTINUATION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PUBLICATION_OBJ_SPEC_TYPE_UNDEFINED = 0;</code>
   */
  public static final int PUBLICATION_OBJ_SPEC_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>PUBLICATIONOBJ_TABLE = 1;</code>
   */
  public static final int PUBLICATIONOBJ_TABLE_VALUE = 1;
  /**
   * <code>PUBLICATIONOBJ_TABLES_IN_SCHEMA = 2;</code>
   */
  public static final int PUBLICATIONOBJ_TABLES_IN_SCHEMA_VALUE = 2;
  /**
   * <code>PUBLICATIONOBJ_TABLES_IN_CUR_SCHEMA = 3;</code>
   */
  public static final int PUBLICATIONOBJ_TABLES_IN_CUR_SCHEMA_VALUE = 3;
  /**
   * <code>PUBLICATIONOBJ_CONTINUATION = 4;</code>
   */
  public static final int PUBLICATIONOBJ_CONTINUATION_VALUE = 4;


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
  public static PublicationObjSpecType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PublicationObjSpecType forNumber(int value) {
    switch (value) {
      case 0: return PUBLICATION_OBJ_SPEC_TYPE_UNDEFINED;
      case 1: return PUBLICATIONOBJ_TABLE;
      case 2: return PUBLICATIONOBJ_TABLES_IN_SCHEMA;
      case 3: return PUBLICATIONOBJ_TABLES_IN_CUR_SCHEMA;
      case 4: return PUBLICATIONOBJ_CONTINUATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PublicationObjSpecType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PublicationObjSpecType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PublicationObjSpecType>() {
          public PublicationObjSpecType findValueByNumber(int number) {
            return PublicationObjSpecType.forNumber(number);
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

  private static final PublicationObjSpecType[] VALUES = values();

  public static PublicationObjSpecType valueOf(
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

  private PublicationObjSpecType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.PublicationObjSpecType)
}

