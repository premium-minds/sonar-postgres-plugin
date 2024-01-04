// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.JsonOutput}
 */
public final class JsonOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.JsonOutput)
    JsonOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JsonOutput.newBuilder() to construct.
  private JsonOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JsonOutput() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JsonOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.JsonOutput.class, com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder.class);
  }

  public static final int TYPE_NAME_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.TypeName typeName_;
  /**
   * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
   * @return Whether the typeName field is set.
   */
  @java.lang.Override
  public boolean hasTypeName() {
    return typeName_ != null;
  }
  /**
   * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
   * @return The typeName.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeName getTypeName() {
    return typeName_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : typeName_;
  }
  /**
   * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getTypeNameOrBuilder() {
    return typeName_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : typeName_;
  }

  public static final int RETURNING_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.JsonReturning returning_;
  /**
   * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
   * @return Whether the returning field is set.
   */
  @java.lang.Override
  public boolean hasReturning() {
    return returning_ != null;
  }
  /**
   * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
   * @return The returning.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonReturning getReturning() {
    return returning_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonReturning.getDefaultInstance() : returning_;
  }
  /**
   * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonReturningOrBuilder getReturningOrBuilder() {
    return returning_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonReturning.getDefaultInstance() : returning_;
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
    if (typeName_ != null) {
      output.writeMessage(1, getTypeName());
    }
    if (returning_ != null) {
      output.writeMessage(2, getReturning());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeName_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTypeName());
    }
    if (returning_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReturning());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.JsonOutput)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.JsonOutput other = (com.premiumminds.sonar.postgres.protobuf.JsonOutput) obj;

    if (hasTypeName() != other.hasTypeName()) return false;
    if (hasTypeName()) {
      if (!getTypeName()
          .equals(other.getTypeName())) return false;
    }
    if (hasReturning() != other.hasReturning()) return false;
    if (hasReturning()) {
      if (!getReturning()
          .equals(other.getReturning())) return false;
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
    if (hasTypeName()) {
      hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTypeName().hashCode();
    }
    if (hasReturning()) {
      hash = (37 * hash) + RETURNING_FIELD_NUMBER;
      hash = (53 * hash) + getReturning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.JsonOutput prototype) {
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
   * Protobuf type {@code pg_query.JsonOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.JsonOutput)
      com.premiumminds.sonar.postgres.protobuf.JsonOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.JsonOutput.class, com.premiumminds.sonar.postgres.protobuf.JsonOutput.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.JsonOutput.newBuilder()
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
      typeName_ = null;
      if (typeNameBuilder_ != null) {
        typeNameBuilder_.dispose();
        typeNameBuilder_ = null;
      }
      returning_ = null;
      if (returningBuilder_ != null) {
        returningBuilder_.dispose();
        returningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_JsonOutput_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonOutput getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonOutput build() {
      com.premiumminds.sonar.postgres.protobuf.JsonOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.JsonOutput buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.JsonOutput result = new com.premiumminds.sonar.postgres.protobuf.JsonOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.JsonOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.typeName_ = typeNameBuilder_ == null
            ? typeName_
            : typeNameBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.returning_ = returningBuilder_ == null
            ? returning_
            : returningBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.JsonOutput) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.JsonOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.JsonOutput other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.JsonOutput.getDefaultInstance()) return this;
      if (other.hasTypeName()) {
        mergeTypeName(other.getTypeName());
      }
      if (other.hasReturning()) {
        mergeReturning(other.getReturning());
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
                  getTypeNameFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getReturningFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.premiumminds.sonar.postgres.protobuf.TypeName typeName_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder> typeNameBuilder_;
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     * @return Whether the typeName field is set.
     */
    public boolean hasTypeName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     * @return The typeName.
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeName getTypeName() {
      if (typeNameBuilder_ == null) {
        return typeName_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : typeName_;
      } else {
        return typeNameBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder setTypeName(com.premiumminds.sonar.postgres.protobuf.TypeName value) {
      if (typeNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeName_ = value;
      } else {
        typeNameBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder setTypeName(
        com.premiumminds.sonar.postgres.protobuf.TypeName.Builder builderForValue) {
      if (typeNameBuilder_ == null) {
        typeName_ = builderForValue.build();
      } else {
        typeNameBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder mergeTypeName(com.premiumminds.sonar.postgres.protobuf.TypeName value) {
      if (typeNameBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          typeName_ != null &&
          typeName_ != com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance()) {
          getTypeNameBuilder().mergeFrom(value);
        } else {
          typeName_ = value;
        }
      } else {
        typeNameBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    public Builder clearTypeName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      typeName_ = null;
      if (typeNameBuilder_ != null) {
        typeNameBuilder_.dispose();
        typeNameBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeName.Builder getTypeNameBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTypeNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getTypeNameOrBuilder() {
      if (typeNameBuilder_ != null) {
        return typeNameBuilder_.getMessageOrBuilder();
      } else {
        return typeName_ == null ?
            com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : typeName_;
      }
    }
    /**
     * <code>.pg_query.TypeName type_name = 1 [json_name = "typeName"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder> 
        getTypeNameFieldBuilder() {
      if (typeNameBuilder_ == null) {
        typeNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder>(
                getTypeName(),
                getParentForChildren(),
                isClean());
        typeName_ = null;
      }
      return typeNameBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.JsonReturning returning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonReturning, com.premiumminds.sonar.postgres.protobuf.JsonReturning.Builder, com.premiumminds.sonar.postgres.protobuf.JsonReturningOrBuilder> returningBuilder_;
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     * @return Whether the returning field is set.
     */
    public boolean hasReturning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     * @return The returning.
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonReturning getReturning() {
      if (returningBuilder_ == null) {
        return returning_ == null ? com.premiumminds.sonar.postgres.protobuf.JsonReturning.getDefaultInstance() : returning_;
      } else {
        return returningBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    public Builder setReturning(com.premiumminds.sonar.postgres.protobuf.JsonReturning value) {
      if (returningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returning_ = value;
      } else {
        returningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    public Builder setReturning(
        com.premiumminds.sonar.postgres.protobuf.JsonReturning.Builder builderForValue) {
      if (returningBuilder_ == null) {
        returning_ = builderForValue.build();
      } else {
        returningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    public Builder mergeReturning(com.premiumminds.sonar.postgres.protobuf.JsonReturning value) {
      if (returningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          returning_ != null &&
          returning_ != com.premiumminds.sonar.postgres.protobuf.JsonReturning.getDefaultInstance()) {
          getReturningBuilder().mergeFrom(value);
        } else {
          returning_ = value;
        }
      } else {
        returningBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    public Builder clearReturning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      returning_ = null;
      if (returningBuilder_ != null) {
        returningBuilder_.dispose();
        returningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonReturning.Builder getReturningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReturningFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.JsonReturningOrBuilder getReturningOrBuilder() {
      if (returningBuilder_ != null) {
        return returningBuilder_.getMessageOrBuilder();
      } else {
        return returning_ == null ?
            com.premiumminds.sonar.postgres.protobuf.JsonReturning.getDefaultInstance() : returning_;
      }
    }
    /**
     * <code>.pg_query.JsonReturning returning = 2 [json_name = "returning"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.JsonReturning, com.premiumminds.sonar.postgres.protobuf.JsonReturning.Builder, com.premiumminds.sonar.postgres.protobuf.JsonReturningOrBuilder> 
        getReturningFieldBuilder() {
      if (returningBuilder_ == null) {
        returningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.JsonReturning, com.premiumminds.sonar.postgres.protobuf.JsonReturning.Builder, com.premiumminds.sonar.postgres.protobuf.JsonReturningOrBuilder>(
                getReturning(),
                getParentForChildren(),
                isClean());
        returning_ = null;
      }
      return returningBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.JsonOutput)
  }

  // @@protoc_insertion_point(class_scope:pg_query.JsonOutput)
  private static final com.premiumminds.sonar.postgres.protobuf.JsonOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.JsonOutput();
  }

  public static com.premiumminds.sonar.postgres.protobuf.JsonOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JsonOutput>
      PARSER = new com.google.protobuf.AbstractParser<JsonOutput>() {
    @java.lang.Override
    public JsonOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<JsonOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JsonOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.JsonOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

