package com.pengshuang.longma.service.chat_message.controller;

import com.pengshuang.longma.api.message.ChatMessage;
import com.pengshuang.longma.api.message.ChatMessageService;
import com.pengshuang.longma.common.entity.StringResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;

@Slf4j
@RestController
public class ChatMessageController implements ChatMessageService {

    @Override
    public StringResult send(ChatMessage chatMessage) {
        return new StringResult(false, "");
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Principal user) {
        String ip = null;
        String host = null;

        try {
            InetAddress ia = InetAddress.getLocalHost();
            host = ia.getHostName();//获取计算机主机名
            ip = ia.getHostAddress();//获取计算机IP
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        String message = String.format("[%s] [%s] Welcome to Chat Service, %s", ip, host, user.getName());
        log.info(message);
        return message;
    }

}
