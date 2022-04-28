// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlterDefaultPrivilegesStmt}
 */
public final class AlterDefaultPrivilegesStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterDefaultPrivilegesStmt)
    AlterDefaultPrivilegesStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterDefaultPrivilegesStmt.newBuilder() to construct.
  private AlterDefaultPrivilegesStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterDefaultPrivilegesStmt() {
    options_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterDefaultPrivilegesStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlterDefaultPrivilegesStmt(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              options_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            options_.add(
                input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.premiumminds.sonar.postgres.protobuf.GrantStmt.Builder subBuilder = null;
            if (action_ != null) {
              subBuilder = action_.toBuilder();
            }
            action_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.GrantStmt.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(action_);
              action_ = subBuilder.buildPartial();
            }

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
        options_ = java.util.Collections.unmodifiableList(options_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterDefaultPrivilegesStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterDefaultPrivilegesStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.Builder.class);
  }

  public static final int OPTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> options_;
  /**
   * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.GrantStmt action_;
  /**
   * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override
  public boolean hasAction() {
    return action_ != null;
  }
  /**
   * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.GrantStmt getAction() {
    return action_ == null ? com.premiumminds.sonar.postgres.protobuf.GrantStmt.getDefaultInstance() : action_;
  }
  /**
   * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.GrantStmtOrBuilder getActionOrBuilder() {
    return getAction();
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
    for (int i = 0; i < options_.size(); i++) {
      output.writeMessage(1, options_.get(i));
    }
    if (action_ != null) {
      output.writeMessage(2, getAction());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < options_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, options_.get(i));
    }
    if (action_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAction());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt other = (com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt) obj;

    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
    }
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
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterDefaultPrivilegesStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterDefaultPrivilegesStmt)
      com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterDefaultPrivilegesStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterDefaultPrivilegesStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.newBuilder()
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
        getOptionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        optionsBuilder_.clear();
      }
      if (actionBuilder_ == null) {
        action_ = null;
      } else {
        action_ = null;
        actionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterDefaultPrivilegesStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt build() {
      com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt result = new com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt(this);
      int from_bitField0_ = bitField0_;
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          options_ = java.util.Collections.unmodifiableList(options_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      if (actionBuilder_ == null) {
        result.action_ = action_;
      } else {
        result.action_ = actionBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt.getDefaultInstance()) return this;
      if (optionsBuilder_ == null) {
        if (!other.options_.isEmpty()) {
          if (options_.isEmpty()) {
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
            optionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOptionsFieldBuilder() : null;
          } else {
            optionsBuilder_.addAllMessages(other.options_);
          }
        }
      }
      if (other.hasAction()) {
        mergeAction(other.getAction());
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
      com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> options_ =
      java.util.Collections.emptyList();
    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        options_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(options_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> optionsBuilder_;

    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getOptionsList() {
      if (optionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(options_);
      } else {
        return optionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public int getOptionsCount() {
      if (optionsBuilder_ == null) {
        return options_.size();
      } else {
        return optionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);
      } else {
        return optionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 1 [json_name = "options"];</code>
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
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.GrantStmt action_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.GrantStmt, com.premiumminds.sonar.postgres.protobuf.GrantStmt.Builder, com.premiumminds.sonar.postgres.protobuf.GrantStmtOrBuilder> actionBuilder_;
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     * @return Whether the action field is set.
     */
    public boolean hasAction() {
      return actionBuilder_ != null || action_ != null;
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     * @return The action.
     */
    public com.premiumminds.sonar.postgres.protobuf.GrantStmt getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? com.premiumminds.sonar.postgres.protobuf.GrantStmt.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    public Builder setAction(com.premiumminds.sonar.postgres.protobuf.GrantStmt value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        actionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    public Builder setAction(
        com.premiumminds.sonar.postgres.protobuf.GrantStmt.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    public Builder mergeAction(com.premiumminds.sonar.postgres.protobuf.GrantStmt value) {
      if (actionBuilder_ == null) {
        if (action_ != null) {
          action_ =
            com.premiumminds.sonar.postgres.protobuf.GrantStmt.newBuilder(action_).mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        actionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    public Builder clearAction() {
      if (actionBuilder_ == null) {
        action_ = null;
        onChanged();
      } else {
        action_ = null;
        actionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.GrantStmt.Builder getActionBuilder() {
      
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.GrantStmtOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            com.premiumminds.sonar.postgres.protobuf.GrantStmt.getDefaultInstance() : action_;
      }
    }
    /**
     * <code>.pg_query.GrantStmt action = 2 [json_name = "action"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.GrantStmt, com.premiumminds.sonar.postgres.protobuf.GrantStmt.Builder, com.premiumminds.sonar.postgres.protobuf.GrantStmtOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.GrantStmt, com.premiumminds.sonar.postgres.protobuf.GrantStmt.Builder, com.premiumminds.sonar.postgres.protobuf.GrantStmtOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterDefaultPrivilegesStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterDefaultPrivilegesStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterDefaultPrivilegesStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterDefaultPrivilegesStmt>() {
    @java.lang.Override
    public AlterDefaultPrivilegesStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlterDefaultPrivilegesStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlterDefaultPrivilegesStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterDefaultPrivilegesStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlterDefaultPrivilegesStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
