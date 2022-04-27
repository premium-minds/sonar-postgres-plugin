// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.CreateOpFamilyStmt}
 */
public final class CreateOpFamilyStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CreateOpFamilyStmt)
    CreateOpFamilyStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOpFamilyStmt.newBuilder() to construct.
  private CreateOpFamilyStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOpFamilyStmt() {
    opfamilyname_ = java.util.Collections.emptyList();
    amname_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateOpFamilyStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateOpFamilyStmt(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              opfamilyname_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            opfamilyname_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            amname_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        opfamilyname_ = java.util.Collections.unmodifiableList(opfamilyname_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateOpFamilyStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateOpFamilyStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.class, com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.Builder.class);
  }

  public static final int OPFAMILYNAME_FIELD_NUMBER = 1;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> opfamilyname_;
  /**
   * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getOpfamilynameList() {
    return opfamilyname_;
  }
  /**
   * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOpfamilynameOrBuilderList() {
    return opfamilyname_;
  }
  /**
   * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
   */
  @java.lang.Override
  public int getOpfamilynameCount() {
    return opfamilyname_.size();
  }
  /**
   * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getOpfamilyname(int index) {
    return opfamilyname_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOpfamilynameOrBuilder(
      int index) {
    return opfamilyname_.get(index);
  }

  public static final int AMNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object amname_;
  /**
   * <code>string amname = 2 [json_name = "amname"];</code>
   * @return The amname.
   */
  @java.lang.Override
  public java.lang.String getAmname() {
    java.lang.Object ref = amname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amname_ = s;
      return s;
    }
  }
  /**
   * <code>string amname = 2 [json_name = "amname"];</code>
   * @return The bytes for amname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmnameBytes() {
    java.lang.Object ref = amname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < opfamilyname_.size(); i++) {
      output.writeMessage(1, opfamilyname_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, amname_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < opfamilyname_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, opfamilyname_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, amname_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt other = (com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt) obj;

    if (!getOpfamilynameList()
        .equals(other.getOpfamilynameList())) return false;
    if (!getAmname()
        .equals(other.getAmname())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOpfamilynameCount() > 0) {
      hash = (37 * hash) + OPFAMILYNAME_FIELD_NUMBER;
      hash = (53 * hash) + getOpfamilynameList().hashCode();
    }
    hash = (37 * hash) + AMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getAmname().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt prototype) {
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
   * Protobuf type {@code pg_query.CreateOpFamilyStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CreateOpFamilyStmt)
      com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateOpFamilyStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateOpFamilyStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.class, com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.newBuilder()
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
        getOpfamilynameFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (opfamilynameBuilder_ == null) {
        opfamilyname_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        opfamilynameBuilder_.clear();
      }
      amname_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateOpFamilyStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt result = new com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt(this);
      int from_bitField0_ = bitField0_;
      if (opfamilynameBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          opfamilyname_ = java.util.Collections.unmodifiableList(opfamilyname_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.opfamilyname_ = opfamilyname_;
      } else {
        result.opfamilyname_ = opfamilynameBuilder_.build();
      }
      result.amname_ = amname_;
      onBuilt();
      return result;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt.getDefaultInstance()) return this;
      if (opfamilynameBuilder_ == null) {
        if (!other.opfamilyname_.isEmpty()) {
          if (opfamilyname_.isEmpty()) {
            opfamilyname_ = other.opfamilyname_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOpfamilynameIsMutable();
            opfamilyname_.addAll(other.opfamilyname_);
          }
          onChanged();
        }
      } else {
        if (!other.opfamilyname_.isEmpty()) {
          if (opfamilynameBuilder_.isEmpty()) {
            opfamilynameBuilder_.dispose();
            opfamilynameBuilder_ = null;
            opfamilyname_ = other.opfamilyname_;
            bitField0_ = (bitField0_ & ~0x00000001);
            opfamilynameBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOpfamilynameFieldBuilder() : null;
          } else {
            opfamilynameBuilder_.addAllMessages(other.opfamilyname_);
          }
        }
      }
      if (!other.getAmname().isEmpty()) {
        amname_ = other.amname_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> opfamilyname_ =
      java.util.Collections.emptyList();
    private void ensureOpfamilynameIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        opfamilyname_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(opfamilyname_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> opfamilynameBuilder_;

    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getOpfamilynameList() {
      if (opfamilynameBuilder_ == null) {
        return java.util.Collections.unmodifiableList(opfamilyname_);
      } else {
        return opfamilynameBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public int getOpfamilynameCount() {
      if (opfamilynameBuilder_ == null) {
        return opfamilyname_.size();
      } else {
        return opfamilynameBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getOpfamilyname(int index) {
      if (opfamilynameBuilder_ == null) {
        return opfamilyname_.get(index);
      } else {
        return opfamilynameBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder setOpfamilyname(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (opfamilynameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpfamilynameIsMutable();
        opfamilyname_.set(index, value);
        onChanged();
      } else {
        opfamilynameBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder setOpfamilyname(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (opfamilynameBuilder_ == null) {
        ensureOpfamilynameIsMutable();
        opfamilyname_.set(index, builderForValue.build());
        onChanged();
      } else {
        opfamilynameBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder addOpfamilyname(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (opfamilynameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpfamilynameIsMutable();
        opfamilyname_.add(value);
        onChanged();
      } else {
        opfamilynameBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder addOpfamilyname(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (opfamilynameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpfamilynameIsMutable();
        opfamilyname_.add(index, value);
        onChanged();
      } else {
        opfamilynameBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder addOpfamilyname(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (opfamilynameBuilder_ == null) {
        ensureOpfamilynameIsMutable();
        opfamilyname_.add(builderForValue.build());
        onChanged();
      } else {
        opfamilynameBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder addOpfamilyname(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (opfamilynameBuilder_ == null) {
        ensureOpfamilynameIsMutable();
        opfamilyname_.add(index, builderForValue.build());
        onChanged();
      } else {
        opfamilynameBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder addAllOpfamilyname(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (opfamilynameBuilder_ == null) {
        ensureOpfamilynameIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, opfamilyname_);
        onChanged();
      } else {
        opfamilynameBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder clearOpfamilyname() {
      if (opfamilynameBuilder_ == null) {
        opfamilyname_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        opfamilynameBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public Builder removeOpfamilyname(int index) {
      if (opfamilynameBuilder_ == null) {
        ensureOpfamilynameIsMutable();
        opfamilyname_.remove(index);
        onChanged();
      } else {
        opfamilynameBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getOpfamilynameBuilder(
        int index) {
      return getOpfamilynameFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOpfamilynameOrBuilder(
        int index) {
      if (opfamilynameBuilder_ == null) {
        return opfamilyname_.get(index);  } else {
        return opfamilynameBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getOpfamilynameOrBuilderList() {
      if (opfamilynameBuilder_ != null) {
        return opfamilynameBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(opfamilyname_);
      }
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addOpfamilynameBuilder() {
      return getOpfamilynameFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addOpfamilynameBuilder(
        int index) {
      return getOpfamilynameFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node opfamilyname = 1 [json_name = "opfamilyname"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getOpfamilynameBuilderList() {
      return getOpfamilynameFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getOpfamilynameFieldBuilder() {
      if (opfamilynameBuilder_ == null) {
        opfamilynameBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                opfamilyname_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        opfamilyname_ = null;
      }
      return opfamilynameBuilder_;
    }

    private java.lang.Object amname_ = "";
    /**
     * <code>string amname = 2 [json_name = "amname"];</code>
     * @return The amname.
     */
    public java.lang.String getAmname() {
      java.lang.Object ref = amname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amname = 2 [json_name = "amname"];</code>
     * @return The bytes for amname.
     */
    public com.google.protobuf.ByteString
        getAmnameBytes() {
      java.lang.Object ref = amname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amname = 2 [json_name = "amname"];</code>
     * @param value The amname to set.
     * @return This builder for chaining.
     */
    public Builder setAmname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string amname = 2 [json_name = "amname"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmname() {
      
      amname_ = getDefaultInstance().getAmname();
      onChanged();
      return this;
    }
    /**
     * <code>string amname = 2 [json_name = "amname"];</code>
     * @param value The bytes for amname to set.
     * @return This builder for chaining.
     */
    public Builder setAmnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amname_ = value;
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


    // @@protoc_insertion_point(builder_scope:pg_query.CreateOpFamilyStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CreateOpFamilyStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOpFamilyStmt>
      PARSER = new com.google.protobuf.AbstractParser<CreateOpFamilyStmt>() {
    @java.lang.Override
    public CreateOpFamilyStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateOpFamilyStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateOpFamilyStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOpFamilyStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.CreateOpFamilyStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
