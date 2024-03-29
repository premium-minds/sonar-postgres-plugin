// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlterExtensionContentsStmt}
 */
public final class AlterExtensionContentsStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterExtensionContentsStmt)
    AlterExtensionContentsStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterExtensionContentsStmt.newBuilder() to construct.
  private AlterExtensionContentsStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterExtensionContentsStmt() {
    extname_ = "";
    objtype_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterExtensionContentsStmt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.Builder.class);
  }

  private int bitField0_;
  public static final int EXTNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object extname_ = "";
  /**
   * <code>string extname = 1 [json_name = "extname"];</code>
   * @return The extname.
   */
  @java.lang.Override
  public java.lang.String getExtname() {
    java.lang.Object ref = extname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extname_ = s;
      return s;
    }
  }
  /**
   * <code>string extname = 1 [json_name = "extname"];</code>
   * @return The bytes for extname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtnameBytes() {
    java.lang.Object ref = extname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private int action_ = 0;
  /**
   * <code>int32 action = 2 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override
  public int getAction() {
    return action_;
  }

  public static final int OBJTYPE_FIELD_NUMBER = 3;
  private int objtype_ = 0;
  /**
   * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
   * @return The enum numeric value on the wire for objtype.
   */
  @java.lang.Override public int getObjtypeValue() {
    return objtype_;
  }
  /**
   * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
   * @return The objtype.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.ObjectType getObjtype() {
    com.premiumminds.sonar.postgres.protobuf.ObjectType result = com.premiumminds.sonar.postgres.protobuf.ObjectType.forNumber(objtype_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.ObjectType.UNRECOGNIZED : result;
  }

  public static final int OBJECT_FIELD_NUMBER = 4;
  private com.premiumminds.sonar.postgres.protobuf.Node object_;
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getObject() {
    return object_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : object_;
  }
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : object_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, extname_);
    }
    if (action_ != 0) {
      output.writeInt32(2, action_);
    }
    if (objtype_ != com.premiumminds.sonar.postgres.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      output.writeEnum(3, objtype_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getObject());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, extname_);
    }
    if (action_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, action_);
    }
    if (objtype_ != com.premiumminds.sonar.postgres.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, objtype_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getObject());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt other = (com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt) obj;

    if (!getExtname()
        .equals(other.getExtname())) return false;
    if (getAction()
        != other.getAction()) return false;
    if (objtype_ != other.objtype_) return false;
    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject()
          .equals(other.getObject())) return false;
    }
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
    hash = (37 * hash) + EXTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getExtname().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction();
    hash = (37 * hash) + OBJTYPE_FIELD_NUMBER;
    hash = (53 * hash) + objtype_;
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterExtensionContentsStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterExtensionContentsStmt)
      com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.newBuilder()
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
        getObjectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      extname_ = "";
      action_ = 0;
      objtype_ = 0;
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt build() {
      com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt result = new com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.extname_ = extname_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.objtype_ = objtype_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt.getDefaultInstance()) return this;
      if (!other.getExtname().isEmpty()) {
        extname_ = other.extname_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAction() != 0) {
        setAction(other.getAction());
      }
      if (other.objtype_ != 0) {
        setObjtypeValue(other.getObjtypeValue());
      }
      if (other.hasObject()) {
        mergeObject(other.getObject());
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
            case 10: {
              extname_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              action_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              objtype_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getObjectFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object extname_ = "";
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @return The extname.
     */
    public java.lang.String getExtname() {
      java.lang.Object ref = extname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @return The bytes for extname.
     */
    public com.google.protobuf.ByteString
        getExtnameBytes() {
      java.lang.Object ref = extname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @param value The extname to set.
     * @return This builder for chaining.
     */
    public Builder setExtname(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      extname_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtname() {
      extname_ = getDefaultInstance().getExtname();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @param value The bytes for extname to set.
     * @return This builder for chaining.
     */
    public Builder setExtnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      extname_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int action_ ;
    /**
     * <code>int32 action = 2 [json_name = "action"];</code>
     * @return The action.
     */
    @java.lang.Override
    public int getAction() {
      return action_;
    }
    /**
     * <code>int32 action = 2 [json_name = "action"];</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(int value) {

      action_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 action = 2 [json_name = "action"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000002);
      action_ = 0;
      onChanged();
      return this;
    }

    private int objtype_ = 0;
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @return The enum numeric value on the wire for objtype.
     */
    @java.lang.Override public int getObjtypeValue() {
      return objtype_;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @param value The enum numeric value on the wire for objtype to set.
     * @return This builder for chaining.
     */
    public Builder setObjtypeValue(int value) {
      objtype_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @return The objtype.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ObjectType getObjtype() {
      com.premiumminds.sonar.postgres.protobuf.ObjectType result = com.premiumminds.sonar.postgres.protobuf.ObjectType.forNumber(objtype_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.ObjectType.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @param value The objtype to set.
     * @return This builder for chaining.
     */
    public Builder setObjtype(com.premiumminds.sonar.postgres.protobuf.ObjectType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      objtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjtype() {
      bitField0_ = (bitField0_ & ~0x00000004);
      objtype_ = 0;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> objectBuilder_;
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
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
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000008);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getObjectBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterExtensionContentsStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterExtensionContentsStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterExtensionContentsStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterExtensionContentsStmt>() {
    @java.lang.Override
    public AlterExtensionContentsStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlterExtensionContentsStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterExtensionContentsStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlterExtensionContentsStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

