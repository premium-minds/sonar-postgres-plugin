// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.PartitionCmd}
 */
public final class PartitionCmd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.PartitionCmd)
    PartitionCmdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionCmd.newBuilder() to construct.
  private PartitionCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionCmd() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartitionCmd();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartitionCmd(
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
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.RangeVar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.Builder subBuilder = null;
            if (bound_ != null) {
              subBuilder = bound_.toBuilder();
            }
            bound_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bound_);
              bound_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PartitionCmd_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PartitionCmd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.class, com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.plpgsql.protobuf.RangeVar name_;
  /**
   * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RangeVar getName() {
    return name_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : name_;
  }
  /**
   * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int BOUND_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec bound_;
  /**
   * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
   * @return Whether the bound field is set.
   */
  @java.lang.Override
  public boolean hasBound() {
    return bound_ != null;
  }
  /**
   * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
   * @return The bound.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec getBound() {
    return bound_ == null ? com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.getDefaultInstance() : bound_;
  }
  /**
   * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpecOrBuilder getBoundOrBuilder() {
    return getBound();
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
    if (name_ != null) {
      output.writeMessage(1, getName());
    }
    if (bound_ != null) {
      output.writeMessage(2, getBound());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getName());
    }
    if (bound_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBound());
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd other = (com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasBound() != other.hasBound()) return false;
    if (hasBound()) {
      if (!getBound()
          .equals(other.getBound())) return false;
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasBound()) {
      hash = (37 * hash) + BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getBound().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd prototype) {
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
   * Protobuf type {@code pg_query.PartitionCmd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.PartitionCmd)
      com.premiumminds.sonar.plpgsql.protobuf.PartitionCmdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PartitionCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PartitionCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.class, com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.newBuilder()
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
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (boundBuilder_ == null) {
        bound_ = null;
      } else {
        bound_ = null;
        boundBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_PartitionCmd_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd build() {
      com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd result = new com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd(this);
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (boundBuilder_ == null) {
        result.bound_ = bound_;
      } else {
        result.bound_ = boundBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd.getDefaultInstance()) return this;
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasBound()) {
        mergeBound(other.getBound());
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
      com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.RangeVar name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder> nameBuilder_;
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVar getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    public Builder setName(com.premiumminds.sonar.plpgsql.protobuf.RangeVar value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    public Builder setName(
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    public Builder mergeName(com.premiumminds.sonar.plpgsql.protobuf.RangeVar value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.pg_query.RangeVar name = 1 [json_name = "name"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec bound_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec, com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.Builder, com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpecOrBuilder> boundBuilder_;
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     * @return Whether the bound field is set.
     */
    public boolean hasBound() {
      return boundBuilder_ != null || bound_ != null;
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     * @return The bound.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec getBound() {
      if (boundBuilder_ == null) {
        return bound_ == null ? com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.getDefaultInstance() : bound_;
      } else {
        return boundBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    public Builder setBound(com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec value) {
      if (boundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bound_ = value;
        onChanged();
      } else {
        boundBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    public Builder setBound(
        com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.Builder builderForValue) {
      if (boundBuilder_ == null) {
        bound_ = builderForValue.build();
        onChanged();
      } else {
        boundBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    public Builder mergeBound(com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec value) {
      if (boundBuilder_ == null) {
        if (bound_ != null) {
          bound_ =
            com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.newBuilder(bound_).mergeFrom(value).buildPartial();
        } else {
          bound_ = value;
        }
        onChanged();
      } else {
        boundBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    public Builder clearBound() {
      if (boundBuilder_ == null) {
        bound_ = null;
        onChanged();
      } else {
        bound_ = null;
        boundBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.Builder getBoundBuilder() {
      
      onChanged();
      return getBoundFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpecOrBuilder getBoundOrBuilder() {
      if (boundBuilder_ != null) {
        return boundBuilder_.getMessageOrBuilder();
      } else {
        return bound_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.getDefaultInstance() : bound_;
      }
    }
    /**
     * <code>.pg_query.PartitionBoundSpec bound = 2 [json_name = "bound"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec, com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.Builder, com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpecOrBuilder> 
        getBoundFieldBuilder() {
      if (boundBuilder_ == null) {
        boundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec, com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpec.Builder, com.premiumminds.sonar.plpgsql.protobuf.PartitionBoundSpecOrBuilder>(
                getBound(),
                getParentForChildren(),
                isClean());
        bound_ = null;
      }
      return boundBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.PartitionCmd)
  }

  // @@protoc_insertion_point(class_scope:pg_query.PartitionCmd)
  private static final com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionCmd>
      PARSER = new com.google.protobuf.AbstractParser<PartitionCmd>() {
    @java.lang.Override
    public PartitionCmd parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartitionCmd(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartitionCmd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionCmd> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.PartitionCmd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
