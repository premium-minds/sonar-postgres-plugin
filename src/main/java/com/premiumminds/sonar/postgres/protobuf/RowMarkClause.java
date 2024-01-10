// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

// Protobuf Java Version: 3.25.1
package com.premiumminds.sonar.postgres.protobuf;

/**
 * Protobuf type {@code pg_query.RowMarkClause}
 */
public final class RowMarkClause extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.RowMarkClause)
    RowMarkClauseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RowMarkClause.newBuilder() to construct.
  private RowMarkClause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RowMarkClause() {
    strength_ = 0;
    waitPolicy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RowMarkClause();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RowMarkClause_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RowMarkClause_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.postgres.protobuf.RowMarkClause.class, com.premiumminds.sonar.postgres.protobuf.RowMarkClause.Builder.class);
  }

  public static final int RTI_FIELD_NUMBER = 1;
  private int rti_ = 0;
  /**
   * <code>uint32 rti = 1 [json_name = "rti"];</code>
   * @return The rti.
   */
  @java.lang.Override
  public int getRti() {
    return rti_;
  }

  public static final int STRENGTH_FIELD_NUMBER = 2;
  private int strength_ = 0;
  /**
   * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
   * @return The enum numeric value on the wire for strength.
   */
  @java.lang.Override public int getStrengthValue() {
    return strength_;
  }
  /**
   * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
   * @return The strength.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.LockClauseStrength getStrength() {
    com.premiumminds.sonar.postgres.protobuf.LockClauseStrength result = com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.forNumber(strength_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.UNRECOGNIZED : result;
  }

  public static final int WAIT_POLICY_FIELD_NUMBER = 3;
  private int waitPolicy_ = 0;
  /**
   * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
   * @return The enum numeric value on the wire for waitPolicy.
   */
  @java.lang.Override public int getWaitPolicyValue() {
    return waitPolicy_;
  }
  /**
   * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
   * @return The waitPolicy.
   */
  @java.lang.Override public com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy getWaitPolicy() {
    com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy result = com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.forNumber(waitPolicy_);
    return result == null ? com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.UNRECOGNIZED : result;
  }

  public static final int PUSHED_DOWN_FIELD_NUMBER = 4;
  private boolean pushedDown_ = false;
  /**
   * <code>bool pushed_down = 4 [json_name = "pushedDown"];</code>
   * @return The pushedDown.
   */
  @java.lang.Override
  public boolean getPushedDown() {
    return pushedDown_;
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
    if (rti_ != 0) {
      output.writeUInt32(1, rti_);
    }
    if (strength_ != com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.LOCK_CLAUSE_STRENGTH_UNDEFINED.getNumber()) {
      output.writeEnum(2, strength_);
    }
    if (waitPolicy_ != com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.LOCK_WAIT_POLICY_UNDEFINED.getNumber()) {
      output.writeEnum(3, waitPolicy_);
    }
    if (pushedDown_ != false) {
      output.writeBool(4, pushedDown_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rti_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, rti_);
    }
    if (strength_ != com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.LOCK_CLAUSE_STRENGTH_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, strength_);
    }
    if (waitPolicy_ != com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.LOCK_WAIT_POLICY_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, waitPolicy_);
    }
    if (pushedDown_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, pushedDown_);
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
    if (!(obj instanceof com.premiumminds.sonar.postgres.protobuf.RowMarkClause)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.postgres.protobuf.RowMarkClause other = (com.premiumminds.sonar.postgres.protobuf.RowMarkClause) obj;

    if (getRti()
        != other.getRti()) return false;
    if (strength_ != other.strength_) return false;
    if (waitPolicy_ != other.waitPolicy_) return false;
    if (getPushedDown()
        != other.getPushedDown()) return false;
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
    hash = (37 * hash) + RTI_FIELD_NUMBER;
    hash = (53 * hash) + getRti();
    hash = (37 * hash) + STRENGTH_FIELD_NUMBER;
    hash = (53 * hash) + strength_;
    hash = (37 * hash) + WAIT_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + waitPolicy_;
    hash = (37 * hash) + PUSHED_DOWN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPushedDown());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.postgres.protobuf.RowMarkClause prototype) {
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
   * Protobuf type {@code pg_query.RowMarkClause}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.RowMarkClause)
      com.premiumminds.sonar.postgres.protobuf.RowMarkClauseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RowMarkClause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RowMarkClause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.postgres.protobuf.RowMarkClause.class, com.premiumminds.sonar.postgres.protobuf.RowMarkClause.Builder.class);
    }

    // Construct using com.premiumminds.sonar.postgres.protobuf.RowMarkClause.newBuilder()
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
      rti_ = 0;
      strength_ = 0;
      waitPolicy_ = 0;
      pushedDown_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.postgres.protobuf.PgQuery.internal_static_pg_query_RowMarkClause_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RowMarkClause getDefaultInstanceForType() {
      return com.premiumminds.sonar.postgres.protobuf.RowMarkClause.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RowMarkClause build() {
      com.premiumminds.sonar.postgres.protobuf.RowMarkClause result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.RowMarkClause buildPartial() {
      com.premiumminds.sonar.postgres.protobuf.RowMarkClause result = new com.premiumminds.sonar.postgres.protobuf.RowMarkClause(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.premiumminds.sonar.postgres.protobuf.RowMarkClause result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rti_ = rti_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.strength_ = strength_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.waitPolicy_ = waitPolicy_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pushedDown_ = pushedDown_;
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
      if (other instanceof com.premiumminds.sonar.postgres.protobuf.RowMarkClause) {
        return mergeFrom((com.premiumminds.sonar.postgres.protobuf.RowMarkClause)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.postgres.protobuf.RowMarkClause other) {
      if (other == com.premiumminds.sonar.postgres.protobuf.RowMarkClause.getDefaultInstance()) return this;
      if (other.getRti() != 0) {
        setRti(other.getRti());
      }
      if (other.strength_ != 0) {
        setStrengthValue(other.getStrengthValue());
      }
      if (other.waitPolicy_ != 0) {
        setWaitPolicyValue(other.getWaitPolicyValue());
      }
      if (other.getPushedDown() != false) {
        setPushedDown(other.getPushedDown());
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
              rti_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              strength_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              waitPolicy_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              pushedDown_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private int rti_ ;
    /**
     * <code>uint32 rti = 1 [json_name = "rti"];</code>
     * @return The rti.
     */
    @java.lang.Override
    public int getRti() {
      return rti_;
    }
    /**
     * <code>uint32 rti = 1 [json_name = "rti"];</code>
     * @param value The rti to set.
     * @return This builder for chaining.
     */
    public Builder setRti(int value) {

      rti_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rti = 1 [json_name = "rti"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRti() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rti_ = 0;
      onChanged();
      return this;
    }

    private int strength_ = 0;
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @return The enum numeric value on the wire for strength.
     */
    @java.lang.Override public int getStrengthValue() {
      return strength_;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @param value The enum numeric value on the wire for strength to set.
     * @return This builder for chaining.
     */
    public Builder setStrengthValue(int value) {
      strength_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @return The strength.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockClauseStrength getStrength() {
      com.premiumminds.sonar.postgres.protobuf.LockClauseStrength result = com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.forNumber(strength_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.LockClauseStrength.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @param value The strength to set.
     * @return This builder for chaining.
     */
    public Builder setStrength(com.premiumminds.sonar.postgres.protobuf.LockClauseStrength value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      strength_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStrength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      strength_ = 0;
      onChanged();
      return this;
    }

    private int waitPolicy_ = 0;
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @return The enum numeric value on the wire for waitPolicy.
     */
    @java.lang.Override public int getWaitPolicyValue() {
      return waitPolicy_;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @param value The enum numeric value on the wire for waitPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setWaitPolicyValue(int value) {
      waitPolicy_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @return The waitPolicy.
     */
    @java.lang.Override
    public com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy getWaitPolicy() {
      com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy result = com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.forNumber(waitPolicy_);
      return result == null ? com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @param value The waitPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setWaitPolicy(com.premiumminds.sonar.postgres.protobuf.LockWaitPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      waitPolicy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWaitPolicy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      waitPolicy_ = 0;
      onChanged();
      return this;
    }

    private boolean pushedDown_ ;
    /**
     * <code>bool pushed_down = 4 [json_name = "pushedDown"];</code>
     * @return The pushedDown.
     */
    @java.lang.Override
    public boolean getPushedDown() {
      return pushedDown_;
    }
    /**
     * <code>bool pushed_down = 4 [json_name = "pushedDown"];</code>
     * @param value The pushedDown to set.
     * @return This builder for chaining.
     */
    public Builder setPushedDown(boolean value) {

      pushedDown_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool pushed_down = 4 [json_name = "pushedDown"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPushedDown() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pushedDown_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.RowMarkClause)
  }

  // @@protoc_insertion_point(class_scope:pg_query.RowMarkClause)
  private static final com.premiumminds.sonar.postgres.protobuf.RowMarkClause DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.postgres.protobuf.RowMarkClause();
  }

  public static com.premiumminds.sonar.postgres.protobuf.RowMarkClause getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RowMarkClause>
      PARSER = new com.google.protobuf.AbstractParser<RowMarkClause>() {
    @java.lang.Override
    public RowMarkClause parsePartialFrom(
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

  public static com.google.protobuf.Parser<RowMarkClause> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RowMarkClause> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.postgres.protobuf.RowMarkClause getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

