// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.LockingClause}
 */
public final class LockingClause extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.LockingClause)
    LockingClauseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LockingClause.newBuilder() to construct.
  private LockingClause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LockingClause() {
    lockedRels_ = java.util.Collections.emptyList();
    strength_ = 0;
    waitPolicy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LockingClause();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_LockingClause_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_LockingClause_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.LockingClause.class, com.premiumminds.sonar.postgres.protobuf.LockingClause.Builder.class);
  }

  public static final int LOCKED_RELS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> lockedRels_;
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getLockedRelsList() {
    return lockedRels_;
  }
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getLockedRelsOrBuilderList() {
    return lockedRels_;
  }
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  @java.lang.Override
  public int getLockedRelsCount() {
    return lockedRels_.size();
  }
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getLockedRels(int index) {
    return lockedRels_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getLockedRelsOrBuilder(
      int index) {
    return lockedRels_.get(index);
  }

  public static final int STRENGTH_FIELD_NUMBER = 2;
  private int strength_ = 0;
  /**
   * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
   * @return The enum numeric value on the wire for strength.
   */
  @java.lang.Override public int getStrengthValue() {
    return strength_;
  }
  /**
   * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
   * @return The strength.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.LockClauseStrength getStrength() {
    com.premiumminds.sonar.postgres.protobuf.LockClauseStrength result = com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.forNumber(strength_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.UNRECOGNIZED : result;
  }

  public static final int WAIT_POLICY_FIELD_NUMBER = 3;
  private int waitPolicy_ = 0;
  /**
   * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
   * @return The enum numeric value on the wire for waitPolicy.
   */
  @java.lang.Override public int getWaitPolicyValue() {
    return waitPolicy_;
  }
  /**
   * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
   * @return The waitPolicy.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy getWaitPolicy() {
    com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy result = com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.forNumber(waitPolicy_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.UNRECOGNIZED : result;
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
    for (int i = 0; i < lockedRels_.size(); i++) {
      output.writeMessage(1, lockedRels_.get(i));
    }
    if (strength_ != com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.LOCK_CLAUSE_STRENGTH_UNDEFINED.getNumber()) {
      output.writeEnum(2, strength_);
    }
    if (waitPolicy_ != com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.LOCK_WAIT_POLICY_UNDEFINED.getNumber()) {
      output.writeEnum(3, waitPolicy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lockedRels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lockedRels_.get(i));
    }
    if (strength_ != com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.LOCK_CLAUSE_STRENGTH_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, strength_);
    }
    if (waitPolicy_ != com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.LOCK_WAIT_POLICY_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, waitPolicy_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.LockingClause)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.LockingClause other = (com.premiumminds.sonar.postgres.protobuf.LockingClause) obj;

    if (!getLockedRelsList()
        .equals(other.getLockedRelsList())) return false;
    if (strength_ != other.strength_) return false;
    if (waitPolicy_ != other.waitPolicy_) return false;
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
    if (getLockedRelsCount() > 0) {
      hash = (37 * hash) + LOCKED_RELS_FIELD_NUMBER;
      hash = (53 * hash) + getLockedRelsList().hashCode();
    }
    hash = (37 * hash) + STRENGTH_FIELD_NUMBER;
    hash = (53 * hash) + strength_;
    hash = (37 * hash) + WAIT_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + waitPolicy_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.LockingClause parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.LockingClause prototype) {
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
   * Protobuf type {@code pg_query.LockingClause}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.LockingClause)
      com.premiumminds.sonar.postgres.protobuf.LockingClauseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_LockingClause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_LockingClause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.LockingClause.class, com.premiumminds.sonar.postgres.protobuf.LockingClause.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.LockingClause.newBuilder()
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
      if (lockedRelsBuilder_ == null) {
        lockedRels_ = java.util.Collections.emptyList();
      } else {
        lockedRels_ = null;
        lockedRelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      strength_ = 0;
      waitPolicy_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_LockingClause_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockingClause getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.LockingClause.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockingClause build() {
      com.premiumminds.sonar.postgres.protobuf.LockingClause result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockingClause buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.LockingClause result = new com.premiumminds.sonar.postgres.protobuf.LockingClause(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.LockingClause result) {
      if (lockedRelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lockedRels_ = java.util.Collections.unmodifiableList(lockedRels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lockedRels_ = lockedRels_;
      } else {
        result.lockedRels_ = lockedRelsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.LockingClause result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.strength_ = strength_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.waitPolicy_ = waitPolicy_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.LockingClause) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.LockingClause)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.LockingClause other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.LockingClause.getDefaultInstance()) return this;
      if (lockedRelsBuilder_ == null) {
        if (!other.lockedRels_.isEmpty()) {
          if (lockedRels_.isEmpty()) {
            lockedRels_ = other.lockedRels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLockedRelsIsMutable();
            lockedRels_.addAll(other.lockedRels_);
          }
          onChanged();
        }
      } else {
        if (!other.lockedRels_.isEmpty()) {
          if (lockedRelsBuilder_.isEmpty()) {
            lockedRelsBuilder_.dispose();
            lockedRelsBuilder_ = null;
            lockedRels_ = other.lockedRels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lockedRelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLockedRelsFieldBuilder() : null;
          } else {
            lockedRelsBuilder_.addAllMessages(other.lockedRels_);
          }
        }
      }
      if (other.strength_ != 0) {
        setStrengthValue(other.getStrengthValue());
      }
      if (other.waitPolicy_ != 0) {
        setWaitPolicyValue(other.getWaitPolicyValue());
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
              if (lockedRelsBuilder_ == null) {
                ensureLockedRelsIsMutable();
                lockedRels_.add(m);
              } else {
                lockedRelsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              strength_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              waitPolicy_ = input.readEnum();
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

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> lockedRels_ =
      java.util.Collections.emptyList();
    private void ensureLockedRelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lockedRels_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(lockedRels_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> lockedRelsBuilder_;

    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getLockedRelsList() {
      if (lockedRelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lockedRels_);
      } else {
        return lockedRelsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public int getLockedRelsCount() {
      if (lockedRelsBuilder_ == null) {
        return lockedRels_.size();
      } else {
        return lockedRelsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getLockedRels(int index) {
      if (lockedRelsBuilder_ == null) {
        return lockedRels_.get(index);
      } else {
        return lockedRelsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder setLockedRels(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (lockedRelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLockedRelsIsMutable();
        lockedRels_.set(index, value);
        onChanged();
      } else {
        lockedRelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder setLockedRels(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (lockedRelsBuilder_ == null) {
        ensureLockedRelsIsMutable();
        lockedRels_.set(index, builderForValue.build());
        onChanged();
      } else {
        lockedRelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder addLockedRels(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (lockedRelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLockedRelsIsMutable();
        lockedRels_.add(value);
        onChanged();
      } else {
        lockedRelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder addLockedRels(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (lockedRelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLockedRelsIsMutable();
        lockedRels_.add(index, value);
        onChanged();
      } else {
        lockedRelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder addLockedRels(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (lockedRelsBuilder_ == null) {
        ensureLockedRelsIsMutable();
        lockedRels_.add(builderForValue.build());
        onChanged();
      } else {
        lockedRelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder addLockedRels(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (lockedRelsBuilder_ == null) {
        ensureLockedRelsIsMutable();
        lockedRels_.add(index, builderForValue.build());
        onChanged();
      } else {
        lockedRelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder addAllLockedRels(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (lockedRelsBuilder_ == null) {
        ensureLockedRelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lockedRels_);
        onChanged();
      } else {
        lockedRelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder clearLockedRels() {
      if (lockedRelsBuilder_ == null) {
        lockedRels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lockedRelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public Builder removeLockedRels(int index) {
      if (lockedRelsBuilder_ == null) {
        ensureLockedRelsIsMutable();
        lockedRels_.remove(index);
        onChanged();
      } else {
        lockedRelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getLockedRelsBuilder(
        int index) {
      return getLockedRelsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getLockedRelsOrBuilder(
        int index) {
      if (lockedRelsBuilder_ == null) {
        return lockedRels_.get(index);  } else {
        return lockedRelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getLockedRelsOrBuilderList() {
      if (lockedRelsBuilder_ != null) {
        return lockedRelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lockedRels_);
      }
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addLockedRelsBuilder() {
      return getLockedRelsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addLockedRelsBuilder(
        int index) {
      return getLockedRelsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getLockedRelsBuilderList() {
      return getLockedRelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getLockedRelsFieldBuilder() {
      if (lockedRelsBuilder_ == null) {
        lockedRelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                lockedRels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lockedRels_ = null;
      }
      return lockedRelsBuilder_;
    }

    private int strength_ = 0;
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @return The enum numeric value on the wire for strength.
     */
    @java.lang.Override public int getStrengthValue() {
      return strength_;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @param value The enum numeric value on the wire for strength to set.
     * @return This builder for chaining.
     */
    public Builder setStrengthValue(int value) {
      strength_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @return The strength.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockClauseStrength getStrength() {
      com.premiumminds.sonar.postgres.protobuf.LockClauseStrength result = com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.forNumber(strength_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @param value The strength to set.
     * @return This builder for chaining.
     */
    public Builder setStrength(com.premiumminds.sonar.postgres.protobuf.LockClauseStrength value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      strength_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStrength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      strength_ = 0;
      onChanged();
      return this;
    }

    private int waitPolicy_ = 0;
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @return The enum numeric value on the wire for waitPolicy.
     */
    @java.lang.Override public int getWaitPolicyValue() {
      return waitPolicy_;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @param value The enum numeric value on the wire for waitPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setWaitPolicyValue(int value) {
      waitPolicy_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @return The waitPolicy.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy getWaitPolicy() {
      com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy result = com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.forNumber(waitPolicy_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @param value The waitPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setWaitPolicy(com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      waitPolicy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWaitPolicy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      waitPolicy_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.LockingClause)
  }

  // @@protoc_insertion_point(class_scope:pg_query.LockingClause)
  private static final com.premiumminds.sonar.postgres.protobuf.LockingClause DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.LockingClause();
  }

  public static com.premiumminds.sonar.postgres.protobuf.LockingClause getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LockingClause>
      PARSER = new com.google.protobuf.AbstractParser<LockingClause>() {
    @java.lang.Override
    public LockingClause parsePartialFrom(
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

  public static com.google.protobuf.Parser<LockingClause> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LockingClause> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.LockingClause getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

