// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.FunctionParameter}
 */
public final class FunctionParameter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.FunctionParameter)
    FunctionParameterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionParameter.newBuilder() to construct.
  private FunctionParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionParameter() {
    name_ = "";
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionParameter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_FunctionParameter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_FunctionParameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.FunctionParameter.class, com.premiumminds.sonar.postgres.protobuf.FunctionParameter.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
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

  public static final int ARG_TYPE_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.TypeName argType_;
  /**
   * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
   * @return Whether the argType field is set.
   */
  @java.lang.Override
  public boolean hasArgType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
   * @return The argType.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeName getArgType() {
    return argType_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : argType_;
  }
  /**
   * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getArgTypeOrBuilder() {
    return argType_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : argType_;
  }

  public static final int MODE_FIELD_NUMBER = 3;
  private int mode_ = 0;
  /**
   * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override public int getModeValue() {
    return mode_;
  }
  /**
   * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
   * @return The mode.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode getMode() {
    com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode result = com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode.forNumber(mode_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode.UNRECOGNIZED : result;
  }

  public static final int DEFEXPR_FIELD_NUMBER = 4;
  private com.premiumminds.sonar.postgres.protobuf.Node defexpr_;
  /**
   * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
   * @return Whether the defexpr field is set.
   */
  @java.lang.Override
  public boolean hasDefexpr() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
   * @return The defexpr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getDefexpr() {
    return defexpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : defexpr_;
  }
  /**
   * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getDefexprOrBuilder() {
    return defexpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : defexpr_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getArgType());
    }
    if (mode_ != com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode.FUNCTION_PARAMETER_MODE_UNDEFINED.getNumber()) {
      output.writeEnum(3, mode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getDefexpr());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getArgType());
    }
    if (mode_ != com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode.FUNCTION_PARAMETER_MODE_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, mode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDefexpr());
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.FunctionParameter)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.FunctionParameter other = (com.premiumminds.sonar.postgres.protobuf.FunctionParameter) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasArgType() != other.hasArgType()) return false;
    if (hasArgType()) {
      if (!getArgType()
          .equals(other.getArgType())) return false;
    }
    if (mode_ != other.mode_) return false;
    if (hasDefexpr() != other.hasDefexpr()) return false;
    if (hasDefexpr()) {
      if (!getDefexpr()
          .equals(other.getDefexpr())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasArgType()) {
      hash = (37 * hash) + ARG_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getArgType().hashCode();
    }
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    if (hasDefexpr()) {
      hash = (37 * hash) + DEFEXPR_FIELD_NUMBER;
      hash = (53 * hash) + getDefexpr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.FunctionParameter prototype) {
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
   * Protobuf type {@code pg_query.FunctionParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.FunctionParameter)
      com.premiumminds.sonar.postgres.protobuf.FunctionParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_FunctionParameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_FunctionParameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.FunctionParameter.class, com.premiumminds.sonar.postgres.protobuf.FunctionParameter.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.FunctionParameter.newBuilder()
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
        getArgTypeFieldBuilder();
        getDefexprFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      argType_ = null;
      if (argTypeBuilder_ != null) {
        argTypeBuilder_.dispose();
        argTypeBuilder_ = null;
      }
      mode_ = 0;
      defexpr_ = null;
      if (defexprBuilder_ != null) {
        defexprBuilder_.dispose();
        defexprBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_FunctionParameter_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.FunctionParameter getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.FunctionParameter.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.FunctionParameter build() {
      com.premiumminds.sonar.postgres.protobuf.FunctionParameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.FunctionParameter buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.FunctionParameter result = new com.premiumminds.sonar.postgres.protobuf.FunctionParameter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.FunctionParameter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.argType_ = argTypeBuilder_ == null
            ? argType_
            : argTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mode_ = mode_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.defexpr_ = defexprBuilder_ == null
            ? defexpr_
            : defexprBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.FunctionParameter) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.FunctionParameter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.FunctionParameter other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.FunctionParameter.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasArgType()) {
        mergeArgType(other.getArgType());
      }
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (other.hasDefexpr()) {
        mergeDefexpr(other.getDefexpr());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getArgTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              mode_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getDefexprFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
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
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.TypeName argType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder> argTypeBuilder_;
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     * @return Whether the argType field is set.
     */
    public boolean hasArgType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     * @return The argType.
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeName getArgType() {
      if (argTypeBuilder_ == null) {
        return argType_ == null ? com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : argType_;
      } else {
        return argTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    public Builder setArgType(com.premiumminds.sonar.postgres.protobuf.TypeName value) {
      if (argTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        argType_ = value;
      } else {
        argTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    public Builder setArgType(
        com.premiumminds.sonar.postgres.protobuf.TypeName.Builder builderForValue) {
      if (argTypeBuilder_ == null) {
        argType_ = builderForValue.build();
      } else {
        argTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    public Builder mergeArgType(com.premiumminds.sonar.postgres.protobuf.TypeName value) {
      if (argTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          argType_ != null &&
          argType_ != com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance()) {
          getArgTypeBuilder().mergeFrom(value);
        } else {
          argType_ = value;
        }
      } else {
        argTypeBuilder_.mergeFrom(value);
      }
      if (argType_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    public Builder clearArgType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      argType_ = null;
      if (argTypeBuilder_ != null) {
        argTypeBuilder_.dispose();
        argTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeName.Builder getArgTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getArgTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder getArgTypeOrBuilder() {
      if (argTypeBuilder_ != null) {
        return argTypeBuilder_.getMessageOrBuilder();
      } else {
        return argType_ == null ?
            com.premiumminds.sonar.postgres.protobuf.TypeName.getDefaultInstance() : argType_;
      }
    }
    /**
     * <code>.pg_query.TypeName arg_type = 2 [json_name = "argType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder> 
        getArgTypeFieldBuilder() {
      if (argTypeBuilder_ == null) {
        argTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.TypeName, com.premiumminds.sonar.postgres.protobuf.TypeName.Builder, com.premiumminds.sonar.postgres.protobuf.TypeNameOrBuilder>(
                getArgType(),
                getParentForChildren(),
                isClean());
        argType_ = null;
      }
      return argTypeBuilder_;
    }

    private int mode_ = 0;
    /**
     * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override public int getModeValue() {
      return mode_;
    }
    /**
     * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
     * @return The mode.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode getMode() {
      com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode result = com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode.forNumber(mode_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.premiumminds.sonar.postgres.protobuf.FunctionParameterMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.FunctionParameterMode mode = 3 [json_name = "mode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mode_ = 0;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node defexpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> defexprBuilder_;
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     * @return Whether the defexpr field is set.
     */
    public boolean hasDefexpr() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     * @return The defexpr.
     */
    public com.premiumminds.sonar.postgres.protobuf.Node getDefexpr() {
      if (defexprBuilder_ == null) {
        return defexpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : defexpr_;
      } else {
        return defexprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    public Builder setDefexpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (defexprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defexpr_ = value;
      } else {
        defexprBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    public Builder setDefexpr(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (defexprBuilder_ == null) {
        defexpr_ = builderForValue.build();
      } else {
        defexprBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    public Builder mergeDefexpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (defexprBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          defexpr_ != null &&
          defexpr_ != com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance()) {
          getDefexprBuilder().mergeFrom(value);
        } else {
          defexpr_ = value;
        }
      } else {
        defexprBuilder_.mergeFrom(value);
      }
      if (defexpr_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    public Builder clearDefexpr() {
      bitField0_ = (bitField0_ & ~0x00000008);
      defexpr_ = null;
      if (defexprBuilder_ != null) {
        defexprBuilder_.dispose();
        defexprBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getDefexprBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDefexprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getDefexprOrBuilder() {
      if (defexprBuilder_ != null) {
        return defexprBuilder_.getMessageOrBuilder();
      } else {
        return defexpr_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : defexpr_;
      }
    }
    /**
     * <code>.pg_query.Node defexpr = 4 [json_name = "defexpr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getDefexprFieldBuilder() {
      if (defexprBuilder_ == null) {
        defexprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getDefexpr(),
                getParentForChildren(),
                isClean());
        defexpr_ = null;
      }
      return defexprBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.FunctionParameter)
  }

  // @@protoc_insertion_point(class_scope:pg_query.FunctionParameter)
  private static final com.premiumminds.sonar.postgres.protobuf.FunctionParameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.FunctionParameter();
  }

  public static com.premiumminds.sonar.postgres.protobuf.FunctionParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionParameter>
      PARSER = new com.google.protobuf.AbstractParser<FunctionParameter>() {
    @java.lang.Override
    public FunctionParameter parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunctionParameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionParameter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.FunctionParameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

