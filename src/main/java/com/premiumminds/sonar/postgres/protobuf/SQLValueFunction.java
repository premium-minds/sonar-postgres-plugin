// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.SQLValueFunction}
 */
public final class SQLValueFunction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.SQLValueFunction)
    SQLValueFunctionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SQLValueFunction.newBuilder() to construct.
  private SQLValueFunction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SQLValueFunction() {
    op_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SQLValueFunction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SQLValueFunction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SQLValueFunction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.class, com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.Builder.class);
  }

  public static final int XPR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.Node xpr_;
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  @java.lang.Override
  public boolean hasXpr() {
    return xpr_ != null;
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

  public static final int OP_FIELD_NUMBER = 2;
  private int op_ = 0;
  /**
   * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  @java.lang.Override public int getOpValue() {
    return op_;
  }
  /**
   * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
   * @return The op.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp getOp() {
    com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp result = com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp.forNumber(op_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp.UNRECOGNIZED : result;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   * <code>uint32 type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int TYPMOD_FIELD_NUMBER = 4;
  private int typmod_ = 0;
  /**
   * <code>int32 typmod = 4 [json_name = "typmod"];</code>
   * @return The typmod.
   */
  @java.lang.Override
  public int getTypmod() {
    return typmod_;
  }

  public static final int LOCATION_FIELD_NUMBER = 5;
  private int location_ = 0;
  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
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
    if (xpr_ != null) {
      output.writeMessage(1, getXpr());
    }
    if (op_ != com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp.SQLVALUE_FUNCTION_OP_UNDEFINED.getNumber()) {
      output.writeEnum(2, op_);
    }
    if (type_ != 0) {
      output.writeUInt32(3, type_);
    }
    if (typmod_ != 0) {
      output.writeInt32(4, typmod_);
    }
    if (location_ != 0) {
      output.writeInt32(5, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (xpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getXpr());
    }
    if (op_ != com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp.SQLVALUE_FUNCTION_OP_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, op_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, type_);
    }
    if (typmod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, typmod_);
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.SQLValueFunction)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.SQLValueFunction other = (com.premiumminds.sonar.postgres.protobuf.SQLValueFunction) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (op_ != other.op_) return false;
    if (getType()
        != other.getType()) return false;
    if (getTypmod()
        != other.getTypmod()) return false;
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
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + TYPMOD_FIELD_NUMBER;
    hash = (53 * hash) + getTypmod();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.SQLValueFunction prototype) {
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
   * Protobuf type {@code pg_query.SQLValueFunction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.SQLValueFunction)
      com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SQLValueFunction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SQLValueFunction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.class, com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.newBuilder()
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
      xpr_ = null;
      if (xprBuilder_ != null) {
        xprBuilder_.dispose();
        xprBuilder_ = null;
      }
      op_ = 0;
      type_ = 0;
      typmod_ = 0;
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SQLValueFunction_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SQLValueFunction getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SQLValueFunction build() {
      com.premiumminds.sonar.postgres.protobuf.SQLValueFunction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SQLValueFunction buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.SQLValueFunction result = new com.premiumminds.sonar.postgres.protobuf.SQLValueFunction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.SQLValueFunction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpr_ = xprBuilder_ == null
            ? xpr_
            : xprBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.op_ = op_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.typmod_ = typmod_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.SQLValueFunction) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.SQLValueFunction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.SQLValueFunction other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.SQLValueFunction.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getTypmod() != 0) {
        setTypmod(other.getTypmod());
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
            case 16: {
              op_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              type_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              typmod_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              location_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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
      bitField0_ |= 0x00000001;
      onChanged();
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

    private int op_ = 0;
    /**
     * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
     * @param value The enum numeric value on the wire for op to set.
     * @return This builder for chaining.
     */
    public Builder setOpValue(int value) {
      op_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
     * @return The op.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp getOp() {
      com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp result = com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp.forNumber(op_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
     * @param value The op to set.
     * @return This builder for chaining.
     */
    public Builder setOp(com.premiumminds.sonar.postgres.protobuf.SQLValueFunctionOp value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      op_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>uint32 type = 3 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <code>uint32 type = 3 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 type = 3 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
      onChanged();
      return this;
    }

    private int typmod_ ;
    /**
     * <code>int32 typmod = 4 [json_name = "typmod"];</code>
     * @return The typmod.
     */
    @java.lang.Override
    public int getTypmod() {
      return typmod_;
    }
    /**
     * <code>int32 typmod = 4 [json_name = "typmod"];</code>
     * @param value The typmod to set.
     * @return This builder for chaining.
     */
    public Builder setTypmod(int value) {
      
      typmod_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 typmod = 4 [json_name = "typmod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypmod() {
      bitField0_ = (bitField0_ & ~0x00000008);
      typmod_ = 0;
      onChanged();
      return this;
    }

    private int location_ ;
    /**
     * <code>int32 location = 5 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 5 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {
      
      location_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 5 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000010);
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


    // @@protoc_insertion_point(builder_scope:pg_query.SQLValueFunction)
  }

  // @@protoc_insertion_point(class_scope:pg_query.SQLValueFunction)
  private static final com.premiumminds.sonar.postgres.protobuf.SQLValueFunction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.SQLValueFunction();
  }

  public static com.premiumminds.sonar.postgres.protobuf.SQLValueFunction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SQLValueFunction>
      PARSER = new com.google.protobuf.AbstractParser<SQLValueFunction>() {
    @java.lang.Override
    public SQLValueFunction parsePartialFrom(
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

  public static com.google.protobuf.Parser<SQLValueFunction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SQLValueFunction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.SQLValueFunction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

