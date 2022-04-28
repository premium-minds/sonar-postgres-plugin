// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.VacuumRelation}
 */
public final class VacuumRelation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.VacuumRelation)
    VacuumRelationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VacuumRelation.newBuilder() to construct.
  private VacuumRelation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VacuumRelation() {
    vaCols_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VacuumRelation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VacuumRelation(
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
            if (relation_ != null) {
              subBuilder = relation_.toBuilder();
            }
            relation_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.RangeVar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(relation_);
              relation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            oid_ = input.readUInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vaCols_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            vaCols_.add(
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
        vaCols_ = java.util.Collections.unmodifiableList(vaCols_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_VacuumRelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_VacuumRelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.VacuumRelation.class, com.premiumminds.sonar.postgres.protobuf.VacuumRelation.Builder.class);
  }

  public static final int RELATION_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.RangeVar relation_;
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return relation_ != null;
  }
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation() {
    return relation_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
  }
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder() {
    return getRelation();
  }

  public static final int OID_FIELD_NUMBER = 2;
  private int oid_;
  /**
   * <code>uint32 oid = 2 [json_name = "oid"];</code>
   * @return The oid.
   */
  @java.lang.Override
  public int getOid() {
    return oid_;
  }

  public static final int VA_COLS_FIELD_NUMBER = 3;
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> vaCols_;
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getVaColsList() {
    return vaCols_;
  }
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getVaColsOrBuilderList() {
    return vaCols_;
  }
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  @java.lang.Override
  public int getVaColsCount() {
    return vaCols_.size();
  }
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getVaCols(int index) {
    return vaCols_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getVaColsOrBuilder(
      int index) {
    return vaCols_.get(index);
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
    if (relation_ != null) {
      output.writeMessage(1, getRelation());
    }
    if (oid_ != 0) {
      output.writeUInt32(2, oid_);
    }
    for (int i = 0; i < vaCols_.size(); i++) {
      output.writeMessage(3, vaCols_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (relation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRelation());
    }
    if (oid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, oid_);
    }
    for (int i = 0; i < vaCols_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, vaCols_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.VacuumRelation)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.VacuumRelation other = (com.premiumminds.sonar.postgres.protobuf.VacuumRelation) obj;

    if (hasRelation() != other.hasRelation()) return false;
    if (hasRelation()) {
      if (!getRelation()
          .equals(other.getRelation())) return false;
    }
    if (getOid()
        != other.getOid()) return false;
    if (!getVaColsList()
        .equals(other.getVaColsList())) return false;
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
    if (hasRelation()) {
      hash = (37 * hash) + RELATION_FIELD_NUMBER;
      hash = (53 * hash) + getRelation().hashCode();
    }
    hash = (37 * hash) + OID_FIELD_NUMBER;
    hash = (53 * hash) + getOid();
    if (getVaColsCount() > 0) {
      hash = (37 * hash) + VA_COLS_FIELD_NUMBER;
      hash = (53 * hash) + getVaColsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.VacuumRelation prototype) {
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
   * Protobuf type {@code pg_query.VacuumRelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.VacuumRelation)
      com.premiumminds.sonar.postgres.protobuf.VacuumRelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_VacuumRelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_VacuumRelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.VacuumRelation.class, com.premiumminds.sonar.postgres.protobuf.VacuumRelation.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.VacuumRelation.newBuilder()
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
        getVaColsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (relationBuilder_ == null) {
        relation_ = null;
      } else {
        relation_ = null;
        relationBuilder_ = null;
      }
      oid_ = 0;

      if (vaColsBuilder_ == null) {
        vaCols_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        vaColsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_VacuumRelation_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.VacuumRelation getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.VacuumRelation.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.VacuumRelation build() {
      com.premiumminds.sonar.postgres.protobuf.VacuumRelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.VacuumRelation buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.VacuumRelation result = new com.premiumminds.sonar.postgres.protobuf.VacuumRelation(this);
      int from_bitField0_ = bitField0_;
      if (relationBuilder_ == null) {
        result.relation_ = relation_;
      } else {
        result.relation_ = relationBuilder_.build();
      }
      result.oid_ = oid_;
      if (vaColsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vaCols_ = java.util.Collections.unmodifiableList(vaCols_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vaCols_ = vaCols_;
      } else {
        result.vaCols_ = vaColsBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.VacuumRelation) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.VacuumRelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.VacuumRelation other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.VacuumRelation.getDefaultInstance()) return this;
      if (other.hasRelation()) {
        mergeRelation(other.getRelation());
      }
      if (other.getOid() != 0) {
        setOid(other.getOid());
      }
      if (vaColsBuilder_ == null) {
        if (!other.vaCols_.isEmpty()) {
          if (vaCols_.isEmpty()) {
            vaCols_ = other.vaCols_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVaColsIsMutable();
            vaCols_.addAll(other.vaCols_);
          }
          onChanged();
        }
      } else {
        if (!other.vaCols_.isEmpty()) {
          if (vaColsBuilder_.isEmpty()) {
            vaColsBuilder_.dispose();
            vaColsBuilder_ = null;
            vaCols_ = other.vaCols_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vaColsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVaColsFieldBuilder() : null;
          } else {
            vaColsBuilder_.addAllMessages(other.vaCols_);
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
      com.premiumminds.sonar.postgres.protobuf.VacuumRelation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.VacuumRelation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.premiumminds.sonar.postgres.protobuf.RangeVar relation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder> relationBuilder_;
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    public boolean hasRelation() {
      return relationBuilder_ != null || relation_ != null;
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     * @return The relation.
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVar getRelation() {
      if (relationBuilder_ == null) {
        return relation_ == null ? com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
      } else {
        return relationBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.premiumminds.sonar.postgres.protobuf.RangeVar value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relation_ = value;
        onChanged();
      } else {
        relationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder builderForValue) {
      if (relationBuilder_ == null) {
        relation_ = builderForValue.build();
        onChanged();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.premiumminds.sonar.postgres.protobuf.RangeVar value) {
      if (relationBuilder_ == null) {
        if (relation_ != null) {
          relation_ =
            com.premiumminds.sonar.postgres.protobuf.RangeVar.newBuilder(relation_).mergeFrom(value).buildPartial();
        } else {
          relation_ = value;
        }
        onChanged();
      } else {
        relationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      if (relationBuilder_ == null) {
        relation_ = null;
        onChanged();
      } else {
        relation_ = null;
        relationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder getRelationBuilder() {
      
      onChanged();
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder getRelationOrBuilder() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        return relation_ == null ?
            com.premiumminds.sonar.postgres.protobuf.RangeVar.getDefaultInstance() : relation_;
      }
    }
    /**
     * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.RangeVar, com.premiumminds.sonar.postgres.protobuf.RangeVar.Builder, com.premiumminds.sonar.postgres.protobuf.RangeVarOrBuilder>(
                getRelation(),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
    }

    private int oid_ ;
    /**
     * <code>uint32 oid = 2 [json_name = "oid"];</code>
     * @return The oid.
     */
    @java.lang.Override
    public int getOid() {
      return oid_;
    }
    /**
     * <code>uint32 oid = 2 [json_name = "oid"];</code>
     * @param value The oid to set.
     * @return This builder for chaining.
     */
    public Builder setOid(int value) {
      
      oid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 oid = 2 [json_name = "oid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOid() {
      
      oid_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> vaCols_ =
      java.util.Collections.emptyList();
    private void ensureVaColsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vaCols_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(vaCols_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> vaColsBuilder_;

    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getVaColsList() {
      if (vaColsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vaCols_);
      } else {
        return vaColsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public int getVaColsCount() {
      if (vaColsBuilder_ == null) {
        return vaCols_.size();
      } else {
        return vaColsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getVaCols(int index) {
      if (vaColsBuilder_ == null) {
        return vaCols_.get(index);
      } else {
        return vaColsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder setVaCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (vaColsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVaColsIsMutable();
        vaCols_.set(index, value);
        onChanged();
      } else {
        vaColsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder setVaCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (vaColsBuilder_ == null) {
        ensureVaColsIsMutable();
        vaCols_.set(index, builderForValue.build());
        onChanged();
      } else {
        vaColsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder addVaCols(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (vaColsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVaColsIsMutable();
        vaCols_.add(value);
        onChanged();
      } else {
        vaColsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder addVaCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (vaColsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVaColsIsMutable();
        vaCols_.add(index, value);
        onChanged();
      } else {
        vaColsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder addVaCols(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (vaColsBuilder_ == null) {
        ensureVaColsIsMutable();
        vaCols_.add(builderForValue.build());
        onChanged();
      } else {
        vaColsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder addVaCols(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (vaColsBuilder_ == null) {
        ensureVaColsIsMutable();
        vaCols_.add(index, builderForValue.build());
        onChanged();
      } else {
        vaColsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder addAllVaCols(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (vaColsBuilder_ == null) {
        ensureVaColsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vaCols_);
        onChanged();
      } else {
        vaColsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder clearVaCols() {
      if (vaColsBuilder_ == null) {
        vaCols_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vaColsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public Builder removeVaCols(int index) {
      if (vaColsBuilder_ == null) {
        ensureVaColsIsMutable();
        vaCols_.remove(index);
        onChanged();
      } else {
        vaColsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getVaColsBuilder(
        int index) {
      return getVaColsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getVaColsOrBuilder(
        int index) {
      if (vaColsBuilder_ == null) {
        return vaCols_.get(index);  } else {
        return vaColsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getVaColsOrBuilderList() {
      if (vaColsBuilder_ != null) {
        return vaColsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vaCols_);
      }
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addVaColsBuilder() {
      return getVaColsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addVaColsBuilder(
        int index) {
      return getVaColsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node va_cols = 3 [json_name = "va_cols"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getVaColsBuilderList() {
      return getVaColsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getVaColsFieldBuilder() {
      if (vaColsBuilder_ == null) {
        vaColsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                vaCols_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vaCols_ = null;
      }
      return vaColsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.VacuumRelation)
  }

  // @@protoc_insertion_point(class_scope:pg_query.VacuumRelation)
  private static final com.premiumminds.sonar.postgres.protobuf.VacuumRelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.VacuumRelation();
  }

  public static com.premiumminds.sonar.postgres.protobuf.VacuumRelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VacuumRelation>
      PARSER = new com.google.protobuf.AbstractParser<VacuumRelation>() {
    @java.lang.Override
    public VacuumRelation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VacuumRelation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VacuumRelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VacuumRelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.VacuumRelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
