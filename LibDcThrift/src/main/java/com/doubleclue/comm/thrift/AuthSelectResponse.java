/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.doubleclue.comm.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-10-21")
public class AuthSelectResponse implements org.apache.thrift.TBase<AuthSelectResponse, AuthSelectResponse._Fields>, java.io.Serializable, Cloneable, Comparable<AuthSelectResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthSelectResponse");

  private static final org.apache.thrift.protocol.TField AUTH_METHODS_FIELD_DESC = new org.apache.thrift.protocol.TField("authMethods", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AuthSelectResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AuthSelectResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<com.doubleclue.comm.thrift.ThriftAuthMethod> authMethods; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AUTH_METHODS((short)1, "authMethods");

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
        case 1: // AUTH_METHODS
          return AUTH_METHODS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AUTH_METHODS, new org.apache.thrift.meta_data.FieldMetaData("authMethods", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.doubleclue.comm.thrift.ThriftAuthMethod.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthSelectResponse.class, metaDataMap);
  }

  public AuthSelectResponse() {
  }

  public AuthSelectResponse(
    java.util.List<com.doubleclue.comm.thrift.ThriftAuthMethod> authMethods)
  {
    this();
    this.authMethods = authMethods;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthSelectResponse(AuthSelectResponse other) {
    if (other.isSetAuthMethods()) {
      java.util.List<com.doubleclue.comm.thrift.ThriftAuthMethod> __this__authMethods = new java.util.ArrayList<com.doubleclue.comm.thrift.ThriftAuthMethod>(other.authMethods.size());
      for (com.doubleclue.comm.thrift.ThriftAuthMethod other_element : other.authMethods) {
        __this__authMethods.add(other_element);
      }
      this.authMethods = __this__authMethods;
    }
  }

  public AuthSelectResponse deepCopy() {
    return new AuthSelectResponse(this);
  }

  @Override
  public void clear() {
    this.authMethods = null;
  }

  public int getAuthMethodsSize() {
    return (this.authMethods == null) ? 0 : this.authMethods.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.doubleclue.comm.thrift.ThriftAuthMethod> getAuthMethodsIterator() {
    return (this.authMethods == null) ? null : this.authMethods.iterator();
  }

  public void addToAuthMethods(com.doubleclue.comm.thrift.ThriftAuthMethod elem) {
    if (this.authMethods == null) {
      this.authMethods = new java.util.ArrayList<com.doubleclue.comm.thrift.ThriftAuthMethod>();
    }
    this.authMethods.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.doubleclue.comm.thrift.ThriftAuthMethod> getAuthMethods() {
    return this.authMethods;
  }

  public AuthSelectResponse setAuthMethods(@org.apache.thrift.annotation.Nullable java.util.List<com.doubleclue.comm.thrift.ThriftAuthMethod> authMethods) {
    this.authMethods = authMethods;
    return this;
  }

  public void unsetAuthMethods() {
    this.authMethods = null;
  }

  /** Returns true if field authMethods is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthMethods() {
    return this.authMethods != null;
  }

  public void setAuthMethodsIsSet(boolean value) {
    if (!value) {
      this.authMethods = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case AUTH_METHODS:
      if (value == null) {
        unsetAuthMethods();
      } else {
        setAuthMethods((java.util.List<com.doubleclue.comm.thrift.ThriftAuthMethod>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTH_METHODS:
      return getAuthMethods();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AUTH_METHODS:
      return isSetAuthMethods();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthSelectResponse)
      return this.equals((AuthSelectResponse)that);
    return false;
  }

  public boolean equals(AuthSelectResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_authMethods = true && this.isSetAuthMethods();
    boolean that_present_authMethods = true && that.isSetAuthMethods();
    if (this_present_authMethods || that_present_authMethods) {
      if (!(this_present_authMethods && that_present_authMethods))
        return false;
      if (!this.authMethods.equals(that.authMethods))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAuthMethods()) ? 131071 : 524287);
    if (isSetAuthMethods())
      hashCode = hashCode * 8191 + authMethods.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AuthSelectResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAuthMethods()).compareTo(other.isSetAuthMethods());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthMethods()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authMethods, other.authMethods);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthSelectResponse(");
    boolean first = true;

    sb.append("authMethods:");
    if (this.authMethods == null) {
      sb.append("null");
    } else {
      sb.append(this.authMethods);
    }
    first = false;
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

  private static class AuthSelectResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthSelectResponseStandardScheme getScheme() {
      return new AuthSelectResponseStandardScheme();
    }
  }

  private static class AuthSelectResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<AuthSelectResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthSelectResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AUTH_METHODS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.authMethods = new java.util.ArrayList<com.doubleclue.comm.thrift.ThriftAuthMethod>(_list18.size);
                @org.apache.thrift.annotation.Nullable com.doubleclue.comm.thrift.ThriftAuthMethod _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = com.doubleclue.comm.thrift.ThriftAuthMethod.findByValue(iprot.readI32());
                  if (_elem19 != null)
                  {
                    struct.authMethods.add(_elem19);
                  }
                }
                iprot.readListEnd();
              }
              struct.setAuthMethodsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthSelectResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.authMethods != null) {
        oprot.writeFieldBegin(AUTH_METHODS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.authMethods.size()));
          for (com.doubleclue.comm.thrift.ThriftAuthMethod _iter21 : struct.authMethods)
          {
            oprot.writeI32(_iter21.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthSelectResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthSelectResponseTupleScheme getScheme() {
      return new AuthSelectResponseTupleScheme();
    }
  }

  private static class AuthSelectResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<AuthSelectResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthSelectResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAuthMethods()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAuthMethods()) {
        {
          oprot.writeI32(struct.authMethods.size());
          for (com.doubleclue.comm.thrift.ThriftAuthMethod _iter22 : struct.authMethods)
          {
            oprot.writeI32(_iter22.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthSelectResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.authMethods = new java.util.ArrayList<com.doubleclue.comm.thrift.ThriftAuthMethod>(_list23.size);
          @org.apache.thrift.annotation.Nullable com.doubleclue.comm.thrift.ThriftAuthMethod _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = com.doubleclue.comm.thrift.ThriftAuthMethod.findByValue(iprot.readI32());
            if (_elem24 != null)
            {
              struct.authMethods.add(_elem24);
            }
          }
        }
        struct.setAuthMethodsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

