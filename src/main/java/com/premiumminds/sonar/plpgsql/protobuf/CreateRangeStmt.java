// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.CreateRangeStmt}
 */
public final class CreateRangeStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CreateRangeStmt)
    CreateRangeStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRangeStmt.newBuilder() to construct.
  private CreateRangeStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRangeStmt() {
    typeName_ = java.util.Collections.emptyList();
    params_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRangeStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateRangeStmt(
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
              typeName_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            typeName_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              params_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000002;
            }
            params_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
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
        typeName_ = java.util.Collections.unmodifiableList(typeName_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        params_ = java.util.Collections.unmodifiableList(params_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateRangeStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateRangeStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.class, com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.Builder.class);
  }

  public static final int TYPE_NAME_FIELD_NUMBER = 1;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> typeName_;
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getTypeNameList() {
    return typeName_;
  }
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getTypeNameOrBuilderList() {
    return typeName_;
  }
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public int getTypeNameCount() {
    return typeName_.size();
  }
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getTypeName(int index) {
    return typeName_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getTypeNameOrBuilder(
      int index) {
    return typeName_.get(index);
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> params_;
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getParamsList() {
    return params_;
  }
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
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
  public com.premiumminds.sonar.plpgsql.protobuf.Node getParams(int index) {
    return params_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getParamsOrBuilder(
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
    for (int i = 0; i < typeName_.size(); i++) {
      output.writeMessage(1, typeName_.get(i));
    }
    for (int i = 0; i < params_.size(); i++) {
      output.writeMessage(2, params_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < typeName_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, typeName_.get(i));
    }
    for (int i = 0; i < params_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, params_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt other = (com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt) obj;

    if (!getTypeNameList()
        .equals(other.getTypeNameList())) return false;
    if (!getParamsList()
        .equals(other.getParamsList())) return false;
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
    if (getTypeNameCount() > 0) {
      hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTypeNameList().hashCode();
    }
    if (getParamsCount() > 0) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParamsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt prototype) {
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
   * Protobuf type {@code pg_query.CreateRangeStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CreateRangeStmt)
      com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateRangeStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateRangeStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.class, com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.newBuilder()
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
        getTypeNameFieldBuilder();
        getParamsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (typeNameBuilder_ == null) {
        typeName_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        typeNameBuilder_.clear();
      }
      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        paramsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateRangeStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt result = new com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt(this);
      int from_bitField0_ = bitField0_;
      if (typeNameBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          typeName_ = java.util.Collections.unmodifiableList(typeName_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.typeName_ = typeName_;
      } else {
        result.typeName_ = typeNameBuilder_.build();
      }
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          params_ = java.util.Collections.unmodifiableList(params_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
      }
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt.getDefaultInstance()) return this;
      if (typeNameBuilder_ == null) {
        if (!other.typeName_.isEmpty()) {
          if (typeName_.isEmpty()) {
            typeName_ = other.typeName_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTypeNameIsMutable();
            typeName_.addAll(other.typeName_);
          }
          onChanged();
        }
      } else {
        if (!other.typeName_.isEmpty()) {
          if (typeNameBuilder_.isEmpty()) {
            typeNameBuilder_.dispose();
            typeNameBuilder_ = null;
            typeName_ = other.typeName_;
            bitField0_ = (bitField0_ & ~0x00000001);
            typeNameBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTypeNameFieldBuilder() : null;
          } else {
            typeNameBuilder_.addAllMessages(other.typeName_);
          }
        }
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
      com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> typeName_ =
      java.util.Collections.emptyList();
    private void ensureTypeNameIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        typeName_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(typeName_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> typeNameBuilder_;

    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getTypeNameList() {
      if (typeNameBuilder_ == null) {
        return java.util.Collections.unmodifiableList(typeName_);
      } else {
        return typeNameBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public int getTypeNameCount() {
      if (typeNameBuilder_ == null) {
        return typeName_.size();
      } else {
        return typeNameBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getTypeName(int index) {
      if (typeNameBuilder_ == null) {
        return typeName_.get(index);
      } else {
        return typeNameBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder setTypeName(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (typeNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTypeNameIsMutable();
        typeName_.set(index, value);
        onChanged();
      } else {
        typeNameBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder setTypeName(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (typeNameBuilder_ == null) {
        ensureTypeNameIsMutable();
        typeName_.set(index, builderForValue.build());
        onChanged();
      } else {
        typeNameBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder addTypeName(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (typeNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTypeNameIsMutable();
        typeName_.add(value);
        onChanged();
      } else {
        typeNameBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder addTypeName(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (typeNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTypeNameIsMutable();
        typeName_.add(index, value);
        onChanged();
      } else {
        typeNameBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder addTypeName(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (typeNameBuilder_ == null) {
        ensureTypeNameIsMutable();
        typeName_.add(builderForValue.build());
        onChanged();
      } else {
        typeNameBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder addTypeName(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (typeNameBuilder_ == null) {
        ensureTypeNameIsMutable();
        typeName_.add(index, builderForValue.build());
        onChanged();
      } else {
        typeNameBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder addAllTypeName(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (typeNameBuilder_ == null) {
        ensureTypeNameIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, typeName_);
        onChanged();
      } else {
        typeNameBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder clearTypeName() {
      if (typeNameBuilder_ == null) {
        typeName_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        typeNameBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder removeTypeName(int index) {
      if (typeNameBuilder_ == null) {
        ensureTypeNameIsMutable();
        typeName_.remove(index);
        onChanged();
      } else {
        typeNameBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getTypeNameBuilder(
        int index) {
      return getTypeNameFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getTypeNameOrBuilder(
        int index) {
      if (typeNameBuilder_ == null) {
        return typeName_.get(index);  } else {
        return typeNameBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getTypeNameOrBuilderList() {
      if (typeNameBuilder_ != null) {
        return typeNameBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(typeName_);
      }
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addTypeNameBuilder() {
      return getTypeNameFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addTypeNameBuilder(
        int index) {
      return getTypeNameFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node type_name = 1 [json_name = "typeName"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getTypeNameBuilderList() {
      return getTypeNameFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getTypeNameFieldBuilder() {
      if (typeNameBuilder_ == null) {
        typeNameBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                typeName_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        typeName_ = null;
      }
      return typeNameBuilder_;
    }

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> params_ =
      java.util.Collections.emptyList();
    private void ensureParamsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        params_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(params_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> paramsBuilder_;

    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getParamsList() {
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
    public com.premiumminds.sonar.plpgsql.protobuf.Node getParams(int index) {
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
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
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
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
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
    public Builder addParams(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
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
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
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
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
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
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
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
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
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
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getParamsBuilder(
        int index) {
      return getParamsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getParamsOrBuilder(
        int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);  } else {
        return paramsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
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
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addParamsBuilder() {
      return getParamsFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addParamsBuilder(
        int index) {
      return getParamsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node params = 2 [json_name = "params"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getParamsBuilderList() {
      return getParamsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:pg_query.CreateRangeStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CreateRangeStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRangeStmt>
      PARSER = new com.google.protobuf.AbstractParser<CreateRangeStmt>() {
    @java.lang.Override
    public CreateRangeStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateRangeStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRangeStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRangeStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.CreateRangeStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
