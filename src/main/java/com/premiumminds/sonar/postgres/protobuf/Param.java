// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.Param}
 */
public final class Param extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.Param)
    ParamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Param.newBuilder() to construct.
  private Param(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Param() {
    paramkind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Param();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_Param_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_Param_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.Param.class, com.premiumminds.sonar.postgres.protobuf.Param.Builder.class);
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

  public static final int PARAMKIND_FIELD_NUMBER = 2;
  private int paramkind_ = 0;
  /**
   * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
   * @return The enum numeric value on the wire for paramkind.
   */
  @java.lang.Override public int getParamkindValue() {
    return paramkind_;
  }
  /**
   * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
   * @return The paramkind.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.ParamKind getParamkind() {
    com.premiumminds.sonar.postgres.protobuf.ParamKind result = com.premiumminds.sonar.postgres.protobuf.ParamKind.forNumber(paramkind_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.ParamKind.UNRECOGNIZED : result;
  }

  public static final int PARAMID_FIELD_NUMBER = 3;
  private int paramid_ = 0;
  /**
   * <code>int32 paramid = 3 [json_name = "paramid"];</code>
   * @return The paramid.
   */
  @java.lang.Override
  public int getParamid() {
    return paramid_;
  }

  public static final int PARAMTYPE_FIELD_NUMBER = 4;
  private int paramtype_ = 0;
  /**
   * <code>uint32 paramtype = 4 [json_name = "paramtype"];</code>
   * @return The paramtype.
   */
  @java.lang.Override
  public int getParamtype() {
    return paramtype_;
  }

  public static final int PARAMTYPMOD_FIELD_NUMBER = 5;
  private int paramtypmod_ = 0;
  /**
   * <code>int32 paramtypmod = 5 [json_name = "paramtypmod"];</code>
   * @return The paramtypmod.
   */
  @java.lang.Override
  public int getParamtypmod() {
    return paramtypmod_;
  }

  public static final int PARAMCOLLID_FIELD_NUMBER = 6;
  private int paramcollid_ = 0;
  /**
   * <code>uint32 paramcollid = 6 [json_name = "paramcollid"];</code>
   * @return The paramcollid.
   */
  @java.lang.Override
  public int getParamcollid() {
    return paramcollid_;
  }

  public static final int LOCATION_FIELD_NUMBER = 7;
  private int location_ = 0;
  /**
   * <code>int32 location = 7 [json_name = "location"];</code>
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
    if (paramkind_ != com.premiumminds.sonar.postgres.protobuf.ParamKind.PARAM_KIND_UNDEFINED.getNumber()) {
      output.writeEnum(2, paramkind_);
    }
    if (paramid_ != 0) {
      output.writeInt32(3, paramid_);
    }
    if (paramtype_ != 0) {
      output.writeUInt32(4, paramtype_);
    }
    if (paramtypmod_ != 0) {
      output.writeInt32(5, paramtypmod_);
    }
    if (paramcollid_ != 0) {
      output.writeUInt32(6, paramcollid_);
    }
    if (location_ != 0) {
      output.writeInt32(7, location_);
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
    if (paramkind_ != com.premiumminds.sonar.postgres.protobuf.ParamKind.PARAM_KIND_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, paramkind_);
    }
    if (paramid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, paramid_);
    }
    if (paramtype_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, paramtype_);
    }
    if (paramtypmod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, paramtypmod_);
    }
    if (paramcollid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, paramcollid_);
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.Param)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.Param other = (com.premiumminds.sonar.postgres.protobuf.Param) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (paramkind_ != other.paramkind_) return false;
    if (getParamid()
        != other.getParamid()) return false;
    if (getParamtype()
        != other.getParamtype()) return false;
    if (getParamtypmod()
        != other.getParamtypmod()) return false;
    if (getParamcollid()
        != other.getParamcollid()) return false;
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
    hash = (37 * hash) + PARAMKIND_FIELD_NUMBER;
    hash = (53 * hash) + paramkind_;
    hash = (37 * hash) + PARAMID_FIELD_NUMBER;
    hash = (53 * hash) + getParamid();
    hash = (37 * hash) + PARAMTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getParamtype();
    hash = (37 * hash) + PARAMTYPMOD_FIELD_NUMBER;
    hash = (53 * hash) + getParamtypmod();
    hash = (37 * hash) + PARAMCOLLID_FIELD_NUMBER;
    hash = (53 * hash) + getParamcollid();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.Param parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.Param parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.Param parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.Param prototype) {
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
   * Protobuf type {@code pg_query.Param}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.Param)
      com.premiumminds.sonar.postgres.protobuf.ParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_Param_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_Param_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.Param.class, com.premiumminds.sonar.postgres.protobuf.Param.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.Param.newBuilder()
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
      paramkind_ = 0;
      paramid_ = 0;
      paramtype_ = 0;
      paramtypmod_ = 0;
      paramcollid_ = 0;
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_Param_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.Param getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.Param.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.Param build() {
      com.premiumminds.sonar.postgres.protobuf.Param result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.Param buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.Param result = new com.premiumminds.sonar.postgres.protobuf.Param(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.Param result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpr_ = xprBuilder_ == null
            ? xpr_
            : xprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.paramkind_ = paramkind_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.paramid_ = paramid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.paramtype_ = paramtype_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.paramtypmod_ = paramtypmod_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.paramcollid_ = paramcollid_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.Param) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.Param)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.Param other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.Param.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.paramkind_ != 0) {
        setParamkindValue(other.getParamkindValue());
      }
      if (other.getParamid() != 0) {
        setParamid(other.getParamid());
      }
      if (other.getParamtype() != 0) {
        setParamtype(other.getParamtype());
      }
      if (other.getParamtypmod() != 0) {
        setParamtypmod(other.getParamtypmod());
      }
      if (other.getParamcollid() != 0) {
        setParamcollid(other.getParamcollid());
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
              paramkind_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              paramid_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              paramtype_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              paramtypmod_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              paramcollid_ = input.readUInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              location_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private int paramkind_ = 0;
    /**
     * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
     * @return The enum numeric value on the wire for paramkind.
     */
    @java.lang.Override public int getParamkindValue() {
      return paramkind_;
    }
    /**
     * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
     * @param value The enum numeric value on the wire for paramkind to set.
     * @return This builder for chaining.
     */
    public Builder setParamkindValue(int value) {
      paramkind_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
     * @return The paramkind.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ParamKind getParamkind() {
      com.premiumminds.sonar.postgres.protobuf.ParamKind result = com.premiumminds.sonar.postgres.protobuf.ParamKind.forNumber(paramkind_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.ParamKind.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
     * @param value The paramkind to set.
     * @return This builder for chaining.
     */
    public Builder setParamkind(com.premiumminds.sonar.postgres.protobuf.ParamKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      paramkind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ParamKind paramkind = 2 [json_name = "paramkind"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParamkind() {
      bitField0_ = (bitField0_ & ~0x00000002);
      paramkind_ = 0;
      onChanged();
      return this;
    }

    private int paramid_ ;
    /**
     * <code>int32 paramid = 3 [json_name = "paramid"];</code>
     * @return The paramid.
     */
    @java.lang.Override
    public int getParamid() {
      return paramid_;
    }
    /**
     * <code>int32 paramid = 3 [json_name = "paramid"];</code>
     * @param value The paramid to set.
     * @return This builder for chaining.
     */
    public Builder setParamid(int value) {

      paramid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 paramid = 3 [json_name = "paramid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParamid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      paramid_ = 0;
      onChanged();
      return this;
    }

    private int paramtype_ ;
    /**
     * <code>uint32 paramtype = 4 [json_name = "paramtype"];</code>
     * @return The paramtype.
     */
    @java.lang.Override
    public int getParamtype() {
      return paramtype_;
    }
    /**
     * <code>uint32 paramtype = 4 [json_name = "paramtype"];</code>
     * @param value The paramtype to set.
     * @return This builder for chaining.
     */
    public Builder setParamtype(int value) {

      paramtype_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 paramtype = 4 [json_name = "paramtype"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParamtype() {
      bitField0_ = (bitField0_ & ~0x00000008);
      paramtype_ = 0;
      onChanged();
      return this;
    }

    private int paramtypmod_ ;
    /**
     * <code>int32 paramtypmod = 5 [json_name = "paramtypmod"];</code>
     * @return The paramtypmod.
     */
    @java.lang.Override
    public int getParamtypmod() {
      return paramtypmod_;
    }
    /**
     * <code>int32 paramtypmod = 5 [json_name = "paramtypmod"];</code>
     * @param value The paramtypmod to set.
     * @return This builder for chaining.
     */
    public Builder setParamtypmod(int value) {

      paramtypmod_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 paramtypmod = 5 [json_name = "paramtypmod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParamtypmod() {
      bitField0_ = (bitField0_ & ~0x00000010);
      paramtypmod_ = 0;
      onChanged();
      return this;
    }

    private int paramcollid_ ;
    /**
     * <code>uint32 paramcollid = 6 [json_name = "paramcollid"];</code>
     * @return The paramcollid.
     */
    @java.lang.Override
    public int getParamcollid() {
      return paramcollid_;
    }
    /**
     * <code>uint32 paramcollid = 6 [json_name = "paramcollid"];</code>
     * @param value The paramcollid to set.
     * @return This builder for chaining.
     */
    public Builder setParamcollid(int value) {

      paramcollid_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 paramcollid = 6 [json_name = "paramcollid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParamcollid() {
      bitField0_ = (bitField0_ & ~0x00000020);
      paramcollid_ = 0;
      onChanged();
      return this;
    }

    private int location_ ;
    /**
     * <code>int32 location = 7 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 7 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {

      location_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 7 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000040);
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


    // @@protoc_insertion_point(builder_scope:pg_query.Param)
  }

  // @@protoc_insertion_point(class_scope:pg_query.Param)
  private static final com.premiumminds.sonar.postgres.protobuf.Param DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.Param();
  }

  public static com.premiumminds.sonar.postgres.protobuf.Param getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Param>
      PARSER = new com.google.protobuf.AbstractParser<Param>() {
    @java.lang.Override
    public Param parsePartialFrom(
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

  public static com.google.protobuf.Parser<Param> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Param> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Param getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

