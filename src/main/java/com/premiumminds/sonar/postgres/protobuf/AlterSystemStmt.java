// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.AlterSystemStmt}
 */
public final class AlterSystemStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterSystemStmt)
    AlterSystemStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterSystemStmt.newBuilder() to construct.
  private AlterSystemStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterSystemStmt() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterSystemStmt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSystemStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSystemStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.Builder.class);
  }

  private int bitField0_;
  public static final int SETSTMT_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.VariableSetStmt setstmt_;
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
   * @return Whether the setstmt field is set.
   */
  @java.lang.Override
  public boolean hasSetstmt() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
   * @return The setstmt.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.VariableSetStmt getSetstmt() {
    return setstmt_ == null ? com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.getDefaultInstance() : setstmt_;
  }
  /**
   * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder getSetstmtOrBuilder() {
    return setstmt_ == null ? com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.getDefaultInstance() : setstmt_;
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
      output.writeMessage(1, getSetstmt());
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
        .computeMessageSize(1, getSetstmt());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt other = (com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt) obj;

    if (hasSetstmt() != other.hasSetstmt()) return false;
    if (hasSetstmt()) {
      if (!getSetstmt()
          .equals(other.getSetstmt())) return false;
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
    if (hasSetstmt()) {
      hash = (37 * hash) + SETSTMT_FIELD_NUMBER;
      hash = (53 * hash) + getSetstmt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterSystemStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterSystemStmt)
      com.premiumminds.sonar.postgres.protobuf.AlterSystemStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSystemStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSystemStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.class, com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.newBuilder()
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
        getSetstmtFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      setstmt_ = null;
      if (setstmtBuilder_ != null) {
        setstmtBuilder_.dispose();
        setstmtBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_AlterSystemStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt build() {
      com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt result = new com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.setstmt_ = setstmtBuilder_ == null
            ? setstmt_
            : setstmtBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt.getDefaultInstance()) return this;
      if (other.hasSetstmt()) {
        mergeSetstmt(other.getSetstmt());
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
                  getSetstmtFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.premiumminds.sonar.postgres.protobuf.VariableSetStmt setstmt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.VariableSetStmt, com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.Builder, com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder> setstmtBuilder_;
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     * @return Whether the setstmt field is set.
     */
    public boolean hasSetstmt() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     * @return The setstmt.
     */
    public com.premiumminds.sonar.postgres.protobuf.VariableSetStmt getSetstmt() {
      if (setstmtBuilder_ == null) {
        return setstmt_ == null ? com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.getDefaultInstance() : setstmt_;
      } else {
        return setstmtBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    public Builder setSetstmt(com.premiumminds.sonar.postgres.protobuf.VariableSetStmt value) {
      if (setstmtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        setstmt_ = value;
      } else {
        setstmtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    public Builder setSetstmt(
        com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.Builder builderForValue) {
      if (setstmtBuilder_ == null) {
        setstmt_ = builderForValue.build();
      } else {
        setstmtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    public Builder mergeSetstmt(com.premiumminds.sonar.postgres.protobuf.VariableSetStmt value) {
      if (setstmtBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          setstmt_ != null &&
          setstmt_ != com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.getDefaultInstance()) {
          getSetstmtBuilder().mergeFrom(value);
        } else {
          setstmt_ = value;
        }
      } else {
        setstmtBuilder_.mergeFrom(value);
      }
      if (setstmt_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    public Builder clearSetstmt() {
      bitField0_ = (bitField0_ & ~0x00000001);
      setstmt_ = null;
      if (setstmtBuilder_ != null) {
        setstmtBuilder_.dispose();
        setstmtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.Builder getSetstmtBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSetstmtFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder getSetstmtOrBuilder() {
      if (setstmtBuilder_ != null) {
        return setstmtBuilder_.getMessageOrBuilder();
      } else {
        return setstmt_ == null ?
            com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.getDefaultInstance() : setstmt_;
      }
    }
    /**
     * <code>.pg_query.VariableSetStmt setstmt = 1 [json_name = "setstmt"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.VariableSetStmt, com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.Builder, com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder> 
        getSetstmtFieldBuilder() {
      if (setstmtBuilder_ == null) {
        setstmtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.VariableSetStmt, com.premiumminds.sonar.postgres.protobuf.VariableSetStmt.Builder, com.premiumminds.sonar.postgres.protobuf.VariableSetStmtOrBuilder>(
                getSetstmt(),
                getParentForChildren(),
                isClean());
        setstmt_ = null;
      }
      return setstmtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterSystemStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterSystemStmt)
  private static final com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt();
  }

  public static com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterSystemStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterSystemStmt>() {
    @java.lang.Override
    public AlterSystemStmt parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlterSystemStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterSystemStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.AlterSystemStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

