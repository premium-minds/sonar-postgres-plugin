// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.RelabelType}
 */
public final class RelabelType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.RelabelType)
    RelabelTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelabelType.newBuilder() to construct.
  private RelabelType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelabelType() {
    relabelformat_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelabelType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RelabelType(
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
            if (xpr_ != null) {
              subBuilder = xpr_.toBuilder();
            }
            xpr_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(xpr_);
              xpr_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.premiumminds.sonar.postgres.protobuf.Node.Builder subBuilder = null;
            if (arg_ != null) {
              subBuilder = arg_.toBuilder();
            }
            arg_ = input.readMessage(com.premiumminds.sonar.postgres.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(arg_);
              arg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            resulttype_ = input.readUInt32();
            break;
          }
          case 32: {

            resulttypmod_ = input.readInt32();
            break;
          }
          case 40: {

            resultcollid_ = input.readUInt32();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            relabelformat_ = rawValue;
            break;
          }
          case 56: {

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
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RelabelType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RelabelType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.RelabelType.class, com.premiumminds.sonar.postgres.protobuf.RelabelType.Builder.class);
  }

  public static final int XPR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.postgres.protobuf.Node xpr_;
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
  public com.premiumminds.sonar.postgres.protobuf.Node getXpr() {
    return xpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getXprOrBuilder() {
    return getXpr();
  }

  public static final int ARG_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.postgres.protobuf.Node arg_;
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  @java.lang.Override
  public boolean hasArg() {
    return arg_ != null;
  }
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return The arg.
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.Node getArg() {
    return arg_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : arg_;
  }
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getArgOrBuilder() {
    return getArg();
  }

  public static final int RESULTTYPE_FIELD_NUMBER = 3;
  private int resulttype_;
  /**
   * <code>uint32 resulttype = 3 [json_name = "resulttype"];</code>
   * @return The resulttype.
   */
  @java.lang.Override
  public int getResulttype() {
    return resulttype_;
  }

  public static final int RESULTTYPMOD_FIELD_NUMBER = 4;
  private int resulttypmod_;
  /**
   * <code>int32 resulttypmod = 4 [json_name = "resulttypmod"];</code>
   * @return The resulttypmod.
   */
  @java.lang.Override
  public int getResulttypmod() {
    return resulttypmod_;
  }

  public static final int RESULTCOLLID_FIELD_NUMBER = 5;
  private int resultcollid_;
  /**
   * <code>uint32 resultcollid = 5 [json_name = "resultcollid"];</code>
   * @return The resultcollid.
   */
  @java.lang.Override
  public int getResultcollid() {
    return resultcollid_;
  }

  public static final int RELABELFORMAT_FIELD_NUMBER = 6;
  private int relabelformat_;
  /**
   * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
   * @return The enum numeric value on the wire for relabelformat.
   */
  @java.lang.Override public int getRelabelformatValue() {
    return relabelformat_;
  }
  /**
   * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
   * @return The relabelformat.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.CoercionForm getRelabelformat() {
    @SuppressWarnings("deprecation")
    com.premiumminds.sonar.postgres.protobuf.CoercionForm result = com.premiumminds.sonar.postgres.protobuf.CoercionForm.valueOf(relabelformat_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.CoercionForm.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FIELD_NUMBER = 7;
  private int location_;
  /**
   * <code>int32 location = 7 [json_name = "location"];</code>
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
    if (xpr_ != null) {
      output.writeMessage(1, getXpr());
    }
    if (arg_ != null) {
      output.writeMessage(2, getArg());
    }
    if (resulttype_ != 0) {
      output.writeUInt32(3, resulttype_);
    }
    if (resulttypmod_ != 0) {
      output.writeInt32(4, resulttypmod_);
    }
    if (resultcollid_ != 0) {
      output.writeUInt32(5, resultcollid_);
    }
    if (relabelformat_ != com.premiumminds.sonar.postgres.protobuf.CoercionForm.COERCION_FORM_UNDEFINED.getNumber()) {
      output.writeEnum(6, relabelformat_);
    }
    if (location_ != 0) {
      output.writeInt32(7, location_);
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
    if (arg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getArg());
    }
    if (resulttype_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, resulttype_);
    }
    if (resulttypmod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, resulttypmod_);
    }
    if (resultcollid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, resultcollid_);
    }
    if (relabelformat_ != com.premiumminds.sonar.postgres.protobuf.CoercionForm.COERCION_FORM_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, relabelformat_);
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.RelabelType)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.RelabelType other = (com.premiumminds.sonar.postgres.protobuf.RelabelType) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (hasArg() != other.hasArg()) return false;
    if (hasArg()) {
      if (!getArg()
          .equals(other.getArg())) return false;
    }
    if (getResulttype()
        != other.getResulttype()) return false;
    if (getResulttypmod()
        != other.getResulttypmod()) return false;
    if (getResultcollid()
        != other.getResultcollid()) return false;
    if (relabelformat_ != other.relabelformat_) return false;
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    if (hasArg()) {
      hash = (37 * hash) + ARG_FIELD_NUMBER;
      hash = (53 * hash) + getArg().hashCode();
    }
    hash = (37 * hash) + RESULTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResulttype();
    hash = (37 * hash) + RESULTTYPMOD_FIELD_NUMBER;
    hash = (53 * hash) + getResulttypmod();
    hash = (37 * hash) + RESULTCOLLID_FIELD_NUMBER;
    hash = (53 * hash) + getResultcollid();
    hash = (37 * hash) + RELABELFORMAT_FIELD_NUMBER;
    hash = (53 * hash) + relabelformat_;
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RelabelType parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.RelabelType prototype) {
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
   * Protobuf type {@code pg_query.RelabelType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.RelabelType)
      com.premiumminds.sonar.postgres.protobuf.RelabelTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RelabelType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RelabelType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.RelabelType.class, com.premiumminds.sonar.postgres.protobuf.RelabelType.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.RelabelType.newBuilder()
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
      if (argBuilder_ == null) {
        arg_ = null;
      } else {
        arg_ = null;
        argBuilder_ = null;
      }
      resulttype_ = 0;

      resulttypmod_ = 0;

      resultcollid_ = 0;

      relabelformat_ = 0;

      location_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RelabelType_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RelabelType getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.RelabelType.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RelabelType build() {
      com.premiumminds.sonar.postgres.protobuf.RelabelType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RelabelType buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.RelabelType result = new com.premiumminds.sonar.postgres.protobuf.RelabelType(this);
      if (xprBuilder_ == null) {
        result.xpr_ = xpr_;
      } else {
        result.xpr_ = xprBuilder_.build();
      }
      if (argBuilder_ == null) {
        result.arg_ = arg_;
      } else {
        result.arg_ = argBuilder_.build();
      }
      result.resulttype_ = resulttype_;
      result.resulttypmod_ = resulttypmod_;
      result.resultcollid_ = resultcollid_;
      result.relabelformat_ = relabelformat_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.RelabelType) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.RelabelType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.RelabelType other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.RelabelType.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.hasArg()) {
        mergeArg(other.getArg());
      }
      if (other.getResulttype() != 0) {
        setResulttype(other.getResulttype());
      }
      if (other.getResulttypmod() != 0) {
        setResulttypmod(other.getResulttypmod());
      }
      if (other.getResultcollid() != 0) {
        setResultcollid(other.getResultcollid());
      }
      if (other.relabelformat_ != 0) {
        setRelabelformatValue(other.getRelabelformatValue());
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
      com.premiumminds.sonar.postgres.protobuf.RelabelType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.postgres.protobuf.RelabelType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node xpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> xprBuilder_;
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
    public com.premiumminds.sonar.postgres.protobuf.Node getXpr() {
      if (xprBuilder_ == null) {
        return xpr_ == null ? com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
      } else {
        return xprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
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
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
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
    public Builder mergeXpr(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (xpr_ != null) {
          xpr_ =
            com.premiumminds.sonar.postgres.protobuf.Node.newBuilder(xpr_).mergeFrom(value).buildPartial();
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
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getXprBuilder() {
      
      onChanged();
      return getXprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder getXprOrBuilder() {
      if (xprBuilder_ != null) {
        return xprBuilder_.getMessageOrBuilder();
      } else {
        return xpr_ == null ?
            com.premiumminds.sonar.postgres.protobuf.Node.getDefaultInstance() : xpr_;
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> 
        getXprFieldBuilder() {
      if (xprBuilder_ == null) {
        xprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder>(
                getXpr(),
                getParentForChildren(),
                isClean());
        xpr_ = null;
      }
      return xprBuilder_;
    }

    private com.premiumminds.sonar.postgres.protobuf.Node arg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.postgres.protobuf.Node, com.premiumminds.sonar.postgres.protobuf.Node.Builder, com.premiumminds.sonar.postgres.protobuf.NodeOrBuilder> argBuilder_;
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     * @return Whether the arg field is set.
     */
    public boolean hasArg() {
      return argBuilder_ != null || arg_ != null;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
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
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder setArg(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arg_ = value;
        onChanged();
      } else {
        argBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder setArg(
        com.premiumminds.sonar.postgres.protobuf.Node.Builder builderForValue) {
      if (argBuilder_ == null) {
        arg_ = builderForValue.build();
        onChanged();
      } else {
        argBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder mergeArg(com.premiumminds.sonar.postgres.protobuf.Node value) {
      if (argBuilder_ == null) {
        if (arg_ != null) {
          arg_ =
            com.premiumminds.sonar.postgres.protobuf.Node.newBuilder(arg_).mergeFrom(value).buildPartial();
        } else {
          arg_ = value;
        }
        onChanged();
      } else {
        argBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder clearArg() {
      if (argBuilder_ == null) {
        arg_ = null;
        onChanged();
      } else {
        arg_ = null;
        argBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.postgres.protobuf.Node.Builder getArgBuilder() {
      
      onChanged();
      return getArgFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
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
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
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

    private int resulttype_ ;
    /**
     * <code>uint32 resulttype = 3 [json_name = "resulttype"];</code>
     * @return The resulttype.
     */
    @java.lang.Override
    public int getResulttype() {
      return resulttype_;
    }
    /**
     * <code>uint32 resulttype = 3 [json_name = "resulttype"];</code>
     * @param value The resulttype to set.
     * @return This builder for chaining.
     */
    public Builder setResulttype(int value) {
      
      resulttype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 resulttype = 3 [json_name = "resulttype"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResulttype() {
      
      resulttype_ = 0;
      onChanged();
      return this;
    }

    private int resulttypmod_ ;
    /**
     * <code>int32 resulttypmod = 4 [json_name = "resulttypmod"];</code>
     * @return The resulttypmod.
     */
    @java.lang.Override
    public int getResulttypmod() {
      return resulttypmod_;
    }
    /**
     * <code>int32 resulttypmod = 4 [json_name = "resulttypmod"];</code>
     * @param value The resulttypmod to set.
     * @return This builder for chaining.
     */
    public Builder setResulttypmod(int value) {
      
      resulttypmod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 resulttypmod = 4 [json_name = "resulttypmod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResulttypmod() {
      
      resulttypmod_ = 0;
      onChanged();
      return this;
    }

    private int resultcollid_ ;
    /**
     * <code>uint32 resultcollid = 5 [json_name = "resultcollid"];</code>
     * @return The resultcollid.
     */
    @java.lang.Override
    public int getResultcollid() {
      return resultcollid_;
    }
    /**
     * <code>uint32 resultcollid = 5 [json_name = "resultcollid"];</code>
     * @param value The resultcollid to set.
     * @return This builder for chaining.
     */
    public Builder setResultcollid(int value) {
      
      resultcollid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 resultcollid = 5 [json_name = "resultcollid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResultcollid() {
      
      resultcollid_ = 0;
      onChanged();
      return this;
    }

    private int relabelformat_ = 0;
    /**
     * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
     * @return The enum numeric value on the wire for relabelformat.
     */
    @java.lang.Override public int getRelabelformatValue() {
      return relabelformat_;
    }
    /**
     * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
     * @param value The enum numeric value on the wire for relabelformat to set.
     * @return This builder for chaining.
     */
    public Builder setRelabelformatValue(int value) {
      
      relabelformat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
     * @return The relabelformat.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.CoercionForm getRelabelformat() {
      @SuppressWarnings("deprecation")
      com.premiumminds.sonar.postgres.protobuf.CoercionForm result = com.premiumminds.sonar.postgres.protobuf.CoercionForm.valueOf(relabelformat_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.CoercionForm.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
     * @param value The relabelformat to set.
     * @return This builder for chaining.
     */
    public Builder setRelabelformat(com.premiumminds.sonar.postgres.protobuf.CoercionForm value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      relabelformat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.CoercionForm relabelformat = 6 [json_name = "relabelformat"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelabelformat() {
      
      relabelformat_ = 0;
      onChanged();
      return this;
    }

    private int location_ ;
    /**
     * <code>int32 location = 7 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 7 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {
      
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 7 [json_name = "location"];</code>
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


    // @@protoc_insertion_point(builder_scope:pg_query.RelabelType)
  }

  // @@protoc_insertion_point(class_scope:pg_query.RelabelType)
  private static final com.premiumminds.sonar.postgres.protobuf.RelabelType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.RelabelType();
  }

  public static com.premiumminds.sonar.postgres.protobuf.RelabelType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelabelType>
      PARSER = new com.google.protobuf.AbstractParser<RelabelType>() {
    @java.lang.Override
    public RelabelType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RelabelType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RelabelType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelabelType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RelabelType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
