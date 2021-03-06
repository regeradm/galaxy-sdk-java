/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: yongxing@xiaomi.com
 */

package com.xiaomi.infra.galaxy.talos.producer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

import libthrift091.TException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import com.xiaomi.infra.galaxy.talos.client.ScheduleInfoCache;
import com.xiaomi.infra.galaxy.talos.thrift.GalaxyTalosException;
import com.xiaomi.infra.galaxy.talos.thrift.Message;
import com.xiaomi.infra.galaxy.talos.thrift.MessageService;
import com.xiaomi.infra.galaxy.talos.thrift.PutMessageRequest;
import com.xiaomi.infra.galaxy.talos.thrift.PutMessageResponse;
import com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition;
import com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class SimpleProducerTest {
  private static final String topicName = "MyTopic";
  private static final String resourceName = "12345#MyTopic#dfi34598dfj4";
  private static final int partitionId = 7;

  private static TalosProducerConfig producerConfig;
  private static MessageService.Iface messageClientMock;
  private static ScheduleInfoCache scheduleInfoCacheMock;
  private static TopicAndPartition topicAndPartition;
  private static List<Message> messageList;
  private static SimpleProducer simpleProducer;

  @Before
  public void setUp() throws IOException {
    Properties properties = new Properties();
    properties.setProperty("galaxy.talos.service.endpoint", "testUrl");
    producerConfig = new TalosProducerConfig(properties);
    messageClientMock = Mockito.mock(MessageService.Iface.class);
    scheduleInfoCacheMock = Mockito.mock(ScheduleInfoCache.class);
    topicAndPartition = new TopicAndPartition(topicName,
        new TopicTalosResourceName(resourceName), partitionId);
    Message message = new Message(ByteBuffer.wrap("hello world".getBytes()));
    messageList = new ArrayList<Message>();
    messageList.add(message);
    simpleProducer = new SimpleProducer(producerConfig, topicAndPartition,
        messageClientMock, new AtomicLong(1), scheduleInfoCacheMock);
  }

  @After
  public void tearDown() {

  }

  @Test (expected = RuntimeException.class)
  public void testConfigWithoutServiceURI() throws Exception {
    Properties properties = new Properties();
    TalosProducerConfig producerConfig = new TalosProducerConfig(properties);
  }

  @Test (expected = RuntimeException.class)
  public void testConfigWithFileNotFound() throws Exception {
    TalosProducerConfig producerConfig = new TalosProducerConfig("test.file");
  }

  @Test
  public void testPutMessage() throws TException {
    doReturn(new PutMessageResponse()).when(messageClientMock).putMessage(
        any(PutMessageRequest.class));
    when(scheduleInfoCacheMock.getOrCreateMessageClient(any(TopicAndPartition.class)))
        .thenReturn(messageClientMock);
    boolean putSuccess = simpleProducer.putMessage(messageList);
    assertTrue(putSuccess);
    assertTrue(simpleProducer.putMessage(new ArrayList<Message>()));
    assertTrue(simpleProducer.putMessage(null));

    InOrder inOrder = inOrder(messageClientMock);
    inOrder.verify(messageClientMock, times(1)).putMessage(
        any(PutMessageRequest.class));
    inOrder.verifyNoMoreInteractions();
  }

  @Test (expected = IllegalArgumentException.class)
  public void testTopicAndPartition() throws Exception {
    TopicAndPartition topicAndPartition1 = new TopicAndPartition(
        "CL777/" + topicName, new TopicTalosResourceName(resourceName),
        partitionId);
    SimpleProducer simpleProducer1 = new SimpleProducer(producerConfig,
        topicAndPartition1, messageClientMock, new AtomicLong());
  }

  @Test
  public void testPutMessageException() throws TException {
    doThrow(new GalaxyTalosException()).doReturn(new PutMessageResponse())
        .when(messageClientMock).putMessage(any(PutMessageRequest.class));
    when(scheduleInfoCacheMock.getOrCreateMessageClient(any(TopicAndPartition.class)))
        .thenReturn(messageClientMock);
    boolean putSuccess = simpleProducer.putMessage(messageList);
    assertFalse(putSuccess);
    while (!putSuccess) {
      putSuccess = simpleProducer.putMessage(messageList);
      assertTrue(putSuccess);
    }

    InOrder inOrder = inOrder(messageClientMock);
    inOrder.verify(messageClientMock, times(2)).putMessage(
        any(PutMessageRequest.class));
    inOrder.verifyNoMoreInteractions();
  }

  @Test (expected = IllegalArgumentException.class)
  public void testMessageBlockSizeLimit() throws Exception {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= 20 * 1024 * 1024; ++i) {
      sb.append('a');
    }
    Message message = new Message(ByteBuffer.wrap(sb.toString().getBytes()));
    List<Message> msgList = new ArrayList<Message>();
    msgList.add(message);
    simpleProducer.putMessageList(msgList);
  }

}