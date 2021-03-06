/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-8-28")
public class OffsetInfo implements libthrift091.TBase<OffsetInfo, OffsetInfo._Fields>, java.io.Serializable, Cloneable, Comparable<OffsetInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("OffsetInfo");

  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField START_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("startOffset", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField END_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("endOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField ERROR_CODE_FIELD_DESC = new libthrift091.protocol.TField("errorCode", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField ERROR_MSG_FIELD_DESC = new libthrift091.protocol.TField("errorMsg", libthrift091.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OffsetInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OffsetInfoTupleSchemeFactory());
  }

  /**
   * partitionId
   * 
   */
  public int partitionId; // required
  /**
   * start offset
   * 
   */
  public long startOffset; // optional
  /**
   * end offset
   * 
   */
  public long endOffset; // optional
  /**
   * error code for this partition offset info
   * 
   * 
   * @see com.xiaomi.infra.galaxy.talos.thrift.ErrorCode
   */
  public com.xiaomi.infra.galaxy.talos.thrift.ErrorCode errorCode; // optional
  /**
   * error message for this partition offset info
   * 
   */
  public String errorMsg; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * partitionId
     * 
     */
    PARTITION_ID((short)1, "partitionId"),
    /**
     * start offset
     * 
     */
    START_OFFSET((short)2, "startOffset"),
    /**
     * end offset
     * 
     */
    END_OFFSET((short)3, "endOffset"),
    /**
     * error code for this partition offset info
     * 
     * 
     * @see com.xiaomi.infra.galaxy.talos.thrift.ErrorCode
     */
    ERROR_CODE((short)4, "errorCode"),
    /**
     * error message for this partition offset info
     * 
     */
    ERROR_MSG((short)5, "errorMsg");

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
        case 1: // PARTITION_ID
          return PARTITION_ID;
        case 2: // START_OFFSET
          return START_OFFSET;
        case 3: // END_OFFSET
          return END_OFFSET;
        case 4: // ERROR_CODE
          return ERROR_CODE;
        case 5: // ERROR_MSG
          return ERROR_MSG;
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
  private static final int __PARTITIONID_ISSET_ID = 0;
  private static final int __STARTOFFSET_ISSET_ID = 1;
  private static final int __ENDOFFSET_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_OFFSET,_Fields.END_OFFSET,_Fields.ERROR_CODE,_Fields.ERROR_MSG};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.START_OFFSET, new libthrift091.meta_data.FieldMetaData("startOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.END_OFFSET, new libthrift091.meta_data.FieldMetaData("endOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.ERROR_CODE, new libthrift091.meta_data.FieldMetaData("errorCode", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.class)));
    tmpMap.put(_Fields.ERROR_MSG, new libthrift091.meta_data.FieldMetaData("errorMsg", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(OffsetInfo.class, metaDataMap);
  }

  public OffsetInfo() {
  }

  public OffsetInfo(
    int partitionId)
  {
    this();
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OffsetInfo(OffsetInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partitionId = other.partitionId;
    this.startOffset = other.startOffset;
    this.endOffset = other.endOffset;
    if (other.isSetErrorCode()) {
      this.errorCode = other.errorCode;
    }
    if (other.isSetErrorMsg()) {
      this.errorMsg = other.errorMsg;
    }
  }

  public OffsetInfo deepCopy() {
    return new OffsetInfo(this);
  }

  @Override
  public void clear() {
    setPartitionIdIsSet(false);
    this.partitionId = 0;
    setStartOffsetIsSet(false);
    this.startOffset = 0;
    setEndOffsetIsSet(false);
    this.endOffset = 0;
    this.errorCode = null;
    this.errorMsg = null;
  }

  /**
   * partitionId
   * 
   */
  public int getPartitionId() {
    return this.partitionId;
  }

  /**
   * partitionId
   * 
   */
  public OffsetInfo setPartitionId(int partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  /**
   * start offset
   * 
   */
  public long getStartOffset() {
    return this.startOffset;
  }

  /**
   * start offset
   * 
   */
  public OffsetInfo setStartOffset(long startOffset) {
    this.startOffset = startOffset;
    setStartOffsetIsSet(true);
    return this;
  }

  public void unsetStartOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTOFFSET_ISSET_ID);
  }

  /** Returns true if field startOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetStartOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTOFFSET_ISSET_ID);
  }

  public void setStartOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTOFFSET_ISSET_ID, value);
  }

  /**
   * end offset
   * 
   */
  public long getEndOffset() {
    return this.endOffset;
  }

  /**
   * end offset
   * 
   */
  public OffsetInfo setEndOffset(long endOffset) {
    this.endOffset = endOffset;
    setEndOffsetIsSet(true);
    return this;
  }

  public void unsetEndOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDOFFSET_ISSET_ID);
  }

  /** Returns true if field endOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetEndOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDOFFSET_ISSET_ID);
  }

  public void setEndOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDOFFSET_ISSET_ID, value);
  }

  /**
   * error code for this partition offset info
   * 
   * 
   * @see com.xiaomi.infra.galaxy.talos.thrift.ErrorCode
   */
  public com.xiaomi.infra.galaxy.talos.thrift.ErrorCode getErrorCode() {
    return this.errorCode;
  }

  /**
   * error code for this partition offset info
   * 
   * 
   * @see com.xiaomi.infra.galaxy.talos.thrift.ErrorCode
   */
  public OffsetInfo setErrorCode(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public void unsetErrorCode() {
    this.errorCode = null;
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return this.errorCode != null;
  }

  public void setErrorCodeIsSet(boolean value) {
    if (!value) {
      this.errorCode = null;
    }
  }

  /**
   * error message for this partition offset info
   * 
   */
  public String getErrorMsg() {
    return this.errorMsg;
  }

  /**
   * error message for this partition offset info
   * 
   */
  public OffsetInfo setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  public void unsetErrorMsg() {
    this.errorMsg = null;
  }

  /** Returns true if field errorMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMsg() {
    return this.errorMsg != null;
  }

  public void setErrorMsgIsSet(boolean value) {
    if (!value) {
      this.errorMsg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Integer)value);
      }
      break;

    case START_OFFSET:
      if (value == null) {
        unsetStartOffset();
      } else {
        setStartOffset((Long)value);
      }
      break;

    case END_OFFSET:
      if (value == null) {
        unsetEndOffset();
      } else {
        setEndOffset((Long)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((com.xiaomi.infra.galaxy.talos.thrift.ErrorCode)value);
      }
      break;

    case ERROR_MSG:
      if (value == null) {
        unsetErrorMsg();
      } else {
        setErrorMsg((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_ID:
      return Integer.valueOf(getPartitionId());

    case START_OFFSET:
      return Long.valueOf(getStartOffset());

    case END_OFFSET:
      return Long.valueOf(getEndOffset());

    case ERROR_CODE:
      return getErrorCode();

    case ERROR_MSG:
      return getErrorMsg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_ID:
      return isSetPartitionId();
    case START_OFFSET:
      return isSetStartOffset();
    case END_OFFSET:
      return isSetEndOffset();
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_MSG:
      return isSetErrorMsg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OffsetInfo)
      return this.equals((OffsetInfo)that);
    return false;
  }

  public boolean equals(OffsetInfo that) {
    if (that == null)
      return false;

    boolean this_present_partitionId = true;
    boolean that_present_partitionId = true;
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    boolean this_present_startOffset = true && this.isSetStartOffset();
    boolean that_present_startOffset = true && that.isSetStartOffset();
    if (this_present_startOffset || that_present_startOffset) {
      if (!(this_present_startOffset && that_present_startOffset))
        return false;
      if (this.startOffset != that.startOffset)
        return false;
    }

    boolean this_present_endOffset = true && this.isSetEndOffset();
    boolean that_present_endOffset = true && that.isSetEndOffset();
    if (this_present_endOffset || that_present_endOffset) {
      if (!(this_present_endOffset && that_present_endOffset))
        return false;
      if (this.endOffset != that.endOffset)
        return false;
    }

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (!this.errorCode.equals(that.errorCode))
        return false;
    }

    boolean this_present_errorMsg = true && this.isSetErrorMsg();
    boolean that_present_errorMsg = true && that.isSetErrorMsg();
    if (this_present_errorMsg || that_present_errorMsg) {
      if (!(this_present_errorMsg && that_present_errorMsg))
        return false;
      if (!this.errorMsg.equals(that.errorMsg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partitionId = true;
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    boolean present_startOffset = true && (isSetStartOffset());
    list.add(present_startOffset);
    if (present_startOffset)
      list.add(startOffset);

    boolean present_endOffset = true && (isSetEndOffset());
    list.add(present_endOffset);
    if (present_endOffset)
      list.add(endOffset);

    boolean present_errorCode = true && (isSetErrorCode());
    list.add(present_errorCode);
    if (present_errorCode)
      list.add(errorCode.getValue());

    boolean present_errorMsg = true && (isSetErrorMsg());
    list.add(present_errorMsg);
    if (present_errorMsg)
      list.add(errorMsg);

    return list.hashCode();
  }

  @Override
  public int compareTo(OffsetInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartOffset()).compareTo(other.isSetStartOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startOffset, other.startOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndOffset()).compareTo(other.isSetEndOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.endOffset, other.endOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorMsg()).compareTo(other.isSetErrorMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMsg()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.errorMsg, other.errorMsg);
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
    StringBuilder sb = new StringBuilder("OffsetInfo(");
    boolean first = true;

    sb.append("partitionId:");
    sb.append(this.partitionId);
    first = false;
    if (isSetStartOffset()) {
      if (!first) sb.append(", ");
      sb.append("startOffset:");
      sb.append(this.startOffset);
      first = false;
    }
    if (isSetEndOffset()) {
      if (!first) sb.append(", ");
      sb.append("endOffset:");
      sb.append(this.endOffset);
      first = false;
    }
    if (isSetErrorCode()) {
      if (!first) sb.append(", ");
      sb.append("errorCode:");
      if (this.errorCode == null) {
        sb.append("null");
      } else {
        sb.append(this.errorCode);
      }
      first = false;
    }
    if (isSetErrorMsg()) {
      if (!first) sb.append(", ");
      sb.append("errorMsg:");
      if (this.errorMsg == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMsg);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'partitionId' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OffsetInfoStandardSchemeFactory implements SchemeFactory {
    public OffsetInfoStandardScheme getScheme() {
      return new OffsetInfoStandardScheme();
    }
  }

  private static class OffsetInfoStandardScheme extends StandardScheme<OffsetInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, OffsetInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionId = iprot.readI32();
              struct.setPartitionIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startOffset = iprot.readI64();
              struct.setStartOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // END_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.endOffset = iprot.readI64();
              struct.setEndOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_CODE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.errorCode = com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.findByValue(iprot.readI32());
              struct.setErrorCodeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERROR_MSG
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.errorMsg = iprot.readString();
              struct.setErrorMsgIsSet(true);
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
      if (!struct.isSetPartitionId()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'partitionId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, OffsetInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
      oprot.writeI32(struct.partitionId);
      oprot.writeFieldEnd();
      if (struct.isSetStartOffset()) {
        oprot.writeFieldBegin(START_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.startOffset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEndOffset()) {
        oprot.writeFieldBegin(END_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.endOffset);
        oprot.writeFieldEnd();
      }
      if (struct.errorCode != null) {
        if (struct.isSetErrorCode()) {
          oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
          oprot.writeI32(struct.errorCode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.errorMsg != null) {
        if (struct.isSetErrorMsg()) {
          oprot.writeFieldBegin(ERROR_MSG_FIELD_DESC);
          oprot.writeString(struct.errorMsg);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OffsetInfoTupleSchemeFactory implements SchemeFactory {
    public OffsetInfoTupleScheme getScheme() {
      return new OffsetInfoTupleScheme();
    }
  }

  private static class OffsetInfoTupleScheme extends TupleScheme<OffsetInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, OffsetInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.partitionId);
      BitSet optionals = new BitSet();
      if (struct.isSetStartOffset()) {
        optionals.set(0);
      }
      if (struct.isSetEndOffset()) {
        optionals.set(1);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(2);
      }
      if (struct.isSetErrorMsg()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStartOffset()) {
        oprot.writeI64(struct.startOffset);
      }
      if (struct.isSetEndOffset()) {
        oprot.writeI64(struct.endOffset);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode.getValue());
      }
      if (struct.isSetErrorMsg()) {
        oprot.writeString(struct.errorMsg);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, OffsetInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.partitionId = iprot.readI32();
      struct.setPartitionIdIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.startOffset = iprot.readI64();
        struct.setStartOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endOffset = iprot.readI64();
        struct.setEndOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorCode = com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.findByValue(iprot.readI32());
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.errorMsg = iprot.readString();
        struct.setErrorMsgIsSet(true);
      }
    }
  }

}

