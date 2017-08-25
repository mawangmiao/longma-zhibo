package com.pengshuang.longma.message.api;

import lombok.Data;

@Data
public class ChatMessage {
    private String from;
    private String to;
    private String chatMessage;
}
