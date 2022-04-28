// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.A_Const}
 */
public final class A_Const extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.A_Const)
    A_ConstOrBuilder {
private static final long serialVersionUID = 0L;
  // Use A_Const.newBuilder() to construct.
  private A_Const(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private A_Const() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new A_Const();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private A_Const(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.premiumminds.sonar.postgres.protobuf.Node.Builder subBuilder = null;
            if (val_ != null) {
              subBuilder = val_.toBuilder();
            }
            val_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(val_);
              val_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            location_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Const_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Const_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.A_Const.class, com.premiumminds.sonar.postgres.protobuf.A_Const.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.Node val_;
  /**
   * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return val_ != null;
  }
  /**
   * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
   * @return The val.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getVal() {
    return val_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : val_;
  }
  /**
   * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getValOrBuilder() {
    return getVal();
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private int location_;
  /**
   * <code>int32 location = 2 [json_name = "location"];</code>
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
    if (val_ != null) {
      output.writeMessage(1, getVal());
    }
    if (location_ != 0) {
      output.writeInt32(2, location_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (val_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVal());
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.A_Const)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.A_Const other = (com.premiumminds.sonar.postgres.protobuf.A_Const) obj;

    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
    }
    if (getLocation()
        != other.getLocation()) return false;
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
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_Const parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.A_Const prototype) {
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
   * Protobuf type {@code pg_query.A_Const}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.A_Const)
      com.premiumminds.sonar.postgres.protobuf.A_ConstOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Const_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Const_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.A_Const.class, com.premiumminds.sonar.postgres.protobuf.A_Const.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.A_Const.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (valBuilder_ == null) {
        val_ = null;
      } else {
        val_ = null;
        valBuilder_ = null;
      }
      location_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_Const_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_Const getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.A_Const.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_Const build() {
      com.premiumminds.sonar.postgres.protobuf.A_Const result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_Const buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.A_Const result = new com.premiumminds.sonar.postgres.protobuf.A_Const(this);
      if (valBuilder_ == null) {
        result.val_ = val_;
      } else {
        result.val_ = valBuilder_.build();
      }
      result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.A_Const) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.A_Const)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.A_Const other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.A_Const.getDefaultInstance()) return this;
      if (other.hasVal()) {
        mergeVal(other.getVal());
      }
      if (other.getLocation() != 0) {
        setLocation(other.getLocation());
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
      com.premiumminds.sonar.postgres.protobuf.A_Const parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.A_Const) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node val_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> valBuilder_;
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return valBuilder_ != null || val_ != null;
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     * @return The val.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getVal() {
      if (valBuilder_ == null) {
        return val_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : val_;
      } else {
        return valBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    public Builder setVal(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        val_ = value;
        onChanged();
      } else {
        valBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    public Builder setVal(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (valBuilder_ == null) {
        val_ = builderForValue.build();
        onChanged();
      } else {
        valBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    public Builder mergeVal(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (valBuilder_ == null) {
        if (val_ != null) {
          val_ =
            com.premiumminds.sonar.postgres.protobuf.Node.newBuilder(val_).mergeFrom(value).buildPartial();
        } else {
          val_ = value;
        }
        onChanged();
      } else {
        valBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    public Builder clearVal() {
      if (valBuilder_ == null) {
        val_ = null;
        onChanged();
      } else {
        val_ = null;
        valBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getValBuilder() {
      
      onChanged();
      return getValFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getValOrBuilder() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilder();
      } else {
        return val_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : val_;
      }
    }
    /**
     * <code>.pg_query.Node val = 1 [json_name = "val"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getVal(),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
    }

    private int location_ ;
    /**
     * <code>int32 location = 2 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 2 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {
      
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 2 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
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


    // @@protoc_insertion_point(builder_scope:pg_query.A_Const)
  }

  // @@protoc_insertion_point(class_scope:pg_query.A_Const)
  private static final com.premiumminds.sonar.postgres.protobuf.A_Const DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.A_Const();
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_Const getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<A_Const>
      PARSER = new com.google.protobuf.AbstractParser<A_Const>() {
    @java.lang.Override
    public A_Const parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new A_Const(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<A_Const> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<A_Const> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.A_Const getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
