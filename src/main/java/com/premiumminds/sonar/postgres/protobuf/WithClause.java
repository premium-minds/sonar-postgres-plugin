// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.WithClause}
 */
public final class WithClause extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.WithClause)
    WithClauseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithClause.newBuilder() to construct.
  private WithClause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithClause() {
    ctes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithClause();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithClause(
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
              ctes_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            ctes_.add(
                input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 16: {

            recursive_ = input.readBool();
            break;
          }
          case 24: {

            location_ = input.readInt32();
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
        ctes_ = java.util.Collections.unmodifiableList(ctes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_WithClause_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_WithClause_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.WithClause.class, com.premiumminds.sonar.postgres.protobuf.WithClause.Builder.class);
  }

  public static final int CTES_FIELD_NUMBER = 1;
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> ctes_;
  /**
   * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getCtesList() {
    return ctes_;
  }
  /**
   * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getCtesOrBuilderList() {
    return ctes_;
  }
  /**
   * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
   */
  @java.lang.Override
  public int getCtesCount() {
    return ctes_.size();
  }
  /**
   * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getCtes(int index) {
    return ctes_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getCtesOrBuilder(
      int index) {
    return ctes_.get(index);
  }

  public static final int RECURSIVE_FIELD_NUMBER = 2;
  private boolean recursive_;
  /**
   * <code>bool recursive = 2 [json_name = "recursive"];</code>
   * @return The recursive.
   */
  @java.lang.Override
  public boolean getRecursive() {
    return recursive_;
  }

  public static final int LOCATION_FIELD_NUMBER = 3;
  private int location_;
  /**
   * <code>int32 location = 3 [json_name = "location"];</code>
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
    for (int i = 0; i < ctes_.size(); i++) {
      output.writeMessage(1, ctes_.get(i));
    }
    if (recursive_ != false) {
      output.writeBool(2, recursive_);
    }
    if (location_ != 0) {
      output.writeInt32(3, location_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ctes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ctes_.get(i));
    }
    if (recursive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, recursive_);
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.WithClause)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.WithClause other = (com.premiumminds.sonar.postgres.protobuf.WithClause) obj;

    if (!getCtesList()
        .equals(other.getCtesList())) return false;
    if (getRecursive()
        != other.getRecursive()) return false;
    if (getLocation()
        != other.getLocation()) return false;
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
    if (getCtesCount() > 0) {
      hash = (37 * hash) + CTES_FIELD_NUMBER;
      hash = (53 * hash) + getCtesList().hashCode();
    }
    hash = (37 * hash) + RECURSIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRecursive());
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.WithClause parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.WithClause prototype) {
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
   * Protobuf type {@code pg_query.WithClause}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.WithClause)
      com.premiumminds.sonar.postgres.protobuf.WithClauseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_WithClause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_WithClause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.WithClause.class, com.premiumminds.sonar.postgres.protobuf.WithClause.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.WithClause.newBuilder()
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
        getCtesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ctesBuilder_ == null) {
        ctes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ctesBuilder_.clear();
      }
      recursive_ = false;

      location_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_WithClause_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.WithClause getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.WithClause.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.WithClause build() {
      com.premiumminds.sonar.postgres.protobuf.WithClause result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.WithClause buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.WithClause result = new com.premiumminds.sonar.postgres.protobuf.WithClause(this);
      int from_bitField0_ = bitField0_;
      if (ctesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ctes_ = java.util.Collections.unmodifiableList(ctes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ctes_ = ctes_;
      } else {
        result.ctes_ = ctesBuilder_.build();
      }
      result.recursive_ = recursive_;
      result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.WithClause) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.WithClause)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.WithClause other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.WithClause.getDefaultInstance()) return this;
      if (ctesBuilder_ == null) {
        if (!other.ctes_.isEmpty()) {
          if (ctes_.isEmpty()) {
            ctes_ = other.ctes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCtesIsMutable();
            ctes_.addAll(other.ctes_);
          }
          onChanged();
        }
      } else {
        if (!other.ctes_.isEmpty()) {
          if (ctesBuilder_.isEmpty()) {
            ctesBuilder_.dispose();
            ctesBuilder_ = null;
            ctes_ = other.ctes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ctesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCtesFieldBuilder() : null;
          } else {
            ctesBuilder_.addAllMessages(other.ctes_);
          }
        }
      }
      if (other.getRecursive() != false) {
        setRecursive(other.getRecursive());
      }
      if (other.getLocation() != 0) {
        setLocation(other.getLocation());
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
      com.premiumminds.sonar.postgres.protobuf.WithClause parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.WithClause) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> ctes_ =
      java.util.Collections.emptyList();
    private void ensureCtesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ctes_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(ctes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> ctesBuilder_;

    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getCtesList() {
      if (ctesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ctes_);
      } else {
        return ctesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public int getCtesCount() {
      if (ctesBuilder_ == null) {
        return ctes_.size();
      } else {
        return ctesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getCtes(int index) {
      if (ctesBuilder_ == null) {
        return ctes_.get(index);
      } else {
        return ctesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder setCtes(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (ctesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCtesIsMutable();
        ctes_.set(index, value);
        onChanged();
      } else {
        ctesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder setCtes(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (ctesBuilder_ == null) {
        ensureCtesIsMutable();
        ctes_.set(index, builderForValue.build());
        onChanged();
      } else {
        ctesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder addCtes(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (ctesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCtesIsMutable();
        ctes_.add(value);
        onChanged();
      } else {
        ctesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder addCtes(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (ctesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCtesIsMutable();
        ctes_.add(index, value);
        onChanged();
      } else {
        ctesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder addCtes(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (ctesBuilder_ == null) {
        ensureCtesIsMutable();
        ctes_.add(builderForValue.build());
        onChanged();
      } else {
        ctesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder addCtes(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (ctesBuilder_ == null) {
        ensureCtesIsMutable();
        ctes_.add(index, builderForValue.build());
        onChanged();
      } else {
        ctesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder addAllCtes(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (ctesBuilder_ == null) {
        ensureCtesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ctes_);
        onChanged();
      } else {
        ctesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder clearCtes() {
      if (ctesBuilder_ == null) {
        ctes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ctesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public Builder removeCtes(int index) {
      if (ctesBuilder_ == null) {
        ensureCtesIsMutable();
        ctes_.remove(index);
        onChanged();
      } else {
        ctesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getCtesBuilder(
        int index) {
      return getCtesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getCtesOrBuilder(
        int index) {
      if (ctesBuilder_ == null) {
        return ctes_.get(index);  } else {
        return ctesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getCtesOrBuilderList() {
      if (ctesBuilder_ != null) {
        return ctesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ctes_);
      }
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addCtesBuilder() {
      return getCtesFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addCtesBuilder(
        int index) {
      return getCtesFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node ctes = 1 [json_name = "ctes"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getCtesBuilderList() {
      return getCtesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getCtesFieldBuilder() {
      if (ctesBuilder_ == null) {
        ctesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                ctes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ctes_ = null;
      }
      return ctesBuilder_;
    }

    private boolean recursive_ ;
    /**
     * <code>bool recursive = 2 [json_name = "recursive"];</code>
     * @return The recursive.
     */
    @java.lang.Override
    public boolean getRecursive() {
      return recursive_;
    }
    /**
     * <code>bool recursive = 2 [json_name = "recursive"];</code>
     * @param value The recursive to set.
     * @return This builder for chaining.
     */
    public Builder setRecursive(boolean value) {
      
      recursive_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool recursive = 2 [json_name = "recursive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecursive() {
      
      recursive_ = false;
      onChanged();
      return this;
    }

    private int location_ ;
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {
      
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
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


    // @@protoc_insertion_point(builder_scope:pg_query.WithClause)
  }

  // @@protoc_insertion_point(class_scope:pg_query.WithClause)
  private static final com.premiumminds.sonar.postgres.protobuf.WithClause DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.WithClause();
  }

  public static com.premiumminds.sonar.postgres.protobuf.WithClause getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithClause>
      PARSER = new com.google.protobuf.AbstractParser<WithClause>() {
    @java.lang.Override
    public WithClause parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithClause(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithClause> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithClause> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.WithClause getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
