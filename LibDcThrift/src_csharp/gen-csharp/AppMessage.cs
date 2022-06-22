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
public partial class AppMessage : TBase
{
  private long _id;
  private MsgPriority _priority;
  private int _templateId;
  private bool _signitureRequired;
  private bool _responseRequired;
  private int _responseTime;
  private long _responseTo;
  private Dictionary<string, string> _data;

  public long Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="MsgPriority"/>
  /// </summary>
  public MsgPriority Priority
  {
    get
    {
      return _priority;
    }
    set
    {
      __isset.priority = true;
      this._priority = value;
    }
  }

  public int TemplateId
  {
    get
    {
      return _templateId;
    }
    set
    {
      __isset.templateId = true;
      this._templateId = value;
    }
  }

  public bool SignitureRequired
  {
    get
    {
      return _signitureRequired;
    }
    set
    {
      __isset.signitureRequired = true;
      this._signitureRequired = value;
    }
  }

  public bool ResponseRequired
  {
    get
    {
      return _responseRequired;
    }
    set
    {
      __isset.responseRequired = true;
      this._responseRequired = value;
    }
  }

  public int ResponseTime
  {
    get
    {
      return _responseTime;
    }
    set
    {
      __isset.responseTime = true;
      this._responseTime = value;
    }
  }

  public long ResponseTo
  {
    get
    {
      return _responseTo;
    }
    set
    {
      __isset.responseTo = true;
      this._responseTo = value;
    }
  }

  public Dictionary<string, string> Data
  {
    get
    {
      return _data;
    }
    set
    {
      __isset.data = true;
      this._data = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool id;
    public bool priority;
    public bool templateId;
    public bool signitureRequired;
    public bool responseRequired;
    public bool responseTime;
    public bool responseTo;
    public bool data;
  }

  public AppMessage() {
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
            if (field.Type == TType.I64) {
              Id = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Priority = (MsgPriority)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              TemplateId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Bool) {
              SignitureRequired = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Bool) {
              ResponseRequired = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              ResponseTime = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I64) {
              ResponseTo = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.Map) {
              {
                Data = new Dictionary<string, string>();
                TMap _map5 = iprot.ReadMapBegin();
                for( int _i6 = 0; _i6 < _map5.Count; ++_i6)
                {
                  string _key7;
                  string _val8;
                  _key7 = iprot.ReadString();
                  _val8 = iprot.ReadString();
                  Data[_key7] = _val8;
                }
                iprot.ReadMapEnd();
              }
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
      TStruct struc = new TStruct("AppMessage");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.id) {
        field.Name = "id";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Id);
        oprot.WriteFieldEnd();
      }
      if (__isset.priority) {
        field.Name = "priority";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Priority);
        oprot.WriteFieldEnd();
      }
      if (__isset.templateId) {
        field.Name = "templateId";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(TemplateId);
        oprot.WriteFieldEnd();
      }
      if (__isset.signitureRequired) {
        field.Name = "signitureRequired";
        field.Type = TType.Bool;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(SignitureRequired);
        oprot.WriteFieldEnd();
      }
      if (__isset.responseRequired) {
        field.Name = "responseRequired";
        field.Type = TType.Bool;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(ResponseRequired);
        oprot.WriteFieldEnd();
      }
      if (__isset.responseTime) {
        field.Name = "responseTime";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ResponseTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.responseTo) {
        field.Name = "responseTo";
        field.Type = TType.I64;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ResponseTo);
        oprot.WriteFieldEnd();
      }
      if (Data != null && __isset.data) {
        field.Name = "data";
        field.Type = TType.Map;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, Data.Count));
          foreach (string _iter9 in Data.Keys)
          {
            oprot.WriteString(_iter9);
            oprot.WriteString(Data[_iter9]);
          }
          oprot.WriteMapEnd();
        }
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
    StringBuilder __sb = new StringBuilder("AppMessage(");
    bool __first = true;
    if (__isset.id) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Id: ");
      __sb.Append(Id);
    }
    if (__isset.priority) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Priority: ");
      __sb.Append(Priority);
    }
    if (__isset.templateId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TemplateId: ");
      __sb.Append(TemplateId);
    }
    if (__isset.signitureRequired) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SignitureRequired: ");
      __sb.Append(SignitureRequired);
    }
    if (__isset.responseRequired) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ResponseRequired: ");
      __sb.Append(ResponseRequired);
    }
    if (__isset.responseTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ResponseTime: ");
      __sb.Append(ResponseTime);
    }
    if (__isset.responseTo) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ResponseTo: ");
      __sb.Append(ResponseTo);
    }
    if (Data != null && __isset.data) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Data: ");
      __sb.Append(Data);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

