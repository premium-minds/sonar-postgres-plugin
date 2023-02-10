// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.ExecuteStmt}
 */
public final class ExecuteStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.ExecuteStmt)
    ExecuteStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteStmt.newBuilder() to construct.
  private ExecuteStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteStmt() {
    name_ = "";
    params_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecuteStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ExecuteStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ExecuteStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.class, com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> params_;
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getParamsList() {
    return params_;
  }
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getParamsOrBuilderList() {
    return params_;
  }
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public int getParamsCount() {
    return params_.size();
  }
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getParams(int index) {
    return params_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getParamsOrBuilder(
      int index) {
    return params_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < params_.size(); i++) {
      output.writeMessage(2, params_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < params_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, params_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.ExecuteStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.ExecuteStmt other = (com.premiumminds.sonar.postgres.protobuf.ExecuteStmt) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getParamsList()
        .equals(other.getParamsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getParamsCount() > 0) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParamsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.ExecuteStmt prototype) {
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
   * Protobuf type {@code pg_query.ExecuteStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.ExecuteStmt)
      com.premiumminds.sonar.postgres.protobuf.ExecuteStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ExecuteStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ExecuteStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.class, com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.newBuilder()
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
      name_ = "";
      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
      } else {
        params_ = null;
        paramsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ExecuteStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ExecuteStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ExecuteStmt build() {
      com.premiumminds.sonar.postgres.protobuf.ExecuteStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ExecuteStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.ExecuteStmt result = new com.premiumminds.sonar.postgres.protobuf.ExecuteStmt(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.ExecuteStmt result) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          params_ = java.util.Collections.unmodifiableList(params_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.ExecuteStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.ExecuteStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.ExecuteStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.ExecuteStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.ExecuteStmt.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (paramsBuilder_ == null) {
        if (!other.params_.isEmpty()) {
          if (params_.isEmpty()) {
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParamsIsMutable();
            params_.addAll(other.params_);
          }
          onChanged();
        }
      } else {
        if (!other.params_.isEmpty()) {
          if (paramsBuilder_.isEmpty()) {
            paramsBuilder_.dispose();
            paramsBuilder_ = null;
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000002);
            paramsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParamsFieldBuilder() : null;
          } else {
            paramsBuilder_.addAllMessages(other.params_);
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (paramsBuilder_ == null) {
                ensureParamsIsMutable();
                params_.add(m);
              } else {
                paramsBuilder_.addMessage(m);
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> params_ =
      java.util.Collections.emptyList();
    private void ensureParamsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        params_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(params_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> paramsBuilder_;

    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getParamsList() {
      if (paramsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(params_);
      } else {
        return paramsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public int getParamsCount() {
      if (paramsBuilder_ == null) {
        return params_.size();
      } else {
        return paramsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getParams(int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);
      } else {
        return paramsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder setParams(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.set(index, value);
        onChanged();
      } else {
        paramsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder setParams(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.set(index, builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder addParams(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.add(value);
        onChanged();
      } else {
        paramsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder addParams(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.add(index, value);
        onChanged();
      } else {
        paramsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder addParams(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.add(builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder addParams(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.add(index, builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder addAllParams(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, params_);
        onChanged();
      } else {
        paramsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        paramsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public Builder removeParams(int index) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.remove(index);
        onChanged();
      } else {
        paramsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getParamsBuilder(
        int index) {
      return getParamsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getParamsOrBuilder(
        int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);  } else {
        return paramsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getParamsOrBuilderList() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(params_);
      }
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addParamsBuilder() {
      return getParamsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addParamsBuilder(
        int index) {
      return getParamsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getParamsBuilderList() {
      return getParamsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                params_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.ExecuteStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.ExecuteStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.ExecuteStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.ExecuteStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.ExecuteStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteStmt>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteStmt>() {
    @java.lang.Override
    public ExecuteStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExecuteStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.ExecuteStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

