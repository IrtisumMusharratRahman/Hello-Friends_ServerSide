package com.server.hellofrields.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.hellofrields.model.Message;



@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/client/group")
    public Message getContent(@RequestBody Message message){
        return message;
    }
    
}
