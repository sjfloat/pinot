/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.linkedin.pinot.common.response;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A single row event keyed by field name
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-2")
public class RowEvent implements org.apache.thrift.TBase<RowEvent, RowEvent._Fields>, java.io.Serializable, Cloneable, Comparable<RowEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RowEvent");

  private static final org.apache.thrift.protocol.TField STRING_ROW_EVENT_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("stringRowEventMap", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RowEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RowEventTupleSchemeFactory());
  }

  private Map<String,RowEventVal> stringRowEventMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STRING_ROW_EVENT_MAP((short)1, "stringRowEventMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STRING_ROW_EVENT_MAP
          return STRING_ROW_EVENT_MAP;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.STRING_ROW_EVENT_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STRING_ROW_EVENT_MAP, new org.apache.thrift.meta_data.FieldMetaData("stringRowEventMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RowEventVal.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RowEvent.class, metaDataMap);
  }

  public RowEvent() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RowEvent(RowEvent other) {
    if (other.isSetStringRowEventMap()) {
      Map<String,RowEventVal> __this__stringRowEventMap = new HashMap<String,RowEventVal>(other.stringRowEventMap.size());
      for (Map.Entry<String, RowEventVal> other_element : other.stringRowEventMap.entrySet()) {

        String other_element_key = other_element.getKey();
        RowEventVal other_element_value = other_element.getValue();

        String __this__stringRowEventMap_copy_key = other_element_key;

        RowEventVal __this__stringRowEventMap_copy_value = new RowEventVal(other_element_value);

        __this__stringRowEventMap.put(__this__stringRowEventMap_copy_key, __this__stringRowEventMap_copy_value);
      }
      this.stringRowEventMap = __this__stringRowEventMap;
    }
  }

  public RowEvent deepCopy() {
    return new RowEvent(this);
  }

  @Override
  public void clear() {
    this.stringRowEventMap = null;
  }

  public int getStringRowEventMapSize() {
    return (this.stringRowEventMap == null) ? 0 : this.stringRowEventMap.size();
  }

  public void putToStringRowEventMap(String key, RowEventVal val) {
    if (this.stringRowEventMap == null) {
      this.stringRowEventMap = new HashMap<String,RowEventVal>();
    }
    this.stringRowEventMap.put(key, val);
  }

  public Map<String,RowEventVal> getStringRowEventMap() {
    return this.stringRowEventMap;
  }

  public void setStringRowEventMap(Map<String,RowEventVal> stringRowEventMap) {
    this.stringRowEventMap = stringRowEventMap;
  }

  public void unsetStringRowEventMap() {
    this.stringRowEventMap = null;
  }

  /** Returns true if field stringRowEventMap is set (has been assigned a value) and false otherwise */
  public boolean isSetStringRowEventMap() {
    return this.stringRowEventMap != null;
  }

  public void setStringRowEventMapIsSet(boolean value) {
    if (!value) {
      this.stringRowEventMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STRING_ROW_EVENT_MAP:
      if (value == null) {
        unsetStringRowEventMap();
      } else {
        setStringRowEventMap((Map<String,RowEventVal>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STRING_ROW_EVENT_MAP:
      return getStringRowEventMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STRING_ROW_EVENT_MAP:
      return isSetStringRowEventMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RowEvent)
      return this.equals((RowEvent)that);
    return false;
  }

  public boolean equals(RowEvent that) {
    if (that == null)
      return false;

    boolean this_present_stringRowEventMap = true && this.isSetStringRowEventMap();
    boolean that_present_stringRowEventMap = true && that.isSetStringRowEventMap();
    if (this_present_stringRowEventMap || that_present_stringRowEventMap) {
      if (!(this_present_stringRowEventMap && that_present_stringRowEventMap))
        return false;
      if (!this.stringRowEventMap.equals(that.stringRowEventMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stringRowEventMap = true && (isSetStringRowEventMap());
    list.add(present_stringRowEventMap);
    if (present_stringRowEventMap)
      list.add(stringRowEventMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(RowEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStringRowEventMap()).compareTo(other.isSetStringRowEventMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringRowEventMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringRowEventMap, other.stringRowEventMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RowEvent(");
    boolean first = true;

    if (isSetStringRowEventMap()) {
      sb.append("stringRowEventMap:");
      if (this.stringRowEventMap == null) {
        sb.append("null");
      } else {
        sb.append(this.stringRowEventMap);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RowEventStandardSchemeFactory implements SchemeFactory {
    public RowEventStandardScheme getScheme() {
      return new RowEventStandardScheme();
    }
  }

  private static class RowEventStandardScheme extends StandardScheme<RowEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RowEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STRING_ROW_EVENT_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map156 = iprot.readMapBegin();
                struct.stringRowEventMap = new HashMap<String,RowEventVal>(2*_map156.size);
                String _key157;
                RowEventVal _val158;
                for (int _i159 = 0; _i159 < _map156.size; ++_i159)
                {
                  _key157 = iprot.readString();
                  _val158 = new RowEventVal();
                  _val158.read(iprot);
                  struct.stringRowEventMap.put(_key157, _val158);
                }
                iprot.readMapEnd();
              }
              struct.setStringRowEventMapIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RowEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stringRowEventMap != null) {
        if (struct.isSetStringRowEventMap()) {
          oprot.writeFieldBegin(STRING_ROW_EVENT_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.stringRowEventMap.size()));
            for (Map.Entry<String, RowEventVal> _iter160 : struct.stringRowEventMap.entrySet())
            {
              oprot.writeString(_iter160.getKey());
              _iter160.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RowEventTupleSchemeFactory implements SchemeFactory {
    public RowEventTupleScheme getScheme() {
      return new RowEventTupleScheme();
    }
  }

  private static class RowEventTupleScheme extends TupleScheme<RowEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RowEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStringRowEventMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStringRowEventMap()) {
        {
          oprot.writeI32(struct.stringRowEventMap.size());
          for (Map.Entry<String, RowEventVal> _iter161 : struct.stringRowEventMap.entrySet())
          {
            oprot.writeString(_iter161.getKey());
            _iter161.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RowEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map162 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.stringRowEventMap = new HashMap<String,RowEventVal>(2*_map162.size);
          String _key163;
          RowEventVal _val164;
          for (int _i165 = 0; _i165 < _map162.size; ++_i165)
          {
            _key163 = iprot.readString();
            _val164 = new RowEventVal();
            _val164.read(iprot);
            struct.stringRowEventMap.put(_key163, _val164);
          }
        }
        struct.setStringRowEventMapIsSet(true);
      }
    }
  }

}

