// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.RangeSubselect}
 */
public final class RangeSubselect extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.RangeSubselect)
    RangeSubselectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RangeSubselect.newBuilder() to construct.
  private RangeSubselect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RangeSubselect() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RangeSubselect();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RangeSubselect_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RangeSubselect_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.RangeSubselect.class, com.premiumminds.sonar.postgres.protobuf.RangeSubselect.Builder.class);
  }

  public static final int LATERAL_FIELD_NUMBER = 1;
  private boolean lateral_ = false;
  /**
   * <code>bool lateral = 1 [json_name = "lateral"];</code>
   * @return The lateral.
   */
  @java.lang.Override
  public boolean getLateral() {
    return lateral_;
  }

  public static final int SUBQUERY_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.Node subquery_;
  /**
   * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
   * @return Whether the subquery field is set.
   */
  @java.lang.Override
  public boolean hasSubquery() {
    return subquery_ != null;
  }
  /**
   * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
   * @return The subquery.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getSubquery() {
    return subquery_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : subquery_;
  }
  /**
   * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSubqueryOrBuilder() {
    return subquery_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : subquery_;
  }

  public static final int ALIAS_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.postgres.protobuf.Alias alias_;
  /**
   * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
   * @return Whether the alias field is set.
   */
  @java.lang.Override
  public boolean hasAlias() {
    return alias_ != null;
  }
  /**
   * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
   * @return The alias.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Alias getAlias() {
    return alias_ == null ? com.premiumminds.sonar.postgres.protobuf.Alias.getDefaultInstance() : alias_;
  }
  /**
   * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getAliasOrBuilder() {
    return alias_ == null ? com.premiumminds.sonar.postgres.protobuf.Alias.getDefaultInstance() : alias_;
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
    if (lateral_ != false) {
      output.writeBool(1, lateral_);
    }
    if (subquery_ != null) {
      output.writeMessage(2, getSubquery());
    }
    if (alias_ != null) {
      output.writeMessage(3, getAlias());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lateral_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, lateral_);
    }
    if (subquery_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubquery());
    }
    if (alias_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAlias());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.RangeSubselect)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.RangeSubselect other = (com.premiumminds.sonar.postgres.protobuf.RangeSubselect) obj;

    if (getLateral()
        != other.getLateral()) return false;
    if (hasSubquery() != other.hasSubquery()) return false;
    if (hasSubquery()) {
      if (!getSubquery()
          .equals(other.getSubquery())) return false;
    }
    if (hasAlias() != other.hasAlias()) return false;
    if (hasAlias()) {
      if (!getAlias()
          .equals(other.getAlias())) return false;
    }
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
    hash = (37 * hash) + LATERAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLateral());
    if (hasSubquery()) {
      hash = (37 * hash) + SUBQUERY_FIELD_NUMBER;
      hash = (53 * hash) + getSubquery().hashCode();
    }
    if (hasAlias()) {
      hash = (37 * hash) + ALIAS_FIELD_NUMBER;
      hash = (53 * hash) + getAlias().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.RangeSubselect prototype) {
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
   * Protobuf type {@code pg_query.RangeSubselect}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.RangeSubselect)
      com.premiumminds.sonar.postgres.protobuf.RangeSubselectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RangeSubselect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RangeSubselect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.RangeSubselect.class, com.premiumminds.sonar.postgres.protobuf.RangeSubselect.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.RangeSubselect.newBuilder()
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
      lateral_ = false;
      subquery_ = null;
      if (subqueryBuilder_ != null) {
        subqueryBuilder_.dispose();
        subqueryBuilder_ = null;
      }
      alias_ = null;
      if (aliasBuilder_ != null) {
        aliasBuilder_.dispose();
        aliasBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RangeSubselect_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RangeSubselect getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.RangeSubselect.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RangeSubselect build() {
      com.premiumminds.sonar.postgres.protobuf.RangeSubselect result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RangeSubselect buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.RangeSubselect result = new com.premiumminds.sonar.postgres.protobuf.RangeSubselect(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.RangeSubselect result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lateral_ = lateral_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subquery_ = subqueryBuilder_ == null
            ? subquery_
            : subqueryBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.alias_ = aliasBuilder_ == null
            ? alias_
            : aliasBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.RangeSubselect) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.RangeSubselect)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.RangeSubselect other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.RangeSubselect.getDefaultInstance()) return this;
      if (other.getLateral() != false) {
        setLateral(other.getLateral());
      }
      if (other.hasSubquery()) {
        mergeSubquery(other.getSubquery());
      }
      if (other.hasAlias()) {
        mergeAlias(other.getAlias());
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
            case 8: {
              lateral_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getSubqueryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAliasFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private boolean lateral_ ;
    /**
     * <code>bool lateral = 1 [json_name = "lateral"];</code>
     * @return The lateral.
     */
    @java.lang.Override
    public boolean getLateral() {
      return lateral_;
    }
    /**
     * <code>bool lateral = 1 [json_name = "lateral"];</code>
     * @param value The lateral to set.
     * @return This builder for chaining.
     */
    public Builder setLateral(boolean value) {
      
      lateral_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool lateral = 1 [json_name = "lateral"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLateral() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lateral_ = false;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node subquery_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> subqueryBuilder_;
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     * @return Whether the subquery field is set.
     */
    public boolean hasSubquery() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     * @return The subquery.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getSubquery() {
      if (subqueryBuilder_ == null) {
        return subquery_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : subquery_;
      } else {
        return subqueryBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    public Builder setSubquery(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (subqueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subquery_ = value;
      } else {
        subqueryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    public Builder setSubquery(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (subqueryBuilder_ == null) {
        subquery_ = builderForValue.build();
      } else {
        subqueryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    public Builder mergeSubquery(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (subqueryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          subquery_ != null &&
          subquery_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getSubqueryBuilder().mergeFrom(value);
        } else {
          subquery_ = value;
        }
      } else {
        subqueryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    public Builder clearSubquery() {
      bitField0_ = (bitField0_ & ~0x00000002);
      subquery_ = null;
      if (subqueryBuilder_ != null) {
        subqueryBuilder_.dispose();
        subqueryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getSubqueryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSubqueryFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getSubqueryOrBuilder() {
      if (subqueryBuilder_ != null) {
        return subqueryBuilder_.getMessageOrBuilder();
      } else {
        return subquery_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : subquery_;
      }
    }
    /**
     * <code>.pg_query.Node subquery = 2 [json_name = "subquery"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getSubqueryFieldBuilder() {
      if (subqueryBuilder_ == null) {
        subqueryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getSubquery(),
                getParentForChildren(),
                isClean());
        subquery_ = null;
      }
      return subqueryBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.Alias alias_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Alias, com.premiumminds.sonar.postgres.protobuf.Alias.Builder, com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder> aliasBuilder_;
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     * @return Whether the alias field is set.
     */
    public boolean hasAlias() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     * @return The alias.
     */
    public com.premiumminds.sonar.postgres.protobuf.Alias getAlias() {
      if (aliasBuilder_ == null) {
        return alias_ == null ? com.premiumminds.sonar.postgres.protobuf.Alias.getDefaultInstance() : alias_;
      } else {
        return aliasBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    public Builder setAlias(com.premiumminds.sonar.postgres.protobuf.Alias value) {
      if (aliasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        alias_ = value;
      } else {
        aliasBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    public Builder setAlias(
        com.premiumminds.sonar.postgres.protobuf.Alias.Builder builderForValue) {
      if (aliasBuilder_ == null) {
        alias_ = builderForValue.build();
      } else {
        aliasBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    public Builder mergeAlias(com.premiumminds.sonar.postgres.protobuf.Alias value) {
      if (aliasBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          alias_ != null &&
          alias_ != com.premiumminds.sonar.postgres.protobuf.Alias.getDefaultInstance()) {
          getAliasBuilder().mergeFrom(value);
        } else {
          alias_ = value;
        }
      } else {
        aliasBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    public Builder clearAlias() {
      bitField0_ = (bitField0_ & ~0x00000004);
      alias_ = null;
      if (aliasBuilder_ != null) {
        aliasBuilder_.dispose();
        aliasBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Alias.Builder getAliasBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAliasFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder getAliasOrBuilder() {
      if (aliasBuilder_ != null) {
        return aliasBuilder_.getMessageOrBuilder();
      } else {
        return alias_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Alias.getDefaultInstance() : alias_;
      }
    }
    /**
     * <code>.pg_query.Alias alias = 3 [json_name = "alias"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Alias, com.premiumminds.sonar.postgres.protobuf.Alias.Builder, com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder> 
        getAliasFieldBuilder() {
      if (aliasBuilder_ == null) {
        aliasBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Alias, com.premiumminds.sonar.postgres.protobuf.Alias.Builder, com.premiumminds.sonar.postgres.protobuf.AliasOrBuilder>(
                getAlias(),
                getParentForChildren(),
                isClean());
        alias_ = null;
      }
      return aliasBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.RangeSubselect)
  }

  // @@protoc_insertion_point(class_scope:pg_query.RangeSubselect)
  private static final com.premiumminds.sonar.postgres.protobuf.RangeSubselect DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.RangeSubselect();
  }

  public static com.premiumminds.sonar.postgres.protobuf.RangeSubselect getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangeSubselect>
      PARSER = new com.google.protobuf.AbstractParser<RangeSubselect>() {
    @java.lang.Override
    public RangeSubselect parsePartialFrom(
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

  public static com.google.protobuf.Parser<RangeSubselect> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangeSubselect> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RangeSubselect getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

