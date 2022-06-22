/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.doubleclue.comm.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-10-21")
public class DomainSdkConfigResponse implements org.apache.thrift.TBase<DomainSdkConfigResponse, DomainSdkConfigResponse._Fields>, java.io.Serializable, Cloneable, Comparable<DomainSdkConfigResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainSdkConfigResponse");

  private static final org.apache.thrift.protocol.TField SDK_CONFIG_DCEM_FIELD_DESC = new org.apache.thrift.protocol.TField("sdkConfigDcem", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DomainSdkConfigResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DomainSdkConfigResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer sdkConfigDcem; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SDK_CONFIG_DCEM((short)1, "sdkConfigDcem");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SDK_CONFIG_DCEM
          return SDK_CONFIG_DCEM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.SDK_CONFIG_DCEM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SDK_CONFIG_DCEM, new org.apache.thrift.meta_data.FieldMetaData("sdkConfigDcem", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainSdkConfigResponse.class, metaDataMap);
  }

  public DomainSdkConfigResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainSdkConfigResponse(DomainSdkConfigResponse other) {
    if (other.isSetSdkConfigDcem()) {
      this.sdkConfigDcem = org.apache.thrift.TBaseHelper.copyBinary(other.sdkConfigDcem);
    }
  }

  public DomainSdkConfigResponse deepCopy() {
    return new DomainSdkConfigResponse(this);
  }

  @Override
  public void clear() {
    this.sdkConfigDcem = null;
  }

  public byte[] getSdkConfigDcem() {
    setSdkConfigDcem(org.apache.thrift.TBaseHelper.rightSize(sdkConfigDcem));
    return sdkConfigDcem == null ? null : sdkConfigDcem.array();
  }

  public java.nio.ByteBuffer bufferForSdkConfigDcem() {
    return org.apache.thrift.TBaseHelper.copyBinary(sdkConfigDcem);
  }

  public DomainSdkConfigResponse setSdkConfigDcem(byte[] sdkConfigDcem) {
    this.sdkConfigDcem = sdkConfigDcem == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(sdkConfigDcem.clone());
    return this;
  }

  public DomainSdkConfigResponse setSdkConfigDcem(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer sdkConfigDcem) {
    this.sdkConfigDcem = org.apache.thrift.TBaseHelper.copyBinary(sdkConfigDcem);
    return this;
  }

  public void unsetSdkConfigDcem() {
    this.sdkConfigDcem = null;
  }

  /** Returns true if field sdkConfigDcem is set (has been assigned a value) and false otherwise */
  public boolean isSetSdkConfigDcem() {
    return this.sdkConfigDcem != null;
  }

  public void setSdkConfigDcemIsSet(boolean value) {
    if (!value) {
      this.sdkConfigDcem = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SDK_CONFIG_DCEM:
      if (value == null) {
        unsetSdkConfigDcem();
      } else {
        if (value instanceof byte[]) {
          setSdkConfigDcem((byte[])value);
        } else {
          setSdkConfigDcem((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SDK_CONFIG_DCEM:
      return getSdkConfigDcem();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SDK_CONFIG_DCEM:
      return isSetSdkConfigDcem();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainSdkConfigResponse)
      return this.equals((DomainSdkConfigResponse)that);
    return false;
  }

  public boolean equals(DomainSdkConfigResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sdkConfigDcem = true && this.isSetSdkConfigDcem();
    boolean that_present_sdkConfigDcem = true && that.isSetSdkConfigDcem();
    if (this_present_sdkConfigDcem || that_present_sdkConfigDcem) {
      if (!(this_present_sdkConfigDcem && that_present_sdkConfigDcem))
        return false;
      if (!this.sdkConfigDcem.equals(that.sdkConfigDcem))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSdkConfigDcem()) ? 131071 : 524287);
    if (isSetSdkConfigDcem())
      hashCode = hashCode * 8191 + sdkConfigDcem.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DomainSdkConfigResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSdkConfigDcem()).compareTo(other.isSetSdkConfigDcem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSdkConfigDcem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sdkConfigDcem, other.sdkConfigDcem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DomainSdkConfigResponse(");
    boolean first = true;

    if (isSetSdkConfigDcem()) {
      sb.append("sdkConfigDcem:");
      if (this.sdkConfigDcem == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.sdkConfigDcem, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DomainSdkConfigResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DomainSdkConfigResponseStandardScheme getScheme() {
      return new DomainSdkConfigResponseStandardScheme();
    }
  }

  private static class DomainSdkConfigResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<DomainSdkConfigResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainSdkConfigResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SDK_CONFIG_DCEM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sdkConfigDcem = iprot.readBinary();
              struct.setSdkConfigDcemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainSdkConfigResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sdkConfigDcem != null) {
        if (struct.isSetSdkConfigDcem()) {
          oprot.writeFieldBegin(SDK_CONFIG_DCEM_FIELD_DESC);
          oprot.writeBinary(struct.sdkConfigDcem);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainSdkConfigResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DomainSdkConfigResponseTupleScheme getScheme() {
      return new DomainSdkConfigResponseTupleScheme();
    }
  }

  private static class DomainSdkConfigResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<DomainSdkConfigResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainSdkConfigResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSdkConfigDcem()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSdkConfigDcem()) {
        oprot.writeBinary(struct.sdkConfigDcem);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainSdkConfigResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.sdkConfigDcem = iprot.readBinary();
        struct.setSdkConfigDcemIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

