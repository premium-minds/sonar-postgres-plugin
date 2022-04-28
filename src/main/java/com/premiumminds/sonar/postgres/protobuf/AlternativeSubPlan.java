// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

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

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlternativeSubPlan(
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
            com.premiumminds.sonar.postgres.protobuf.Node.Builder subBuilder = null;
            if (xpr_ != null) {
              subBuilder = xpr_.toBuilder();
            }
            xpr_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(xpr_);
              xpr_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              subplans_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            subplans_.add(
                input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry));
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
        subplans_ = java.util.Collections.unmodifiableList(subplans_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
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
    return getXpr();
  }

  public static final int SUBPLANS_FIELD_NUMBER = 2;
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
    if (xpr_ != null) {
      output.writeMessage(1, getXpr());
    }
    for (int i = 0; i < subplans_.size(); i++) {
      output.writeMessage(2, subplans_.get(i));
    }
    unknownFields.writeTo(output);
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
    for (int i = 0; i < subplans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, subplans_.get(i));
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    if (getSubplansCount() > 0) {
      hash = (37 * hash) + SUBPLANS_FIELD_NUMBER;
      hash = (53 * hash) + getSubplansList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
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
        getSubplansFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (xprBuilder_ == null) {
        xpr_ = null;
      } else {
        xpr_ = null;
        xprBuilder_ = null;
      }
      if (subplansBuilder_ == null) {
        subplans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        subplansBuilder_.clear();
      }
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
      int from_bitField0_ = bitField0_;
      if (xprBuilder_ == null) {
        result.xpr_ = xpr_;
      } else {
        result.xpr_ = xprBuilder_.build();
      }
      if (subplansBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subplans_ = java.util.Collections.unmodifiableList(subplans_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subplans_ = subplans_;
      } else {
        result.subplans_ = subplansBuilder_.build();
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
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
            subplansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubplansFieldBuilder() : null;
          } else {
            subplansBuilder_.addAllMessages(other.subplans_);
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
      com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.AlternativeSubPlan) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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
      return xprBuilder_ != null || xpr_ != null;
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
        onChanged();
      } else {
        xprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (xprBuilder_ == null) {
        xpr_ = builderForValue.build();
        onChanged();
      } else {
        xprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder mergeXpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (xpr_ != null) {
          xpr_ =
            com.premiumminds.sonar.postgres.protobuf.Node.newBuilder(xpr_).mergeFrom(value).buildPartial();
        } else {
          xpr_ = value;
        }
        onChanged();
      } else {
        xprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder clearXpr() {
      if (xprBuilder_ == null) {
        xpr_ = null;
        onChanged();
      } else {
        xpr_ = null;
        xprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getXprBuilder() {
      
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
      if (!((bitField0_ & 0x00000001) != 0)) {
        subplans_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(subplans_);
        bitField0_ |= 0x00000001;
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
        bitField0_ = (bitField0_ & ~0x00000001);
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
                ((bitField0_ & 0x00000001) != 0),
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
      return new AlternativeSubPlan(input, extensionRegistry);
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
