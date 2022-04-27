// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.CaseTestExpr}
 */
public final class CaseTestExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CaseTestExpr)
    CaseTestExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CaseTestExpr.newBuilder() to construct.
  private CaseTestExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CaseTestExpr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CaseTestExpr();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CaseTestExpr(
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
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (xpr_ != null) {
              subBuilder = xpr_.toBuilder();
            }
            xpr_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(xpr_);
              xpr_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            typeId_ = input.readUInt32();
            break;
          }
          case 24: {

            typeMod_ = input.readInt32();
            break;
          }
          case 32: {

            collation_ = input.readUInt32();
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseTestExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseTestExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.class, com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.Builder.class);
  }

  public static final int XPR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.plpgsql.protobuf.Node xpr_;
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  @java.lang.Override
  public boolean hasXpr() {
    return xpr_ != null;
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return The xpr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getXpr() {
    return xpr_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : xpr_;
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getXprOrBuilder() {
    return getXpr();
  }

  public static final int TYPE_ID_FIELD_NUMBER = 2;
  private int typeId_;
  /**
   * <code>uint32 type_id = 2 [json_name = "typeId"];</code>
   * @return The typeId.
   */
  @java.lang.Override
  public int getTypeId() {
    return typeId_;
  }

  public static final int TYPE_MOD_FIELD_NUMBER = 3;
  private int typeMod_;
  /**
   * <code>int32 type_mod = 3 [json_name = "typeMod"];</code>
   * @return The typeMod.
   */
  @java.lang.Override
  public int getTypeMod() {
    return typeMod_;
  }

  public static final int COLLATION_FIELD_NUMBER = 4;
  private int collation_;
  /**
   * <code>uint32 collation = 4 [json_name = "collation"];</code>
   * @return The collation.
   */
  @java.lang.Override
  public int getCollation() {
    return collation_;
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
    if (xpr_ != null) {
      output.writeMessage(1, getXpr());
    }
    if (typeId_ != 0) {
      output.writeUInt32(2, typeId_);
    }
    if (typeMod_ != 0) {
      output.writeInt32(3, typeMod_);
    }
    if (collation_ != 0) {
      output.writeUInt32(4, collation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (xpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getXpr());
    }
    if (typeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, typeId_);
    }
    if (typeMod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, typeMod_);
    }
    if (collation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, collation_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr other = (com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (getTypeId()
        != other.getTypeId()) return false;
    if (getTypeMod()
        != other.getTypeMod()) return false;
    if (getCollation()
        != other.getCollation()) return false;
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTypeId();
    hash = (37 * hash) + TYPE_MOD_FIELD_NUMBER;
    hash = (53 * hash) + getTypeMod();
    hash = (37 * hash) + COLLATION_FIELD_NUMBER;
    hash = (53 * hash) + getCollation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr prototype) {
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
   * Protobuf type {@code pg_query.CaseTestExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CaseTestExpr)
      com.premiumminds.sonar.plpgsql.protobuf.CaseTestExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseTestExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseTestExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.class, com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.newBuilder()
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
      if (xprBuilder_ == null) {
        xpr_ = null;
      } else {
        xpr_ = null;
        xprBuilder_ = null;
      }
      typeId_ = 0;

      typeMod_ = 0;

      collation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseTestExpr_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr build() {
      com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr result = new com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr(this);
      if (xprBuilder_ == null) {
        result.xpr_ = xpr_;
      } else {
        result.xpr_ = xprBuilder_.build();
      }
      result.typeId_ = typeId_;
      result.typeMod_ = typeMod_;
      result.collation_ = collation_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.getTypeId() != 0) {
        setTypeId(other.getTypeId());
      }
      if (other.getTypeMod() != 0) {
        setTypeMod(other.getTypeMod());
      }
      if (other.getCollation() != 0) {
        setCollation(other.getCollation());
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
      com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node xpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> xprBuilder_;
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     * @return Whether the xpr field is set.
     */
    public boolean hasXpr() {
      return xprBuilder_ != null || xpr_ != null;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     * @return The xpr.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getXpr() {
      if (xprBuilder_ == null) {
        return xpr_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : xpr_;
      } else {
        return xprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        xpr_ = value;
        onChanged();
      } else {
        xprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (xprBuilder_ == null) {
        xpr_ = builderForValue.build();
        onChanged();
      } else {
        xprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder mergeXpr(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (xpr_ != null) {
          xpr_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(xpr_).mergeFrom(value).buildPartial();
        } else {
          xpr_ = value;
        }
        onChanged();
      } else {
        xprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder clearXpr() {
      if (xprBuilder_ == null) {
        xpr_ = null;
        onChanged();
      } else {
        xpr_ = null;
        xprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getXprBuilder() {
      
      onChanged();
      return getXprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getXprOrBuilder() {
      if (xprBuilder_ != null) {
        return xprBuilder_.getMessageOrBuilder();
      } else {
        return xpr_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : xpr_;
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getXprFieldBuilder() {
      if (xprBuilder_ == null) {
        xprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getXpr(),
                getParentForChildren(),
                isClean());
        xpr_ = null;
      }
      return xprBuilder_;
    }

    private int typeId_ ;
    /**
     * <code>uint32 type_id = 2 [json_name = "typeId"];</code>
     * @return The typeId.
     */
    @java.lang.Override
    public int getTypeId() {
      return typeId_;
    }
    /**
     * <code>uint32 type_id = 2 [json_name = "typeId"];</code>
     * @param value The typeId to set.
     * @return This builder for chaining.
     */
    public Builder setTypeId(int value) {
      
      typeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 type_id = 2 [json_name = "typeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeId() {
      
      typeId_ = 0;
      onChanged();
      return this;
    }

    private int typeMod_ ;
    /**
     * <code>int32 type_mod = 3 [json_name = "typeMod"];</code>
     * @return The typeMod.
     */
    @java.lang.Override
    public int getTypeMod() {
      return typeMod_;
    }
    /**
     * <code>int32 type_mod = 3 [json_name = "typeMod"];</code>
     * @param value The typeMod to set.
     * @return This builder for chaining.
     */
    public Builder setTypeMod(int value) {
      
      typeMod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type_mod = 3 [json_name = "typeMod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeMod() {
      
      typeMod_ = 0;
      onChanged();
      return this;
    }

    private int collation_ ;
    /**
     * <code>uint32 collation = 4 [json_name = "collation"];</code>
     * @return The collation.
     */
    @java.lang.Override
    public int getCollation() {
      return collation_;
    }
    /**
     * <code>uint32 collation = 4 [json_name = "collation"];</code>
     * @param value The collation to set.
     * @return This builder for chaining.
     */
    public Builder setCollation(int value) {
      
      collation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 collation = 4 [json_name = "collation"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollation() {
      
      collation_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.CaseTestExpr)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CaseTestExpr)
  private static final com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CaseTestExpr>
      PARSER = new com.google.protobuf.AbstractParser<CaseTestExpr>() {
    @java.lang.Override
    public CaseTestExpr parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CaseTestExpr(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CaseTestExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CaseTestExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.CaseTestExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
