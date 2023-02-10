// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.ConstraintsSetStmt}
 */
public final class ConstraintsSetStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.ConstraintsSetStmt)
    ConstraintsSetStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConstraintsSetStmt.newBuilder() to construct.
  private ConstraintsSetStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConstraintsSetStmt() {
    constraints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConstraintsSetStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ConstraintsSetStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ConstraintsSetStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.class, com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.Builder.class);
  }

  public static final int CONSTRAINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> constraints_;
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getConstraintsList() {
    return constraints_;
  }
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getConstraintsOrBuilderList() {
    return constraints_;
  }
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public int getConstraintsCount() {
    return constraints_.size();
  }
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getConstraints(int index) {
    return constraints_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getConstraintsOrBuilder(
      int index) {
    return constraints_.get(index);
  }

  public static final int DEFERRED_FIELD_NUMBER = 2;
  private boolean deferred_ = false;
  /**
   * <code>bool deferred = 2 [json_name = "deferred"];</code>
   * @return The deferred.
   */
  @java.lang.Override
  public boolean getDeferred() {
    return deferred_;
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
    for (int i = 0; i < constraints_.size(); i++) {
      output.writeMessage(1, constraints_.get(i));
    }
    if (deferred_ != false) {
      output.writeBool(2, deferred_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < constraints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, constraints_.get(i));
    }
    if (deferred_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, deferred_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt other = (com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt) obj;

    if (!getConstraintsList()
        .equals(other.getConstraintsList())) return false;
    if (getDeferred()
        != other.getDeferred()) return false;
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
    if (getConstraintsCount() > 0) {
      hash = (37 * hash) + CONSTRAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getConstraintsList().hashCode();
    }
    hash = (37 * hash) + DEFERRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDeferred());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt prototype) {
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
   * Protobuf type {@code pg_query.ConstraintsSetStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.ConstraintsSetStmt)
      com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ConstraintsSetStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ConstraintsSetStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.class, com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.newBuilder()
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
      if (constraintsBuilder_ == null) {
        constraints_ = java.util.Collections.emptyList();
      } else {
        constraints_ = null;
        constraintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      deferred_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ConstraintsSetStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt build() {
      com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt result = new com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt result) {
      if (constraintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          constraints_ = java.util.Collections.unmodifiableList(constraints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.constraints_ = constraints_;
      } else {
        result.constraints_ = constraintsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deferred_ = deferred_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt.getDefaultInstance()) return this;
      if (constraintsBuilder_ == null) {
        if (!other.constraints_.isEmpty()) {
          if (constraints_.isEmpty()) {
            constraints_ = other.constraints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConstraintsIsMutable();
            constraints_.addAll(other.constraints_);
          }
          onChanged();
        }
      } else {
        if (!other.constraints_.isEmpty()) {
          if (constraintsBuilder_.isEmpty()) {
            constraintsBuilder_.dispose();
            constraintsBuilder_ = null;
            constraints_ = other.constraints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            constraintsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConstraintsFieldBuilder() : null;
          } else {
            constraintsBuilder_.addAllMessages(other.constraints_);
          }
        }
      }
      if (other.getDeferred() != false) {
        setDeferred(other.getDeferred());
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
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (constraintsBuilder_ == null) {
                ensureConstraintsIsMutable();
                constraints_.add(m);
              } else {
                constraintsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              deferred_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> constraints_ =
      java.util.Collections.emptyList();
    private void ensureConstraintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        constraints_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(constraints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> constraintsBuilder_;

    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getConstraintsList() {
      if (constraintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(constraints_);
      } else {
        return constraintsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public int getConstraintsCount() {
      if (constraintsBuilder_ == null) {
        return constraints_.size();
      } else {
        return constraintsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getConstraints(int index) {
      if (constraintsBuilder_ == null) {
        return constraints_.get(index);
      } else {
        return constraintsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder setConstraints(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.set(index, value);
        onChanged();
      } else {
        constraintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder setConstraints(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.set(index, builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.add(value);
        onChanged();
      } else {
        constraintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.add(index, value);
        onChanged();
      } else {
        constraintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.add(builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.add(index, builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder addAllConstraints(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, constraints_);
        onChanged();
      } else {
        constraintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder clearConstraints() {
      if (constraintsBuilder_ == null) {
        constraints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        constraintsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public Builder removeConstraints(int index) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.remove(index);
        onChanged();
      } else {
        constraintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getConstraintsBuilder(
        int index) {
      return getConstraintsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getConstraintsOrBuilder(
        int index) {
      if (constraintsBuilder_ == null) {
        return constraints_.get(index);  } else {
        return constraintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getConstraintsOrBuilderList() {
      if (constraintsBuilder_ != null) {
        return constraintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(constraints_);
      }
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addConstraintsBuilder() {
      return getConstraintsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addConstraintsBuilder(
        int index) {
      return getConstraintsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getConstraintsBuilderList() {
      return getConstraintsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getConstraintsFieldBuilder() {
      if (constraintsBuilder_ == null) {
        constraintsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                constraints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        constraints_ = null;
      }
      return constraintsBuilder_;
    }

    private boolean deferred_ ;
    /**
     * <code>bool deferred = 2 [json_name = "deferred"];</code>
     * @return The deferred.
     */
    @java.lang.Override
    public boolean getDeferred() {
      return deferred_;
    }
    /**
     * <code>bool deferred = 2 [json_name = "deferred"];</code>
     * @param value The deferred to set.
     * @return This builder for chaining.
     */
    public Builder setDeferred(boolean value) {
      
      deferred_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool deferred = 2 [json_name = "deferred"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeferred() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deferred_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.ConstraintsSetStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.ConstraintsSetStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConstraintsSetStmt>
      PARSER = new com.google.protobuf.AbstractParser<ConstraintsSetStmt>() {
    @java.lang.Override
    public ConstraintsSetStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConstraintsSetStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConstraintsSetStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.ConstraintsSetStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

