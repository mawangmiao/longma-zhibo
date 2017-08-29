package com.pengshuang.longma.api.message;

import com.pengshuang.longma.common.entity.StringResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ChatMessageService {

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    StringResult send(@RequestBody ChatMessage chatMessage);
}
