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
public partial class DomainSdkConfigResponse : TBase
{
  private byte[] _sdkConfigDcem;

  public byte[] SdkConfigDcem
  {
    get
    {
      return _sdkConfigDcem;
    }
    set
    {
      __isset.sdkConfigDcem = true;
      this._sdkConfigDcem = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool sdkConfigDcem;
  }

  public DomainSdkConfigResponse() {
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
              SdkConfigDcem = iprot.ReadBinary();
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
      TStruct struc = new TStruct("DomainSdkConfigResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SdkConfigDcem != null && __isset.sdkConfigDcem) {
        field.Name = "sdkConfigDcem";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteBinary(SdkConfigDcem);
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
    StringBuilder __sb = new StringBuilder("DomainSdkConfigResponse(");
    bool __first = true;
    if (SdkConfigDcem != null && __isset.sdkConfigDcem) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SdkConfigDcem: ");
      __sb.Append(SdkConfigDcem);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

