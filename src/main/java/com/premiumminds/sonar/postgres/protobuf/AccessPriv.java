// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AccessPriv}
 */
public final class AccessPriv extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AccessPriv)
    AccessPrivOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccessPriv.newBuilder() to construct.
  private AccessPriv(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccessPriv() {
    privName_ = "";
    cols_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccessPriv();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AccessPriv_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AccessPriv_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AccessPriv.class, com.premiumminds.sonar.postgres.protobuf.AccessPriv.Builder.class);
  }

  public static final int PRIV_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object privName_ = "";
  /**
   * <code>string priv_name = 1 [json_name = "priv_name"];</code>
   * @return The privName.
   */
  @java.lang.Override
  public java.lang.String getPrivName() {
    java.lang.Object ref = privName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      privName_ = s;
      return s;
    }
  }
  /**
   * <code>string priv_name = 1 [json_name = "priv_name"];</code>
   * @return The bytes for privName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivNameBytes() {
    java.lang.Object ref = privName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      privName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> cols_;
  /**
   * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getColsList() {
    return cols_;
  }
  /**
   * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getColsOrBuilderList() {
    return cols_;
  }
  /**
   * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
   */
  @java.lang.Override
  public int getColsCount() {
    return cols_.size();
  }
  /**
   * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getCols(int index) {
    return cols_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColsOrBuilder(
      int index) {
    return cols_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, privName_);
    }
    for (int i = 0; i < cols_.size(); i++) {
      output.writeMessage(2, cols_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, privName_);
    }
    for (int i = 0; i < cols_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, cols_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AccessPriv)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AccessPriv other = (com.premiumminds.sonar.postgres.protobuf.AccessPriv) obj;

    if (!getPrivName()
        .equals(other.getPrivName())) return false;
    if (!getColsList()
        .equals(other.getColsList())) return false;
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
    hash = (37 * hash) + PRIV_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPrivName().hashCode();
    if (getColsCount() > 0) {
      hash = (37 * hash) + COLS_FIELD_NUMBER;
      hash = (53 * hash) + getColsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AccessPriv prototype) {
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
   * Protobuf type {@code pg_query.AccessPriv}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AccessPriv)
      com.premiumminds.sonar.postgres.protobuf.AccessPrivOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AccessPriv_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AccessPriv_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AccessPriv.class, com.premiumminds.sonar.postgres.protobuf.AccessPriv.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AccessPriv.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      privName_ = "";
      if (colsBuilder_ == null) {
        cols_ = java.util.Collections.emptyList();
      } else {
        cols_ = null;
        colsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AccessPriv_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AccessPriv getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AccessPriv.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AccessPriv build() {
      com.premiumminds.sonar.postgres.protobuf.AccessPriv result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AccessPriv buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AccessPriv result = new com.premiumminds.sonar.postgres.protobuf.AccessPriv(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.AccessPriv result) {
      if (colsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          cols_ = java.util.Collections.unmodifiableList(cols_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.cols_ = cols_;
      } else {
        result.cols_ = colsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.AccessPriv result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privName_ = privName_;
      }
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AccessPriv) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AccessPriv)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AccessPriv other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AccessPriv.getDefaultInstance()) return this;
      if (!other.getPrivName().isEmpty()) {
        privName_ = other.privName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (colsBuilder_ == null) {
        if (!other.cols_.isEmpty()) {
          if (cols_.isEmpty()) {
            cols_ = other.cols_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureColsIsMutable();
            cols_.addAll(other.cols_);
          }
          onChanged();
        }
      } else {
        if (!other.cols_.isEmpty()) {
          if (colsBuilder_.isEmpty()) {
            colsBuilder_.dispose();
            colsBuilder_ = null;
            cols_ = other.cols_;
            bitField0_ = (bitField0_ & ~0x00000002);
            colsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColsFieldBuilder() : null;
          } else {
            colsBuilder_.addAllMessages(other.cols_);
          }
        }
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
              privName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (colsBuilder_ == null) {
                ensureColsIsMutable();
                cols_.add(m);
              } else {
                colsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.lang.Object privName_ = "";
    /**
     * <code>string priv_name = 1 [json_name = "priv_name"];</code>
     * @return The privName.
     */
    public java.lang.String getPrivName() {
      java.lang.Object ref = privName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        privName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string priv_name = 1 [json_name = "priv_name"];</code>
     * @return The bytes for privName.
     */
    public com.google.protobuf.ByteString
        getPrivNameBytes() {
      java.lang.Object ref = privName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        privName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string priv_name = 1 [json_name = "priv_name"];</code>
     * @param value The privName to set.
     * @return This builder for chaining.
     */
    public Builder setPrivName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      privName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string priv_name = 1 [json_name = "priv_name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivName() {
      privName_ = getDefaultInstance().getPrivName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string priv_name = 1 [json_name = "priv_name"];</code>
     * @param value The bytes for privName to set.
     * @return This builder for chaining.
     */
    public Builder setPrivNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      privName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> cols_ =
      java.util.Collections.emptyList();
    private void ensureColsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        cols_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(cols_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> colsBuilder_;

    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getColsList() {
      if (colsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cols_);
      } else {
        return colsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public int getColsCount() {
      if (colsBuilder_ == null) {
        return cols_.size();
      } else {
        return colsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getCols(int index) {
      if (colsBuilder_ == null) {
        return cols_.get(index);
      } else {
        return colsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder setCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (colsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColsIsMutable();
        cols_.set(index, value);
        onChanged();
      } else {
        colsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder setCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (colsBuilder_ == null) {
        ensureColsIsMutable();
        cols_.set(index, builderForValue.build());
        onChanged();
      } else {
        colsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder addCols(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (colsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColsIsMutable();
        cols_.add(value);
        onChanged();
      } else {
        colsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder addCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (colsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColsIsMutable();
        cols_.add(index, value);
        onChanged();
      } else {
        colsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder addCols(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (colsBuilder_ == null) {
        ensureColsIsMutable();
        cols_.add(builderForValue.build());
        onChanged();
      } else {
        colsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder addCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (colsBuilder_ == null) {
        ensureColsIsMutable();
        cols_.add(index, builderForValue.build());
        onChanged();
      } else {
        colsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder addAllCols(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (colsBuilder_ == null) {
        ensureColsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cols_);
        onChanged();
      } else {
        colsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder clearCols() {
      if (colsBuilder_ == null) {
        cols_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        colsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public Builder removeCols(int index) {
      if (colsBuilder_ == null) {
        ensureColsIsMutable();
        cols_.remove(index);
        onChanged();
      } else {
        colsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getColsBuilder(
        int index) {
      return getColsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getColsOrBuilder(
        int index) {
      if (colsBuilder_ == null) {
        return cols_.get(index);  } else {
        return colsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getColsOrBuilderList() {
      if (colsBuilder_ != null) {
        return colsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cols_);
      }
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addColsBuilder() {
      return getColsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addColsBuilder(
        int index) {
      return getColsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node cols = 2 [json_name = "cols"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getColsBuilderList() {
      return getColsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getColsFieldBuilder() {
      if (colsBuilder_ == null) {
        colsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                cols_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        cols_ = null;
      }
      return colsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AccessPriv)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AccessPriv)
  private static final com.premiumminds.sonar.postgres.protobuf.AccessPriv DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AccessPriv();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AccessPriv getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessPriv>
      PARSER = new com.google.protobuf.AbstractParser<AccessPriv>() {
    @java.lang.Override
    public AccessPriv parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessPriv> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessPriv> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AccessPriv getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

