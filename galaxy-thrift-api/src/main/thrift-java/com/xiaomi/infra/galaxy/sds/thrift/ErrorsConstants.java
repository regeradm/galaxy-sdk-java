/**
 * Autogenerated by Thrift Compiler (0.9.1)
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorsConstants {

  /**
   * SDK自动重试的错误码及回退(backoff)基准时间，
   * 等待时间 = 2 ^ 重试次数 * 回退基准时间
   */
  public static final Map<ErrorCode,Long> ERROR_BACKOFF = new HashMap<ErrorCode,Long>();
  static {
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.SERVICE_UNAVAILABLE, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.THROUGHPUT_EXCEED, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.CLOCK_TOO_SKEWED, 0L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.INTERNAL_ERROR, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.TTRANSPORT_ERROR, 1000L);
  }

  /**
   * 错误码所对应的重试类型
   */
  public static final Map<ErrorCode,RetryType> ERROR_RETRY_TYPE = new HashMap<ErrorCode,RetryType>();
  static {
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.SERVICE_UNAVAILABLE, com.xiaomi.infra.galaxy.sds.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.THROUGHPUT_EXCEED, com.xiaomi.infra.galaxy.sds.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.CLOCK_TOO_SKEWED, com.xiaomi.infra.galaxy.sds.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.INTERNAL_ERROR, com.xiaomi.infra.galaxy.sds.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.TTRANSPORT_ERROR, com.xiaomi.infra.galaxy.sds.thrift.RetryType.UNSAFE);
  }

  /**
   * 抛出异常之前最大重试次数
   */
  public static final int MAX_RETRY = 1;

}
