// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.NextValueExpr}
 */
public final class NextValueExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.NextValueExpr)
    NextValueExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NextValueExpr.newBuilder() to construct.
  private NextValueExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NextValueExpr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NextValueExpr();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_NextValueExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_NextValueExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.NextValueExpr.class, com.premiumminds.sonar.postgres.protobuf.NextValueExpr.Builder.class);
  }

  private int bitField0_;
  public static final int XPR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.Node xpr_;
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  @java.lang.Override
  public boolean hasXpr() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return The xpr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getXpr() {
    return xpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getXprOrBuilder() {
    return xpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
  }

  public static final int SEQID_FIELD_NUMBER = 2;
  private int seqid_ = 0;
  /**
   * <code>uint32 seqid = 2 [json_name = "seqid"];</code>
   * @return The seqid.
   */
  @java.lang.Override
  public int getSeqid() {
    return seqid_;
  }

  public static final int TYPE_ID_FIELD_NUMBER = 3;
  private int typeId_ = 0;
  /**
   * <code>uint32 type_id = 3 [json_name = "typeId"];</code>
   * @return The typeId.
   */
  @java.lang.Override
  public int getTypeId() {
    return typeId_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getXpr());
    }
    if (seqid_ != 0) {
      output.writeUInt32(2, seqid_);
    }
    if (typeId_ != 0) {
      output.writeUInt32(3, typeId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getXpr());
    }
    if (seqid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, seqid_);
    }
    if (typeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, typeId_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.NextValueExpr)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.NextValueExpr other = (com.premiumminds.sonar.postgres.protobuf.NextValueExpr) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (getSeqid()
        != other.getSeqid()) return false;
    if (getTypeId()
        != other.getTypeId()) return false;
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    hash = (37 * hash) + SEQID_FIELD_NUMBER;
    hash = (53 * hash) + getSeqid();
    hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTypeId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.NextValueExpr prototype) {
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
   * Protobuf type {@code pg_query.NextValueExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.NextValueExpr)
      com.premiumminds.sonar.postgres.protobuf.NextValueExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_NextValueExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_NextValueExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.NextValueExpr.class, com.premiumminds.sonar.postgres.protobuf.NextValueExpr.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.NextValueExpr.newBuilder()
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
        getXprFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      xpr_ = null;
      if (xprBuilder_ != null) {
        xprBuilder_.dispose();
        xprBuilder_ = null;
      }
      seqid_ = 0;
      typeId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_NextValueExpr_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.NextValueExpr getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.NextValueExpr.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.NextValueExpr build() {
      com.premiumminds.sonar.postgres.protobuf.NextValueExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.NextValueExpr buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.NextValueExpr result = new com.premiumminds.sonar.postgres.protobuf.NextValueExpr(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.NextValueExpr result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpr_ = xprBuilder_ == null
            ? xpr_
            : xprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seqid_ = seqid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.typeId_ = typeId_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.NextValueExpr) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.NextValueExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.NextValueExpr other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.NextValueExpr.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.getSeqid() != 0) {
        setSeqid(other.getSeqid());
      }
      if (other.getTypeId() != 0) {
        setTypeId(other.getTypeId());
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
              input.readMessage(
                  getXprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              seqid_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              typeId_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.premiumminds.sonar.postgres.protobuf.Node xpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> xprBuilder_;
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     * @return Whether the xpr field is set.
     */
    public boolean hasXpr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     * @return The xpr.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getXpr() {
      if (xprBuilder_ == null) {
        return xpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
      } else {
        return xprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        xpr_ = value;
      } else {
        xprBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (xprBuilder_ == null) {
        xpr_ = builderForValue.build();
      } else {
        xprBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder mergeXpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          xpr_ != null &&
          xpr_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getXprBuilder().mergeFrom(value);
        } else {
          xpr_ = value;
        }
      } else {
        xprBuilder_.mergeFrom(value);
      }
      if (xpr_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder clearXpr() {
      bitField0_ = (bitField0_ & ~0x00000001);
      xpr_ = null;
      if (xprBuilder_ != null) {
        xprBuilder_.dispose();
        xprBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getXprBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getXprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getXprOrBuilder() {
      if (xprBuilder_ != null) {
        return xprBuilder_.getMessageOrBuilder();
      } else {
        return xpr_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getXprFieldBuilder() {
      if (xprBuilder_ == null) {
        xprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getXpr(),
                getParentForChildren(),
                isClean());
        xpr_ = null;
      }
      return xprBuilder_;
    }

    private int seqid_ ;
    /**
     * <code>uint32 seqid = 2 [json_name = "seqid"];</code>
     * @return The seqid.
     */
    @java.lang.Override
    public int getSeqid() {
      return seqid_;
    }
    /**
     * <code>uint32 seqid = 2 [json_name = "seqid"];</code>
     * @param value The seqid to set.
     * @return This builder for chaining.
     */
    public Builder setSeqid(int value) {

      seqid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 seqid = 2 [json_name = "seqid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSeqid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seqid_ = 0;
      onChanged();
      return this;
    }

    private int typeId_ ;
    /**
     * <code>uint32 type_id = 3 [json_name = "typeId"];</code>
     * @return The typeId.
     */
    @java.lang.Override
    public int getTypeId() {
      return typeId_;
    }
    /**
     * <code>uint32 type_id = 3 [json_name = "typeId"];</code>
     * @param value The typeId to set.
     * @return This builder for chaining.
     */
    public Builder setTypeId(int value) {

      typeId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 type_id = 3 [json_name = "typeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      typeId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.NextValueExpr)
  }

  // @@protoc_insertion_point(class_scope:pg_query.NextValueExpr)
  private static final com.premiumminds.sonar.postgres.protobuf.NextValueExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.NextValueExpr();
  }

  public static com.premiumminds.sonar.postgres.protobuf.NextValueExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NextValueExpr>
      PARSER = new com.google.protobuf.AbstractParser<NextValueExpr>() {
    @java.lang.Override
    public NextValueExpr parsePartialFrom(
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

  public static com.google.protobuf.Parser<NextValueExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NextValueExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NextValueExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

