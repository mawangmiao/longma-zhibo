package com.pengshuang.longma.backend.controller;

import com.pengshuang.longma.account.api.AccountService;
import com.pengshuang.longma.backend.view.ResultView;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    private final AccountService accountService;

    public TokenController(AccountService accountService) {this.accountService = accountService;}

    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public ResultView<String> getToken(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    ) {
        String token = accountService.getToken(username, password);
        return StringUtils.isBlank(token) ? new ResultView<>(false, "") : new ResultView<>(true, token);
    }
}
