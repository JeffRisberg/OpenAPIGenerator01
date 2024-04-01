package com.baeldung.openapi.controller;

import com.baeldung.openapi.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

  // The jersey counterpart of this would be:
  // @GET
  // @Path("/chat")
  // public Message chat(@QueryParam("source") String source) {

  @GetMapping("/chat")
  public Message chat(@RequestParam String source) {

    log.info("running chat1");
    Message message = new Message();
    message.setSource(source);
    message.setContent("hello to you");

    return message;
  }
}