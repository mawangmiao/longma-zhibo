package com.pengshuang.longma.service.auth.controller;

import com.pengshuang.longma.api.account.AccountService;
import com.pengshuang.longma.common.entity.StringResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RestController
public class AccountController implements AccountService {

    @Override
    public StringResult getToken(String username, String password) {
        return null;
    }

    @RequestMapping({"/", "/welcome"})
    public String welcome() {
        log.info("Welcome to Auth Service");
        return "Welcome to Auth Service";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Principal user) {
        return "Hello " + user.getName();
    }

    @RequestMapping({"/user", "/me"})
    public Map<String, String> user(Principal principal) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", principal.getName());
        return map;
    }

}
