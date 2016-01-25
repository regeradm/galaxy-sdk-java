/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-12")
public class DeleteAlertPolicyRequest implements libthrift091.TBase<DeleteAlertPolicyRequest, DeleteAlertPolicyRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteAlertPolicyRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeleteAlertPolicyRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField ALERT_POLICY_FIELD_DESC = new libthrift091.protocol.TField("alertPolicy", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteAlertPolicyRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteAlertPolicyRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   *  
   */
  public String queueName; // required
  /**
   * The alert policy;
   *  
   */
  public AlertPolicy alertPolicy; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     *  
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * The alert policy;
     *  
     */
    ALERT_POLICY((short)2, "alertPolicy");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // ALERT_POLICY
          return ALERT_POLICY;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALERT_POLICY, new libthrift091.meta_data.FieldMetaData("alertPolicy", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, AlertPolicy.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeleteAlertPolicyRequest.class, metaDataMap);
  }

  public DeleteAlertPolicyRequest() {
  }

  public DeleteAlertPolicyRequest(
    String queueName,
    AlertPolicy alertPolicy)
  {
    this();
    this.queueName = queueName;
    this.alertPolicy = alertPolicy;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteAlertPolicyRequest(DeleteAlertPolicyRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetAlertPolicy()) {
      this.alertPolicy = new AlertPolicy(other.alertPolicy);
    }
  }

  public DeleteAlertPolicyRequest deepCopy() {
    return new DeleteAlertPolicyRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.alertPolicy = null;
  }

  /**
   * Queue name;
   *  
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   *  
   */
  public DeleteAlertPolicyRequest setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  /**
   * The alert policy;
   *  
   */
  public AlertPolicy getAlertPolicy() {
    return this.alertPolicy;
  }

  /**
   * The alert policy;
   *  
   */
  public DeleteAlertPolicyRequest setAlertPolicy(AlertPolicy alertPolicy) {
    this.alertPolicy = alertPolicy;
    return this;
  }

  public void unsetAlertPolicy() {
    this.alertPolicy = null;
  }

  /** Returns true if field alertPolicy is set (has been assigned a value) and false otherwise */
  public boolean isSetAlertPolicy() {
    return this.alertPolicy != null;
  }

  public void setAlertPolicyIsSet(boolean value) {
    if (!value) {
      this.alertPolicy = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case ALERT_POLICY:
      if (value == null) {
        unsetAlertPolicy();
      } else {
        setAlertPolicy((AlertPolicy)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case ALERT_POLICY:
      return getAlertPolicy();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case ALERT_POLICY:
      return isSetAlertPolicy();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteAlertPolicyRequest)
      return this.equals((DeleteAlertPolicyRequest)that);
    return false;
  }

  public boolean equals(DeleteAlertPolicyRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_alertPolicy = true && this.isSetAlertPolicy();
    boolean that_present_alertPolicy = true && that.isSetAlertPolicy();
    if (this_present_alertPolicy || that_present_alertPolicy) {
      if (!(this_present_alertPolicy && that_present_alertPolicy))
        return false;
      if (!this.alertPolicy.equals(that.alertPolicy))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_alertPolicy = true && (isSetAlertPolicy());
    list.add(present_alertPolicy);
    if (present_alertPolicy)
      list.add(alertPolicy);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteAlertPolicyRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlertPolicy()).compareTo(other.isSetAlertPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlertPolicy()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.alertPolicy, other.alertPolicy);
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
    StringBuilder sb = new StringBuilder("DeleteAlertPolicyRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("alertPolicy:");
    if (this.alertPolicy == null) {
      sb.append("null");
    } else {
      sb.append(this.alertPolicy);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (alertPolicy == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'alertPolicy' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (alertPolicy != null) {
      alertPolicy.validate();
    }
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

  private static class DeleteAlertPolicyRequestStandardSchemeFactory implements SchemeFactory {
    public DeleteAlertPolicyRequestStandardScheme getScheme() {
      return new DeleteAlertPolicyRequestStandardScheme();
    }
  }

  private static class DeleteAlertPolicyRequestStandardScheme extends StandardScheme<DeleteAlertPolicyRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, DeleteAlertPolicyRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALERT_POLICY
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.alertPolicy = new AlertPolicy();
              struct.alertPolicy.read(iprot);
              struct.setAlertPolicyIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DeleteAlertPolicyRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.alertPolicy != null) {
        oprot.writeFieldBegin(ALERT_POLICY_FIELD_DESC);
        struct.alertPolicy.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteAlertPolicyRequestTupleSchemeFactory implements SchemeFactory {
    public DeleteAlertPolicyRequestTupleScheme getScheme() {
      return new DeleteAlertPolicyRequestTupleScheme();
    }
  }

  private static class DeleteAlertPolicyRequestTupleScheme extends TupleScheme<DeleteAlertPolicyRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeleteAlertPolicyRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      struct.alertPolicy.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeleteAlertPolicyRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      struct.alertPolicy = new AlertPolicy();
      struct.alertPolicy.read(iprot);
      struct.setAlertPolicyIsSet(true);
    }
  }

}

