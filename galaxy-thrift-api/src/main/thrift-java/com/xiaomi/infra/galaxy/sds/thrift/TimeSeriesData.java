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
 * 统计指标时间序列
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-10-30")
public class TimeSeriesData implements libthrift091.TBase<TimeSeriesData, TimeSeriesData._Fields>, java.io.Serializable, Cloneable, Comparable<TimeSeriesData> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TimeSeriesData");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField METRIC_KEY_FIELD_DESC = new libthrift091.protocol.TField("metricKey", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField METRIC_TYPE_FIELD_DESC = new libthrift091.protocol.TField("metricType", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField DATA_FIELD_DESC = new libthrift091.protocol.TField("data", libthrift091.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeSeriesDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeSeriesDataTupleSchemeFactory());
  }

  /**
   * 表名
   */
  public String tableName; // optional
  /**
   * 统计指标主类型
   * 
   * @see MetricKey
   */
  public MetricKey metricKey; // optional
  /**
   * 统计指标子类型
   * 
   * @see MetricType
   */
  public MetricType metricType; // optional
  /**
   * 统计指标数据时间序列，值为{时间 => 数值}映射
   */
  public Map<Long,Double> data; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 统计指标主类型
     * 
     * @see MetricKey
     */
    METRIC_KEY((short)2, "metricKey"),
    /**
     * 统计指标子类型
     * 
     * @see MetricType
     */
    METRIC_TYPE((short)3, "metricType"),
    /**
     * 统计指标数据时间序列，值为{时间 => 数值}映射
     */
    DATA((short)4, "data");

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
        case 2: // METRIC_KEY
          return METRIC_KEY;
        case 3: // METRIC_TYPE
          return METRIC_TYPE;
        case 4: // DATA
          return DATA;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.METRIC_KEY,_Fields.METRIC_TYPE,_Fields.DATA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.METRIC_KEY, new libthrift091.meta_data.FieldMetaData("metricKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MetricKey.class)));
    tmpMap.put(_Fields.METRIC_TYPE, new libthrift091.meta_data.FieldMetaData("metricType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MetricType.class)));
    tmpMap.put(_Fields.DATA, new libthrift091.meta_data.FieldMetaData("data", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TimeSeriesData.class, metaDataMap);
  }

  public TimeSeriesData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeSeriesData(TimeSeriesData other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetMetricKey()) {
      this.metricKey = other.metricKey;
    }
    if (other.isSetMetricType()) {
      this.metricType = other.metricType;
    }
    if (other.isSetData()) {
      Map<Long,Double> __this__data = new HashMap<Long,Double>(other.data);
      this.data = __this__data;
    }
  }

  public TimeSeriesData deepCopy() {
    return new TimeSeriesData(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.metricKey = null;
    this.metricType = null;
    this.data = null;
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
  public TimeSeriesData setTableName(String tableName) {
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

  /**
   * 统计指标主类型
   * 
   * @see MetricKey
   */
  public MetricKey getMetricKey() {
    return this.metricKey;
  }

  /**
   * 统计指标主类型
   * 
   * @see MetricKey
   */
  public TimeSeriesData setMetricKey(MetricKey metricKey) {
    this.metricKey = metricKey;
    return this;
  }

  public void unsetMetricKey() {
    this.metricKey = null;
  }

  /** Returns true if field metricKey is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricKey() {
    return this.metricKey != null;
  }

  public void setMetricKeyIsSet(boolean value) {
    if (!value) {
      this.metricKey = null;
    }
  }

  /**
   * 统计指标子类型
   * 
   * @see MetricType
   */
  public MetricType getMetricType() {
    return this.metricType;
  }

  /**
   * 统计指标子类型
   * 
   * @see MetricType
   */
  public TimeSeriesData setMetricType(MetricType metricType) {
    this.metricType = metricType;
    return this;
  }

  public void unsetMetricType() {
    this.metricType = null;
  }

  /** Returns true if field metricType is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricType() {
    return this.metricType != null;
  }

  public void setMetricTypeIsSet(boolean value) {
    if (!value) {
      this.metricType = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public void putToData(long key, double val) {
    if (this.data == null) {
      this.data = new HashMap<Long,Double>();
    }
    this.data.put(key, val);
  }

  /**
   * 统计指标数据时间序列，值为{时间 => 数值}映射
   */
  public Map<Long,Double> getData() {
    return this.data;
  }

  /**
   * 统计指标数据时间序列，值为{时间 => 数值}映射
   */
  public TimeSeriesData setData(Map<Long,Double> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
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

    case METRIC_KEY:
      if (value == null) {
        unsetMetricKey();
      } else {
        setMetricKey((MetricKey)value);
      }
      break;

    case METRIC_TYPE:
      if (value == null) {
        unsetMetricType();
      } else {
        setMetricType((MetricType)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Map<Long,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case METRIC_KEY:
      return getMetricKey();

    case METRIC_TYPE:
      return getMetricType();

    case DATA:
      return getData();

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
    case METRIC_KEY:
      return isSetMetricKey();
    case METRIC_TYPE:
      return isSetMetricType();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeSeriesData)
      return this.equals((TimeSeriesData)that);
    return false;
  }

  public boolean equals(TimeSeriesData that) {
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

    boolean this_present_metricKey = true && this.isSetMetricKey();
    boolean that_present_metricKey = true && that.isSetMetricKey();
    if (this_present_metricKey || that_present_metricKey) {
      if (!(this_present_metricKey && that_present_metricKey))
        return false;
      if (!this.metricKey.equals(that.metricKey))
        return false;
    }

    boolean this_present_metricType = true && this.isSetMetricType();
    boolean that_present_metricType = true && that.isSetMetricType();
    if (this_present_metricType || that_present_metricType) {
      if (!(this_present_metricType && that_present_metricType))
        return false;
      if (!this.metricType.equals(that.metricType))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
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

    boolean present_metricKey = true && (isSetMetricKey());
    list.add(present_metricKey);
    if (present_metricKey)
      list.add(metricKey.getValue());

    boolean present_metricType = true && (isSetMetricType());
    list.add(present_metricType);
    if (present_metricType)
      list.add(metricType.getValue());

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimeSeriesData other) {
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
    lastComparison = Boolean.valueOf(isSetMetricKey()).compareTo(other.isSetMetricKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricKey, other.metricKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetricType()).compareTo(other.isSetMetricType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricType, other.metricType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.data, other.data);
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
    StringBuilder sb = new StringBuilder("TimeSeriesData(");
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
    if (isSetMetricKey()) {
      if (!first) sb.append(", ");
      sb.append("metricKey:");
      if (this.metricKey == null) {
        sb.append("null");
      } else {
        sb.append(this.metricKey);
      }
      first = false;
    }
    if (isSetMetricType()) {
      if (!first) sb.append(", ");
      sb.append("metricType:");
      if (this.metricType == null) {
        sb.append("null");
      } else {
        sb.append(this.metricType);
      }
      first = false;
    }
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
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

  private static class TimeSeriesDataStandardSchemeFactory implements SchemeFactory {
    public TimeSeriesDataStandardScheme getScheme() {
      return new TimeSeriesDataStandardScheme();
    }
  }

  private static class TimeSeriesDataStandardScheme extends StandardScheme<TimeSeriesData> {

    public void read(libthrift091.protocol.TProtocol iprot, TimeSeriesData struct) throws libthrift091.TException {
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
          case 2: // METRIC_KEY
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.metricKey = com.xiaomi.infra.galaxy.sds.thrift.MetricKey.findByValue(iprot.readI32());
              struct.setMetricKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // METRIC_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.metricType = com.xiaomi.infra.galaxy.sds.thrift.MetricType.findByValue(iprot.readI32());
              struct.setMetricTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map28 = iprot.readMapBegin();
                struct.data = new HashMap<Long,Double>(2*_map28.size);
                long _key29;
                double _val30;
                for (int _i31 = 0; _i31 < _map28.size; ++_i31)
                {
                  _key29 = iprot.readI64();
                  _val30 = iprot.readDouble();
                  struct.data.put(_key29, _val30);
                }
                iprot.readMapEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TimeSeriesData struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.metricKey != null) {
        if (struct.isSetMetricKey()) {
          oprot.writeFieldBegin(METRIC_KEY_FIELD_DESC);
          oprot.writeI32(struct.metricKey.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.metricType != null) {
        if (struct.isSetMetricType()) {
          oprot.writeFieldBegin(METRIC_TYPE_FIELD_DESC);
          oprot.writeI32(struct.metricType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.I64, libthrift091.protocol.TType.DOUBLE, struct.data.size()));
            for (Map.Entry<Long, Double> _iter32 : struct.data.entrySet())
            {
              oprot.writeI64(_iter32.getKey());
              oprot.writeDouble(_iter32.getValue());
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

  private static class TimeSeriesDataTupleSchemeFactory implements SchemeFactory {
    public TimeSeriesDataTupleScheme getScheme() {
      return new TimeSeriesDataTupleScheme();
    }
  }

  private static class TimeSeriesDataTupleScheme extends TupleScheme<TimeSeriesData> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TimeSeriesData struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetMetricKey()) {
        optionals.set(1);
      }
      if (struct.isSetMetricType()) {
        optionals.set(2);
      }
      if (struct.isSetData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetMetricKey()) {
        oprot.writeI32(struct.metricKey.getValue());
      }
      if (struct.isSetMetricType()) {
        oprot.writeI32(struct.metricType.getValue());
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (Map.Entry<Long, Double> _iter33 : struct.data.entrySet())
          {
            oprot.writeI64(_iter33.getKey());
            oprot.writeDouble(_iter33.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TimeSeriesData struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.metricKey = com.xiaomi.infra.galaxy.sds.thrift.MetricKey.findByValue(iprot.readI32());
        struct.setMetricKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.metricType = com.xiaomi.infra.galaxy.sds.thrift.MetricType.findByValue(iprot.readI32());
        struct.setMetricTypeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          libthrift091.protocol.TMap _map34 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.I64, libthrift091.protocol.TType.DOUBLE, iprot.readI32());
          struct.data = new HashMap<Long,Double>(2*_map34.size);
          long _key35;
          double _val36;
          for (int _i37 = 0; _i37 < _map34.size; ++_i37)
          {
            _key35 = iprot.readI64();
            _val36 = iprot.readDouble();
            struct.data.put(_key35, _val36);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

