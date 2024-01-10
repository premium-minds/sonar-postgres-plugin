// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlterUserMappingStmt}
 */
public final class AlterUserMappingStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterUserMappingStmt)
    AlterUserMappingStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterUserMappingStmt.newBuilder() to construct.
  private AlterUserMappingStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterUserMappingStmt() {
    servername_ = "";
    options_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterUserMappingStmt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterUserMappingStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterUserMappingStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.RoleSpec user_;
  /**
   * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
   * @return The user.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RoleSpec getUser() {
    return user_ == null ? com.premiumminds.sonar.postgres.protobuf.RoleSpec.getDefaultInstance() : user_;
  }
  /**
   * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder getUserOrBuilder() {
    return user_ == null ? com.premiumminds.sonar.postgres.protobuf.RoleSpec.getDefaultInstance() : user_;
  }

  public static final int SERVERNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object servername_ = "";
  /**
   * <code>string servername = 2 [json_name = "servername"];</code>
   * @return The servername.
   */
  @java.lang.Override
  public java.lang.String getServername() {
    java.lang.Object ref = servername_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      servername_ = s;
      return s;
    }
  }
  /**
   * <code>string servername = 2 [json_name = "servername"];</code>
   * @return The bytes for servername.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServernameBytes() {
    java.lang.Object ref = servername_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      servername_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> options_;
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
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
      output.writeMessage(1, getUser());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(servername_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, servername_);
    }
    for (int i = 0; i < options_.size(); i++) {
      output.writeMessage(3, options_.get(i));
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
        .computeMessageSize(1, getUser());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(servername_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, servername_);
    }
    for (int i = 0; i < options_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, options_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt other = (com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getServername()
        .equals(other.getServername())) return false;
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + SERVERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getServername().hashCode();
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterUserMappingStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterUserMappingStmt)
      com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterUserMappingStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterUserMappingStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.newBuilder()
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
        getUserFieldBuilder();
        getOptionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      servername_ = "";
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
      } else {
        options_ = null;
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterUserMappingStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt build() {
      com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt result = new com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt result) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          options_ = java.util.Collections.unmodifiableList(options_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.servername_ = servername_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getServername().isEmpty()) {
        servername_ = other.servername_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (optionsBuilder_ == null) {
        if (!other.options_.isEmpty()) {
          if (options_.isEmpty()) {
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureOptionsIsMutable();
            options_.addAll(other.options_);
          }
          onChanged();
        }
      } else {
        if (!other.options_.isEmpty()) {
          if (optionsBuilder_.isEmpty()) {
            optionsBuilder_.dispose();
            optionsBuilder_ = null;
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000004);
            optionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOptionsFieldBuilder() : null;
          } else {
            optionsBuilder_.addAllMessages(other.options_);
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
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              servername_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                options_.add(m);
              } else {
                optionsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private com.premiumminds.sonar.postgres.protobuf.RoleSpec user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RoleSpec, com.premiumminds.sonar.postgres.protobuf.RoleSpec.Builder, com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder> userBuilder_;
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     * @return The user.
     */
    public com.premiumminds.sonar.postgres.protobuf.RoleSpec getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.premiumminds.sonar.postgres.protobuf.RoleSpec.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    public Builder setUser(com.premiumminds.sonar.postgres.protobuf.RoleSpec value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    public Builder setUser(
        com.premiumminds.sonar.postgres.protobuf.RoleSpec.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    public Builder mergeUser(com.premiumminds.sonar.postgres.protobuf.RoleSpec value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          user_ != null &&
          user_ != com.premiumminds.sonar.postgres.protobuf.RoleSpec.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RoleSpec.Builder getUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.premiumminds.sonar.postgres.protobuf.RoleSpec.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.pg_query.RoleSpec user = 1 [json_name = "user"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RoleSpec, com.premiumminds.sonar.postgres.protobuf.RoleSpec.Builder, com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.RoleSpec, com.premiumminds.sonar.postgres.protobuf.RoleSpec.Builder, com.premiumminds.sonar.postgres.protobuf.RoleSpecOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private java.lang.Object servername_ = "";
    /**
     * <code>string servername = 2 [json_name = "servername"];</code>
     * @return The servername.
     */
    public java.lang.String getServername() {
      java.lang.Object ref = servername_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        servername_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string servername = 2 [json_name = "servername"];</code>
     * @return The bytes for servername.
     */
    public com.google.protobuf.ByteString
        getServernameBytes() {
      java.lang.Object ref = servername_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        servername_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string servername = 2 [json_name = "servername"];</code>
     * @param value The servername to set.
     * @return This builder for chaining.
     */
    public Builder setServername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      servername_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string servername = 2 [json_name = "servername"];</code>
     * @return This builder for chaining.
     */
    public Builder clearServername() {
      servername_ = getDefaultInstance().getServername();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string servername = 2 [json_name = "servername"];</code>
     * @param value The bytes for servername to set.
     * @return This builder for chaining.
     */
    public Builder setServernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      servername_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> options_ =
      java.util.Collections.emptyList();
    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        options_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(options_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> optionsBuilder_;

    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getOptionsList() {
      if (optionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(options_);
      } else {
        return optionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public int getOptionsCount() {
      if (optionsBuilder_ == null) {
        return options_.size();
      } else {
        return optionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);
      } else {
        return optionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.set(index, value);
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.set(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder addOptions(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(index, value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder addOptions(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder addAllOptions(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, options_);
        onChanged();
      } else {
        optionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public Builder removeOptions(int index) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.remove(index);
        onChanged();
      } else {
        optionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getOptionsOrBuilderList() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(options_);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 3 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getOptionsBuilderList() {
      return getOptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                options_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterUserMappingStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterUserMappingStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterUserMappingStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterUserMappingStmt>() {
    @java.lang.Override
    public AlterUserMappingStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlterUserMappingStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterUserMappingStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlterUserMappingStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

