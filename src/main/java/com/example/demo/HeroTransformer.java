package com.example.demo;

import java.util.List;

import org.springframework.messaging.Message;

public class HeroTransformer {
  public ResponseDTO execute(final Message<List<HeroProcResponse>> message) {
    final Integer heroId = (Integer) message.getHeaders().get("heroId");
    final List<StatusProcResponse> statuses = (List<StatusProcResponse>) message.getHeaders().get("statuses-response");
    List<HeroProcResponse> heroes = message.getPayload();
    if (heroId == null && statuses == null) {
      return null;
    }
    return new ResponseDTO(heroId,heroes, statuses );
  }
}
