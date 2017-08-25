package com.pengshuang.longma.account.service.controller;

import com.pengshuang.longma.account.api.AccountService;
import com.pengshuang.longma.common.entity.StringResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AccountController implements AccountService {

    @Override
    public StringResult getToken(String username, String password) {
        String token = null;
        if (StringUtils.equals(username, "pengshuang") && StringUtils.equals(password, "123456")) {
            token = UUID.randomUUID().toString();
        }
        return new StringResult(token != null, token);
    }

}
