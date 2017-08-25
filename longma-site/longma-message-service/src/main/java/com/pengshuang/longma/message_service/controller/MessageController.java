package com.pengshuang.longma.message_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

    @RequestMapping(method = RequestMethod.POST)
    public String sendMessage() {
        return null;
    }

}
