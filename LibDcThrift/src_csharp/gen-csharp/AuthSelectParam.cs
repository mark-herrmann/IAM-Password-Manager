/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class AuthSelectParam : TBase
{
  private string _authGatewayId;
  private string _loginId;
  private byte[] _sharedSecret;
  private byte[] _udid;
  private string _workstationName;
  private ClientType _clientType;

  public string AuthGatewayId
  {
    get
    {
      return _authGatewayId;
    }
    set
    {
      __isset.authGatewayId = true;
      this._authGatewayId = value;
    }
  }

  public string LoginId
  {
    get
    {
      return _loginId;
    }
    set
    {
      __isset.loginId = true;
      this._loginId = value;
    }
  }

  public byte[] SharedSecret
  {
    get
    {
      return _sharedSecret;
    }
    set
    {
      __isset.sharedSecret = true;
      this._sharedSecret = value;
    }
  }

  public byte[] Udid
  {
    get
    {
      return _udid;
    }
    set
    {
      __isset.udid = true;
      this._udid = value;
    }
  }

  public string WorkstationName
  {
    get
    {
      return _workstationName;
    }
    set
    {
      __isset.workstationName = true;
      this._workstationName = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref=".ClientType"/>
  /// </summary>
  public ClientType ClientType
  {
    get
    {
      return _clientType;
    }
    set
    {
      __isset.clientType = true;
      this._clientType = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool authGatewayId;
    public bool loginId;
    public bool sharedSecret;
    public bool udid;
    public bool workstationName;
    public bool clientType;
  }

  public AuthSelectParam() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String) {
              AuthGatewayId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              LoginId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              SharedSecret = iprot.ReadBinary();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Udid = iprot.ReadBinary();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              WorkstationName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              ClientType = (ClientType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("AuthSelectParam");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (AuthGatewayId != null && __isset.authGatewayId) {
        field.Name = "authGatewayId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AuthGatewayId);
        oprot.WriteFieldEnd();
      }
      if (LoginId != null && __isset.loginId) {
        field.Name = "loginId";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(LoginId);
        oprot.WriteFieldEnd();
      }
      if (SharedSecret != null && __isset.sharedSecret) {
        field.Name = "sharedSecret";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteBinary(SharedSecret);
        oprot.WriteFieldEnd();
      }
      if (Udid != null && __isset.udid) {
        field.Name = "udid";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBinary(Udid);
        oprot.WriteFieldEnd();
      }
      if (WorkstationName != null && __isset.workstationName) {
        field.Name = "workstationName";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(WorkstationName);
        oprot.WriteFieldEnd();
      }
      if (__isset.clientType) {
        field.Name = "clientType";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ClientType);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("AuthSelectParam(");
    bool __first = true;
    if (AuthGatewayId != null && __isset.authGatewayId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AuthGatewayId: ");
      __sb.Append(AuthGatewayId);
    }
    if (LoginId != null && __isset.loginId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("LoginId: ");
      __sb.Append(LoginId);
    }
    if (SharedSecret != null && __isset.sharedSecret) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SharedSecret: ");
      __sb.Append(SharedSecret);
    }
    if (Udid != null && __isset.udid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Udid: ");
      __sb.Append(Udid);
    }
    if (WorkstationName != null && __isset.workstationName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("WorkstationName: ");
      __sb.Append(WorkstationName);
    }
    if (__isset.clientType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ClientType: ");
      __sb.Append(ClientType);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

