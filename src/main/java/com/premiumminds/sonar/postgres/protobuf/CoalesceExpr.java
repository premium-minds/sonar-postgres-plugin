// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.CoalesceExpr}
 */
public final class CoalesceExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CoalesceExpr)
    CoalesceExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CoalesceExpr.newBuilder() to construct.
  private CoalesceExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CoalesceExpr() {
    args_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CoalesceExpr();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CoalesceExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CoalesceExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.class, com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.Builder.class);
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

  public static final int COALESCETYPE_FIELD_NUMBER = 2;
  private int coalescetype_ = 0;
  /**
   * <code>uint32 coalescetype = 2 [json_name = "coalescetype"];</code>
   * @return The coalescetype.
   */
  @java.lang.Override
  public int getCoalescetype() {
    return coalescetype_;
  }

  public static final int COALESCECOLLID_FIELD_NUMBER = 3;
  private int coalescecollid_ = 0;
  /**
   * <code>uint32 coalescecollid = 3 [json_name = "coalescecollid"];</code>
   * @return The coalescecollid.
   */
  @java.lang.Override
  public int getCoalescecollid() {
    return coalescecollid_;
  }

  public static final int ARGS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> args_;
  /**
   * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getArgsList() {
    return args_;
  }
  /**
   * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList() {
    return args_;
  }
  /**
   * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
   */
  @java.lang.Override
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index) {
    return args_.get(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getXpr());
    }
    if (coalescetype_ != 0) {
      output.writeUInt32(2, coalescetype_);
    }
    if (coalescecollid_ != 0) {
      output.writeUInt32(3, coalescecollid_);
    }
    for (int i = 0; i < args_.size(); i++) {
      output.writeMessage(4, args_.get(i));
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getXpr());
    }
    if (coalescetype_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, coalescetype_);
    }
    if (coalescecollid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, coalescecollid_);
    }
    for (int i = 0; i < args_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, args_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.CoalesceExpr)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.CoalesceExpr other = (com.premiumminds.sonar.postgres.protobuf.CoalesceExpr) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (getCoalescetype()
        != other.getCoalescetype()) return false;
    if (getCoalescecollid()
        != other.getCoalescecollid()) return false;
    if (!getArgsList()
        .equals(other.getArgsList())) return false;
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
    hash = (37 * hash) + COALESCETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCoalescetype();
    hash = (37 * hash) + COALESCECOLLID_FIELD_NUMBER;
    hash = (53 * hash) + getCoalescecollid();
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.CoalesceExpr prototype) {
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
   * Protobuf type {@code pg_query.CoalesceExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CoalesceExpr)
      com.premiumminds.sonar.postgres.protobuf.CoalesceExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CoalesceExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CoalesceExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.class, com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.newBuilder()
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
        getArgsFieldBuilder();
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
      coalescetype_ = 0;
      coalescecollid_ = 0;
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
      } else {
        args_ = null;
        argsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_CoalesceExpr_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CoalesceExpr getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CoalesceExpr build() {
      com.premiumminds.sonar.postgres.protobuf.CoalesceExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CoalesceExpr buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.CoalesceExpr result = new com.premiumminds.sonar.postgres.protobuf.CoalesceExpr(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.CoalesceExpr result) {
      if (argsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          args_ = java.util.Collections.unmodifiableList(args_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.args_ = args_;
      } else {
        result.args_ = argsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.CoalesceExpr result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpr_ = xprBuilder_ == null
            ? xpr_
            : xprBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coalescetype_ = coalescetype_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.coalescecollid_ = coalescecollid_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.CoalesceExpr) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.CoalesceExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.CoalesceExpr other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.CoalesceExpr.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.getCoalescetype() != 0) {
        setCoalescetype(other.getCoalescetype());
      }
      if (other.getCoalescecollid() != 0) {
        setCoalescecollid(other.getCoalescecollid());
      }
      if (argsBuilder_ == null) {
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
      } else {
        if (!other.args_.isEmpty()) {
          if (argsBuilder_.isEmpty()) {
            argsBuilder_.dispose();
            argsBuilder_ = null;
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000008);
            argsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgsFieldBuilder() : null;
          } else {
            argsBuilder_.addAllMessages(other.args_);
          }
        }
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
              coalescetype_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              coalescecollid_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (argsBuilder_ == null) {
                ensureArgsIsMutable();
                args_.add(m);
              } else {
                argsBuilder_.addMessage(m);
              }
              break;
            } // case 34
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

    private int coalescetype_ ;
    /**
     * <code>uint32 coalescetype = 2 [json_name = "coalescetype"];</code>
     * @return The coalescetype.
     */
    @java.lang.Override
    public int getCoalescetype() {
      return coalescetype_;
    }
    /**
     * <code>uint32 coalescetype = 2 [json_name = "coalescetype"];</code>
     * @param value The coalescetype to set.
     * @return This builder for chaining.
     */
    public Builder setCoalescetype(int value) {

      coalescetype_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 coalescetype = 2 [json_name = "coalescetype"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCoalescetype() {
      bitField0_ = (bitField0_ & ~0x00000002);
      coalescetype_ = 0;
      onChanged();
      return this;
    }

    private int coalescecollid_ ;
    /**
     * <code>uint32 coalescecollid = 3 [json_name = "coalescecollid"];</code>
     * @return The coalescecollid.
     */
    @java.lang.Override
    public int getCoalescecollid() {
      return coalescecollid_;
    }
    /**
     * <code>uint32 coalescecollid = 3 [json_name = "coalescecollid"];</code>
     * @param value The coalescecollid to set.
     * @return This builder for chaining.
     */
    public Builder setCoalescecollid(int value) {

      coalescecollid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 coalescecollid = 3 [json_name = "coalescecollid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCoalescecollid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      coalescecollid_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> args_ =
      java.util.Collections.emptyList();
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        args_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(args_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> argsBuilder_;

    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getArgsList() {
      if (argsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(args_);
      } else {
        return argsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public int getArgsCount() {
      if (argsBuilder_ == null) {
        return args_.size();
      } else {
        return argsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getArgs(int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);
      } else {
        return argsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder setArgs(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
      } else {
        argsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder setArgs(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.set(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder addArgs(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(value);
        onChanged();
      } else {
        argsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder addArgs(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(index, value);
        onChanged();
      } else {
        argsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder addArgs(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder addArgs(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder addAllArgs(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
      } else {
        argsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder clearArgs() {
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        argsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public Builder removeArgs(int index) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.remove(index);
        onChanged();
      } else {
        argsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getArgsBuilder(
        int index) {
      return getArgsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgsOrBuilder(
        int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);  } else {
        return argsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getArgsOrBuilderList() {
      if (argsBuilder_ != null) {
        return argsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(args_);
      }
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addArgsBuilder() {
      return getArgsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addArgsBuilder(
        int index) {
      return getArgsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node args = 4 [json_name = "args"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getArgsBuilderList() {
      return getArgsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getArgsFieldBuilder() {
      if (argsBuilder_ == null) {
        argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                args_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        args_ = null;
      }
      return argsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.CoalesceExpr)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CoalesceExpr)
  private static final com.premiumminds.sonar.postgres.protobuf.CoalesceExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.CoalesceExpr();
  }

  public static com.premiumminds.sonar.postgres.protobuf.CoalesceExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CoalesceExpr>
      PARSER = new com.google.protobuf.AbstractParser<CoalesceExpr>() {
    @java.lang.Override
    public CoalesceExpr parsePartialFrom(
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

  public static com.google.protobuf.Parser<CoalesceExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CoalesceExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.CoalesceExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

