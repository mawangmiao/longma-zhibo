package com.pengshuang.longma.api.message;

import lombok.Data;

@Data
public class ChatMessage {
    private String from;
    private String to;
    private String chatMessage;
}
