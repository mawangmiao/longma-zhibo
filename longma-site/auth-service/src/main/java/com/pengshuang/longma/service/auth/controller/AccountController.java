package com.pengshuang.longma.service.auth.controller;

import com.pengshuang.longma.api.account.AccountService;
import com.pengshuang.longma.common.entity.StringResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class AccountController implements AccountService {

    @Override
    public StringResult getToken(String username, String password) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to Account Service";
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
