// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.StatsElem}
 */
public final class StatsElem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.StatsElem)
    StatsElemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatsElem.newBuilder() to construct.
  private StatsElem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatsElem() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatsElem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_StatsElem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_StatsElem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.StatsElem.class, com.premiumminds.sonar.postgres.protobuf.StatsElem.Builder.class);
  }

  private int bitField0_;
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

  public static final int EXPR_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.Node expr_;
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getExpr() {
    return expr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : expr_;
  }
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getExprOrBuilder() {
    return expr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : expr_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getExpr());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExpr());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.StatsElem)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.StatsElem other = (com.premiumminds.sonar.postgres.protobuf.StatsElem) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.StatsElem parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.StatsElem prototype) {
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
   * Protobuf type {@code pg_query.StatsElem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.StatsElem)
      com.premiumminds.sonar.postgres.protobuf.StatsElemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_StatsElem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_StatsElem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.StatsElem.class, com.premiumminds.sonar.postgres.protobuf.StatsElem.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.StatsElem.newBuilder()
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
        getExprFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_StatsElem_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.StatsElem getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.StatsElem.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.StatsElem build() {
      com.premiumminds.sonar.postgres.protobuf.StatsElem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.StatsElem buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.StatsElem result = new com.premiumminds.sonar.postgres.protobuf.StatsElem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.StatsElem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expr_ = exprBuilder_ == null
            ? expr_
            : exprBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.StatsElem) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.StatsElem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.StatsElem other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.StatsElem.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
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
              input.readMessage(
                  getExprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.premiumminds.sonar.postgres.protobuf.Node expr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> exprBuilder_;
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     * @return The expr.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder setExpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
      } else {
        exprBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder setExpr(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder mergeExpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (exprBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          expr_ != null &&
          expr_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getExprBuilder().mergeFrom(value);
        } else {
          expr_ = value;
        }
      } else {
        exprBuilder_.mergeFrom(value);
      }
      if (expr_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder clearExpr() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getExprBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : expr_;
      }
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.StatsElem)
  }

  // @@protoc_insertion_point(class_scope:pg_query.StatsElem)
  private static final com.premiumminds.sonar.postgres.protobuf.StatsElem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.StatsElem();
  }

  public static com.premiumminds.sonar.postgres.protobuf.StatsElem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatsElem>
      PARSER = new com.google.protobuf.AbstractParser<StatsElem>() {
    @java.lang.Override
    public StatsElem parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatsElem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatsElem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.StatsElem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

