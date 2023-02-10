// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.DropTableSpaceStmt}
 */
public final class DropTableSpaceStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.DropTableSpaceStmt)
    DropTableSpaceStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DropTableSpaceStmt.newBuilder() to construct.
  private DropTableSpaceStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DropTableSpaceStmt() {
    tablespacename_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DropTableSpaceStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropTableSpaceStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropTableSpaceStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.class, com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.Builder.class);
  }

  public static final int TABLESPACENAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tablespacename_ = "";
  /**
   * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
   * @return The tablespacename.
   */
  @java.lang.Override
  public java.lang.String getTablespacename() {
    java.lang.Object ref = tablespacename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tablespacename_ = s;
      return s;
    }
  }
  /**
   * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
   * @return The bytes for tablespacename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTablespacenameBytes() {
    java.lang.Object ref = tablespacename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tablespacename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MISSING_OK_FIELD_NUMBER = 2;
  private boolean missingOk_ = false;
  /**
   * <code>bool missing_ok = 2 [json_name = "missing_ok"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tablespacename_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tablespacename_);
    }
    if (missingOk_ != false) {
      output.writeBool(2, missingOk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tablespacename_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tablespacename_);
    }
    if (missingOk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, missingOk_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt other = (com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt) obj;

    if (!getTablespacename()
        .equals(other.getTablespacename())) return false;
    if (getMissingOk()
        != other.getMissingOk()) return false;
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
    hash = (37 * hash) + TABLESPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getTablespacename().hashCode();
    hash = (37 * hash) + MISSING_OK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMissingOk());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt prototype) {
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
   * Protobuf type {@code pg_query.DropTableSpaceStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.DropTableSpaceStmt)
      com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropTableSpaceStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropTableSpaceStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.class, com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.newBuilder()
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
      tablespacename_ = "";
      missingOk_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_DropTableSpaceStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt build() {
      com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt result = new com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tablespacename_ = tablespacename_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.missingOk_ = missingOk_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt.getDefaultInstance()) return this;
      if (!other.getTablespacename().isEmpty()) {
        tablespacename_ = other.tablespacename_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMissingOk() != false) {
        setMissingOk(other.getMissingOk());
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
              tablespacename_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              missingOk_ = input.readBool();
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

    private java.lang.Object tablespacename_ = "";
    /**
     * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
     * @return The tablespacename.
     */
    public java.lang.String getTablespacename() {
      java.lang.Object ref = tablespacename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tablespacename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
     * @return The bytes for tablespacename.
     */
    public com.google.protobuf.ByteString
        getTablespacenameBytes() {
      java.lang.Object ref = tablespacename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tablespacename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
     * @param value The tablespacename to set.
     * @return This builder for chaining.
     */
    public Builder setTablespacename(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tablespacename_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTablespacename() {
      tablespacename_ = getDefaultInstance().getTablespacename();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string tablespacename = 1 [json_name = "tablespacename"];</code>
     * @param value The bytes for tablespacename to set.
     * @return This builder for chaining.
     */
    public Builder setTablespacenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tablespacename_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean missingOk_ ;
    /**
     * <code>bool missing_ok = 2 [json_name = "missing_ok"];</code>
     * @return The missingOk.
     */
    @java.lang.Override
    public boolean getMissingOk() {
      return missingOk_;
    }
    /**
     * <code>bool missing_ok = 2 [json_name = "missing_ok"];</code>
     * @param value The missingOk to set.
     * @return This builder for chaining.
     */
    public Builder setMissingOk(boolean value) {
      
      missingOk_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool missing_ok = 2 [json_name = "missing_ok"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMissingOk() {
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:pg_query.DropTableSpaceStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.DropTableSpaceStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DropTableSpaceStmt>
      PARSER = new com.google.protobuf.AbstractParser<DropTableSpaceStmt>() {
    @java.lang.Override
    public DropTableSpaceStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<DropTableSpaceStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DropTableSpaceStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.DropTableSpaceStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

