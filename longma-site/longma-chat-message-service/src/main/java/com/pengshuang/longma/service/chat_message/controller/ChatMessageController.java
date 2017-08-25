package com.pengshuang.longma.service.chat_message.controller;

import com.pengshuang.longma.common.entity.StringResult;
import com.pengshuang.longma.api.message.ChatMessage;
import com.pengshuang.longma.api.message.ChatMessageService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatMessageController implements ChatMessageService {

    @Override
    public StringResult send(ChatMessage chatMessage) {
        return new StringResult(false, "");
    }

}
