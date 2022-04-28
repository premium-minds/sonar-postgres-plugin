// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlterSeqStmt}
 */
public final class AlterSeqStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterSeqStmt)
    AlterSeqStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterSeqStmt.newBuilder() to construct.
  private AlterSeqStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterSeqStmt() {
    options_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterSeqStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlterSeqStmt(
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
            com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder subBuilder = null;
            if (sequence_ != null) {
              subBuilder = sequence_.toBuilder();
            }
            sequence_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.RangeVar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sequence_);
              sequence_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              options_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            options_.add(
                input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 24: {

            forIdentity_ = input.readBool();
            break;
          }
          case 32: {

            missingOk_ = input.readBool();
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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSeqStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSeqStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.Builder.class);
  }

  public static final int SEQUENCE_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.RangeVar sequence_;
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
  public com.premiumminds.sonar.postgres.protobuf.RangeVar getSequence() {
    return sequence_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : sequence_;
  }
  /**
   * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getSequenceOrBuilder() {
    return getSequence();
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> options_;
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
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
  public com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
  }

  public static final int FOR_IDENTITY_FIELD_NUMBER = 3;
  private boolean forIdentity_;
  /**
   * <code>bool for_identity = 3 [json_name = "for_identity"];</code>
   * @return The forIdentity.
   */
  @java.lang.Override
  public boolean getForIdentity() {
    return forIdentity_;
  }

  public static final int MISSING_OK_FIELD_NUMBER = 4;
  private boolean missingOk_;
  /**
   * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  @java.lang.Override
  public boolean getMissingOk() {
    return missingOk_;
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
    if (forIdentity_ != false) {
      output.writeBool(3, forIdentity_);
    }
    if (missingOk_ != false) {
      output.writeBool(4, missingOk_);
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
    if (forIdentity_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, forIdentity_);
    }
    if (missingOk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, missingOk_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt other = (com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt) obj;

    if (hasSequence() != other.hasSequence()) return false;
    if (hasSequence()) {
      if (!getSequence()
          .equals(other.getSequence())) return false;
    }
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
    if (getForIdentity()
        != other.getForIdentity()) return false;
    if (getMissingOk()
        != other.getMissingOk()) return false;
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
    hash = (37 * hash) + FOR_IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForIdentity());
    hash = (37 * hash) + MISSING_OK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMissingOk());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterSeqStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterSeqStmt)
      com.premiumminds.sonar.postgres.protobuf.AlterSeqStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSeqStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSeqStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.newBuilder()
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
      forIdentity_ = false;

      missingOk_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSeqStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt build() {
      com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt result = new com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt(this);
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
      result.forIdentity_ = forIdentity_;
      result.missingOk_ = missingOk_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt.getDefaultInstance()) return this;
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
      if (other.getForIdentity() != false) {
        setForIdentity(other.getForIdentity());
      }
      if (other.getMissingOk() != false) {
        setMissingOk(other.getMissingOk());
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
      com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.premiumminds.sonar.postgres.protobuf.RangeVar sequence_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder> sequenceBuilder_;
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
    public com.premiumminds.sonar.postgres.protobuf.RangeVar getSequence() {
      if (sequenceBuilder_ == null) {
        return sequence_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : sequence_;
      } else {
        return sequenceBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public Builder setSequence(com.premiumminds.sonar.postgres.protobuf.RangeVar value) {
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
        com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder builderForValue) {
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
    public Builder mergeSequence(com.premiumminds.sonar.postgres.protobuf.RangeVar value) {
      if (sequenceBuilder_ == null) {
        if (sequence_ != null) {
          sequence_ =
            com.premiumminds.sonar.postgres.protobuf.RangeVar.newBuilder(sequence_).mergeFrom(value).buildPartial();
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
    public com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder getSequenceBuilder() {
      
      onChanged();
      return getSequenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getSequenceOrBuilder() {
      if (sequenceBuilder_ != null) {
        return sequenceBuilder_.getMessageOrBuilder();
      } else {
        return sequence_ == null ?
            com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : sequence_;
      }
    }
    /**
     * <code>.pg_query.RangeVar sequence = 1 [json_name = "sequence"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder> 
        getSequenceFieldBuilder() {
      if (sequenceBuilder_ == null) {
        sequenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder>(
                getSequence(),
                getParentForChildren(),
                isClean());
        sequence_ = null;
      }
      return sequenceBuilder_;
    }

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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getOptionsList() {
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
    public com.premiumminds.sonar.postgres.protobuf.Node getOptions(int index) {
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
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

    private boolean forIdentity_ ;
    /**
     * <code>bool for_identity = 3 [json_name = "for_identity"];</code>
     * @return The forIdentity.
     */
    @java.lang.Override
    public boolean getForIdentity() {
      return forIdentity_;
    }
    /**
     * <code>bool for_identity = 3 [json_name = "for_identity"];</code>
     * @param value The forIdentity to set.
     * @return This builder for chaining.
     */
    public Builder setForIdentity(boolean value) {
      
      forIdentity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool for_identity = 3 [json_name = "for_identity"];</code>
     * @return This builder for chaining.
     */
    public Builder clearForIdentity() {
      
      forIdentity_ = false;
      onChanged();
      return this;
    }

    private boolean missingOk_ ;
    /**
     * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
     * @return The missingOk.
     */
    @java.lang.Override
    public boolean getMissingOk() {
      return missingOk_;
    }
    /**
     * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
     * @param value The missingOk to set.
     * @return This builder for chaining.
     */
    public Builder setMissingOk(boolean value) {
      
      missingOk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMissingOk() {
      
      missingOk_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterSeqStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterSeqStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterSeqStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterSeqStmt>() {
    @java.lang.Override
    public AlterSeqStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlterSeqStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlterSeqStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterSeqStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlterSeqStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
