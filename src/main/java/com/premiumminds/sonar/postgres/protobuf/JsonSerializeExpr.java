// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.JsonSerializeExpr}
 */
public final class JsonSerializeExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.JsonSerializeExpr)
    JsonSerializeExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JsonSerializeExpr.newBuilder() to construct.
  private JsonSerializeExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JsonSerializeExpr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JsonSerializeExpr();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonSerializeExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonSerializeExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.class, com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.Builder.class);
  }

  private int bitField0_;
  public static final int EXPR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.JsonValueExpr expr_;
  /**
   * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
   * @return The expr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonValueExpr getExpr() {
    return expr_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.getDefaultInstance() : expr_;
  }
  /**
   * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder getExprOrBuilder() {
    return expr_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.getDefaultInstance() : expr_;
  }

  public static final int OUTPUT_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.JsonOutput output_;
  /**
   * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
   * @return Whether the output field is set.
   */
  @java.lang.Override
  public boolean hasOutput() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
   * @return The output.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonOutput getOutput() {
    return output_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance() : output_;
  }
  /**
   * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder getOutputOrBuilder() {
    return output_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance() : output_;
  }

  public static final int LOCATION_FIELD_NUMBER = 3;
  private int location_ = 0;
  /**
   * <code>int32 location = 3 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public int getLocation() {
    return location_;
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
      output.writeMessage(1, getExpr());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getOutput());
    }
    if (location_ != 0) {
      output.writeInt32(3, location_);
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
        .computeMessageSize(1, getExpr());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOutput());
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr other = (com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (hasOutput() != other.hasOutput()) return false;
    if (hasOutput()) {
      if (!getOutput()
          .equals(other.getOutput())) return false;
    }
    if (getLocation()
        != other.getLocation()) return false;
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
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    if (hasOutput()) {
      hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getOutput().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr prototype) {
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
   * Protobuf type {@code pg_query.JsonSerializeExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.JsonSerializeExpr)
      com.premiumminds.sonar.postgres.protobuf.JsonSerializeExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonSerializeExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonSerializeExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.class, com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.newBuilder()
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
        getOutputFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      output_ = null;
      if (outputBuilder_ != null) {
        outputBuilder_.dispose();
        outputBuilder_ = null;
      }
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonSerializeExpr_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr build() {
      com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr result = new com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expr_ = exprBuilder_ == null
            ? expr_
            : exprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.output_ = outputBuilder_ == null
            ? output_
            : outputBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (other.hasOutput()) {
        mergeOutput(other.getOutput());
      }
      if (other.getLocation() != 0) {
        setLocation(other.getLocation());
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
                  getExprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOutputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              location_ = input.readInt32();
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

    private com.premiumminds.sonar.postgres.protobuf.JsonValueExpr expr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonValueExpr, com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.Builder, com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder> exprBuilder_;
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     * @return The expr.
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonValueExpr getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    public Builder setExpr(com.premiumminds.sonar.postgres.protobuf.JsonValueExpr value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
      } else {
        exprBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    public Builder setExpr(
        com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    public Builder mergeExpr(com.premiumminds.sonar.postgres.protobuf.JsonValueExpr value) {
      if (exprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          expr_ != null &&
          expr_ != com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.getDefaultInstance()) {
          getExprBuilder().mergeFrom(value);
        } else {
          expr_ = value;
        }
      } else {
        exprBuilder_.mergeFrom(value);
      }
      if (expr_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    public Builder clearExpr() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.Builder getExprBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.getDefaultInstance() : expr_;
      }
    }
    /**
     * <code>.pg_query.JsonValueExpr expr = 1 [json_name = "expr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonValueExpr, com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.Builder, com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.JsonValueExpr, com.premiumminds.sonar.postgres.protobuf.JsonValueExpr.Builder, com.premiumminds.sonar.postgres.protobuf.JsonValueExprOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.JsonOutput output_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonOutput, com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder, com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder> outputBuilder_;
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     * @return Whether the output field is set.
     */
    public boolean hasOutput() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     * @return The output.
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonOutput getOutput() {
      if (outputBuilder_ == null) {
        return output_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance() : output_;
      } else {
        return outputBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    public Builder setOutput(com.premiumminds.sonar.postgres.protobuf.JsonOutput value) {
      if (outputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        output_ = value;
      } else {
        outputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    public Builder setOutput(
        com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder builderForValue) {
      if (outputBuilder_ == null) {
        output_ = builderForValue.build();
      } else {
        outputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    public Builder mergeOutput(com.premiumminds.sonar.postgres.protobuf.JsonOutput value) {
      if (outputBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          output_ != null &&
          output_ != com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance()) {
          getOutputBuilder().mergeFrom(value);
        } else {
          output_ = value;
        }
      } else {
        outputBuilder_.mergeFrom(value);
      }
      if (output_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    public Builder clearOutput() {
      bitField0_ = (bitField0_ & ~0x00000002);
      output_ = null;
      if (outputBuilder_ != null) {
        outputBuilder_.dispose();
        outputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder getOutputBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOutputFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder getOutputOrBuilder() {
      if (outputBuilder_ != null) {
        return outputBuilder_.getMessageOrBuilder();
      } else {
        return output_ == null ?
            com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance() : output_;
      }
    }
    /**
     * <code>.pg_query.JsonOutput output = 2 [json_name = "output"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonOutput, com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder, com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder> 
        getOutputFieldBuilder() {
      if (outputBuilder_ == null) {
        outputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.JsonOutput, com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder, com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder>(
                getOutput(),
                getParentForChildren(),
                isClean());
        output_ = null;
      }
      return outputBuilder_;
    }

    private int location_ ;
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {

      location_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000004);
      location_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.JsonSerializeExpr)
  }

  // @@protoc_insertion_point(class_scope:pg_query.JsonSerializeExpr)
  private static final com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr();
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JsonSerializeExpr>
      PARSER = new com.google.protobuf.AbstractParser<JsonSerializeExpr>() {
    @java.lang.Override
    public JsonSerializeExpr parsePartialFrom(
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

  public static com.google.protobuf.Parser<JsonSerializeExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JsonSerializeExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonSerializeExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

