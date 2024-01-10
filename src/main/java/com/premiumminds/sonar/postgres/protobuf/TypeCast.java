// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.TypeCast}
 */
public final class TypeCast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.TypeCast)
    TypeCastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TypeCast.newBuilder() to construct.
  private TypeCast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TypeCast() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TypeCast();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_TypeCast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_TypeCast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.TypeCast.class, com.premiumminds.sonar.postgres.protobuf.TypeCast.Builder.class);
  }

  private int bitField0_;
  public static final int ARG_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.Node arg_;
  /**
   * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  @java.lang.Override
  public boolean hasArg() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
   * @return The arg.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getArg() {
    return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : arg_;
  }
  /**
   * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgOrBuilder() {
    return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : arg_;
  }

  public static final int TYPE_NAME_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.TypeName typeName_;
  /**
   * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
   * @return Whether the typeName field is set.
   */
  @java.lang.Override
  public boolean hasTypeName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
   * @return The typeName.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeName getTypeName() {
    return typeName_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : typeName_;
  }
  /**
   * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getTypeNameOrBuilder() {
    return typeName_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : typeName_;
  }

  public static final int LOCATION_FIELD_NUMBER = 3;
  private int location_ = 0;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getArg());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getTypeName());
    }
    if (location_ != 0) {
      output.writeInt32(3, location_);
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
        .computeMessageSize(1, getArg());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTypeName());
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.TypeCast)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.TypeCast other = (com.premiumminds.sonar.postgres.protobuf.TypeCast) obj;

    if (hasArg() != other.hasArg()) return false;
    if (hasArg()) {
      if (!getArg()
          .equals(other.getArg())) return false;
    }
    if (hasTypeName() != other.hasTypeName()) return false;
    if (hasTypeName()) {
      if (!getTypeName()
          .equals(other.getTypeName())) return false;
    }
    if (getLocation()
        != other.getLocation()) return false;
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
    if (hasArg()) {
      hash = (37 * hash) + ARG_FIELD_NUMBER;
      hash = (53 * hash) + getArg().hashCode();
    }
    if (hasTypeName()) {
      hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTypeName().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.TypeCast parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.TypeCast prototype) {
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
   * Protobuf type {@code pg_query.TypeCast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.TypeCast)
      com.premiumminds.sonar.postgres.protobuf.TypeCastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_TypeCast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_TypeCast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.TypeCast.class, com.premiumminds.sonar.postgres.protobuf.TypeCast.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.TypeCast.newBuilder()
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
        getArgFieldBuilder();
        getTypeNameFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      arg_ = null;
      if (argBuilder_ != null) {
        argBuilder_.dispose();
        argBuilder_ = null;
      }
      typeName_ = null;
      if (typeNameBuilder_ != null) {
        typeNameBuilder_.dispose();
        typeNameBuilder_ = null;
      }
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_TypeCast_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.TypeCast getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.TypeCast.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.TypeCast build() {
      com.premiumminds.sonar.postgres.protobuf.TypeCast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.TypeCast buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.TypeCast result = new com.premiumminds.sonar.postgres.protobuf.TypeCast(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.TypeCast result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.arg_ = argBuilder_ == null
            ? arg_
            : argBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.typeName_ = typeNameBuilder_ == null
            ? typeName_
            : typeNameBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.TypeCast) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.TypeCast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.TypeCast other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.TypeCast.getDefaultInstance()) return this;
      if (other.hasArg()) {
        mergeArg(other.getArg());
      }
      if (other.hasTypeName()) {
        mergeTypeName(other.getTypeName());
      }
      if (other.getLocation() != 0) {
        setLocation(other.getLocation());
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
                  getArgFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTypeNameFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              location_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.premiumminds.sonar.postgres.protobuf.Node arg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> argBuilder_;
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     * @return Whether the arg field is set.
     */
    public boolean hasArg() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     * @return The arg.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getArg() {
      if (argBuilder_ == null) {
        return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : arg_;
      } else {
        return argBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    public Builder setArg(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arg_ = value;
      } else {
        argBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    public Builder setArg(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (argBuilder_ == null) {
        arg_ = builderForValue.build();
      } else {
        argBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    public Builder mergeArg(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          arg_ != null &&
          arg_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getArgBuilder().mergeFrom(value);
        } else {
          arg_ = value;
        }
      } else {
        argBuilder_.mergeFrom(value);
      }
      if (arg_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    public Builder clearArg() {
      bitField0_ = (bitField0_ & ~0x00000001);
      arg_ = null;
      if (argBuilder_ != null) {
        argBuilder_.dispose();
        argBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getArgBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getArgFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgOrBuilder() {
      if (argBuilder_ != null) {
        return argBuilder_.getMessageOrBuilder();
      } else {
        return arg_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : arg_;
      }
    }
    /**
     * <code>.pg_query.Node arg = 1 [json_name = "arg"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getArgFieldBuilder() {
      if (argBuilder_ == null) {
        argBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getArg(),
                getParentForChildren(),
                isClean());
        arg_ = null;
      }
      return argBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.TypeName typeName_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder> typeNameBuilder_;
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
     * @return Whether the typeName field is set.
     */
    public boolean hasTypeName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
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
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
     */
    public Builder setTypeName(
        com.premiumminds.sonar.postgres.protobuf.TypeName.Builder builderForValue) {
      if (typeNameBuilder_ == null) {
        typeName_ = builderForValue.build();
      } else {
        typeNameBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
     */
    public Builder mergeTypeName(com.premiumminds.sonar.postgres.protobuf.TypeName value) {
      if (typeNameBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          typeName_ != null &&
          typeName_ != com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance()) {
          getTypeNameBuilder().mergeFrom(value);
        } else {
          typeName_ = value;
        }
      } else {
        typeNameBuilder_.mergeFrom(value);
      }
      if (typeName_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
     */
    public Builder clearTypeName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      typeName_ = null;
      if (typeNameBuilder_ != null) {
        typeNameBuilder_.dispose();
        typeNameBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeName.Builder getTypeNameBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTypeNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
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
     * <code>.pg_query.TypeName type_name = 2 [json_name = "typeName"];</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 3 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:pg_query.TypeCast)
  }

  // @@protoc_insertion_point(class_scope:pg_query.TypeCast)
  private static final com.premiumminds.sonar.postgres.protobuf.TypeCast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.TypeCast();
  }

  public static com.premiumminds.sonar.postgres.protobuf.TypeCast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TypeCast>
      PARSER = new com.google.protobuf.AbstractParser<TypeCast>() {
    @java.lang.Override
    public TypeCast parsePartialFrom(
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

  public static com.google.protobuf.Parser<TypeCast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypeCast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeCast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

