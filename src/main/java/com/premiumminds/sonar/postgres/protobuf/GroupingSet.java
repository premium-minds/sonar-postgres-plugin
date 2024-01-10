// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.GroupingSet}
 */
public final class GroupingSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.GroupingSet)
    GroupingSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupingSet.newBuilder() to construct.
  private GroupingSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupingSet() {
    kind_ = 0;
    content_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupingSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_GroupingSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_GroupingSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.GroupingSet.class, com.premiumminds.sonar.postgres.protobuf.GroupingSet.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  @java.lang.Override public int getKindValue() {
    return kind_;
  }
  /**
   * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.GroupingSetKind getKind() {
    com.premiumminds.sonar.postgres.protobuf.GroupingSetKind result = com.premiumminds.sonar.postgres.protobuf.GroupingSetKind.forNumber(kind_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.GroupingSetKind.UNRECOGNIZED : result;
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> content_;
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getContentList() {
    return content_;
  }
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getContentOrBuilderList() {
    return content_;
  }
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  @java.lang.Override
  public int getContentCount() {
    return content_.size();
  }
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getContent(int index) {
    return content_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getContentOrBuilder(
      int index) {
    return content_.get(index);
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
    if (kind_ != com.premiumminds.sonar.postgres.protobuf.GroupingSetKind.GROUPING_SET_KIND_UNDEFINED.getNumber()) {
      output.writeEnum(1, kind_);
    }
    for (int i = 0; i < content_.size(); i++) {
      output.writeMessage(2, content_.get(i));
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
    if (kind_ != com.premiumminds.sonar.postgres.protobuf.GroupingSetKind.GROUPING_SET_KIND_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kind_);
    }
    for (int i = 0; i < content_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, content_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.GroupingSet)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.GroupingSet other = (com.premiumminds.sonar.postgres.protobuf.GroupingSet) obj;

    if (kind_ != other.kind_) return false;
    if (!getContentList()
        .equals(other.getContentList())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    if (getContentCount() > 0) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContentList().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.GroupingSet prototype) {
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
   * Protobuf type {@code pg_query.GroupingSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.GroupingSet)
      com.premiumminds.sonar.postgres.protobuf.GroupingSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_GroupingSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_GroupingSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.GroupingSet.class, com.premiumminds.sonar.postgres.protobuf.GroupingSet.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.GroupingSet.newBuilder()
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
      kind_ = 0;
      if (contentBuilder_ == null) {
        content_ = java.util.Collections.emptyList();
      } else {
        content_ = null;
        contentBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_GroupingSet_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.GroupingSet getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.GroupingSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.GroupingSet build() {
      com.premiumminds.sonar.postgres.protobuf.GroupingSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.GroupingSet buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.GroupingSet result = new com.premiumminds.sonar.postgres.protobuf.GroupingSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.GroupingSet result) {
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          content_ = java.util.Collections.unmodifiableList(content_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.content_ = content_;
      } else {
        result.content_ = contentBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.GroupingSet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.GroupingSet) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.GroupingSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.GroupingSet other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.GroupingSet.getDefaultInstance()) return this;
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
      }
      if (contentBuilder_ == null) {
        if (!other.content_.isEmpty()) {
          if (content_.isEmpty()) {
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureContentIsMutable();
            content_.addAll(other.content_);
          }
          onChanged();
        }
      } else {
        if (!other.content_.isEmpty()) {
          if (contentBuilder_.isEmpty()) {
            contentBuilder_.dispose();
            contentBuilder_ = null;
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000002);
            contentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContentFieldBuilder() : null;
          } else {
            contentBuilder_.addAllMessages(other.content_);
          }
        }
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
            case 8: {
              kind_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (contentBuilder_ == null) {
                ensureContentIsMutable();
                content_.add(m);
              } else {
                contentBuilder_.addMessage(m);
              }
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

    private int kind_ = 0;
    /**
     * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
     * @return The enum numeric value on the wire for kind.
     */
    @java.lang.Override public int getKindValue() {
      return kind_;
    }
    /**
     * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
     * @param value The enum numeric value on the wire for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.GroupingSetKind getKind() {
      com.premiumminds.sonar.postgres.protobuf.GroupingSetKind result = com.premiumminds.sonar.postgres.protobuf.GroupingSetKind.forNumber(kind_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.GroupingSetKind.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.premiumminds.sonar.postgres.protobuf.GroupingSetKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> content_ =
      java.util.Collections.emptyList();
    private void ensureContentIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        content_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(content_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> contentBuilder_;

    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getContentList() {
      if (contentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(content_);
      } else {
        return contentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public int getContentCount() {
      if (contentBuilder_ == null) {
        return content_.size();
      } else {
        return contentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getContent(int index) {
      if (contentBuilder_ == null) {
        return content_.get(index);
      } else {
        return contentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder setContent(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.set(index, value);
        onChanged();
      } else {
        contentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder setContent(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.set(index, builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder addContent(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.add(value);
        onChanged();
      } else {
        contentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder addContent(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.add(index, value);
        onChanged();
      } else {
        contentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder addContent(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.add(builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder addContent(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.add(index, builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder addAllContent(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, content_);
        onChanged();
      } else {
        contentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder clearContent() {
      if (contentBuilder_ == null) {
        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        contentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public Builder removeContent(int index) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.remove(index);
        onChanged();
      } else {
        contentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getContentBuilder(
        int index) {
      return getContentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getContentOrBuilder(
        int index) {
      if (contentBuilder_ == null) {
        return content_.get(index);  } else {
        return contentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getContentOrBuilderList() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(content_);
      }
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addContentBuilder() {
      return getContentFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addContentBuilder(
        int index) {
      return getContentFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getContentBuilderList() {
      return getContentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                content_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.GroupingSet)
  }

  // @@protoc_insertion_point(class_scope:pg_query.GroupingSet)
  private static final com.premiumminds.sonar.postgres.protobuf.GroupingSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.GroupingSet();
  }

  public static com.premiumminds.sonar.postgres.protobuf.GroupingSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupingSet>
      PARSER = new com.google.protobuf.AbstractParser<GroupingSet>() {
    @java.lang.Override
    public GroupingSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupingSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupingSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.GroupingSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

