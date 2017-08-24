package com.pengshuang.longma.account_service.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AccountController {

    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public String getToken(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    ) {
        if (StringUtils.equals(username, "pengshuang") && StringUtils.equals(password, "123456")) {
            return UUID.randomUUID().toString();
        }
        return null;
    }

}
