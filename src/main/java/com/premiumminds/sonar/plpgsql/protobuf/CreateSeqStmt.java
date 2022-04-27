// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.CreateSeqStmt}
 */
public final class CreateSeqStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CreateSeqStmt)
    CreateSeqStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSeqStmt.newBuilder() to construct.
  private CreateSeqStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSeqStmt() {
    options_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSeqStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSeqStmt(
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
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder subBuilder = null;
            if (sequence_ != null) {
              subBuilder = sequence_.toBuilder();
            }
            sequence_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.RangeVar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sequence_);
              sequence_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              options_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            options_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 24: {

            ownerId_ = input.readUInt32();
            break;
          }
          case 32: {

            forIdentity_ = input.readBool();
            break;
          }
          case 40: {

            ifNotExists_ = input.readBool();
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateSeqStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateSeqStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.class, com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.Builder.class);
  }

  public static final int SEQUENCE_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.plpgsql.protobuf.RangeVar sequence_;
  /**
   * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
   * @return Whether the sequence field is set.
   */
  @java.lang.Override
  public boolean hasSequence() {
    return sequence_ != null;
  }
  /**
   * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RangeVar getSequence() {
    return sequence_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : sequence_;
  }
  /**
   * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getSequenceOrBuilder() {
    return getSequence();
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> options_;
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
  }

  public static final int OWNER_ID_FIELD_NUMBER = 3;
  private int ownerId_;
  /**
   * <code>uint32 owner_id = 3 [json_name = "ownerId"];</code>
   * @return The ownerId.
   */
  @java.lang.Override
  public int getOwnerId() {
    return ownerId_;
  }

  public static final int FOR_IDENTITY_FIELD_NUMBER = 4;
  private boolean forIdentity_;
  /**
   * <code>bool for_identity = 4 [json_name = "for_identity"];</code>
   * @return The forIdentity.
   */
  @java.lang.Override
  public boolean getForIdentity() {
    return forIdentity_;
  }

  public static final int IF_NOT_EXISTS_FIELD_NUMBER = 5;
  private boolean ifNotExists_;
  /**
   * <code>bool if_not_exists = 5 [json_name = "if_not_exists"];</code>
   * @return The ifNotExists.
   */
  @java.lang.Override
  public boolean getIfNotExists() {
    return ifNotExists_;
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
    if (sequence_ != null) {
      output.writeMessage(1, getSequence());
    }
    for (int i = 0; i < options_.size(); i++) {
      output.writeMessage(2, options_.get(i));
    }
    if (ownerId_ != 0) {
      output.writeUInt32(3, ownerId_);
    }
    if (forIdentity_ != false) {
      output.writeBool(4, forIdentity_);
    }
    if (ifNotExists_ != false) {
      output.writeBool(5, ifNotExists_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sequence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSequence());
    }
    for (int i = 0; i < options_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, options_.get(i));
    }
    if (ownerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, ownerId_);
    }
    if (forIdentity_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, forIdentity_);
    }
    if (ifNotExists_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ifNotExists_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt other = (com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt) obj;

    if (hasSequence() != other.hasSequence()) return false;
    if (hasSequence()) {
      if (!getSequence()
          .equals(other.getSequence())) return false;
    }
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
    if (getOwnerId()
        != other.getOwnerId()) return false;
    if (getForIdentity()
        != other.getForIdentity()) return false;
    if (getIfNotExists()
        != other.getIfNotExists()) return false;
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
    if (hasSequence()) {
      hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
      hash = (53 * hash) + getSequence().hashCode();
    }
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (37 * hash) + OWNER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerId();
    hash = (37 * hash) + FOR_IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForIdentity());
    hash = (37 * hash) + IF_NOT_EXISTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIfNotExists());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt prototype) {
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
   * Protobuf type {@code pg_query.CreateSeqStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CreateSeqStmt)
      com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateSeqStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateSeqStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.class, com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.newBuilder()
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
      if (sequenceBuilder_ == null) {
        sequence_ = null;
      } else {
        sequence_ = null;
        sequenceBuilder_ = null;
      }
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        optionsBuilder_.clear();
      }
      ownerId_ = 0;

      forIdentity_ = false;

      ifNotExists_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CreateSeqStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt result = new com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt(this);
      int from_bitField0_ = bitField0_;
      if (sequenceBuilder_ == null) {
        result.sequence_ = sequence_;
      } else {
        result.sequence_ = sequenceBuilder_.build();
      }
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          options_ = java.util.Collections.unmodifiableList(options_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      result.ownerId_ = ownerId_;
      result.forIdentity_ = forIdentity_;
      result.ifNotExists_ = ifNotExists_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt.getDefaultInstance()) return this;
      if (other.hasSequence()) {
        mergeSequence(other.getSequence());
      }
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
      if (other.getOwnerId() != 0) {
        setOwnerId(other.getOwnerId());
      }
      if (other.getForIdentity() != false) {
        setForIdentity(other.getForIdentity());
      }
      if (other.getIfNotExists() != false) {
        setIfNotExists(other.getIfNotExists());
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
      com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.premiumminds.sonar.plpgsql.protobuf.RangeVar sequence_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder> sequenceBuilder_;
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     * @return Whether the sequence field is set.
     */
    public boolean hasSequence() {
      return sequenceBuilder_ != null || sequence_ != null;
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVar getSequence() {
      if (sequenceBuilder_ == null) {
        return sequence_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : sequence_;
      } else {
        return sequenceBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public Builder setSequence(com.premiumminds.sonar.plpgsql.protobuf.RangeVar value) {
      if (sequenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sequence_ = value;
        onChanged();
      } else {
        sequenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public Builder setSequence(
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder builderForValue) {
      if (sequenceBuilder_ == null) {
        sequence_ = builderForValue.build();
        onChanged();
      } else {
        sequenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public Builder mergeSequence(com.premiumminds.sonar.plpgsql.protobuf.RangeVar value) {
      if (sequenceBuilder_ == null) {
        if (sequence_ != null) {
          sequence_ =
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.newBuilder(sequence_).mergeFrom(value).buildPartial();
        } else {
          sequence_ = value;
        }
        onChanged();
      } else {
        sequenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public Builder clearSequence() {
      if (sequenceBuilder_ == null) {
        sequence_ = null;
        onChanged();
      } else {
        sequence_ = null;
        sequenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder getSequenceBuilder() {
      
      onChanged();
      return getSequenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getSequenceOrBuilder() {
      if (sequenceBuilder_ != null) {
        return sequenceBuilder_.getMessageOrBuilder();
      } else {
        return sequence_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : sequence_;
      }
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder> 
        getSequenceFieldBuilder() {
      if (sequenceBuilder_ == null) {
        sequenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder>(
                getSequence(),
                getParentForChildren(),
                isClean());
        sequence_ = null;
      }
      return sequenceBuilder_;
    }

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> options_ =
      java.util.Collections.emptyList();
    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        options_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(options_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> optionsBuilder_;

    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getOptionsList() {
      if (optionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(options_);
      } else {
        return optionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public int getOptionsCount() {
      if (optionsBuilder_ == null) {
        return options_.size();
      } else {
        return optionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getOptions(int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);
      } else {
        return optionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addAllOptions(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getOptionsOrBuilderList() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(options_);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getOptionsBuilderList() {
      return getOptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                options_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    private int ownerId_ ;
    /**
     * <code>uint32 owner_id = 3 [json_name = "ownerId"];</code>
     * @return The ownerId.
     */
    @java.lang.Override
    public int getOwnerId() {
      return ownerId_;
    }
    /**
     * <code>uint32 owner_id = 3 [json_name = "ownerId"];</code>
     * @param value The ownerId to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerId(int value) {
      
      ownerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 owner_id = 3 [json_name = "ownerId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwnerId() {
      
      ownerId_ = 0;
      onChanged();
      return this;
    }

    private boolean forIdentity_ ;
    /**
     * <code>bool for_identity = 4 [json_name = "for_identity"];</code>
     * @return The forIdentity.
     */
    @java.lang.Override
    public boolean getForIdentity() {
      return forIdentity_;
    }
    /**
     * <code>bool for_identity = 4 [json_name = "for_identity"];</code>
     * @param value The forIdentity to set.
     * @return This builder for chaining.
     */
    public Builder setForIdentity(boolean value) {
      
      forIdentity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool for_identity = 4 [json_name = "for_identity"];</code>
     * @return This builder for chaining.
     */
    public Builder clearForIdentity() {
      
      forIdentity_ = false;
      onChanged();
      return this;
    }

    private boolean ifNotExists_ ;
    /**
     * <code>bool if_not_exists = 5 [json_name = "if_not_exists"];</code>
     * @return The ifNotExists.
     */
    @java.lang.Override
    public boolean getIfNotExists() {
      return ifNotExists_;
    }
    /**
     * <code>bool if_not_exists = 5 [json_name = "if_not_exists"];</code>
     * @param value The ifNotExists to set.
     * @return This builder for chaining.
     */
    public Builder setIfNotExists(boolean value) {
      
      ifNotExists_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool if_not_exists = 5 [json_name = "if_not_exists"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIfNotExists() {
      
      ifNotExists_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.CreateSeqStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CreateSeqStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSeqStmt>
      PARSER = new com.google.protobuf.AbstractParser<CreateSeqStmt>() {
    @java.lang.Override
    public CreateSeqStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSeqStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSeqStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSeqStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.CreateSeqStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
