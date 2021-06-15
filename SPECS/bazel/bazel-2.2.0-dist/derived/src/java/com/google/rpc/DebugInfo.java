// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 * <pre>
 * Describes additional debugging info.
 * </pre>
 *
 * Protobuf type {@code google.rpc.DebugInfo}
 */
public  final class DebugInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.rpc.DebugInfo)
    DebugInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DebugInfo.newBuilder() to construct.
  private DebugInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DebugInfo() {
    stackEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    detail_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DebugInfo(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              stackEntries_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            stackEntries_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            detail_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        stackEntries_ = stackEntries_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.rpc.DebugInfo.class, com.google.rpc.DebugInfo.Builder.class);
  }

  private int bitField0_;
  public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList stackEntries_;
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStackEntriesList() {
    return stackEntries_;
  }
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public int getStackEntriesCount() {
    return stackEntries_.size();
  }
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public java.lang.String getStackEntries(int index) {
    return stackEntries_.get(index);
  }
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStackEntriesBytes(int index) {
    return stackEntries_.getByteString(index);
  }

  public static final int DETAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object detail_;
  /**
   * <pre>
   * Additional debugging information provided by the server.
   * </pre>
   *
   * <code>string detail = 2;</code>
   */
  public java.lang.String getDetail() {
    java.lang.Object ref = detail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detail_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Additional debugging information provided by the server.
   * </pre>
   *
   * <code>string detail = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDetailBytes() {
    java.lang.Object ref = detail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < stackEntries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stackEntries_.getRaw(i));
    }
    if (!getDetailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, detail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < stackEntries_.size(); i++) {
        dataSize += computeStringSizeNoTag(stackEntries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStackEntriesList().size();
    }
    if (!getDetailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, detail_);
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
    if (!(obj instanceof com.google.rpc.DebugInfo)) {
      return super.equals(obj);
    }
    com.google.rpc.DebugInfo other = (com.google.rpc.DebugInfo) obj;

    boolean result = true;
    result = result && getStackEntriesList()
        .equals(other.getStackEntriesList());
    result = result && getDetail()
        .equals(other.getDetail());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStackEntriesCount() > 0) {
      hash = (37 * hash) + STACK_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getStackEntriesList().hashCode();
    }
    hash = (37 * hash) + DETAIL_FIELD_NUMBER;
    hash = (53 * hash) + getDetail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.rpc.DebugInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.DebugInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.DebugInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.DebugInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.DebugInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.DebugInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.DebugInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.rpc.DebugInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.rpc.DebugInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.rpc.DebugInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.rpc.DebugInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.rpc.DebugInfo parseFrom(
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
  public static Builder newBuilder(com.google.rpc.DebugInfo prototype) {
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
   * <pre>
   * Describes additional debugging info.
   * </pre>
   *
   * Protobuf type {@code google.rpc.DebugInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.DebugInfo)
      com.google.rpc.DebugInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.rpc.DebugInfo.class, com.google.rpc.DebugInfo.Builder.class);
    }

    // Construct using com.google.rpc.DebugInfo.newBuilder()
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
      stackEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      detail_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_descriptor;
    }

    @java.lang.Override
    public com.google.rpc.DebugInfo getDefaultInstanceForType() {
      return com.google.rpc.DebugInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.rpc.DebugInfo build() {
      com.google.rpc.DebugInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.rpc.DebugInfo buildPartial() {
      com.google.rpc.DebugInfo result = new com.google.rpc.DebugInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        stackEntries_ = stackEntries_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stackEntries_ = stackEntries_;
      result.detail_ = detail_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.rpc.DebugInfo) {
        return mergeFrom((com.google.rpc.DebugInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.rpc.DebugInfo other) {
      if (other == com.google.rpc.DebugInfo.getDefaultInstance()) return this;
      if (!other.stackEntries_.isEmpty()) {
        if (stackEntries_.isEmpty()) {
          stackEntries_ = other.stackEntries_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStackEntriesIsMutable();
          stackEntries_.addAll(other.stackEntries_);
        }
        onChanged();
      }
      if (!other.getDetail().isEmpty()) {
        detail_ = other.detail_;
        onChanged();
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
      com.google.rpc.DebugInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.rpc.DebugInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList stackEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStackEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        stackEntries_ = new com.google.protobuf.LazyStringArrayList(stackEntries_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStackEntriesList() {
      return stackEntries_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public int getStackEntriesCount() {
      return stackEntries_.size();
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public java.lang.String getStackEntries(int index) {
      return stackEntries_.get(index);
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStackEntriesBytes(int index) {
      return stackEntries_.getByteString(index);
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder setStackEntries(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStackEntriesIsMutable();
      stackEntries_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder addStackEntries(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStackEntriesIsMutable();
      stackEntries_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder addAllStackEntries(
        java.lang.Iterable<java.lang.String> values) {
      ensureStackEntriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stackEntries_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder clearStackEntries() {
      stackEntries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder addStackEntriesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStackEntriesIsMutable();
      stackEntries_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object detail_ = "";
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public java.lang.String getDetail() {
      java.lang.Object ref = detail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDetailBytes() {
      java.lang.Object ref = detail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public Builder setDetail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      detail_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public Builder clearDetail() {
      
      detail_ = getDefaultInstance().getDetail();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public Builder setDetailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      detail_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.rpc.DebugInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.DebugInfo)
  private static final com.google.rpc.DebugInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.rpc.DebugInfo();
  }

  public static com.google.rpc.DebugInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebugInfo>
      PARSER = new com.google.protobuf.AbstractParser<DebugInfo>() {
    @java.lang.Override
    public DebugInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DebugInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DebugInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebugInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.rpc.DebugInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

