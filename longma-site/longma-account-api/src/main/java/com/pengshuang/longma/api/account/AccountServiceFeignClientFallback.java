package com.pengshuang.longma.api.account;

import com.pengshuang.longma.common.entity.StringResult;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceFeignClientFallback implements AccountServiceFeignClient {

    @Override
    public StringResult getToken(String username, String password) {
        return new StringResult(false, "");
    }
}
