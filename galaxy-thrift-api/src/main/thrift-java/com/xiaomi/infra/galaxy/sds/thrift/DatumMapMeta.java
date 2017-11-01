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
 * DATUM_MAP文件格式元信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-10-30")
public class DatumMapMeta implements libthrift091.TBase<DatumMapMeta, DatumMapMeta._Fields>, java.io.Serializable, Cloneable, Comparable<DatumMapMeta> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DatumMapMeta");

  private static final libthrift091.protocol.TField KEY_ID_MAP_FIELD_DESC = new libthrift091.protocol.TField("keyIdMap", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DatumMapMetaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DatumMapMetaTupleSchemeFactory());
  }

  /**
   * 属性id -> 属性名映射
   */
  public Map<Short,String> keyIdMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 属性id -> 属性名映射
     */
    KEY_ID_MAP((short)1, "keyIdMap");

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
        case 1: // KEY_ID_MAP
          return KEY_ID_MAP;
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
  private static final _Fields optionals[] = {_Fields.KEY_ID_MAP};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY_ID_MAP, new libthrift091.meta_data.FieldMetaData("keyIdMap", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I16), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DatumMapMeta.class, metaDataMap);
  }

  public DatumMapMeta() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DatumMapMeta(DatumMapMeta other) {
    if (other.isSetKeyIdMap()) {
      Map<Short,String> __this__keyIdMap = new HashMap<Short,String>(other.keyIdMap);
      this.keyIdMap = __this__keyIdMap;
    }
  }

  public DatumMapMeta deepCopy() {
    return new DatumMapMeta(this);
  }

  @Override
  public void clear() {
    this.keyIdMap = null;
  }

  public int getKeyIdMapSize() {
    return (this.keyIdMap == null) ? 0 : this.keyIdMap.size();
  }

  public void putToKeyIdMap(short key, String val) {
    if (this.keyIdMap == null) {
      this.keyIdMap = new HashMap<Short,String>();
    }
    this.keyIdMap.put(key, val);
  }

  /**
   * 属性id -> 属性名映射
   */
  public Map<Short,String> getKeyIdMap() {
    return this.keyIdMap;
  }

  /**
   * 属性id -> 属性名映射
   */
  public DatumMapMeta setKeyIdMap(Map<Short,String> keyIdMap) {
    this.keyIdMap = keyIdMap;
    return this;
  }

  public void unsetKeyIdMap() {
    this.keyIdMap = null;
  }

  /** Returns true if field keyIdMap is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyIdMap() {
    return this.keyIdMap != null;
  }

  public void setKeyIdMapIsSet(boolean value) {
    if (!value) {
      this.keyIdMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY_ID_MAP:
      if (value == null) {
        unsetKeyIdMap();
      } else {
        setKeyIdMap((Map<Short,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY_ID_MAP:
      return getKeyIdMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY_ID_MAP:
      return isSetKeyIdMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DatumMapMeta)
      return this.equals((DatumMapMeta)that);
    return false;
  }

  public boolean equals(DatumMapMeta that) {
    if (that == null)
      return false;

    boolean this_present_keyIdMap = true && this.isSetKeyIdMap();
    boolean that_present_keyIdMap = true && that.isSetKeyIdMap();
    if (this_present_keyIdMap || that_present_keyIdMap) {
      if (!(this_present_keyIdMap && that_present_keyIdMap))
        return false;
      if (!this.keyIdMap.equals(that.keyIdMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_keyIdMap = true && (isSetKeyIdMap());
    list.add(present_keyIdMap);
    if (present_keyIdMap)
      list.add(keyIdMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(DatumMapMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKeyIdMap()).compareTo(other.isSetKeyIdMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyIdMap()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keyIdMap, other.keyIdMap);
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
    StringBuilder sb = new StringBuilder("DatumMapMeta(");
    boolean first = true;

    if (isSetKeyIdMap()) {
      sb.append("keyIdMap:");
      if (this.keyIdMap == null) {
        sb.append("null");
      } else {
        sb.append(this.keyIdMap);
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

  private static class DatumMapMetaStandardSchemeFactory implements SchemeFactory {
    public DatumMapMetaStandardScheme getScheme() {
      return new DatumMapMetaStandardScheme();
    }
  }

  private static class DatumMapMetaStandardScheme extends StandardScheme<DatumMapMeta> {

    public void read(libthrift091.protocol.TProtocol iprot, DatumMapMeta struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY_ID_MAP
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map0 = iprot.readMapBegin();
                struct.keyIdMap = new HashMap<Short,String>(2*_map0.size);
                short _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readI16();
                  _val2 = iprot.readString();
                  struct.keyIdMap.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setKeyIdMapIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DatumMapMeta struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keyIdMap != null) {
        if (struct.isSetKeyIdMap()) {
          oprot.writeFieldBegin(KEY_ID_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.I16, libthrift091.protocol.TType.STRING, struct.keyIdMap.size()));
            for (Map.Entry<Short, String> _iter4 : struct.keyIdMap.entrySet())
            {
              oprot.writeI16(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
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

  private static class DatumMapMetaTupleSchemeFactory implements SchemeFactory {
    public DatumMapMetaTupleScheme getScheme() {
      return new DatumMapMetaTupleScheme();
    }
  }

  private static class DatumMapMetaTupleScheme extends TupleScheme<DatumMapMeta> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DatumMapMeta struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKeyIdMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetKeyIdMap()) {
        {
          oprot.writeI32(struct.keyIdMap.size());
          for (Map.Entry<Short, String> _iter5 : struct.keyIdMap.entrySet())
          {
            oprot.writeI16(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DatumMapMeta struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map6 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.I16, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.keyIdMap = new HashMap<Short,String>(2*_map6.size);
          short _key7;
          String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readI16();
            _val8 = iprot.readString();
            struct.keyIdMap.put(_key7, _val8);
          }
        }
        struct.setKeyIdMapIsSet(true);
      }
    }
  }

}

