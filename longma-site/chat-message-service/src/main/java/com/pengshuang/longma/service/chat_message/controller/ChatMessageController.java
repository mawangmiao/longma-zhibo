package com.pengshuang.longma.service.chat_message.controller;

import com.pengshuang.longma.api.message.ChatMessage;
import com.pengshuang.longma.api.message.ChatMessageService;
import com.pengshuang.longma.common.entity.StringResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ChatMessageController implements ChatMessageService {

    @Override
    public StringResult send(ChatMessage chatMessage) {
        return new StringResult(false, "");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Principal user) {
        return "Welcome to Chat Service, " + user.getName();
    }

}
