/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
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
 * RC_BASIC文件格式元信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-15")
public class RCBasicMeta implements libthrift091.TBase<RCBasicMeta, RCBasicMeta._Fields>, java.io.Serializable, Cloneable, Comparable<RCBasicMeta> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RCBasicMeta");

  private static final libthrift091.protocol.TField KEYS_FIELD_DESC = new libthrift091.protocol.TField("keys", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField TYPES_FIELD_DESC = new libthrift091.protocol.TField("types", libthrift091.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RCBasicMetaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RCBasicMetaTupleSchemeFactory());
  }

  /**
   * 属性列表
   */
  public List<String> keys; // optional
  /**
   * 属性类型
   */
  public Map<String,com.xiaomi.infra.galaxy.sds.thrift.DataType> types; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 属性列表
     */
    KEYS((short)1, "keys"),
    /**
     * 属性类型
     */
    TYPES((short)2, "types");

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
        case 1: // KEYS
          return KEYS;
        case 2: // TYPES
          return TYPES;
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
  private static final _Fields optionals[] = {_Fields.KEYS,_Fields.TYPES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYS, new libthrift091.meta_data.FieldMetaData("keys", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.TYPES, new libthrift091.meta_data.FieldMetaData("types", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, com.xiaomi.infra.galaxy.sds.thrift.DataType.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RCBasicMeta.class, metaDataMap);
  }

  public RCBasicMeta() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RCBasicMeta(RCBasicMeta other) {
    if (other.isSetKeys()) {
      List<String> __this__keys = new ArrayList<String>(other.keys);
      this.keys = __this__keys;
    }
    if (other.isSetTypes()) {
      Map<String,com.xiaomi.infra.galaxy.sds.thrift.DataType> __this__types = new HashMap<String,com.xiaomi.infra.galaxy.sds.thrift.DataType>(other.types.size());
      for (Map.Entry<String, com.xiaomi.infra.galaxy.sds.thrift.DataType> other_element : other.types.entrySet()) {

        String other_element_key = other_element.getKey();
        com.xiaomi.infra.galaxy.sds.thrift.DataType other_element_value = other_element.getValue();

        String __this__types_copy_key = other_element_key;

        com.xiaomi.infra.galaxy.sds.thrift.DataType __this__types_copy_value = other_element_value;

        __this__types.put(__this__types_copy_key, __this__types_copy_value);
      }
      this.types = __this__types;
    }
  }

  public RCBasicMeta deepCopy() {
    return new RCBasicMeta(this);
  }

  @Override
  public void clear() {
    this.keys = null;
    this.types = null;
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public java.util.Iterator<String> getKeysIterator() {
    return (this.keys == null) ? null : this.keys.iterator();
  }

  public void addToKeys(String elem) {
    if (this.keys == null) {
      this.keys = new ArrayList<String>();
    }
    this.keys.add(elem);
  }

  /**
   * 属性列表
   */
  public List<String> getKeys() {
    return this.keys;
  }

  /**
   * 属性列表
   */
  public RCBasicMeta setKeys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  public int getTypesSize() {
    return (this.types == null) ? 0 : this.types.size();
  }

  public void putToTypes(String key, com.xiaomi.infra.galaxy.sds.thrift.DataType val) {
    if (this.types == null) {
      this.types = new HashMap<String,com.xiaomi.infra.galaxy.sds.thrift.DataType>();
    }
    this.types.put(key, val);
  }

  /**
   * 属性类型
   */
  public Map<String,com.xiaomi.infra.galaxy.sds.thrift.DataType> getTypes() {
    return this.types;
  }

  /**
   * 属性类型
   */
  public RCBasicMeta setTypes(Map<String,com.xiaomi.infra.galaxy.sds.thrift.DataType> types) {
    this.types = types;
    return this;
  }

  public void unsetTypes() {
    this.types = null;
  }

  /** Returns true if field types is set (has been assigned a value) and false otherwise */
  public boolean isSetTypes() {
    return this.types != null;
  }

  public void setTypesIsSet(boolean value) {
    if (!value) {
      this.types = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((List<String>)value);
      }
      break;

    case TYPES:
      if (value == null) {
        unsetTypes();
      } else {
        setTypes((Map<String,com.xiaomi.infra.galaxy.sds.thrift.DataType>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYS:
      return getKeys();

    case TYPES:
      return getTypes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEYS:
      return isSetKeys();
    case TYPES:
      return isSetTypes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RCBasicMeta)
      return this.equals((RCBasicMeta)that);
    return false;
  }

  public boolean equals(RCBasicMeta that) {
    if (that == null)
      return false;

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_types = true && this.isSetTypes();
    boolean that_present_types = true && that.isSetTypes();
    if (this_present_types || that_present_types) {
      if (!(this_present_types && that_present_types))
        return false;
      if (!this.types.equals(that.types))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    boolean present_types = true && (isSetTypes());
    list.add(present_types);
    if (present_types)
      list.add(types);

    return list.hashCode();
  }

  @Override
  public int compareTo(RCBasicMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keys, other.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypes()).compareTo(other.isSetTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.types, other.types);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RCBasicMeta(");
    boolean first = true;

    if (isSetKeys()) {
      sb.append("keys:");
      if (this.keys == null) {
        sb.append("null");
      } else {
        sb.append(this.keys);
      }
      first = false;
    }
    if (isSetTypes()) {
      if (!first) sb.append(", ");
      sb.append("types:");
      if (this.types == null) {
        sb.append("null");
      } else {
        sb.append(this.types);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RCBasicMetaStandardSchemeFactory implements SchemeFactory {
    public RCBasicMetaStandardScheme getScheme() {
      return new RCBasicMetaStandardScheme();
    }
  }

  private static class RCBasicMetaStandardScheme extends StandardScheme<RCBasicMeta> {

    public void read(libthrift091.protocol.TProtocol iprot, RCBasicMeta struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEYS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list10 = iprot.readListBegin();
                struct.keys = new ArrayList<String>(_list10.size);
                String _elem11;
                for (int _i12 = 0; _i12 < _list10.size; ++_i12)
                {
                  _elem11 = iprot.readString();
                  struct.keys.add(_elem11);
                }
                iprot.readListEnd();
              }
              struct.setKeysIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map13 = iprot.readMapBegin();
                struct.types = new HashMap<String,com.xiaomi.infra.galaxy.sds.thrift.DataType>(2*_map13.size);
                String _key14;
                com.xiaomi.infra.galaxy.sds.thrift.DataType _val15;
                for (int _i16 = 0; _i16 < _map13.size; ++_i16)
                {
                  _key14 = iprot.readString();
                  _val15 = com.xiaomi.infra.galaxy.sds.thrift.DataType.findByValue(iprot.readI32());
                  struct.types.put(_key14, _val15);
                }
                iprot.readMapEnd();
              }
              struct.setTypesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, RCBasicMeta struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keys != null) {
        if (struct.isSetKeys()) {
          oprot.writeFieldBegin(KEYS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.keys.size()));
            for (String _iter17 : struct.keys)
            {
              oprot.writeString(_iter17);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.types != null) {
        if (struct.isSetTypes()) {
          oprot.writeFieldBegin(TYPES_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, struct.types.size()));
            for (Map.Entry<String, com.xiaomi.infra.galaxy.sds.thrift.DataType> _iter18 : struct.types.entrySet())
            {
              oprot.writeString(_iter18.getKey());
              oprot.writeI32(_iter18.getValue().getValue());
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

  private static class RCBasicMetaTupleSchemeFactory implements SchemeFactory {
    public RCBasicMetaTupleScheme getScheme() {
      return new RCBasicMetaTupleScheme();
    }
  }

  private static class RCBasicMetaTupleScheme extends TupleScheme<RCBasicMeta> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RCBasicMeta struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKeys()) {
        optionals.set(0);
      }
      if (struct.isSetTypes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (String _iter19 : struct.keys)
          {
            oprot.writeString(_iter19);
          }
        }
      }
      if (struct.isSetTypes()) {
        {
          oprot.writeI32(struct.types.size());
          for (Map.Entry<String, com.xiaomi.infra.galaxy.sds.thrift.DataType> _iter20 : struct.types.entrySet())
          {
            oprot.writeString(_iter20.getKey());
            oprot.writeI32(_iter20.getValue().getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RCBasicMeta struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list21 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.keys = new ArrayList<String>(_list21.size);
          String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.keys.add(_elem22);
          }
        }
        struct.setKeysIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map24 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, iprot.readI32());
          struct.types = new HashMap<String,com.xiaomi.infra.galaxy.sds.thrift.DataType>(2*_map24.size);
          String _key25;
          com.xiaomi.infra.galaxy.sds.thrift.DataType _val26;
          for (int _i27 = 0; _i27 < _map24.size; ++_i27)
          {
            _key25 = iprot.readString();
            _val26 = com.xiaomi.infra.galaxy.sds.thrift.DataType.findByValue(iprot.readI32());
            struct.types.put(_key25, _val26);
          }
        }
        struct.setTypesIsSet(true);
      }
    }
  }

}

