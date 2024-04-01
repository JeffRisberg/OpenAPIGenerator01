package com.baeldung.openapi.controller;

import com.baeldung.openapi.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

  @GetMapping("/chat")
  public Message chat(@RequestParam String prompt) {

    log.info("running hello");
    Message message = new Message();
    message.setSource(prompt);
    message.setContent("hello to you");

    return message;
  }
}