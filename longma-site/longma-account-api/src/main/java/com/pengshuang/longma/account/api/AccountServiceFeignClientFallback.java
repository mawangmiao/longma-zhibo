package com.pengshuang.longma.account.api;

import com.pengshuang.longma.common.entity.StringResultMessage;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceFeignClientFallback implements AccountServiceFeignClient {

    @Override
    public StringResultMessage getToken(String username, String password) {
        return new StringResultMessage(false, "");
    }
}
