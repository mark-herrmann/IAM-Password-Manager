/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.doubleclue.comm.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-10-21")
public class RpOpen implements org.apache.thrift.TBase<RpOpen, RpOpen._Fields>, java.io.Serializable, Cloneable, Comparable<RpOpen> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RpOpen");

  private static final org.apache.thrift.protocol.TField REMOTE_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("remoteAddress", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField APP_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("appVersion", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LIB_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("libVersion", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TENANT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tenantName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RpOpenStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RpOpenTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String remoteAddress; // required
  public @org.apache.thrift.annotation.Nullable AppVersion appVersion; // required
  public @org.apache.thrift.annotation.Nullable AppVersion libVersion; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String tenantName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REMOTE_ADDRESS((short)1, "remoteAddress"),
    APP_VERSION((short)2, "appVersion"),
    LIB_VERSION((short)3, "libVersion"),
    TENANT_NAME((short)4, "tenantName");

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
        case 1: // REMOTE_ADDRESS
          return REMOTE_ADDRESS;
        case 2: // APP_VERSION
          return APP_VERSION;
        case 3: // LIB_VERSION
          return LIB_VERSION;
        case 4: // TENANT_NAME
          return TENANT_NAME;
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
    tmpMap.put(_Fields.REMOTE_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("remoteAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_VERSION, new org.apache.thrift.meta_data.FieldMetaData("appVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AppVersion.class)));
    tmpMap.put(_Fields.LIB_VERSION, new org.apache.thrift.meta_data.FieldMetaData("libVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AppVersion.class)));
    tmpMap.put(_Fields.TENANT_NAME, new org.apache.thrift.meta_data.FieldMetaData("tenantName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RpOpen.class, metaDataMap);
  }

  public RpOpen() {
  }

  public RpOpen(
    java.lang.String remoteAddress,
    AppVersion appVersion,
    AppVersion libVersion,
    java.lang.String tenantName)
  {
    this();
    this.remoteAddress = remoteAddress;
    this.appVersion = appVersion;
    this.libVersion = libVersion;
    this.tenantName = tenantName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RpOpen(RpOpen other) {
    if (other.isSetRemoteAddress()) {
      this.remoteAddress = other.remoteAddress;
    }
    if (other.isSetAppVersion()) {
      this.appVersion = new AppVersion(other.appVersion);
    }
    if (other.isSetLibVersion()) {
      this.libVersion = new AppVersion(other.libVersion);
    }
    if (other.isSetTenantName()) {
      this.tenantName = other.tenantName;
    }
  }

  public RpOpen deepCopy() {
    return new RpOpen(this);
  }

  @Override
  public void clear() {
    this.remoteAddress = null;
    this.appVersion = null;
    this.libVersion = null;
    this.tenantName = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRemoteAddress() {
    return this.remoteAddress;
  }

  public RpOpen setRemoteAddress(@org.apache.thrift.annotation.Nullable java.lang.String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

  public void unsetRemoteAddress() {
    this.remoteAddress = null;
  }

  /** Returns true if field remoteAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoteAddress() {
    return this.remoteAddress != null;
  }

  public void setRemoteAddressIsSet(boolean value) {
    if (!value) {
      this.remoteAddress = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public AppVersion getAppVersion() {
    return this.appVersion;
  }

  public RpOpen setAppVersion(@org.apache.thrift.annotation.Nullable AppVersion appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  public void unsetAppVersion() {
    this.appVersion = null;
  }

  /** Returns true if field appVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetAppVersion() {
    return this.appVersion != null;
  }

  public void setAppVersionIsSet(boolean value) {
    if (!value) {
      this.appVersion = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public AppVersion getLibVersion() {
    return this.libVersion;
  }

  public RpOpen setLibVersion(@org.apache.thrift.annotation.Nullable AppVersion libVersion) {
    this.libVersion = libVersion;
    return this;
  }

  public void unsetLibVersion() {
    this.libVersion = null;
  }

  /** Returns true if field libVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetLibVersion() {
    return this.libVersion != null;
  }

  public void setLibVersionIsSet(boolean value) {
    if (!value) {
      this.libVersion = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTenantName() {
    return this.tenantName;
  }

  public RpOpen setTenantName(@org.apache.thrift.annotation.Nullable java.lang.String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public void unsetTenantName() {
    this.tenantName = null;
  }

  /** Returns true if field tenantName is set (has been assigned a value) and false otherwise */
  public boolean isSetTenantName() {
    return this.tenantName != null;
  }

  public void setTenantNameIsSet(boolean value) {
    if (!value) {
      this.tenantName = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case REMOTE_ADDRESS:
      if (value == null) {
        unsetRemoteAddress();
      } else {
        setRemoteAddress((java.lang.String)value);
      }
      break;

    case APP_VERSION:
      if (value == null) {
        unsetAppVersion();
      } else {
        setAppVersion((AppVersion)value);
      }
      break;

    case LIB_VERSION:
      if (value == null) {
        unsetLibVersion();
      } else {
        setLibVersion((AppVersion)value);
      }
      break;

    case TENANT_NAME:
      if (value == null) {
        unsetTenantName();
      } else {
        setTenantName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REMOTE_ADDRESS:
      return getRemoteAddress();

    case APP_VERSION:
      return getAppVersion();

    case LIB_VERSION:
      return getLibVersion();

    case TENANT_NAME:
      return getTenantName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REMOTE_ADDRESS:
      return isSetRemoteAddress();
    case APP_VERSION:
      return isSetAppVersion();
    case LIB_VERSION:
      return isSetLibVersion();
    case TENANT_NAME:
      return isSetTenantName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RpOpen)
      return this.equals((RpOpen)that);
    return false;
  }

  public boolean equals(RpOpen that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_remoteAddress = true && this.isSetRemoteAddress();
    boolean that_present_remoteAddress = true && that.isSetRemoteAddress();
    if (this_present_remoteAddress || that_present_remoteAddress) {
      if (!(this_present_remoteAddress && that_present_remoteAddress))
        return false;
      if (!this.remoteAddress.equals(that.remoteAddress))
        return false;
    }

    boolean this_present_appVersion = true && this.isSetAppVersion();
    boolean that_present_appVersion = true && that.isSetAppVersion();
    if (this_present_appVersion || that_present_appVersion) {
      if (!(this_present_appVersion && that_present_appVersion))
        return false;
      if (!this.appVersion.equals(that.appVersion))
        return false;
    }

    boolean this_present_libVersion = true && this.isSetLibVersion();
    boolean that_present_libVersion = true && that.isSetLibVersion();
    if (this_present_libVersion || that_present_libVersion) {
      if (!(this_present_libVersion && that_present_libVersion))
        return false;
      if (!this.libVersion.equals(that.libVersion))
        return false;
    }

    boolean this_present_tenantName = true && this.isSetTenantName();
    boolean that_present_tenantName = true && that.isSetTenantName();
    if (this_present_tenantName || that_present_tenantName) {
      if (!(this_present_tenantName && that_present_tenantName))
        return false;
      if (!this.tenantName.equals(that.tenantName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRemoteAddress()) ? 131071 : 524287);
    if (isSetRemoteAddress())
      hashCode = hashCode * 8191 + remoteAddress.hashCode();

    hashCode = hashCode * 8191 + ((isSetAppVersion()) ? 131071 : 524287);
    if (isSetAppVersion())
      hashCode = hashCode * 8191 + appVersion.hashCode();

    hashCode = hashCode * 8191 + ((isSetLibVersion()) ? 131071 : 524287);
    if (isSetLibVersion())
      hashCode = hashCode * 8191 + libVersion.hashCode();

    hashCode = hashCode * 8191 + ((isSetTenantName()) ? 131071 : 524287);
    if (isSetTenantName())
      hashCode = hashCode * 8191 + tenantName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RpOpen other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRemoteAddress()).compareTo(other.isSetRemoteAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoteAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remoteAddress, other.remoteAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAppVersion()).compareTo(other.isSetAppVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appVersion, other.appVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLibVersion()).compareTo(other.isSetLibVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLibVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.libVersion, other.libVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTenantName()).compareTo(other.isSetTenantName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTenantName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tenantName, other.tenantName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RpOpen(");
    boolean first = true;

    sb.append("remoteAddress:");
    if (this.remoteAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.remoteAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appVersion:");
    if (this.appVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.appVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("libVersion:");
    if (this.libVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.libVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tenantName:");
    if (this.tenantName == null) {
      sb.append("null");
    } else {
      sb.append(this.tenantName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (appVersion != null) {
      appVersion.validate();
    }
    if (libVersion != null) {
      libVersion.validate();
    }
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

  private static class RpOpenStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RpOpenStandardScheme getScheme() {
      return new RpOpenStandardScheme();
    }
  }

  private static class RpOpenStandardScheme extends org.apache.thrift.scheme.StandardScheme<RpOpen> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RpOpen struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REMOTE_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.remoteAddress = iprot.readString();
              struct.setRemoteAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.appVersion = new AppVersion();
              struct.appVersion.read(iprot);
              struct.setAppVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LIB_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.libVersion = new AppVersion();
              struct.libVersion.read(iprot);
              struct.setLibVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TENANT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tenantName = iprot.readString();
              struct.setTenantNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RpOpen struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.remoteAddress != null) {
        oprot.writeFieldBegin(REMOTE_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.remoteAddress);
        oprot.writeFieldEnd();
      }
      if (struct.appVersion != null) {
        oprot.writeFieldBegin(APP_VERSION_FIELD_DESC);
        struct.appVersion.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.libVersion != null) {
        oprot.writeFieldBegin(LIB_VERSION_FIELD_DESC);
        struct.libVersion.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.tenantName != null) {
        oprot.writeFieldBegin(TENANT_NAME_FIELD_DESC);
        oprot.writeString(struct.tenantName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RpOpenTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RpOpenTupleScheme getScheme() {
      return new RpOpenTupleScheme();
    }
  }

  private static class RpOpenTupleScheme extends org.apache.thrift.scheme.TupleScheme<RpOpen> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RpOpen struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRemoteAddress()) {
        optionals.set(0);
      }
      if (struct.isSetAppVersion()) {
        optionals.set(1);
      }
      if (struct.isSetLibVersion()) {
        optionals.set(2);
      }
      if (struct.isSetTenantName()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRemoteAddress()) {
        oprot.writeString(struct.remoteAddress);
      }
      if (struct.isSetAppVersion()) {
        struct.appVersion.write(oprot);
      }
      if (struct.isSetLibVersion()) {
        struct.libVersion.write(oprot);
      }
      if (struct.isSetTenantName()) {
        oprot.writeString(struct.tenantName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RpOpen struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.remoteAddress = iprot.readString();
        struct.setRemoteAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.appVersion = new AppVersion();
        struct.appVersion.read(iprot);
        struct.setAppVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.libVersion = new AppVersion();
        struct.libVersion.read(iprot);
        struct.setLibVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.tenantName = iprot.readString();
        struct.setTenantNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

