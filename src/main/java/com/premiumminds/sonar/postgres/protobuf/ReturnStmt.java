// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.ReturnStmt}
 */
public final class ReturnStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.ReturnStmt)
    ReturnStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReturnStmt.newBuilder() to construct.
  private ReturnStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReturnStmt() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReturnStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ReturnStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ReturnStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.ReturnStmt.class, com.premiumminds.sonar.postgres.protobuf.ReturnStmt.Builder.class);
  }

  public static final int RETURNVAL_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.Node returnval_;
  /**
   * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
   * @return Whether the returnval field is set.
   */
  @java.lang.Override
  public boolean hasReturnval() {
    return returnval_ != null;
  }
  /**
   * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
   * @return The returnval.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getReturnval() {
    return returnval_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : returnval_;
  }
  /**
   * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getReturnvalOrBuilder() {
    return returnval_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : returnval_;
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
    if (returnval_ != null) {
      output.writeMessage(1, getReturnval());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (returnval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReturnval());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.ReturnStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.ReturnStmt other = (com.premiumminds.sonar.postgres.protobuf.ReturnStmt) obj;

    if (hasReturnval() != other.hasReturnval()) return false;
    if (hasReturnval()) {
      if (!getReturnval()
          .equals(other.getReturnval())) return false;
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
    if (hasReturnval()) {
      hash = (37 * hash) + RETURNVAL_FIELD_NUMBER;
      hash = (53 * hash) + getReturnval().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.ReturnStmt prototype) {
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
   * Protobuf type {@code pg_query.ReturnStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.ReturnStmt)
      com.premiumminds.sonar.postgres.protobuf.ReturnStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ReturnStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ReturnStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.ReturnStmt.class, com.premiumminds.sonar.postgres.protobuf.ReturnStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.ReturnStmt.newBuilder()
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
      returnval_ = null;
      if (returnvalBuilder_ != null) {
        returnvalBuilder_.dispose();
        returnvalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ReturnStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ReturnStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.ReturnStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ReturnStmt build() {
      com.premiumminds.sonar.postgres.protobuf.ReturnStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ReturnStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.ReturnStmt result = new com.premiumminds.sonar.postgres.protobuf.ReturnStmt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.ReturnStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.returnval_ = returnvalBuilder_ == null
            ? returnval_
            : returnvalBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.ReturnStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.ReturnStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.ReturnStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.ReturnStmt.getDefaultInstance()) return this;
      if (other.hasReturnval()) {
        mergeReturnval(other.getReturnval());
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
                  getReturnvalFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.premiumminds.sonar.postgres.protobuf.Node returnval_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> returnvalBuilder_;
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     * @return Whether the returnval field is set.
     */
    public boolean hasReturnval() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     * @return The returnval.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getReturnval() {
      if (returnvalBuilder_ == null) {
        return returnval_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : returnval_;
      } else {
        return returnvalBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    public Builder setReturnval(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (returnvalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnval_ = value;
      } else {
        returnvalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    public Builder setReturnval(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (returnvalBuilder_ == null) {
        returnval_ = builderForValue.build();
      } else {
        returnvalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    public Builder mergeReturnval(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (returnvalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          returnval_ != null &&
          returnval_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getReturnvalBuilder().mergeFrom(value);
        } else {
          returnval_ = value;
        }
      } else {
        returnvalBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    public Builder clearReturnval() {
      bitField0_ = (bitField0_ & ~0x00000001);
      returnval_ = null;
      if (returnvalBuilder_ != null) {
        returnvalBuilder_.dispose();
        returnvalBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getReturnvalBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReturnvalFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getReturnvalOrBuilder() {
      if (returnvalBuilder_ != null) {
        return returnvalBuilder_.getMessageOrBuilder();
      } else {
        return returnval_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : returnval_;
      }
    }
    /**
     * <code>.pg_query.Node returnval = 1 [json_name = "returnval"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getReturnvalFieldBuilder() {
      if (returnvalBuilder_ == null) {
        returnvalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getReturnval(),
                getParentForChildren(),
                isClean());
        returnval_ = null;
      }
      return returnvalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.ReturnStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.ReturnStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.ReturnStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.ReturnStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.ReturnStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReturnStmt>
      PARSER = new com.google.protobuf.AbstractParser<ReturnStmt>() {
    @java.lang.Override
    public ReturnStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReturnStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReturnStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.ReturnStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

