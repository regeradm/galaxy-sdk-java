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
 * 表的所有快照
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-4")
public class TableSnapshots implements libthrift091.TBase<TableSnapshots, TableSnapshots._Fields>, java.io.Serializable, Cloneable, Comparable<TableSnapshots> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TableSnapshots");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SYS_SNAPSHOTS_FIELD_DESC = new libthrift091.protocol.TField("sysSnapshots", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField USER_SNAPSHOTS_FIELD_DESC = new libthrift091.protocol.TField("userSnapshots", libthrift091.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableSnapshotsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableSnapshotsTupleSchemeFactory());
  }

  /**
   * 表名
   */
  public String tableName; // optional
  /**
   * 系统自动生成的快照
   */
  public List<Snapshot> sysSnapshots; // optional
  /**
   * 用户生成的快照
   */
  public List<Snapshot> userSnapshots; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 系统自动生成的快照
     */
    SYS_SNAPSHOTS((short)2, "sysSnapshots"),
    /**
     * 用户生成的快照
     */
    USER_SNAPSHOTS((short)3, "userSnapshots");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // SYS_SNAPSHOTS
          return SYS_SNAPSHOTS;
        case 3: // USER_SNAPSHOTS
          return USER_SNAPSHOTS;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.SYS_SNAPSHOTS,_Fields.USER_SNAPSHOTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SYS_SNAPSHOTS, new libthrift091.meta_data.FieldMetaData("sysSnapshots", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Snapshot.class))));
    tmpMap.put(_Fields.USER_SNAPSHOTS, new libthrift091.meta_data.FieldMetaData("userSnapshots", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Snapshot.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TableSnapshots.class, metaDataMap);
  }

  public TableSnapshots() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableSnapshots(TableSnapshots other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetSysSnapshots()) {
      List<Snapshot> __this__sysSnapshots = new ArrayList<Snapshot>(other.sysSnapshots.size());
      for (Snapshot other_element : other.sysSnapshots) {
        __this__sysSnapshots.add(new Snapshot(other_element));
      }
      this.sysSnapshots = __this__sysSnapshots;
    }
    if (other.isSetUserSnapshots()) {
      List<Snapshot> __this__userSnapshots = new ArrayList<Snapshot>(other.userSnapshots.size());
      for (Snapshot other_element : other.userSnapshots) {
        __this__userSnapshots.add(new Snapshot(other_element));
      }
      this.userSnapshots = __this__userSnapshots;
    }
  }

  public TableSnapshots deepCopy() {
    return new TableSnapshots(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.sysSnapshots = null;
    this.userSnapshots = null;
  }

  /**
   * 表名
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * 表名
   */
  public TableSnapshots setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getSysSnapshotsSize() {
    return (this.sysSnapshots == null) ? 0 : this.sysSnapshots.size();
  }

  public java.util.Iterator<Snapshot> getSysSnapshotsIterator() {
    return (this.sysSnapshots == null) ? null : this.sysSnapshots.iterator();
  }

  public void addToSysSnapshots(Snapshot elem) {
    if (this.sysSnapshots == null) {
      this.sysSnapshots = new ArrayList<Snapshot>();
    }
    this.sysSnapshots.add(elem);
  }

  /**
   * 系统自动生成的快照
   */
  public List<Snapshot> getSysSnapshots() {
    return this.sysSnapshots;
  }

  /**
   * 系统自动生成的快照
   */
  public TableSnapshots setSysSnapshots(List<Snapshot> sysSnapshots) {
    this.sysSnapshots = sysSnapshots;
    return this;
  }

  public void unsetSysSnapshots() {
    this.sysSnapshots = null;
  }

  /** Returns true if field sysSnapshots is set (has been assigned a value) and false otherwise */
  public boolean isSetSysSnapshots() {
    return this.sysSnapshots != null;
  }

  public void setSysSnapshotsIsSet(boolean value) {
    if (!value) {
      this.sysSnapshots = null;
    }
  }

  public int getUserSnapshotsSize() {
    return (this.userSnapshots == null) ? 0 : this.userSnapshots.size();
  }

  public java.util.Iterator<Snapshot> getUserSnapshotsIterator() {
    return (this.userSnapshots == null) ? null : this.userSnapshots.iterator();
  }

  public void addToUserSnapshots(Snapshot elem) {
    if (this.userSnapshots == null) {
      this.userSnapshots = new ArrayList<Snapshot>();
    }
    this.userSnapshots.add(elem);
  }

  /**
   * 用户生成的快照
   */
  public List<Snapshot> getUserSnapshots() {
    return this.userSnapshots;
  }

  /**
   * 用户生成的快照
   */
  public TableSnapshots setUserSnapshots(List<Snapshot> userSnapshots) {
    this.userSnapshots = userSnapshots;
    return this;
  }

  public void unsetUserSnapshots() {
    this.userSnapshots = null;
  }

  /** Returns true if field userSnapshots is set (has been assigned a value) and false otherwise */
  public boolean isSetUserSnapshots() {
    return this.userSnapshots != null;
  }

  public void setUserSnapshotsIsSet(boolean value) {
    if (!value) {
      this.userSnapshots = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case SYS_SNAPSHOTS:
      if (value == null) {
        unsetSysSnapshots();
      } else {
        setSysSnapshots((List<Snapshot>)value);
      }
      break;

    case USER_SNAPSHOTS:
      if (value == null) {
        unsetUserSnapshots();
      } else {
        setUserSnapshots((List<Snapshot>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case SYS_SNAPSHOTS:
      return getSysSnapshots();

    case USER_SNAPSHOTS:
      return getUserSnapshots();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case SYS_SNAPSHOTS:
      return isSetSysSnapshots();
    case USER_SNAPSHOTS:
      return isSetUserSnapshots();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableSnapshots)
      return this.equals((TableSnapshots)that);
    return false;
  }

  public boolean equals(TableSnapshots that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_sysSnapshots = true && this.isSetSysSnapshots();
    boolean that_present_sysSnapshots = true && that.isSetSysSnapshots();
    if (this_present_sysSnapshots || that_present_sysSnapshots) {
      if (!(this_present_sysSnapshots && that_present_sysSnapshots))
        return false;
      if (!this.sysSnapshots.equals(that.sysSnapshots))
        return false;
    }

    boolean this_present_userSnapshots = true && this.isSetUserSnapshots();
    boolean that_present_userSnapshots = true && that.isSetUserSnapshots();
    if (this_present_userSnapshots || that_present_userSnapshots) {
      if (!(this_present_userSnapshots && that_present_userSnapshots))
        return false;
      if (!this.userSnapshots.equals(that.userSnapshots))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_sysSnapshots = true && (isSetSysSnapshots());
    list.add(present_sysSnapshots);
    if (present_sysSnapshots)
      list.add(sysSnapshots);

    boolean present_userSnapshots = true && (isSetUserSnapshots());
    list.add(present_userSnapshots);
    if (present_userSnapshots)
      list.add(userSnapshots);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableSnapshots other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSysSnapshots()).compareTo(other.isSetSysSnapshots());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSysSnapshots()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sysSnapshots, other.sysSnapshots);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserSnapshots()).compareTo(other.isSetUserSnapshots());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserSnapshots()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.userSnapshots, other.userSnapshots);
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
    StringBuilder sb = new StringBuilder("TableSnapshots(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetSysSnapshots()) {
      if (!first) sb.append(", ");
      sb.append("sysSnapshots:");
      if (this.sysSnapshots == null) {
        sb.append("null");
      } else {
        sb.append(this.sysSnapshots);
      }
      first = false;
    }
    if (isSetUserSnapshots()) {
      if (!first) sb.append(", ");
      sb.append("userSnapshots:");
      if (this.userSnapshots == null) {
        sb.append("null");
      } else {
        sb.append(this.userSnapshots);
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

  private static class TableSnapshotsStandardSchemeFactory implements SchemeFactory {
    public TableSnapshotsStandardScheme getScheme() {
      return new TableSnapshotsStandardScheme();
    }
  }

  private static class TableSnapshotsStandardScheme extends StandardScheme<TableSnapshots> {

    public void read(libthrift091.protocol.TProtocol iprot, TableSnapshots struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYS_SNAPSHOTS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list38 = iprot.readListBegin();
                struct.sysSnapshots = new ArrayList<Snapshot>(_list38.size);
                Snapshot _elem39;
                for (int _i40 = 0; _i40 < _list38.size; ++_i40)
                {
                  _elem39 = new Snapshot();
                  _elem39.read(iprot);
                  struct.sysSnapshots.add(_elem39);
                }
                iprot.readListEnd();
              }
              struct.setSysSnapshotsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_SNAPSHOTS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list41 = iprot.readListBegin();
                struct.userSnapshots = new ArrayList<Snapshot>(_list41.size);
                Snapshot _elem42;
                for (int _i43 = 0; _i43 < _list41.size; ++_i43)
                {
                  _elem42 = new Snapshot();
                  _elem42.read(iprot);
                  struct.userSnapshots.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setUserSnapshotsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TableSnapshots struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sysSnapshots != null) {
        if (struct.isSetSysSnapshots()) {
          oprot.writeFieldBegin(SYS_SNAPSHOTS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.sysSnapshots.size()));
            for (Snapshot _iter44 : struct.sysSnapshots)
            {
              _iter44.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.userSnapshots != null) {
        if (struct.isSetUserSnapshots()) {
          oprot.writeFieldBegin(USER_SNAPSHOTS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.userSnapshots.size()));
            for (Snapshot _iter45 : struct.userSnapshots)
            {
              _iter45.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableSnapshotsTupleSchemeFactory implements SchemeFactory {
    public TableSnapshotsTupleScheme getScheme() {
      return new TableSnapshotsTupleScheme();
    }
  }

  private static class TableSnapshotsTupleScheme extends TupleScheme<TableSnapshots> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TableSnapshots struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetSysSnapshots()) {
        optionals.set(1);
      }
      if (struct.isSetUserSnapshots()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetSysSnapshots()) {
        {
          oprot.writeI32(struct.sysSnapshots.size());
          for (Snapshot _iter46 : struct.sysSnapshots)
          {
            _iter46.write(oprot);
          }
        }
      }
      if (struct.isSetUserSnapshots()) {
        {
          oprot.writeI32(struct.userSnapshots.size());
          for (Snapshot _iter47 : struct.userSnapshots)
          {
            _iter47.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TableSnapshots struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list48 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.sysSnapshots = new ArrayList<Snapshot>(_list48.size);
          Snapshot _elem49;
          for (int _i50 = 0; _i50 < _list48.size; ++_i50)
          {
            _elem49 = new Snapshot();
            _elem49.read(iprot);
            struct.sysSnapshots.add(_elem49);
          }
        }
        struct.setSysSnapshotsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TList _list51 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.userSnapshots = new ArrayList<Snapshot>(_list51.size);
          Snapshot _elem52;
          for (int _i53 = 0; _i53 < _list51.size; ++_i53)
          {
            _elem52 = new Snapshot();
            _elem52.read(iprot);
            struct.userSnapshots.add(_elem52);
          }
        }
        struct.setUserSnapshotsIsSet(true);
      }
    }
  }

}

