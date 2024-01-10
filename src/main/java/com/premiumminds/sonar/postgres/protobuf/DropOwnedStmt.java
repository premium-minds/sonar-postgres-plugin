// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.DropOwnedStmt}
 */
public final class DropOwnedStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.DropOwnedStmt)
    DropOwnedStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DropOwnedStmt.newBuilder() to construct.
  private DropOwnedStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DropOwnedStmt() {
    roles_ = java.util.Collections.emptyList();
    behavior_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DropOwnedStmt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropOwnedStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropOwnedStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.class, com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.Builder.class);
  }

  public static final int ROLES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> roles_;
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getRolesList() {
    return roles_;
  }
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getRolesOrBuilderList() {
    return roles_;
  }
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public int getRolesCount() {
    return roles_.size();
  }
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getRoles(int index) {
    return roles_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRolesOrBuilder(
      int index) {
    return roles_.get(index);
  }

  public static final int BEHAVIOR_FIELD_NUMBER = 2;
  private int behavior_ = 0;
  /**
   * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
   * @return The enum numeric value on the wire for behavior.
   */
  @java.lang.Override public int getBehaviorValue() {
    return behavior_;
  }
  /**
   * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
   * @return The behavior.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.DropBehavior getBehavior() {
    com.premiumminds.sonar.postgres.protobuf.DropBehavior result = com.premiumminds.sonar.postgres.protobuf.DropBehavior.forNumber(behavior_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.DropBehavior.UNRECOGNIZED : result;
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
    for (int i = 0; i < roles_.size(); i++) {
      output.writeMessage(1, roles_.get(i));
    }
    if (behavior_ != com.premiumminds.sonar.postgres.protobuf.DropBehavior.DROP_BEHAVIOR_UNDEFINED.getNumber()) {
      output.writeEnum(2, behavior_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < roles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, roles_.get(i));
    }
    if (behavior_ != com.premiumminds.sonar.postgres.protobuf.DropBehavior.DROP_BEHAVIOR_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, behavior_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt other = (com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt) obj;

    if (!getRolesList()
        .equals(other.getRolesList())) return false;
    if (behavior_ != other.behavior_) return false;
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
    if (getRolesCount() > 0) {
      hash = (37 * hash) + ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getRolesList().hashCode();
    }
    hash = (37 * hash) + BEHAVIOR_FIELD_NUMBER;
    hash = (53 * hash) + behavior_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt prototype) {
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
   * Protobuf type {@code pg_query.DropOwnedStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.DropOwnedStmt)
      com.premiumminds.sonar.postgres.protobuf.DropOwnedStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropOwnedStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropOwnedStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.class, com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.newBuilder()
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
      if (rolesBuilder_ == null) {
        roles_ = java.util.Collections.emptyList();
      } else {
        roles_ = null;
        rolesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      behavior_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropOwnedStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt build() {
      com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt result = new com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt result) {
      if (rolesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roles_ = java.util.Collections.unmodifiableList(roles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roles_ = roles_;
      } else {
        result.roles_ = rolesBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.behavior_ = behavior_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt.getDefaultInstance()) return this;
      if (rolesBuilder_ == null) {
        if (!other.roles_.isEmpty()) {
          if (roles_.isEmpty()) {
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRolesIsMutable();
            roles_.addAll(other.roles_);
          }
          onChanged();
        }
      } else {
        if (!other.roles_.isEmpty()) {
          if (rolesBuilder_.isEmpty()) {
            rolesBuilder_.dispose();
            rolesBuilder_ = null;
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rolesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRolesFieldBuilder() : null;
          } else {
            rolesBuilder_.addAllMessages(other.roles_);
          }
        }
      }
      if (other.behavior_ != 0) {
        setBehaviorValue(other.getBehaviorValue());
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
              if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                roles_.add(m);
              } else {
                rolesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              behavior_ = input.readEnum();
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

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> roles_ =
      java.util.Collections.emptyList();
    private void ensureRolesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roles_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(roles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> rolesBuilder_;

    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getRolesList() {
      if (rolesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roles_);
      } else {
        return rolesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public int getRolesCount() {
      if (rolesBuilder_ == null) {
        return roles_.size();
      } else {
        return rolesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getRoles(int index) {
      if (rolesBuilder_ == null) {
        return roles_.get(index);
      } else {
        return rolesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder setRoles(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.set(index, value);
        onChanged();
      } else {
        rolesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder setRoles(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.set(index, builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.add(value);
        onChanged();
      } else {
        rolesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.add(index, value);
        onChanged();
      } else {
        rolesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.add(builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.add(index, builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder addAllRoles(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roles_);
        onChanged();
      } else {
        rolesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder clearRoles() {
      if (rolesBuilder_ == null) {
        roles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rolesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public Builder removeRoles(int index) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.remove(index);
        onChanged();
      } else {
        rolesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getRolesBuilder(
        int index) {
      return getRolesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getRolesOrBuilder(
        int index) {
      if (rolesBuilder_ == null) {
        return roles_.get(index);  } else {
        return rolesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getRolesOrBuilderList() {
      if (rolesBuilder_ != null) {
        return rolesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roles_);
      }
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addRolesBuilder() {
      return getRolesFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addRolesBuilder(
        int index) {
      return getRolesFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getRolesBuilderList() {
      return getRolesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getRolesFieldBuilder() {
      if (rolesBuilder_ == null) {
        rolesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                roles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roles_ = null;
      }
      return rolesBuilder_;
    }

    private int behavior_ = 0;
    /**
     * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
     * @return The enum numeric value on the wire for behavior.
     */
    @java.lang.Override public int getBehaviorValue() {
      return behavior_;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
     * @param value The enum numeric value on the wire for behavior to set.
     * @return This builder for chaining.
     */
    public Builder setBehaviorValue(int value) {
      behavior_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
     * @return The behavior.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropBehavior getBehavior() {
      com.premiumminds.sonar.postgres.protobuf.DropBehavior result = com.premiumminds.sonar.postgres.protobuf.DropBehavior.forNumber(behavior_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.DropBehavior.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
     * @param value The behavior to set.
     * @return This builder for chaining.
     */
    public Builder setBehavior(com.premiumminds.sonar.postgres.protobuf.DropBehavior value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      behavior_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 2 [json_name = "behavior"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBehavior() {
      bitField0_ = (bitField0_ & ~0x00000002);
      behavior_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.DropOwnedStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.DropOwnedStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DropOwnedStmt>
      PARSER = new com.google.protobuf.AbstractParser<DropOwnedStmt>() {
    @java.lang.Override
    public DropOwnedStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<DropOwnedStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DropOwnedStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.DropOwnedStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

