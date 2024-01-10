// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.SortGroupClause}
 */
public final class SortGroupClause extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.SortGroupClause)
    SortGroupClauseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SortGroupClause.newBuilder() to construct.
  private SortGroupClause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SortGroupClause() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SortGroupClause();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SortGroupClause_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SortGroupClause_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.SortGroupClause.class, com.premiumminds.sonar.postgres.protobuf.SortGroupClause.Builder.class);
  }

  public static final int TLE_SORT_GROUP_REF_FIELD_NUMBER = 1;
  private int tleSortGroupRef_ = 0;
  /**
   * <code>uint32 tle_sort_group_ref = 1 [json_name = "tleSortGroupRef"];</code>
   * @return The tleSortGroupRef.
   */
  @java.lang.Override
  public int getTleSortGroupRef() {
    return tleSortGroupRef_;
  }

  public static final int EQOP_FIELD_NUMBER = 2;
  private int eqop_ = 0;
  /**
   * <code>uint32 eqop = 2 [json_name = "eqop"];</code>
   * @return The eqop.
   */
  @java.lang.Override
  public int getEqop() {
    return eqop_;
  }

  public static final int SORTOP_FIELD_NUMBER = 3;
  private int sortop_ = 0;
  /**
   * <code>uint32 sortop = 3 [json_name = "sortop"];</code>
   * @return The sortop.
   */
  @java.lang.Override
  public int getSortop() {
    return sortop_;
  }

  public static final int NULLS_FIRST_FIELD_NUMBER = 4;
  private boolean nullsFirst_ = false;
  /**
   * <code>bool nulls_first = 4 [json_name = "nulls_first"];</code>
   * @return The nullsFirst.
   */
  @java.lang.Override
  public boolean getNullsFirst() {
    return nullsFirst_;
  }

  public static final int HASHABLE_FIELD_NUMBER = 5;
  private boolean hashable_ = false;
  /**
   * <code>bool hashable = 5 [json_name = "hashable"];</code>
   * @return The hashable.
   */
  @java.lang.Override
  public boolean getHashable() {
    return hashable_;
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
    if (tleSortGroupRef_ != 0) {
      output.writeUInt32(1, tleSortGroupRef_);
    }
    if (eqop_ != 0) {
      output.writeUInt32(2, eqop_);
    }
    if (sortop_ != 0) {
      output.writeUInt32(3, sortop_);
    }
    if (nullsFirst_ != false) {
      output.writeBool(4, nullsFirst_);
    }
    if (hashable_ != false) {
      output.writeBool(5, hashable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tleSortGroupRef_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, tleSortGroupRef_);
    }
    if (eqop_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, eqop_);
    }
    if (sortop_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, sortop_);
    }
    if (nullsFirst_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, nullsFirst_);
    }
    if (hashable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hashable_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.SortGroupClause)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.SortGroupClause other = (com.premiumminds.sonar.postgres.protobuf.SortGroupClause) obj;

    if (getTleSortGroupRef()
        != other.getTleSortGroupRef()) return false;
    if (getEqop()
        != other.getEqop()) return false;
    if (getSortop()
        != other.getSortop()) return false;
    if (getNullsFirst()
        != other.getNullsFirst()) return false;
    if (getHashable()
        != other.getHashable()) return false;
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
    hash = (37 * hash) + TLE_SORT_GROUP_REF_FIELD_NUMBER;
    hash = (53 * hash) + getTleSortGroupRef();
    hash = (37 * hash) + EQOP_FIELD_NUMBER;
    hash = (53 * hash) + getEqop();
    hash = (37 * hash) + SORTOP_FIELD_NUMBER;
    hash = (53 * hash) + getSortop();
    hash = (37 * hash) + NULLS_FIRST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullsFirst());
    hash = (37 * hash) + HASHABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHashable());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.SortGroupClause prototype) {
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
   * Protobuf type {@code pg_query.SortGroupClause}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.SortGroupClause)
      com.premiumminds.sonar.postgres.protobuf.SortGroupClauseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SortGroupClause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SortGroupClause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.SortGroupClause.class, com.premiumminds.sonar.postgres.protobuf.SortGroupClause.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.SortGroupClause.newBuilder()
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
      tleSortGroupRef_ = 0;
      eqop_ = 0;
      sortop_ = 0;
      nullsFirst_ = false;
      hashable_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_SortGroupClause_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SortGroupClause getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.SortGroupClause.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SortGroupClause build() {
      com.premiumminds.sonar.postgres.protobuf.SortGroupClause result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.SortGroupClause buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.SortGroupClause result = new com.premiumminds.sonar.postgres.protobuf.SortGroupClause(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.SortGroupClause result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tleSortGroupRef_ = tleSortGroupRef_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eqop_ = eqop_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sortop_ = sortop_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.nullsFirst_ = nullsFirst_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.hashable_ = hashable_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.SortGroupClause) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.SortGroupClause)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.SortGroupClause other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.SortGroupClause.getDefaultInstance()) return this;
      if (other.getTleSortGroupRef() != 0) {
        setTleSortGroupRef(other.getTleSortGroupRef());
      }
      if (other.getEqop() != 0) {
        setEqop(other.getEqop());
      }
      if (other.getSortop() != 0) {
        setSortop(other.getSortop());
      }
      if (other.getNullsFirst() != false) {
        setNullsFirst(other.getNullsFirst());
      }
      if (other.getHashable() != false) {
        setHashable(other.getHashable());
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
              tleSortGroupRef_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              eqop_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              sortop_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              nullsFirst_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              hashable_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private int tleSortGroupRef_ ;
    /**
     * <code>uint32 tle_sort_group_ref = 1 [json_name = "tleSortGroupRef"];</code>
     * @return The tleSortGroupRef.
     */
    @java.lang.Override
    public int getTleSortGroupRef() {
      return tleSortGroupRef_;
    }
    /**
     * <code>uint32 tle_sort_group_ref = 1 [json_name = "tleSortGroupRef"];</code>
     * @param value The tleSortGroupRef to set.
     * @return This builder for chaining.
     */
    public Builder setTleSortGroupRef(int value) {

      tleSortGroupRef_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 tle_sort_group_ref = 1 [json_name = "tleSortGroupRef"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTleSortGroupRef() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tleSortGroupRef_ = 0;
      onChanged();
      return this;
    }

    private int eqop_ ;
    /**
     * <code>uint32 eqop = 2 [json_name = "eqop"];</code>
     * @return The eqop.
     */
    @java.lang.Override
    public int getEqop() {
      return eqop_;
    }
    /**
     * <code>uint32 eqop = 2 [json_name = "eqop"];</code>
     * @param value The eqop to set.
     * @return This builder for chaining.
     */
    public Builder setEqop(int value) {

      eqop_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 eqop = 2 [json_name = "eqop"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEqop() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eqop_ = 0;
      onChanged();
      return this;
    }

    private int sortop_ ;
    /**
     * <code>uint32 sortop = 3 [json_name = "sortop"];</code>
     * @return The sortop.
     */
    @java.lang.Override
    public int getSortop() {
      return sortop_;
    }
    /**
     * <code>uint32 sortop = 3 [json_name = "sortop"];</code>
     * @param value The sortop to set.
     * @return This builder for chaining.
     */
    public Builder setSortop(int value) {

      sortop_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 sortop = 3 [json_name = "sortop"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSortop() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sortop_ = 0;
      onChanged();
      return this;
    }

    private boolean nullsFirst_ ;
    /**
     * <code>bool nulls_first = 4 [json_name = "nulls_first"];</code>
     * @return The nullsFirst.
     */
    @java.lang.Override
    public boolean getNullsFirst() {
      return nullsFirst_;
    }
    /**
     * <code>bool nulls_first = 4 [json_name = "nulls_first"];</code>
     * @param value The nullsFirst to set.
     * @return This builder for chaining.
     */
    public Builder setNullsFirst(boolean value) {

      nullsFirst_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool nulls_first = 4 [json_name = "nulls_first"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNullsFirst() {
      bitField0_ = (bitField0_ & ~0x00000008);
      nullsFirst_ = false;
      onChanged();
      return this;
    }

    private boolean hashable_ ;
    /**
     * <code>bool hashable = 5 [json_name = "hashable"];</code>
     * @return The hashable.
     */
    @java.lang.Override
    public boolean getHashable() {
      return hashable_;
    }
    /**
     * <code>bool hashable = 5 [json_name = "hashable"];</code>
     * @param value The hashable to set.
     * @return This builder for chaining.
     */
    public Builder setHashable(boolean value) {

      hashable_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool hashable = 5 [json_name = "hashable"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHashable() {
      bitField0_ = (bitField0_ & ~0x00000010);
      hashable_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.SortGroupClause)
  }

  // @@protoc_insertion_point(class_scope:pg_query.SortGroupClause)
  private static final com.premiumminds.sonar.postgres.protobuf.SortGroupClause DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.SortGroupClause();
  }

  public static com.premiumminds.sonar.postgres.protobuf.SortGroupClause getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SortGroupClause>
      PARSER = new com.google.protobuf.AbstractParser<SortGroupClause>() {
    @java.lang.Override
    public SortGroupClause parsePartialFrom(
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

  public static com.google.protobuf.Parser<SortGroupClause> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SortGroupClause> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.SortGroupClause getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

