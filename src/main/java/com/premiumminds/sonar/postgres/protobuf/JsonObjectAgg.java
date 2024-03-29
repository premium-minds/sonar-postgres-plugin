// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.JsonObjectAgg}
 */
public final class JsonObjectAgg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.JsonObjectAgg)
    JsonObjectAggOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JsonObjectAgg.newBuilder() to construct.
  private JsonObjectAgg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JsonObjectAgg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JsonObjectAgg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonObjectAgg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonObjectAgg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.class, com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.Builder.class);
  }

  private int bitField0_;
  public static final int CONSTRUCTOR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor constructor_;
  /**
   * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
   * @return Whether the constructor field is set.
   */
  @java.lang.Override
  public boolean hasConstructor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
   * @return The constructor.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor getConstructor() {
    return constructor_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.getDefaultInstance() : constructor_;
  }
  /**
   * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonAggConstructorOrBuilder getConstructorOrBuilder() {
    return constructor_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.getDefaultInstance() : constructor_;
  }

  public static final int ARG_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.JsonKeyValue arg_;
  /**
   * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  @java.lang.Override
  public boolean hasArg() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
   * @return The arg.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonKeyValue getArg() {
    return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.getDefaultInstance() : arg_;
  }
  /**
   * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonKeyValueOrBuilder getArgOrBuilder() {
    return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.getDefaultInstance() : arg_;
  }

  public static final int ABSENT_ON_NULL_FIELD_NUMBER = 3;
  private boolean absentOnNull_ = false;
  /**
   * <code>bool absent_on_null = 3 [json_name = "absent_on_null"];</code>
   * @return The absentOnNull.
   */
  @java.lang.Override
  public boolean getAbsentOnNull() {
    return absentOnNull_;
  }

  public static final int UNIQUE_FIELD_NUMBER = 4;
  private boolean unique_ = false;
  /**
   * <code>bool unique = 4 [json_name = "unique"];</code>
   * @return The unique.
   */
  @java.lang.Override
  public boolean getUnique() {
    return unique_;
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
      output.writeMessage(1, getConstructor());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getArg());
    }
    if (absentOnNull_ != false) {
      output.writeBool(3, absentOnNull_);
    }
    if (unique_ != false) {
      output.writeBool(4, unique_);
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
        .computeMessageSize(1, getConstructor());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getArg());
    }
    if (absentOnNull_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, absentOnNull_);
    }
    if (unique_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, unique_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg other = (com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg) obj;

    if (hasConstructor() != other.hasConstructor()) return false;
    if (hasConstructor()) {
      if (!getConstructor()
          .equals(other.getConstructor())) return false;
    }
    if (hasArg() != other.hasArg()) return false;
    if (hasArg()) {
      if (!getArg()
          .equals(other.getArg())) return false;
    }
    if (getAbsentOnNull()
        != other.getAbsentOnNull()) return false;
    if (getUnique()
        != other.getUnique()) return false;
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
    if (hasConstructor()) {
      hash = (37 * hash) + CONSTRUCTOR_FIELD_NUMBER;
      hash = (53 * hash) + getConstructor().hashCode();
    }
    if (hasArg()) {
      hash = (37 * hash) + ARG_FIELD_NUMBER;
      hash = (53 * hash) + getArg().hashCode();
    }
    hash = (37 * hash) + ABSENT_ON_NULL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAbsentOnNull());
    hash = (37 * hash) + UNIQUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUnique());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg prototype) {
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
   * Protobuf type {@code pg_query.JsonObjectAgg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.JsonObjectAgg)
      com.premiumminds.sonar.postgres.protobuf.JsonObjectAggOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonObjectAgg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonObjectAgg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.class, com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.newBuilder()
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
        getConstructorFieldBuilder();
        getArgFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      constructor_ = null;
      if (constructorBuilder_ != null) {
        constructorBuilder_.dispose();
        constructorBuilder_ = null;
      }
      arg_ = null;
      if (argBuilder_ != null) {
        argBuilder_.dispose();
        argBuilder_ = null;
      }
      absentOnNull_ = false;
      unique_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonObjectAgg_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg build() {
      com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg result = new com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.constructor_ = constructorBuilder_ == null
            ? constructor_
            : constructorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.arg_ = argBuilder_ == null
            ? arg_
            : argBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.absentOnNull_ = absentOnNull_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.unique_ = unique_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg.getDefaultInstance()) return this;
      if (other.hasConstructor()) {
        mergeConstructor(other.getConstructor());
      }
      if (other.hasArg()) {
        mergeArg(other.getArg());
      }
      if (other.getAbsentOnNull() != false) {
        setAbsentOnNull(other.getAbsentOnNull());
      }
      if (other.getUnique() != false) {
        setUnique(other.getUnique());
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
                  getConstructorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getArgFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              absentOnNull_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              unique_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor constructor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor, com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.Builder, com.premiumminds.sonar.postgres.protobuf.JsonAggConstructorOrBuilder> constructorBuilder_;
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     * @return Whether the constructor field is set.
     */
    public boolean hasConstructor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     * @return The constructor.
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor getConstructor() {
      if (constructorBuilder_ == null) {
        return constructor_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.getDefaultInstance() : constructor_;
      } else {
        return constructorBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    public Builder setConstructor(com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor value) {
      if (constructorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        constructor_ = value;
      } else {
        constructorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    public Builder setConstructor(
        com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.Builder builderForValue) {
      if (constructorBuilder_ == null) {
        constructor_ = builderForValue.build();
      } else {
        constructorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    public Builder mergeConstructor(com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor value) {
      if (constructorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          constructor_ != null &&
          constructor_ != com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.getDefaultInstance()) {
          getConstructorBuilder().mergeFrom(value);
        } else {
          constructor_ = value;
        }
      } else {
        constructorBuilder_.mergeFrom(value);
      }
      if (constructor_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    public Builder clearConstructor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      constructor_ = null;
      if (constructorBuilder_ != null) {
        constructorBuilder_.dispose();
        constructorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.Builder getConstructorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConstructorFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonAggConstructorOrBuilder getConstructorOrBuilder() {
      if (constructorBuilder_ != null) {
        return constructorBuilder_.getMessageOrBuilder();
      } else {
        return constructor_ == null ?
            com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.getDefaultInstance() : constructor_;
      }
    }
    /**
     * <code>.pg_query.JsonAggConstructor constructor = 1 [json_name = "constructor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor, com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.Builder, com.premiumminds.sonar.postgres.protobuf.JsonAggConstructorOrBuilder> 
        getConstructorFieldBuilder() {
      if (constructorBuilder_ == null) {
        constructorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor, com.premiumminds.sonar.postgres.protobuf.JsonAggConstructor.Builder, com.premiumminds.sonar.postgres.protobuf.JsonAggConstructorOrBuilder>(
                getConstructor(),
                getParentForChildren(),
                isClean());
        constructor_ = null;
      }
      return constructorBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.JsonKeyValue arg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonKeyValue, com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.Builder, com.premiumminds.sonar.postgres.protobuf.JsonKeyValueOrBuilder> argBuilder_;
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     * @return Whether the arg field is set.
     */
    public boolean hasArg() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     * @return The arg.
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonKeyValue getArg() {
      if (argBuilder_ == null) {
        return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.getDefaultInstance() : arg_;
      } else {
        return argBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    public Builder setArg(com.premiumminds.sonar.postgres.protobuf.JsonKeyValue value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arg_ = value;
      } else {
        argBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    public Builder setArg(
        com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.Builder builderForValue) {
      if (argBuilder_ == null) {
        arg_ = builderForValue.build();
      } else {
        argBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    public Builder mergeArg(com.premiumminds.sonar.postgres.protobuf.JsonKeyValue value) {
      if (argBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          arg_ != null &&
          arg_ != com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.getDefaultInstance()) {
          getArgBuilder().mergeFrom(value);
        } else {
          arg_ = value;
        }
      } else {
        argBuilder_.mergeFrom(value);
      }
      if (arg_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    public Builder clearArg() {
      bitField0_ = (bitField0_ & ~0x00000002);
      arg_ = null;
      if (argBuilder_ != null) {
        argBuilder_.dispose();
        argBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.Builder getArgBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getArgFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonKeyValueOrBuilder getArgOrBuilder() {
      if (argBuilder_ != null) {
        return argBuilder_.getMessageOrBuilder();
      } else {
        return arg_ == null ?
            com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.getDefaultInstance() : arg_;
      }
    }
    /**
     * <code>.pg_query.JsonKeyValue arg = 2 [json_name = "arg"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonKeyValue, com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.Builder, com.premiumminds.sonar.postgres.protobuf.JsonKeyValueOrBuilder> 
        getArgFieldBuilder() {
      if (argBuilder_ == null) {
        argBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.JsonKeyValue, com.premiumminds.sonar.postgres.protobuf.JsonKeyValue.Builder, com.premiumminds.sonar.postgres.protobuf.JsonKeyValueOrBuilder>(
                getArg(),
                getParentForChildren(),
                isClean());
        arg_ = null;
      }
      return argBuilder_;
    }

    private boolean absentOnNull_ ;
    /**
     * <code>bool absent_on_null = 3 [json_name = "absent_on_null"];</code>
     * @return The absentOnNull.
     */
    @java.lang.Override
    public boolean getAbsentOnNull() {
      return absentOnNull_;
    }
    /**
     * <code>bool absent_on_null = 3 [json_name = "absent_on_null"];</code>
     * @param value The absentOnNull to set.
     * @return This builder for chaining.
     */
    public Builder setAbsentOnNull(boolean value) {

      absentOnNull_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool absent_on_null = 3 [json_name = "absent_on_null"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAbsentOnNull() {
      bitField0_ = (bitField0_ & ~0x00000004);
      absentOnNull_ = false;
      onChanged();
      return this;
    }

    private boolean unique_ ;
    /**
     * <code>bool unique = 4 [json_name = "unique"];</code>
     * @return The unique.
     */
    @java.lang.Override
    public boolean getUnique() {
      return unique_;
    }
    /**
     * <code>bool unique = 4 [json_name = "unique"];</code>
     * @param value The unique to set.
     * @return This builder for chaining.
     */
    public Builder setUnique(boolean value) {

      unique_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool unique = 4 [json_name = "unique"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnique() {
      bitField0_ = (bitField0_ & ~0x00000008);
      unique_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.JsonObjectAgg)
  }

  // @@protoc_insertion_point(class_scope:pg_query.JsonObjectAgg)
  private static final com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg();
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JsonObjectAgg>
      PARSER = new com.google.protobuf.AbstractParser<JsonObjectAgg>() {
    @java.lang.Override
    public JsonObjectAgg parsePartialFrom(
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

  public static com.google.protobuf.Parser<JsonObjectAgg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JsonObjectAgg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonObjectAgg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

