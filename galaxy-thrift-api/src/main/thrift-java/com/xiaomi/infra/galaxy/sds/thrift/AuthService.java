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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-6-26")
public class AuthService {

  /**
   * 结构化存储授权相关接口(目前尚未开放)
   */
  public interface Iface extends com.xiaomi.infra.galaxy.sds.thrift.BaseService.Iface {

    /**
     * 通过第三方认证系统换发Storage Access Token，采用App Secret登录无需此过程
     * 
     * @param oauthInfo
     */
    public Credential createCredential(OAuthInfo oauthInfo) throws com.xiaomi.infra.galaxy.sds.thrift.ServiceException, libthrift091.TException;

  }

  public interface AsyncIface extends com.xiaomi.infra.galaxy.sds.thrift.BaseService .AsyncIface {

    public void createCredential(OAuthInfo oauthInfo, libthrift091.async.AsyncMethodCallback resultHandler) throws libthrift091.TException;

  }

  public static class Client extends com.xiaomi.infra.galaxy.sds.thrift.BaseService.Client implements Iface {
    public static class Factory implements libthrift091.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(libthrift091.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(libthrift091.protocol.TProtocol iprot, libthrift091.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(libthrift091.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(libthrift091.protocol.TProtocol iprot, libthrift091.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public Credential createCredential(OAuthInfo oauthInfo) throws com.xiaomi.infra.galaxy.sds.thrift.ServiceException, libthrift091.TException
    {
      send_createCredential(oauthInfo);
      return recv_createCredential();
    }

    public void send_createCredential(OAuthInfo oauthInfo) throws libthrift091.TException
    {
      createCredential_args args = new createCredential_args();
      args.setOauthInfo(oauthInfo);
      sendBase("createCredential", args);
    }

    public Credential recv_createCredential() throws com.xiaomi.infra.galaxy.sds.thrift.ServiceException, libthrift091.TException
    {
      createCredential_result result = new createCredential_result();
      receiveBase(result, "createCredential");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.se != null) {
        throw result.se;
      }
      throw new libthrift091.TApplicationException(libthrift091.TApplicationException.MISSING_RESULT, "createCredential failed: unknown result");
    }

  }
  public static class AsyncClient extends com.xiaomi.infra.galaxy.sds.thrift.BaseService.AsyncClient implements AsyncIface {
    public static class Factory implements libthrift091.async.TAsyncClientFactory<AsyncClient> {
      private libthrift091.async.TAsyncClientManager clientManager;
      private libthrift091.protocol.TProtocolFactory protocolFactory;
      public Factory(libthrift091.async.TAsyncClientManager clientManager, libthrift091.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(libthrift091.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(libthrift091.protocol.TProtocolFactory protocolFactory, libthrift091.async.TAsyncClientManager clientManager, libthrift091.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void createCredential(OAuthInfo oauthInfo, libthrift091.async.AsyncMethodCallback resultHandler) throws libthrift091.TException {
      checkReady();
      createCredential_call method_call = new createCredential_call(oauthInfo, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class createCredential_call extends libthrift091.async.TAsyncMethodCall {
      private OAuthInfo oauthInfo;
      public createCredential_call(OAuthInfo oauthInfo, libthrift091.async.AsyncMethodCallback resultHandler, libthrift091.async.TAsyncClient client, libthrift091.protocol.TProtocolFactory protocolFactory, libthrift091.transport.TNonblockingTransport transport) throws libthrift091.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.oauthInfo = oauthInfo;
      }

      public void write_args(libthrift091.protocol.TProtocol prot) throws libthrift091.TException {
        prot.writeMessageBegin(new libthrift091.protocol.TMessage("createCredential", libthrift091.protocol.TMessageType.CALL, 0));
        createCredential_args args = new createCredential_args();
        args.setOauthInfo(oauthInfo);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public Credential getResult() throws com.xiaomi.infra.galaxy.sds.thrift.ServiceException, libthrift091.TException {
        if (getState() != libthrift091.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        libthrift091.transport.TMemoryInputTransport memoryTransport = new libthrift091.transport.TMemoryInputTransport(getFrameBuffer().array());
        libthrift091.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_createCredential();
      }
    }

  }

  public static class Processor<I extends Iface> extends com.xiaomi.infra.galaxy.sds.thrift.BaseService.Processor<I> implements libthrift091.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, libthrift091.ProcessFunction<I, ? extends libthrift091.TBase>>()));
    }

    protected Processor(I iface, Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> getProcessMap(Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> processMap) {
      processMap.put("createCredential", new createCredential());
      return processMap;
    }

    public static class createCredential<I extends Iface> extends libthrift091.ProcessFunction<I, createCredential_args> {
      public createCredential() {
        super("createCredential");
      }

      public createCredential_args getEmptyArgsInstance() {
        return new createCredential_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public createCredential_result getResult(I iface, createCredential_args args) throws libthrift091.TException {
        createCredential_result result = new createCredential_result();
        try {
          result.success = iface.createCredential(args.oauthInfo);
        } catch (com.xiaomi.infra.galaxy.sds.thrift.ServiceException se) {
          result.se = se;
        }
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends com.xiaomi.infra.galaxy.sds.thrift.BaseService.AsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, libthrift091.AsyncProcessFunction<I, ? extends libthrift091.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase,?>> getProcessMap(Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase, ?>> processMap) {
      processMap.put("createCredential", new createCredential());
      return processMap;
    }

    public static class createCredential<I extends AsyncIface> extends libthrift091.AsyncProcessFunction<I, createCredential_args, Credential> {
      public createCredential() {
        super("createCredential");
      }

      public createCredential_args getEmptyArgsInstance() {
        return new createCredential_args();
      }

      public AsyncMethodCallback<Credential> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final libthrift091.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Credential>() { 
          public void onComplete(Credential o) {
            createCredential_result result = new createCredential_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, libthrift091.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = libthrift091.protocol.TMessageType.REPLY;
            libthrift091.TBase msg;
            createCredential_result result = new createCredential_result();
            if (e instanceof com.xiaomi.infra.galaxy.sds.thrift.ServiceException) {
                        result.se = (com.xiaomi.infra.galaxy.sds.thrift.ServiceException) e;
                        result.setSeIsSet(true);
                        msg = result;
            }
             else 
            {
              msgType = libthrift091.protocol.TMessageType.EXCEPTION;
              msg = (libthrift091.TBase)new libthrift091.TApplicationException(libthrift091.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, createCredential_args args, libthrift091.async.AsyncMethodCallback<Credential> resultHandler) throws TException {
        iface.createCredential(args.oauthInfo,resultHandler);
      }
    }

  }

  public static class createCredential_args implements libthrift091.TBase<createCredential_args, createCredential_args._Fields>, java.io.Serializable, Cloneable, Comparable<createCredential_args>   {
    private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("createCredential_args");

    private static final libthrift091.protocol.TField OAUTH_INFO_FIELD_DESC = new libthrift091.protocol.TField("oauthInfo", libthrift091.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new createCredential_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new createCredential_argsTupleSchemeFactory());
    }

    public OAuthInfo oauthInfo; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements libthrift091.TFieldIdEnum {
      OAUTH_INFO((short)1, "oauthInfo");

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
          case 1: // OAUTH_INFO
            return OAUTH_INFO;
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
      tmpMap.put(_Fields.OAUTH_INFO, new libthrift091.meta_data.FieldMetaData("oauthInfo", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, OAuthInfo.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(createCredential_args.class, metaDataMap);
    }

    public createCredential_args() {
    }

    public createCredential_args(
      OAuthInfo oauthInfo)
    {
      this();
      this.oauthInfo = oauthInfo;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public createCredential_args(createCredential_args other) {
      if (other.isSetOauthInfo()) {
        this.oauthInfo = new OAuthInfo(other.oauthInfo);
      }
    }

    public createCredential_args deepCopy() {
      return new createCredential_args(this);
    }

    @Override
    public void clear() {
      this.oauthInfo = null;
    }

    public OAuthInfo getOauthInfo() {
      return this.oauthInfo;
    }

    public createCredential_args setOauthInfo(OAuthInfo oauthInfo) {
      this.oauthInfo = oauthInfo;
      return this;
    }

    public void unsetOauthInfo() {
      this.oauthInfo = null;
    }

    /** Returns true if field oauthInfo is set (has been assigned a value) and false otherwise */
    public boolean isSetOauthInfo() {
      return this.oauthInfo != null;
    }

    public void setOauthInfoIsSet(boolean value) {
      if (!value) {
        this.oauthInfo = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case OAUTH_INFO:
        if (value == null) {
          unsetOauthInfo();
        } else {
          setOauthInfo((OAuthInfo)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case OAUTH_INFO:
        return getOauthInfo();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case OAUTH_INFO:
        return isSetOauthInfo();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof createCredential_args)
        return this.equals((createCredential_args)that);
      return false;
    }

    public boolean equals(createCredential_args that) {
      if (that == null)
        return false;

      boolean this_present_oauthInfo = true && this.isSetOauthInfo();
      boolean that_present_oauthInfo = true && that.isSetOauthInfo();
      if (this_present_oauthInfo || that_present_oauthInfo) {
        if (!(this_present_oauthInfo && that_present_oauthInfo))
          return false;
        if (!this.oauthInfo.equals(that.oauthInfo))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_oauthInfo = true && (isSetOauthInfo());
      list.add(present_oauthInfo);
      if (present_oauthInfo)
        list.add(oauthInfo);

      return list.hashCode();
    }

    @Override
    public int compareTo(createCredential_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetOauthInfo()).compareTo(other.isSetOauthInfo());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetOauthInfo()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.oauthInfo, other.oauthInfo);
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
      StringBuilder sb = new StringBuilder("createCredential_args(");
      boolean first = true;

      sb.append("oauthInfo:");
      if (this.oauthInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.oauthInfo);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws libthrift091.TException {
      // check for required fields
      // check for sub-struct validity
      if (oauthInfo != null) {
        oauthInfo.validate();
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

    private static class createCredential_argsStandardSchemeFactory implements SchemeFactory {
      public createCredential_argsStandardScheme getScheme() {
        return new createCredential_argsStandardScheme();
      }
    }

    private static class createCredential_argsStandardScheme extends StandardScheme<createCredential_args> {

      public void read(libthrift091.protocol.TProtocol iprot, createCredential_args struct) throws libthrift091.TException {
        libthrift091.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == libthrift091.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // OAUTH_INFO
              if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
                struct.oauthInfo = new OAuthInfo();
                struct.oauthInfo.read(iprot);
                struct.setOauthInfoIsSet(true);
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

      public void write(libthrift091.protocol.TProtocol oprot, createCredential_args struct) throws libthrift091.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.oauthInfo != null) {
          oprot.writeFieldBegin(OAUTH_INFO_FIELD_DESC);
          struct.oauthInfo.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class createCredential_argsTupleSchemeFactory implements SchemeFactory {
      public createCredential_argsTupleScheme getScheme() {
        return new createCredential_argsTupleScheme();
      }
    }

    private static class createCredential_argsTupleScheme extends TupleScheme<createCredential_args> {

      @Override
      public void write(libthrift091.protocol.TProtocol prot, createCredential_args struct) throws libthrift091.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetOauthInfo()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetOauthInfo()) {
          struct.oauthInfo.write(oprot);
        }
      }

      @Override
      public void read(libthrift091.protocol.TProtocol prot, createCredential_args struct) throws libthrift091.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.oauthInfo = new OAuthInfo();
          struct.oauthInfo.read(iprot);
          struct.setOauthInfoIsSet(true);
        }
      }
    }

  }

  public static class createCredential_result implements libthrift091.TBase<createCredential_result, createCredential_result._Fields>, java.io.Serializable, Cloneable, Comparable<createCredential_result>   {
    private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("createCredential_result");

    private static final libthrift091.protocol.TField SUCCESS_FIELD_DESC = new libthrift091.protocol.TField("success", libthrift091.protocol.TType.STRUCT, (short)0);
    private static final libthrift091.protocol.TField SE_FIELD_DESC = new libthrift091.protocol.TField("se", libthrift091.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new createCredential_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new createCredential_resultTupleSchemeFactory());
    }

    public Credential success; // required
    public com.xiaomi.infra.galaxy.sds.thrift.ServiceException se; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements libthrift091.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      SE((short)1, "se");

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
          case 0: // SUCCESS
            return SUCCESS;
          case 1: // SE
            return SE;
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
      tmpMap.put(_Fields.SUCCESS, new libthrift091.meta_data.FieldMetaData("success", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Credential.class)));
      tmpMap.put(_Fields.SE, new libthrift091.meta_data.FieldMetaData("se", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(createCredential_result.class, metaDataMap);
    }

    public createCredential_result() {
    }

    public createCredential_result(
      Credential success,
      com.xiaomi.infra.galaxy.sds.thrift.ServiceException se)
    {
      this();
      this.success = success;
      this.se = se;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public createCredential_result(createCredential_result other) {
      if (other.isSetSuccess()) {
        this.success = new Credential(other.success);
      }
      if (other.isSetSe()) {
        this.se = new com.xiaomi.infra.galaxy.sds.thrift.ServiceException(other.se);
      }
    }

    public createCredential_result deepCopy() {
      return new createCredential_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.se = null;
    }

    public Credential getSuccess() {
      return this.success;
    }

    public createCredential_result setSuccess(Credential success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public com.xiaomi.infra.galaxy.sds.thrift.ServiceException getSe() {
      return this.se;
    }

    public createCredential_result setSe(com.xiaomi.infra.galaxy.sds.thrift.ServiceException se) {
      this.se = se;
      return this;
    }

    public void unsetSe() {
      this.se = null;
    }

    /** Returns true if field se is set (has been assigned a value) and false otherwise */
    public boolean isSetSe() {
      return this.se != null;
    }

    public void setSeIsSet(boolean value) {
      if (!value) {
        this.se = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((Credential)value);
        }
        break;

      case SE:
        if (value == null) {
          unsetSe();
        } else {
          setSe((com.xiaomi.infra.galaxy.sds.thrift.ServiceException)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      case SE:
        return getSe();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case SE:
        return isSetSe();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof createCredential_result)
        return this.equals((createCredential_result)that);
      return false;
    }

    public boolean equals(createCredential_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_se = true && this.isSetSe();
      boolean that_present_se = true && that.isSetSe();
      if (this_present_se || that_present_se) {
        if (!(this_present_se && that_present_se))
          return false;
        if (!this.se.equals(that.se))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      boolean present_se = true && (isSetSe());
      list.add(present_se);
      if (present_se)
        list.add(se);

      return list.hashCode();
    }

    @Override
    public int compareTo(createCredential_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetSe()).compareTo(other.isSetSe());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSe()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.se, other.se);
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
      StringBuilder sb = new StringBuilder("createCredential_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("se:");
      if (this.se == null) {
        sb.append("null");
      } else {
        sb.append(this.se);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws libthrift091.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
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

    private static class createCredential_resultStandardSchemeFactory implements SchemeFactory {
      public createCredential_resultStandardScheme getScheme() {
        return new createCredential_resultStandardScheme();
      }
    }

    private static class createCredential_resultStandardScheme extends StandardScheme<createCredential_result> {

      public void read(libthrift091.protocol.TProtocol iprot, createCredential_result struct) throws libthrift091.TException {
        libthrift091.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == libthrift091.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
                struct.success = new Credential();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
              } else { 
                libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // SE
              if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
                struct.se = new com.xiaomi.infra.galaxy.sds.thrift.ServiceException();
                struct.se.read(iprot);
                struct.setSeIsSet(true);
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

      public void write(libthrift091.protocol.TProtocol oprot, createCredential_result struct) throws libthrift091.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        if (struct.se != null) {
          oprot.writeFieldBegin(SE_FIELD_DESC);
          struct.se.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class createCredential_resultTupleSchemeFactory implements SchemeFactory {
      public createCredential_resultTupleScheme getScheme() {
        return new createCredential_resultTupleScheme();
      }
    }

    private static class createCredential_resultTupleScheme extends TupleScheme<createCredential_result> {

      @Override
      public void write(libthrift091.protocol.TProtocol prot, createCredential_result struct) throws libthrift091.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetSe()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
        if (struct.isSetSe()) {
          struct.se.write(oprot);
        }
      }

      @Override
      public void read(libthrift091.protocol.TProtocol prot, createCredential_result struct) throws libthrift091.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.success = new Credential();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
        if (incoming.get(1)) {
          struct.se = new com.xiaomi.infra.galaxy.sds.thrift.ServiceException();
          struct.se.read(iprot);
          struct.setSeIsSet(true);
        }
      }
    }

  }

}
