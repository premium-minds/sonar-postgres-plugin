// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.PrepareStmt}
 */
public final class PrepareStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.PrepareStmt)
    PrepareStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrepareStmt.newBuilder() to construct.
  private PrepareStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrepareStmt() {
    name_ = "";
    argtypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrepareStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrepareStmt(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              argtypes_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            argtypes_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 26: {
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (query_ != null) {
              subBuilder = query_.toBuilder();
            }
            query_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(query_);
              query_ = subBuilder.buildPartial();
            }

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
        argtypes_ = java.util.Collections.unmodifiableList(argtypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PrepareStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PrepareStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.class, com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGTYPES_FIELD_NUMBER = 2;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> argtypes_;
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getArgtypesList() {
    return argtypes_;
  }
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getArgtypesOrBuilderList() {
    return argtypes_;
  }
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  @java.lang.Override
  public int getArgtypesCount() {
    return argtypes_.size();
  }
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getArgtypes(int index) {
    return argtypes_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgtypesOrBuilder(
      int index) {
    return argtypes_.get(index);
  }

  public static final int QUERY_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.plpgsql.protobuf.Node query_;
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return query_ != null;
  }
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   * @return The query.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getQuery() {
    return query_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : query_;
  }
  /**
   * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getQueryOrBuilder() {
    return getQuery();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < argtypes_.size(); i++) {
      output.writeMessage(2, argtypes_.get(i));
    }
    if (query_ != null) {
      output.writeMessage(3, getQuery());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < argtypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, argtypes_.get(i));
    }
    if (query_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getQuery());
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt other = (com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getArgtypesList()
        .equals(other.getArgtypesList())) return false;
    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery()
          .equals(other.getQuery())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getArgtypesCount() > 0) {
      hash = (37 * hash) + ARGTYPES_FIELD_NUMBER;
      hash = (53 * hash) + getArgtypesList().hashCode();
    }
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt prototype) {
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
   * Protobuf type {@code pg_query.PrepareStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.PrepareStmt)
      com.premiumminds.sonar.plpgsql.protobuf.PrepareStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PrepareStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PrepareStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.class, com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.newBuilder()
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
        getArgtypesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (argtypesBuilder_ == null) {
        argtypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        argtypesBuilder_.clear();
      }
      if (queryBuilder_ == null) {
        query_ = null;
      } else {
        query_ = null;
        queryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PrepareStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt result = new com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (argtypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          argtypes_ = java.util.Collections.unmodifiableList(argtypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.argtypes_ = argtypes_;
      } else {
        result.argtypes_ = argtypesBuilder_.build();
      }
      if (queryBuilder_ == null) {
        result.query_ = query_;
      } else {
        result.query_ = queryBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (argtypesBuilder_ == null) {
        if (!other.argtypes_.isEmpty()) {
          if (argtypes_.isEmpty()) {
            argtypes_ = other.argtypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArgtypesIsMutable();
            argtypes_.addAll(other.argtypes_);
          }
          onChanged();
        }
      } else {
        if (!other.argtypes_.isEmpty()) {
          if (argtypesBuilder_.isEmpty()) {
            argtypesBuilder_.dispose();
            argtypesBuilder_ = null;
            argtypes_ = other.argtypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            argtypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgtypesFieldBuilder() : null;
          } else {
            argtypesBuilder_.addAllMessages(other.argtypes_);
          }
        }
      }
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
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
      com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> argtypes_ =
      java.util.Collections.emptyList();
    private void ensureArgtypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        argtypes_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(argtypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> argtypesBuilder_;

    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getArgtypesList() {
      if (argtypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(argtypes_);
      } else {
        return argtypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public int getArgtypesCount() {
      if (argtypesBuilder_ == null) {
        return argtypes_.size();
      } else {
        return argtypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getArgtypes(int index) {
      if (argtypesBuilder_ == null) {
        return argtypes_.get(index);
      } else {
        return argtypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder setArgtypes(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (argtypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgtypesIsMutable();
        argtypes_.set(index, value);
        onChanged();
      } else {
        argtypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder setArgtypes(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (argtypesBuilder_ == null) {
        ensureArgtypesIsMutable();
        argtypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        argtypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder addArgtypes(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (argtypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgtypesIsMutable();
        argtypes_.add(value);
        onChanged();
      } else {
        argtypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder addArgtypes(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (argtypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgtypesIsMutable();
        argtypes_.add(index, value);
        onChanged();
      } else {
        argtypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder addArgtypes(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (argtypesBuilder_ == null) {
        ensureArgtypesIsMutable();
        argtypes_.add(builderForValue.build());
        onChanged();
      } else {
        argtypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder addArgtypes(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (argtypesBuilder_ == null) {
        ensureArgtypesIsMutable();
        argtypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        argtypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder addAllArgtypes(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (argtypesBuilder_ == null) {
        ensureArgtypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, argtypes_);
        onChanged();
      } else {
        argtypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder clearArgtypes() {
      if (argtypesBuilder_ == null) {
        argtypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        argtypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public Builder removeArgtypes(int index) {
      if (argtypesBuilder_ == null) {
        ensureArgtypesIsMutable();
        argtypes_.remove(index);
        onChanged();
      } else {
        argtypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getArgtypesBuilder(
        int index) {
      return getArgtypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgtypesOrBuilder(
        int index) {
      if (argtypesBuilder_ == null) {
        return argtypes_.get(index);  } else {
        return argtypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getArgtypesOrBuilderList() {
      if (argtypesBuilder_ != null) {
        return argtypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(argtypes_);
      }
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addArgtypesBuilder() {
      return getArgtypesFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addArgtypesBuilder(
        int index) {
      return getArgtypesFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node argtypes = 2 [json_name = "argtypes"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getArgtypesBuilderList() {
      return getArgtypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getArgtypesFieldBuilder() {
      if (argtypesBuilder_ == null) {
        argtypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                argtypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        argtypes_ = null;
      }
      return argtypesBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node query_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> queryBuilder_;
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     * @return Whether the query field is set.
     */
    public boolean hasQuery() {
      return queryBuilder_ != null || query_ != null;
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     * @return The query.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    public Builder setQuery(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
        onChanged();
      } else {
        queryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    public Builder setQuery(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
        onChanged();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    public Builder mergeQuery(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (queryBuilder_ == null) {
        if (query_ != null) {
          query_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(query_).mergeFrom(value).buildPartial();
        } else {
          query_ = value;
        }
        onChanged();
      } else {
        queryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    public Builder clearQuery() {
      if (queryBuilder_ == null) {
        query_ = null;
        onChanged();
      } else {
        query_ = null;
        queryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getQueryBuilder() {
      
      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : query_;
      }
    }
    /**
     * <code>.pg_query.Node query = 3 [json_name = "query"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getQuery(),
                getParentForChildren(),
                isClean());
        query_ = null;
      }
      return queryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.PrepareStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.PrepareStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrepareStmt>
      PARSER = new com.google.protobuf.AbstractParser<PrepareStmt>() {
    @java.lang.Override
    public PrepareStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrepareStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrepareStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrepareStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.PrepareStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
