// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.ScanToken}
 */
public final class ScanToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.ScanToken)
    ScanTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScanToken.newBuilder() to construct.
  private ScanToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScanToken() {
    token_ = 0;
    keywordKind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScanToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ScanToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ScanToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.ScanToken.class, com.premiumminds.sonar.postgres.protobuf.ScanToken.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private int start_ = 0;
  /**
   * <code>int32 start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public int getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private int end_ = 0;
  /**
   * <code>int32 end = 2;</code>
   * @return The end.
   */
  @java.lang.Override
  public int getEnd() {
    return end_;
  }

  public static final int TOKEN_FIELD_NUMBER = 4;
  private int token_ = 0;
  /**
   * <code>.pg_query.Token token = 4;</code>
   * @return The enum numeric value on the wire for token.
   */
  @java.lang.Override public int getTokenValue() {
    return token_;
  }
  /**
   * <code>.pg_query.Token token = 4;</code>
   * @return The token.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.Token getToken() {
    com.premiumminds.sonar.postgres.protobuf.Token result = com.premiumminds.sonar.postgres.protobuf.Token.forNumber(token_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.Token.UNRECOGNIZED : result;
  }

  public static final int KEYWORD_KIND_FIELD_NUMBER = 5;
  private int keywordKind_ = 0;
  /**
   * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
   * @return The enum numeric value on the wire for keywordKind.
   */
  @java.lang.Override public int getKeywordKindValue() {
    return keywordKind_;
  }
  /**
   * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
   * @return The keywordKind.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.KeywordKind getKeywordKind() {
    com.premiumminds.sonar.postgres.protobuf.KeywordKind result = com.premiumminds.sonar.postgres.protobuf.KeywordKind.forNumber(keywordKind_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.KeywordKind.UNRECOGNIZED : result;
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
    if (start_ != 0) {
      output.writeInt32(1, start_);
    }
    if (end_ != 0) {
      output.writeInt32(2, end_);
    }
    if (token_ != com.premiumminds.sonar.postgres.protobuf.Token.NUL.getNumber()) {
      output.writeEnum(4, token_);
    }
    if (keywordKind_ != com.premiumminds.sonar.postgres.protobuf.KeywordKind.NO_KEYWORD.getNumber()) {
      output.writeEnum(5, keywordKind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, start_);
    }
    if (end_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, end_);
    }
    if (token_ != com.premiumminds.sonar.postgres.protobuf.Token.NUL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, token_);
    }
    if (keywordKind_ != com.premiumminds.sonar.postgres.protobuf.KeywordKind.NO_KEYWORD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, keywordKind_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.ScanToken)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.ScanToken other = (com.premiumminds.sonar.postgres.protobuf.ScanToken) obj;

    if (getStart()
        != other.getStart()) return false;
    if (getEnd()
        != other.getEnd()) return false;
    if (token_ != other.token_) return false;
    if (keywordKind_ != other.keywordKind_) return false;
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + token_;
    hash = (37 * hash) + KEYWORD_KIND_FIELD_NUMBER;
    hash = (53 * hash) + keywordKind_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.ScanToken parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.ScanToken prototype) {
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
   * Protobuf type {@code pg_query.ScanToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.ScanToken)
      com.premiumminds.sonar.postgres.protobuf.ScanTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ScanToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ScanToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.ScanToken.class, com.premiumminds.sonar.postgres.protobuf.ScanToken.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.ScanToken.newBuilder()
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
      start_ = 0;
      end_ = 0;
      token_ = 0;
      keywordKind_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_ScanToken_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ScanToken getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.ScanToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ScanToken build() {
      com.premiumminds.sonar.postgres.protobuf.ScanToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.ScanToken buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.ScanToken result = new com.premiumminds.sonar.postgres.protobuf.ScanToken(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.ScanToken result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = start_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = end_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.token_ = token_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.keywordKind_ = keywordKind_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.ScanToken) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.ScanToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.ScanToken other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.ScanToken.getDefaultInstance()) return this;
      if (other.getStart() != 0) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0) {
        setEnd(other.getEnd());
      }
      if (other.token_ != 0) {
        setTokenValue(other.getTokenValue());
      }
      if (other.keywordKind_ != 0) {
        setKeywordKindValue(other.getKeywordKindValue());
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
              start_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              end_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 32: {
              token_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 40: {
              keywordKind_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 40
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

    private int start_ ;
    /**
     * <code>int32 start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public int getStart() {
      return start_;
    }
    /**
     * <code>int32 start = 1;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(int value) {

      start_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = 0;
      onChanged();
      return this;
    }

    private int end_ ;
    /**
     * <code>int32 end = 2;</code>
     * @return The end.
     */
    @java.lang.Override
    public int getEnd() {
      return end_;
    }
    /**
     * <code>int32 end = 2;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(int value) {

      end_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 end = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      end_ = 0;
      onChanged();
      return this;
    }

    private int token_ = 0;
    /**
     * <code>.pg_query.Token token = 4;</code>
     * @return The enum numeric value on the wire for token.
     */
    @java.lang.Override public int getTokenValue() {
      return token_;
    }
    /**
     * <code>.pg_query.Token token = 4;</code>
     * @param value The enum numeric value on the wire for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenValue(int value) {
      token_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Token token = 4;</code>
     * @return The token.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.Token getToken() {
      com.premiumminds.sonar.postgres.protobuf.Token result = com.premiumminds.sonar.postgres.protobuf.Token.forNumber(token_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.Token.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.Token token = 4;</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(com.premiumminds.sonar.postgres.protobuf.Token value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      token_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.Token token = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      bitField0_ = (bitField0_ & ~0x00000004);
      token_ = 0;
      onChanged();
      return this;
    }

    private int keywordKind_ = 0;
    /**
     * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
     * @return The enum numeric value on the wire for keywordKind.
     */
    @java.lang.Override public int getKeywordKindValue() {
      return keywordKind_;
    }
    /**
     * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
     * @param value The enum numeric value on the wire for keywordKind to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordKindValue(int value) {
      keywordKind_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
     * @return The keywordKind.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.KeywordKind getKeywordKind() {
      com.premiumminds.sonar.postgres.protobuf.KeywordKind result = com.premiumminds.sonar.postgres.protobuf.KeywordKind.forNumber(keywordKind_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.KeywordKind.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
     * @param value The keywordKind to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordKind(com.premiumminds.sonar.postgres.protobuf.KeywordKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      keywordKind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.KeywordKind keyword_kind = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordKind() {
      bitField0_ = (bitField0_ & ~0x00000008);
      keywordKind_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.ScanToken)
  }

  // @@protoc_insertion_point(class_scope:pg_query.ScanToken)
  private static final com.premiumminds.sonar.postgres.protobuf.ScanToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.ScanToken();
  }

  public static com.premiumminds.sonar.postgres.protobuf.ScanToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScanToken>
      PARSER = new com.google.protobuf.AbstractParser<ScanToken>() {
    @java.lang.Override
    public ScanToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScanToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScanToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.ScanToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

