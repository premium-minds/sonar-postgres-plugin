// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlternativeSubPlan}
 */
public final class AlternativeSubPlan extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlternativeSubPlan)
    AlternativeSubPlanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlternativeSubPlan.newBuilder() to construct.
  private AlternativeSubPlan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlternativeSubPlan() {
    subplans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlternativeSubPlan();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlternativeSubPlan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlternativeSubPlan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.class, com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.Builder.class);
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

  public static final int SUBPLANS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> subplans_;
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getSubplansList() {
    return subplans_;
  }
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getSubplansOrBuilderList() {
    return subplans_;
  }
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  @java.lang.Override
  public int getSubplansCount() {
    return subplans_.size();
  }
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getSubplans(int index) {
    return subplans_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSubplansOrBuilder(
      int index) {
    return subplans_.get(index);
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
    for (int i = 0; i < subplans_.size(); i++) {
      output.writeMessage(2, subplans_.get(i));
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
    for (int i = 0; i < subplans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, subplans_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan other = (com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (!getSubplansList()
        .equals(other.getSubplansList())) return false;
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
    if (getSubplansCount() > 0) {
      hash = (37 * hash) + SUBPLANS_FIELD_NUMBER;
      hash = (53 * hash) + getSubplansList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan prototype) {
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
   * Protobuf type {@code pg_query.AlternativeSubPlan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlternativeSubPlan)
      com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlternativeSubPlan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlternativeSubPlan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.class, com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.newBuilder()
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
        getSubplansFieldBuilder();
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
      if (subplansBuilder_ == null) {
        subplans_ = java.util.Collections.emptyList();
      } else {
        subplans_ = null;
        subplansBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlternativeSubPlan_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan build() {
      com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan result = new com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan result) {
      if (subplansBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          subplans_ = java.util.Collections.unmodifiableList(subplans_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.subplans_ = subplans_;
      } else {
        result.subplans_ = subplansBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpr_ = xprBuilder_ == null
            ? xpr_
            : xprBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (subplansBuilder_ == null) {
        if (!other.subplans_.isEmpty()) {
          if (subplans_.isEmpty()) {
            subplans_ = other.subplans_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSubplansIsMutable();
            subplans_.addAll(other.subplans_);
          }
          onChanged();
        }
      } else {
        if (!other.subplans_.isEmpty()) {
          if (subplansBuilder_.isEmpty()) {
            subplansBuilder_.dispose();
            subplansBuilder_ = null;
            subplans_ = other.subplans_;
            bitField0_ = (bitField0_ & ~0x00000002);
            subplansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubplansFieldBuilder() : null;
          } else {
            subplansBuilder_.addAllMessages(other.subplans_);
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
              input.readMessage(
                  getXprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (subplansBuilder_ == null) {
                ensureSubplansIsMutable();
                subplans_.add(m);
              } else {
                subplansBuilder_.addMessage(m);
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

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> subplans_ =
      java.util.Collections.emptyList();
    private void ensureSubplansIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        subplans_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(subplans_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> subplansBuilder_;

    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getSubplansList() {
      if (subplansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subplans_);
      } else {
        return subplansBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public int getSubplansCount() {
      if (subplansBuilder_ == null) {
        return subplans_.size();
      } else {
        return subplansBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getSubplans(int index) {
      if (subplansBuilder_ == null) {
        return subplans_.get(index);
      } else {
        return subplansBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder setSubplans(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (subplansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubplansIsMutable();
        subplans_.set(index, value);
        onChanged();
      } else {
        subplansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder setSubplans(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (subplansBuilder_ == null) {
        ensureSubplansIsMutable();
        subplans_.set(index, builderForValue.build());
        onChanged();
      } else {
        subplansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder addSubplans(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (subplansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubplansIsMutable();
        subplans_.add(value);
        onChanged();
      } else {
        subplansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder addSubplans(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (subplansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubplansIsMutable();
        subplans_.add(index, value);
        onChanged();
      } else {
        subplansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder addSubplans(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (subplansBuilder_ == null) {
        ensureSubplansIsMutable();
        subplans_.add(builderForValue.build());
        onChanged();
      } else {
        subplansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder addSubplans(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (subplansBuilder_ == null) {
        ensureSubplansIsMutable();
        subplans_.add(index, builderForValue.build());
        onChanged();
      } else {
        subplansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder addAllSubplans(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (subplansBuilder_ == null) {
        ensureSubplansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subplans_);
        onChanged();
      } else {
        subplansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder clearSubplans() {
      if (subplansBuilder_ == null) {
        subplans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        subplansBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public Builder removeSubplans(int index) {
      if (subplansBuilder_ == null) {
        ensureSubplansIsMutable();
        subplans_.remove(index);
        onChanged();
      } else {
        subplansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getSubplansBuilder(
        int index) {
      return getSubplansFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSubplansOrBuilder(
        int index) {
      if (subplansBuilder_ == null) {
        return subplans_.get(index);  } else {
        return subplansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getSubplansOrBuilderList() {
      if (subplansBuilder_ != null) {
        return subplansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subplans_);
      }
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addSubplansBuilder() {
      return getSubplansFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addSubplansBuilder(
        int index) {
      return getSubplansFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node subplans = 2 [json_name = "subplans"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getSubplansBuilderList() {
      return getSubplansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getSubplansFieldBuilder() {
      if (subplansBuilder_ == null) {
        subplansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                subplans_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        subplans_ = null;
      }
      return subplansBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlternativeSubPlan)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlternativeSubPlan)
  private static final com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlternativeSubPlan>
      PARSER = new com.google.protobuf.AbstractParser<AlternativeSubPlan>() {
    @java.lang.Override
    public AlternativeSubPlan parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlternativeSubPlan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlternativeSubPlan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

