package com.example.demo;

import java.util.List;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

public class StatusTransformer {
  public Message<List<StatusProcResponse>> execute(final Message<List<StatusProcResponse>> messages) {
    return new GenericMessage<>(messages.getPayload(), messages.getHeaders());
  }
}
