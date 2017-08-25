package com.pengshuang.longma.message_service.controller;

import com.pengshuang.longma.common.entity.StringResult;
import com.pengshuang.longma.message.api.ChatMessage;
import com.pengshuang.longma.message.api.ChatMessageService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatMessageController implements ChatMessageService {

    @Override
    public StringResult send(ChatMessage chatMessage) {
        return new StringResult(false, "");
    }

}
