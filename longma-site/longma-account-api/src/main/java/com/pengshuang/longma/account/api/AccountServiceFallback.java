package com.pengshuang.longma.account.api;

import org.springframework.stereotype.Component;

@Component
public class AccountServiceFallback implements AccountService {

    @Override
    public String getToken(String username, String password) {
        return "";
    }
}
