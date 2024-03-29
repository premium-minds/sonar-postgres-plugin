// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.CaseWhen}
 */
public final class CaseWhen extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CaseWhen)
    CaseWhenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CaseWhen.newBuilder() to construct.
  private CaseWhen(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CaseWhen() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CaseWhen();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CaseWhen_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CaseWhen_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.CaseWhen.class, com.premiumminds.sonar.postgres.protobuf.CaseWhen.Builder.class);
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

  public static final int EXPR_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.Node expr_;
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return ((bitField0_ & 0x00000002) != 0);
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

  public static final int RESULT_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.postgres.protobuf.Node result_;
  /**
   * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getResult() {
    return result_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : result_;
  }
  /**
   * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getResultOrBuilder() {
    return result_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : result_;
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private int location_ = 0;
  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
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
      output.writeMessage(1, getXpr());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getExpr());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getResult());
    }
    if (location_ != 0) {
      output.writeInt32(4, location_);
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
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExpr());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResult());
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.CaseWhen)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.CaseWhen other = (com.premiumminds.sonar.postgres.protobuf.CaseWhen) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.CaseWhen prototype) {
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
   * Protobuf type {@code pg_query.CaseWhen}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CaseWhen)
      com.premiumminds.sonar.postgres.protobuf.CaseWhenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CaseWhen_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CaseWhen_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.CaseWhen.class, com.premiumminds.sonar.postgres.protobuf.CaseWhen.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.CaseWhen.newBuilder()
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
        getExprFieldBuilder();
        getResultFieldBuilder();
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
      expr_ = null;
      if (exprBuilder_ != null) {
        exprBuilder_.dispose();
        exprBuilder_ = null;
      }
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CaseWhen_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CaseWhen getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.CaseWhen.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CaseWhen build() {
      com.premiumminds.sonar.postgres.protobuf.CaseWhen result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CaseWhen buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.CaseWhen result = new com.premiumminds.sonar.postgres.protobuf.CaseWhen(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.CaseWhen result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpr_ = xprBuilder_ == null
            ? xpr_
            : xprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expr_ = exprBuilder_ == null
            ? expr_
            : exprBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.CaseWhen) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.CaseWhen)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.CaseWhen other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.CaseWhen.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
                  getXprFieldBuilder().getBuilder(),
                  extensionRegistry);
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
            case 26: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              location_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.premiumminds.sonar.postgres.protobuf.Node result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> resultBuilder_;
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     * @return The result.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder setResult(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder setResult(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder mergeResult(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          result_ != null &&
          result_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000004);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getResultBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private int location_ ;
    /**
     * <code>int32 location = 4 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 4 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {

      location_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 4 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:pg_query.CaseWhen)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CaseWhen)
  private static final com.premiumminds.sonar.postgres.protobuf.CaseWhen DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.CaseWhen();
  }

  public static com.premiumminds.sonar.postgres.protobuf.CaseWhen getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CaseWhen>
      PARSER = new com.google.protobuf.AbstractParser<CaseWhen>() {
    @java.lang.Override
    public CaseWhen parsePartialFrom(
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

  public static com.google.protobuf.Parser<CaseWhen> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CaseWhen> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.CaseWhen getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

