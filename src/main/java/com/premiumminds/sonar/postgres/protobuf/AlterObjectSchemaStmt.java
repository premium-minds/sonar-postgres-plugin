// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlterObjectSchemaStmt}
 */
public final class AlterObjectSchemaStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterObjectSchemaStmt)
    AlterObjectSchemaStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterObjectSchemaStmt.newBuilder() to construct.
  private AlterObjectSchemaStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterObjectSchemaStmt() {
    objectType_ = 0;
    newschema_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterObjectSchemaStmt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterObjectSchemaStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterObjectSchemaStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  private int objectType_ = 0;
  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The enum numeric value on the wire for objectType.
   */
  @java.lang.Override public int getObjectTypeValue() {
    return objectType_;
  }
  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.ObjectType getObjectType() {
    com.premiumminds.sonar.postgres.protobuf.ObjectType result = com.premiumminds.sonar.postgres.protobuf.ObjectType.forNumber(objectType_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.ObjectType.UNRECOGNIZED : result;
  }

  public static final int RELATION_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.RangeVar relation_;
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation() {
    return relation_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
  }
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder() {
    return relation_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
  }

  public static final int OBJECT_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.postgres.protobuf.Node object_;
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getObject() {
    return object_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : object_;
  }
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : object_;
  }

  public static final int NEWSCHEMA_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newschema_ = "";
  /**
   * <code>string newschema = 4 [json_name = "newschema"];</code>
   * @return The newschema.
   */
  @java.lang.Override
  public java.lang.String getNewschema() {
    java.lang.Object ref = newschema_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newschema_ = s;
      return s;
    }
  }
  /**
   * <code>string newschema = 4 [json_name = "newschema"];</code>
   * @return The bytes for newschema.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewschemaBytes() {
    java.lang.Object ref = newschema_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newschema_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MISSING_OK_FIELD_NUMBER = 5;
  private boolean missingOk_ = false;
  /**
   * <code>bool missing_ok = 5 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  @java.lang.Override
  public boolean getMissingOk() {
    return missingOk_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (objectType_ != com.premiumminds.sonar.postgres.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      output.writeEnum(1, objectType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getRelation());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getObject());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newschema_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, newschema_);
    }
    if (missingOk_ != false) {
      output.writeBool(5, missingOk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (objectType_ != com.premiumminds.sonar.postgres.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, objectType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRelation());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getObject());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newschema_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, newschema_);
    }
    if (missingOk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, missingOk_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt other = (com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt) obj;

    if (objectType_ != other.objectType_) return false;
    if (hasRelation() != other.hasRelation()) return false;
    if (hasRelation()) {
      if (!getRelation()
          .equals(other.getRelation())) return false;
    }
    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject()
          .equals(other.getObject())) return false;
    }
    if (!getNewschema()
        .equals(other.getNewschema())) return false;
    if (getMissingOk()
        != other.getMissingOk()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OBJECT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + objectType_;
    if (hasRelation()) {
      hash = (37 * hash) + RELATION_FIELD_NUMBER;
      hash = (53 * hash) + getRelation().hashCode();
    }
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    hash = (37 * hash) + NEWSCHEMA_FIELD_NUMBER;
    hash = (53 * hash) + getNewschema().hashCode();
    hash = (37 * hash) + MISSING_OK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMissingOk());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code pg_query.AlterObjectSchemaStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterObjectSchemaStmt)
      com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterObjectSchemaStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterObjectSchemaStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRelationFieldBuilder();
        getObjectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objectType_ = 0;
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      newschema_ = "";
      missingOk_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterObjectSchemaStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt build() {
      com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt result = new com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectType_ = objectType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relation_ = relationBuilder_ == null
            ? relation_
            : relationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.newschema_ = newschema_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.missingOk_ = missingOk_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt.getDefaultInstance()) return this;
      if (other.objectType_ != 0) {
        setObjectTypeValue(other.getObjectTypeValue());
      }
      if (other.hasRelation()) {
        mergeRelation(other.getRelation());
      }
      if (other.hasObject()) {
        mergeObject(other.getObject());
      }
      if (!other.getNewschema().isEmpty()) {
        newschema_ = other.newschema_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getMissingOk() != false) {
        setMissingOk(other.getMissingOk());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              objectType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getRelationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getObjectFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              newschema_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              missingOk_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int objectType_ = 0;
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return The enum numeric value on the wire for objectType.
     */
    @java.lang.Override public int getObjectTypeValue() {
      return objectType_;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @param value The enum numeric value on the wire for objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectTypeValue(int value) {
      objectType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return The objectType.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ObjectType getObjectType() {
      com.premiumminds.sonar.postgres.protobuf.ObjectType result = com.premiumminds.sonar.postgres.protobuf.ObjectType.forNumber(objectType_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.ObjectType.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @param value The objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectType(com.premiumminds.sonar.postgres.protobuf.ObjectType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      objectType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      objectType_ = 0;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.RangeVar relation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder> relationBuilder_;
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    public boolean hasRelation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     * @return The relation.
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation() {
      if (relationBuilder_ == null) {
        return relation_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
      } else {
        return relationBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.premiumminds.sonar.postgres.protobuf.RangeVar value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relation_ = value;
      } else {
        relationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder builderForValue) {
      if (relationBuilder_ == null) {
        relation_ = builderForValue.build();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.premiumminds.sonar.postgres.protobuf.RangeVar value) {
      if (relationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          relation_ != null &&
          relation_ != com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance()) {
          getRelationBuilder().mergeFrom(value);
        } else {
          relation_ = value;
        }
      } else {
        relationBuilder_.mergeFrom(value);
      }
      if (relation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder getRelationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        return relation_ == null ?
            com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
      }
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder>(
                getRelation(),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> objectBuilder_;
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     * @return The object.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder setObject(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          object_ != null &&
          object_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      if (object_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000004);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getObjectBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : object_;
      }
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
    }

    private java.lang.Object newschema_ = "";
    /**
     * <code>string newschema = 4 [json_name = "newschema"];</code>
     * @return The newschema.
     */
    public java.lang.String getNewschema() {
      java.lang.Object ref = newschema_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newschema_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newschema = 4 [json_name = "newschema"];</code>
     * @return The bytes for newschema.
     */
    public com.google.protobuf.ByteString
        getNewschemaBytes() {
      java.lang.Object ref = newschema_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newschema_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newschema = 4 [json_name = "newschema"];</code>
     * @param value The newschema to set.
     * @return This builder for chaining.
     */
    public Builder setNewschema(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newschema_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string newschema = 4 [json_name = "newschema"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewschema() {
      newschema_ = getDefaultInstance().getNewschema();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string newschema = 4 [json_name = "newschema"];</code>
     * @param value The bytes for newschema to set.
     * @return This builder for chaining.
     */
    public Builder setNewschemaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newschema_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean missingOk_ ;
    /**
     * <code>bool missing_ok = 5 [json_name = "missing_ok"];</code>
     * @return The missingOk.
     */
    @java.lang.Override
    public boolean getMissingOk() {
      return missingOk_;
    }
    /**
     * <code>bool missing_ok = 5 [json_name = "missing_ok"];</code>
     * @param value The missingOk to set.
     * @return This builder for chaining.
     */
    public Builder setMissingOk(boolean value) {

      missingOk_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool missing_ok = 5 [json_name = "missing_ok"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMissingOk() {
      bitField0_ = (bitField0_ & ~0x00000010);
      missingOk_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pg_query.AlterObjectSchemaStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterObjectSchemaStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterObjectSchemaStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterObjectSchemaStmt>() {
    @java.lang.Override
    public AlterObjectSchemaStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AlterObjectSchemaStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterObjectSchemaStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlterObjectSchemaStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

