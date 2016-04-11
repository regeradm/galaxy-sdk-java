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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-7")
public class Topic implements libthrift091.TBase<Topic, Topic._Fields>, java.io.Serializable, Cloneable, Comparable<Topic> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Topic");

  private static final libthrift091.protocol.TField TOPIC_INFO_FIELD_DESC = new libthrift091.protocol.TField("topicInfo", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField TOPIC_ATTRIBUTE_FIELD_DESC = new libthrift091.protocol.TField("topicAttribute", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField TOPIC_STATE_FIELD_DESC = new libthrift091.protocol.TField("topicState", libthrift091.protocol.TType.STRUCT, (short)3);
  private static final libthrift091.protocol.TField TOPIC_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("topicQuota", libthrift091.protocol.TType.STRUCT, (short)4);
  private static final libthrift091.protocol.TField TOPIC_ACL_FIELD_DESC = new libthrift091.protocol.TField("topicAcl", libthrift091.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopicStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopicTupleSchemeFactory());
  }

  /**
   * TopicInfo for this topic;
   * 
   */
  public TopicInfo topicInfo; // required
  /**
   * TopicAttribute for this topic;
   * 
   */
  public TopicAttribute topicAttribute; // required
  /**
   * TopicState for this topic;
   * 
   */
  public TopicState topicState; // required
  /**
   * TopicQuota for the topic;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota; // optional
  /**
   * TopicAcl for the topic;
   * 
   */
  public Map<String,Integer> topicAcl; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * TopicInfo for this topic;
     * 
     */
    TOPIC_INFO((short)1, "topicInfo"),
    /**
     * TopicAttribute for this topic;
     * 
     */
    TOPIC_ATTRIBUTE((short)2, "topicAttribute"),
    /**
     * TopicState for this topic;
     * 
     */
    TOPIC_STATE((short)3, "topicState"),
    /**
     * TopicQuota for the topic;
     * 
     */
    TOPIC_QUOTA((short)4, "topicQuota"),
    /**
     * TopicAcl for the topic;
     * 
     */
    TOPIC_ACL((short)5, "topicAcl");

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
        case 1: // TOPIC_INFO
          return TOPIC_INFO;
        case 2: // TOPIC_ATTRIBUTE
          return TOPIC_ATTRIBUTE;
        case 3: // TOPIC_STATE
          return TOPIC_STATE;
        case 4: // TOPIC_QUOTA
          return TOPIC_QUOTA;
        case 5: // TOPIC_ACL
          return TOPIC_ACL;
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
  private static final _Fields optionals[] = {_Fields.TOPIC_QUOTA,_Fields.TOPIC_ACL};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_INFO, new libthrift091.meta_data.FieldMetaData("topicInfo", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicInfo.class)));
    tmpMap.put(_Fields.TOPIC_ATTRIBUTE, new libthrift091.meta_data.FieldMetaData("topicAttribute", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicAttribute.class)));
    tmpMap.put(_Fields.TOPIC_STATE, new libthrift091.meta_data.FieldMetaData("topicState", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicState.class)));
    tmpMap.put(_Fields.TOPIC_QUOTA, new libthrift091.meta_data.FieldMetaData("topicQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.BaseQuota.class)));
    tmpMap.put(_Fields.TOPIC_ACL, new libthrift091.meta_data.FieldMetaData("topicAcl", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Topic.class, metaDataMap);
  }

  public Topic() {
  }

  public Topic(
    TopicInfo topicInfo,
    TopicAttribute topicAttribute,
    TopicState topicState)
  {
    this();
    this.topicInfo = topicInfo;
    this.topicAttribute = topicAttribute;
    this.topicState = topicState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Topic(Topic other) {
    if (other.isSetTopicInfo()) {
      this.topicInfo = new TopicInfo(other.topicInfo);
    }
    if (other.isSetTopicAttribute()) {
      this.topicAttribute = new TopicAttribute(other.topicAttribute);
    }
    if (other.isSetTopicState()) {
      this.topicState = new TopicState(other.topicState);
    }
    if (other.isSetTopicQuota()) {
      this.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota(other.topicQuota);
    }
    if (other.isSetTopicAcl()) {
      Map<String,Integer> __this__topicAcl = new HashMap<String,Integer>(other.topicAcl);
      this.topicAcl = __this__topicAcl;
    }
  }

  public Topic deepCopy() {
    return new Topic(this);
  }

  @Override
  public void clear() {
    this.topicInfo = null;
    this.topicAttribute = null;
    this.topicState = null;
    this.topicQuota = null;
    this.topicAcl = null;
  }

  /**
   * TopicInfo for this topic;
   * 
   */
  public TopicInfo getTopicInfo() {
    return this.topicInfo;
  }

  /**
   * TopicInfo for this topic;
   * 
   */
  public Topic setTopicInfo(TopicInfo topicInfo) {
    this.topicInfo = topicInfo;
    return this;
  }

  public void unsetTopicInfo() {
    this.topicInfo = null;
  }

  /** Returns true if field topicInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicInfo() {
    return this.topicInfo != null;
  }

  public void setTopicInfoIsSet(boolean value) {
    if (!value) {
      this.topicInfo = null;
    }
  }

  /**
   * TopicAttribute for this topic;
   * 
   */
  public TopicAttribute getTopicAttribute() {
    return this.topicAttribute;
  }

  /**
   * TopicAttribute for this topic;
   * 
   */
  public Topic setTopicAttribute(TopicAttribute topicAttribute) {
    this.topicAttribute = topicAttribute;
    return this;
  }

  public void unsetTopicAttribute() {
    this.topicAttribute = null;
  }

  /** Returns true if field topicAttribute is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAttribute() {
    return this.topicAttribute != null;
  }

  public void setTopicAttributeIsSet(boolean value) {
    if (!value) {
      this.topicAttribute = null;
    }
  }

  /**
   * TopicState for this topic;
   * 
   */
  public TopicState getTopicState() {
    return this.topicState;
  }

  /**
   * TopicState for this topic;
   * 
   */
  public Topic setTopicState(TopicState topicState) {
    this.topicState = topicState;
    return this;
  }

  public void unsetTopicState() {
    this.topicState = null;
  }

  /** Returns true if field topicState is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicState() {
    return this.topicState != null;
  }

  public void setTopicStateIsSet(boolean value) {
    if (!value) {
      this.topicState = null;
    }
  }

  /**
   * TopicQuota for the topic;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota getTopicQuota() {
    return this.topicQuota;
  }

  /**
   * TopicQuota for the topic;
   * 
   */
  public Topic setTopicQuota(com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota) {
    this.topicQuota = topicQuota;
    return this;
  }

  public void unsetTopicQuota() {
    this.topicQuota = null;
  }

  /** Returns true if field topicQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicQuota() {
    return this.topicQuota != null;
  }

  public void setTopicQuotaIsSet(boolean value) {
    if (!value) {
      this.topicQuota = null;
    }
  }

  public int getTopicAclSize() {
    return (this.topicAcl == null) ? 0 : this.topicAcl.size();
  }

  public void putToTopicAcl(String key, int val) {
    if (this.topicAcl == null) {
      this.topicAcl = new HashMap<String,Integer>();
    }
    this.topicAcl.put(key, val);
  }

  /**
   * TopicAcl for the topic;
   * 
   */
  public Map<String,Integer> getTopicAcl() {
    return this.topicAcl;
  }

  /**
   * TopicAcl for the topic;
   * 
   */
  public Topic setTopicAcl(Map<String,Integer> topicAcl) {
    this.topicAcl = topicAcl;
    return this;
  }

  public void unsetTopicAcl() {
    this.topicAcl = null;
  }

  /** Returns true if field topicAcl is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAcl() {
    return this.topicAcl != null;
  }

  public void setTopicAclIsSet(boolean value) {
    if (!value) {
      this.topicAcl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_INFO:
      if (value == null) {
        unsetTopicInfo();
      } else {
        setTopicInfo((TopicInfo)value);
      }
      break;

    case TOPIC_ATTRIBUTE:
      if (value == null) {
        unsetTopicAttribute();
      } else {
        setTopicAttribute((TopicAttribute)value);
      }
      break;

    case TOPIC_STATE:
      if (value == null) {
        unsetTopicState();
      } else {
        setTopicState((TopicState)value);
      }
      break;

    case TOPIC_QUOTA:
      if (value == null) {
        unsetTopicQuota();
      } else {
        setTopicQuota((com.xiaomi.infra.galaxy.talos.thrift.BaseQuota)value);
      }
      break;

    case TOPIC_ACL:
      if (value == null) {
        unsetTopicAcl();
      } else {
        setTopicAcl((Map<String,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_INFO:
      return getTopicInfo();

    case TOPIC_ATTRIBUTE:
      return getTopicAttribute();

    case TOPIC_STATE:
      return getTopicState();

    case TOPIC_QUOTA:
      return getTopicQuota();

    case TOPIC_ACL:
      return getTopicAcl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_INFO:
      return isSetTopicInfo();
    case TOPIC_ATTRIBUTE:
      return isSetTopicAttribute();
    case TOPIC_STATE:
      return isSetTopicState();
    case TOPIC_QUOTA:
      return isSetTopicQuota();
    case TOPIC_ACL:
      return isSetTopicAcl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Topic)
      return this.equals((Topic)that);
    return false;
  }

  public boolean equals(Topic that) {
    if (that == null)
      return false;

    boolean this_present_topicInfo = true && this.isSetTopicInfo();
    boolean that_present_topicInfo = true && that.isSetTopicInfo();
    if (this_present_topicInfo || that_present_topicInfo) {
      if (!(this_present_topicInfo && that_present_topicInfo))
        return false;
      if (!this.topicInfo.equals(that.topicInfo))
        return false;
    }

    boolean this_present_topicAttribute = true && this.isSetTopicAttribute();
    boolean that_present_topicAttribute = true && that.isSetTopicAttribute();
    if (this_present_topicAttribute || that_present_topicAttribute) {
      if (!(this_present_topicAttribute && that_present_topicAttribute))
        return false;
      if (!this.topicAttribute.equals(that.topicAttribute))
        return false;
    }

    boolean this_present_topicState = true && this.isSetTopicState();
    boolean that_present_topicState = true && that.isSetTopicState();
    if (this_present_topicState || that_present_topicState) {
      if (!(this_present_topicState && that_present_topicState))
        return false;
      if (!this.topicState.equals(that.topicState))
        return false;
    }

    boolean this_present_topicQuota = true && this.isSetTopicQuota();
    boolean that_present_topicQuota = true && that.isSetTopicQuota();
    if (this_present_topicQuota || that_present_topicQuota) {
      if (!(this_present_topicQuota && that_present_topicQuota))
        return false;
      if (!this.topicQuota.equals(that.topicQuota))
        return false;
    }

    boolean this_present_topicAcl = true && this.isSetTopicAcl();
    boolean that_present_topicAcl = true && that.isSetTopicAcl();
    if (this_present_topicAcl || that_present_topicAcl) {
      if (!(this_present_topicAcl && that_present_topicAcl))
        return false;
      if (!this.topicAcl.equals(that.topicAcl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicInfo = true && (isSetTopicInfo());
    list.add(present_topicInfo);
    if (present_topicInfo)
      list.add(topicInfo);

    boolean present_topicAttribute = true && (isSetTopicAttribute());
    list.add(present_topicAttribute);
    if (present_topicAttribute)
      list.add(topicAttribute);

    boolean present_topicState = true && (isSetTopicState());
    list.add(present_topicState);
    if (present_topicState)
      list.add(topicState);

    boolean present_topicQuota = true && (isSetTopicQuota());
    list.add(present_topicQuota);
    if (present_topicQuota)
      list.add(topicQuota);

    boolean present_topicAcl = true && (isSetTopicAcl());
    list.add(present_topicAcl);
    if (present_topicAcl)
      list.add(topicAcl);

    return list.hashCode();
  }

  @Override
  public int compareTo(Topic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicInfo()).compareTo(other.isSetTopicInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicInfo()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicInfo, other.topicInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicAttribute()).compareTo(other.isSetTopicAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAttribute()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAttribute, other.topicAttribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicState()).compareTo(other.isSetTopicState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicState()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicState, other.topicState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicQuota()).compareTo(other.isSetTopicQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicQuota, other.topicQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicAcl()).compareTo(other.isSetTopicAcl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAcl()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAcl, other.topicAcl);
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
    StringBuilder sb = new StringBuilder("Topic(");
    boolean first = true;

    sb.append("topicInfo:");
    if (this.topicInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.topicInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicAttribute:");
    if (this.topicAttribute == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAttribute);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicState:");
    if (this.topicState == null) {
      sb.append("null");
    } else {
      sb.append(this.topicState);
    }
    first = false;
    if (isSetTopicQuota()) {
      if (!first) sb.append(", ");
      sb.append("topicQuota:");
      if (this.topicQuota == null) {
        sb.append("null");
      } else {
        sb.append(this.topicQuota);
      }
      first = false;
    }
    if (isSetTopicAcl()) {
      if (!first) sb.append(", ");
      sb.append("topicAcl:");
      if (this.topicAcl == null) {
        sb.append("null");
      } else {
        sb.append(this.topicAcl);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicInfo == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicInfo' was not present! Struct: " + toString());
    }
    if (topicAttribute == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAttribute' was not present! Struct: " + toString());
    }
    if (topicState == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicState' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicInfo != null) {
      topicInfo.validate();
    }
    if (topicAttribute != null) {
      topicAttribute.validate();
    }
    if (topicState != null) {
      topicState.validate();
    }
    if (topicQuota != null) {
      topicQuota.validate();
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

  private static class TopicStandardSchemeFactory implements SchemeFactory {
    public TopicStandardScheme getScheme() {
      return new TopicStandardScheme();
    }
  }

  private static class TopicStandardScheme extends StandardScheme<Topic> {

    public void read(libthrift091.protocol.TProtocol iprot, Topic struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_INFO
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicInfo = new TopicInfo();
              struct.topicInfo.read(iprot);
              struct.setTopicInfoIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_ATTRIBUTE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAttribute = new TopicAttribute();
              struct.topicAttribute.read(iprot);
              struct.setTopicAttributeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOPIC_STATE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicState = new TopicState();
              struct.topicState.read(iprot);
              struct.setTopicStateIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOPIC_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
              struct.topicQuota.read(iprot);
              struct.setTopicQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TOPIC_ACL
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map18 = iprot.readMapBegin();
                struct.topicAcl = new HashMap<String,Integer>(2*_map18.size);
                String _key19;
                int _val20;
                for (int _i21 = 0; _i21 < _map18.size; ++_i21)
                {
                  _key19 = iprot.readString();
                  _val20 = iprot.readI32();
                  struct.topicAcl.put(_key19, _val20);
                }
                iprot.readMapEnd();
              }
              struct.setTopicAclIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Topic struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicInfo != null) {
        oprot.writeFieldBegin(TOPIC_INFO_FIELD_DESC);
        struct.topicInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topicAttribute != null) {
        oprot.writeFieldBegin(TOPIC_ATTRIBUTE_FIELD_DESC);
        struct.topicAttribute.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topicState != null) {
        oprot.writeFieldBegin(TOPIC_STATE_FIELD_DESC);
        struct.topicState.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topicQuota != null) {
        if (struct.isSetTopicQuota()) {
          oprot.writeFieldBegin(TOPIC_QUOTA_FIELD_DESC);
          struct.topicQuota.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.topicAcl != null) {
        if (struct.isSetTopicAcl()) {
          oprot.writeFieldBegin(TOPIC_ACL_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, struct.topicAcl.size()));
            for (Map.Entry<String, Integer> _iter22 : struct.topicAcl.entrySet())
            {
              oprot.writeString(_iter22.getKey());
              oprot.writeI32(_iter22.getValue());
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

  private static class TopicTupleSchemeFactory implements SchemeFactory {
    public TopicTupleScheme getScheme() {
      return new TopicTupleScheme();
    }
  }

  private static class TopicTupleScheme extends TupleScheme<Topic> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Topic struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicInfo.write(oprot);
      struct.topicAttribute.write(oprot);
      struct.topicState.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetTopicQuota()) {
        optionals.set(0);
      }
      if (struct.isSetTopicAcl()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTopicQuota()) {
        struct.topicQuota.write(oprot);
      }
      if (struct.isSetTopicAcl()) {
        {
          oprot.writeI32(struct.topicAcl.size());
          for (Map.Entry<String, Integer> _iter23 : struct.topicAcl.entrySet())
          {
            oprot.writeString(_iter23.getKey());
            oprot.writeI32(_iter23.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Topic struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicInfo = new TopicInfo();
      struct.topicInfo.read(iprot);
      struct.setTopicInfoIsSet(true);
      struct.topicAttribute = new TopicAttribute();
      struct.topicAttribute.read(iprot);
      struct.setTopicAttributeIsSet(true);
      struct.topicState = new TopicState();
      struct.topicState.read(iprot);
      struct.setTopicStateIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
        struct.topicQuota.read(iprot);
        struct.setTopicQuotaIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map24 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, iprot.readI32());
          struct.topicAcl = new HashMap<String,Integer>(2*_map24.size);
          String _key25;
          int _val26;
          for (int _i27 = 0; _i27 < _map24.size; ++_i27)
          {
            _key25 = iprot.readString();
            _val26 = iprot.readI32();
            struct.topicAcl.put(_key25, _val26);
          }
        }
        struct.setTopicAclIsSet(true);
      }
    }
  }

}
