package com.pengshuang.longma.backend.controller;

import com.pengshuang.longma.account.api.AccountServiceFeignClient;
import com.pengshuang.longma.common.entity.StringResultMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    private final AccountServiceFeignClient accountService;

    public TokenController(AccountServiceFeignClient accountService) {this.accountService = accountService;}

    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public StringResultMessage getToken(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    ) {
        return accountService.getToken(username, password);
    }
}
