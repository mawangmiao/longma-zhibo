package com.pengshuang.longma.api.account;

import com.pengshuang.longma.common.entity.StringResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface AccountService {

    @RequestMapping(value = "/token", method = RequestMethod.GET)
    StringResult getToken(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    );
}
