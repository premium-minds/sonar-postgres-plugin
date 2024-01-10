// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.A_Indices}
 */
public final class A_Indices extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.A_Indices)
    A_IndicesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use A_Indices.newBuilder() to construct.
  private A_Indices(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private A_Indices() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new A_Indices();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Indices_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Indices_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.A_Indices.class, com.premiumminds.sonar.postgres.protobuf.A_Indices.Builder.class);
  }

  private int bitField0_;
  public static final int IS_SLICE_FIELD_NUMBER = 1;
  private boolean isSlice_ = false;
  /**
   * <code>bool is_slice = 1 [json_name = "is_slice"];</code>
   * @return The isSlice.
   */
  @java.lang.Override
  public boolean getIsSlice() {
    return isSlice_;
  }

  public static final int LIDX_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.Node lidx_;
  /**
   * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
   * @return Whether the lidx field is set.
   */
  @java.lang.Override
  public boolean hasLidx() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
   * @return The lidx.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getLidx() {
    return lidx_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : lidx_;
  }
  /**
   * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getLidxOrBuilder() {
    return lidx_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : lidx_;
  }

  public static final int UIDX_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.postgres.protobuf.Node uidx_;
  /**
   * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
   * @return Whether the uidx field is set.
   */
  @java.lang.Override
  public boolean hasUidx() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
   * @return The uidx.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getUidx() {
    return uidx_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : uidx_;
  }
  /**
   * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getUidxOrBuilder() {
    return uidx_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : uidx_;
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
    if (isSlice_ != false) {
      output.writeBool(1, isSlice_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLidx());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getUidx());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isSlice_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isSlice_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLidx());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUidx());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.A_Indices)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.A_Indices other = (com.premiumminds.sonar.postgres.protobuf.A_Indices) obj;

    if (getIsSlice()
        != other.getIsSlice()) return false;
    if (hasLidx() != other.hasLidx()) return false;
    if (hasLidx()) {
      if (!getLidx()
          .equals(other.getLidx())) return false;
    }
    if (hasUidx() != other.hasUidx()) return false;
    if (hasUidx()) {
      if (!getUidx()
          .equals(other.getUidx())) return false;
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
    hash = (37 * hash) + IS_SLICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSlice());
    if (hasLidx()) {
      hash = (37 * hash) + LIDX_FIELD_NUMBER;
      hash = (53 * hash) + getLidx().hashCode();
    }
    if (hasUidx()) {
      hash = (37 * hash) + UIDX_FIELD_NUMBER;
      hash = (53 * hash) + getUidx().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Indices parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.A_Indices prototype) {
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
   * Protobuf type {@code pg_query.A_Indices}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.A_Indices)
      com.premiumminds.sonar.postgres.protobuf.A_IndicesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Indices_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Indices_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.A_Indices.class, com.premiumminds.sonar.postgres.protobuf.A_Indices.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.A_Indices.newBuilder()
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
        getLidxFieldBuilder();
        getUidxFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isSlice_ = false;
      lidx_ = null;
      if (lidxBuilder_ != null) {
        lidxBuilder_.dispose();
        lidxBuilder_ = null;
      }
      uidx_ = null;
      if (uidxBuilder_ != null) {
        uidxBuilder_.dispose();
        uidxBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Indices_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_Indices getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.A_Indices.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_Indices build() {
      com.premiumminds.sonar.postgres.protobuf.A_Indices result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_Indices buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.A_Indices result = new com.premiumminds.sonar.postgres.protobuf.A_Indices(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.A_Indices result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isSlice_ = isSlice_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lidx_ = lidxBuilder_ == null
            ? lidx_
            : lidxBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uidx_ = uidxBuilder_ == null
            ? uidx_
            : uidxBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.A_Indices) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.A_Indices)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.A_Indices other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.A_Indices.getDefaultInstance()) return this;
      if (other.getIsSlice() != false) {
        setIsSlice(other.getIsSlice());
      }
      if (other.hasLidx()) {
        mergeLidx(other.getLidx());
      }
      if (other.hasUidx()) {
        mergeUidx(other.getUidx());
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
              isSlice_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getLidxFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUidxFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private boolean isSlice_ ;
    /**
     * <code>bool is_slice = 1 [json_name = "is_slice"];</code>
     * @return The isSlice.
     */
    @java.lang.Override
    public boolean getIsSlice() {
      return isSlice_;
    }
    /**
     * <code>bool is_slice = 1 [json_name = "is_slice"];</code>
     * @param value The isSlice to set.
     * @return This builder for chaining.
     */
    public Builder setIsSlice(boolean value) {

      isSlice_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_slice = 1 [json_name = "is_slice"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSlice() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isSlice_ = false;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node lidx_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> lidxBuilder_;
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     * @return Whether the lidx field is set.
     */
    public boolean hasLidx() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     * @return The lidx.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getLidx() {
      if (lidxBuilder_ == null) {
        return lidx_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : lidx_;
      } else {
        return lidxBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    public Builder setLidx(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (lidxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lidx_ = value;
      } else {
        lidxBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    public Builder setLidx(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (lidxBuilder_ == null) {
        lidx_ = builderForValue.build();
      } else {
        lidxBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    public Builder mergeLidx(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (lidxBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          lidx_ != null &&
          lidx_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getLidxBuilder().mergeFrom(value);
        } else {
          lidx_ = value;
        }
      } else {
        lidxBuilder_.mergeFrom(value);
      }
      if (lidx_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    public Builder clearLidx() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lidx_ = null;
      if (lidxBuilder_ != null) {
        lidxBuilder_.dispose();
        lidxBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getLidxBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLidxFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getLidxOrBuilder() {
      if (lidxBuilder_ != null) {
        return lidxBuilder_.getMessageOrBuilder();
      } else {
        return lidx_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : lidx_;
      }
    }
    /**
     * <code>.pg_query.Node lidx = 2 [json_name = "lidx"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getLidxFieldBuilder() {
      if (lidxBuilder_ == null) {
        lidxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getLidx(),
                getParentForChildren(),
                isClean());
        lidx_ = null;
      }
      return lidxBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node uidx_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> uidxBuilder_;
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     * @return Whether the uidx field is set.
     */
    public boolean hasUidx() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     * @return The uidx.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getUidx() {
      if (uidxBuilder_ == null) {
        return uidx_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : uidx_;
      } else {
        return uidxBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    public Builder setUidx(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (uidxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uidx_ = value;
      } else {
        uidxBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    public Builder setUidx(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (uidxBuilder_ == null) {
        uidx_ = builderForValue.build();
      } else {
        uidxBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    public Builder mergeUidx(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (uidxBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          uidx_ != null &&
          uidx_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getUidxBuilder().mergeFrom(value);
        } else {
          uidx_ = value;
        }
      } else {
        uidxBuilder_.mergeFrom(value);
      }
      if (uidx_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    public Builder clearUidx() {
      bitField0_ = (bitField0_ & ~0x00000004);
      uidx_ = null;
      if (uidxBuilder_ != null) {
        uidxBuilder_.dispose();
        uidxBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getUidxBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUidxFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getUidxOrBuilder() {
      if (uidxBuilder_ != null) {
        return uidxBuilder_.getMessageOrBuilder();
      } else {
        return uidx_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : uidx_;
      }
    }
    /**
     * <code>.pg_query.Node uidx = 3 [json_name = "uidx"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getUidxFieldBuilder() {
      if (uidxBuilder_ == null) {
        uidxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getUidx(),
                getParentForChildren(),
                isClean());
        uidx_ = null;
      }
      return uidxBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.A_Indices)
  }

  // @@protoc_insertion_point(class_scope:pg_query.A_Indices)
  private static final com.premiumminds.sonar.postgres.protobuf.A_Indices DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.A_Indices();
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_Indices getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<A_Indices>
      PARSER = new com.google.protobuf.AbstractParser<A_Indices>() {
    @java.lang.Override
    public A_Indices parsePartialFrom(
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

  public static com.google.protobuf.Parser<A_Indices> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<A_Indices> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.A_Indices getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

