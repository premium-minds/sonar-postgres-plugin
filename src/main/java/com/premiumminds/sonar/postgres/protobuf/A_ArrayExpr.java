// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.A_ArrayExpr}
 */
public final class A_ArrayExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.A_ArrayExpr)
    A_ArrayExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use A_ArrayExpr.newBuilder() to construct.
  private A_ArrayExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private A_ArrayExpr() {
    elements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new A_ArrayExpr();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_ArrayExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_ArrayExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.class, com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.Builder.class);
  }

  public static final int ELEMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> elements_;
  /**
   * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getElementsList() {
    return elements_;
  }
  /**
   * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
      getElementsOrBuilderList() {
    return elements_;
  }
  /**
   * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public int getElementsCount() {
    return elements_.size();
  }
  /**
   * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getElements(int index) {
    return elements_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getElementsOrBuilder(
      int index) {
    return elements_.get(index);
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private int location_ = 0;
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
    for (int i = 0; i < elements_.size(); i++) {
      output.writeMessage(1, elements_.get(i));
    }
    if (location_ != 0) {
      output.writeInt32(2, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < elements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, elements_.get(i));
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr other = (com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr) obj;

    if (!getElementsList()
        .equals(other.getElementsList())) return false;
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
    if (getElementsCount() > 0) {
      hash = (37 * hash) + ELEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getElementsList().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr prototype) {
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
   * Protobuf type {@code pg_query.A_ArrayExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.A_ArrayExpr)
      com.premiumminds.sonar.postgres.protobuf.A_ArrayExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_ArrayExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_ArrayExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.class, com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.newBuilder()
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
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
      } else {
        elements_ = null;
        elementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_A_ArrayExpr_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr build() {
      com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr result = new com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr result) {
      if (elementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          elements_ = java.util.Collections.unmodifiableList(elements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.elements_ = elements_;
      } else {
        result.elements_ = elementsBuilder_.build();
      }
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr.getDefaultInstance()) return this;
      if (elementsBuilder_ == null) {
        if (!other.elements_.isEmpty()) {
          if (elements_.isEmpty()) {
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElementsIsMutable();
            elements_.addAll(other.elements_);
          }
          onChanged();
        }
      } else {
        if (!other.elements_.isEmpty()) {
          if (elementsBuilder_.isEmpty()) {
            elementsBuilder_.dispose();
            elementsBuilder_ = null;
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            elementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getElementsFieldBuilder() : null;
          } else {
            elementsBuilder_.addAllMessages(other.elements_);
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
            case 10: {
              com.premiumminds.sonar.postgres.protobuf.Node m =
                  input.readMessage(
                      com.premiumminds.sonar.postgres.protobuf.Node.parser(),
                      extensionRegistry);
              if (elementsBuilder_ == null) {
                ensureElementsIsMutable();
                elements_.add(m);
              } else {
                elementsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              location_ = input.readInt32();
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

    private java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> elements_ =
      java.util.Collections.emptyList();
    private void ensureElementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        elements_ = new java.util.ArrayList<com.premiumminds.sonar.postgres.protobuf.Node>(elements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> elementsBuilder_;

    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node> getElementsList() {
      if (elementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(elements_);
      } else {
        return elementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public int getElementsCount() {
      if (elementsBuilder_ == null) {
        return elements_.size();
      } else {
        return elementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getElements(int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);
      } else {
        return elementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder setElements(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.set(index, value);
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder setElements(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.set(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        int index, com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(index, value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        int index, com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder addAllElements(
        java.lang.Iterable<? extends com.premiumminds.sonar.postgres.protobuf.Node> values) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, elements_);
        onChanged();
      } else {
        elementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder clearElements() {
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        elementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public Builder removeElements(int index) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.remove(index);
        onChanged();
      } else {
        elementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getElementsBuilder(
        int index) {
      return getElementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getElementsOrBuilder(
        int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);  } else {
        return elementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
         getElementsOrBuilderList() {
      if (elementsBuilder_ != null) {
        return elementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(elements_);
      }
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addElementsBuilder() {
      return getElementsFieldBuilder().addBuilder(
          com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder addElementsBuilder(
        int index) {
      return getElementsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<com.premiumminds.sonar.postgres.protobuf.Node.Builder> 
         getElementsBuilderList() {
      return getElementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getElementsFieldBuilder() {
      if (elementsBuilder_ == null) {
        elementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                elements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        elements_ = null;
      }
      return elementsBuilder_;
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 2 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:pg_query.A_ArrayExpr)
  }

  // @@protoc_insertion_point(class_scope:pg_query.A_ArrayExpr)
  private static final com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr();
  }

  public static com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<A_ArrayExpr>
      PARSER = new com.google.protobuf.AbstractParser<A_ArrayExpr>() {
    @java.lang.Override
    public A_ArrayExpr parsePartialFrom(
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

  public static com.google.protobuf.Parser<A_ArrayExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<A_ArrayExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.A_ArrayExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

