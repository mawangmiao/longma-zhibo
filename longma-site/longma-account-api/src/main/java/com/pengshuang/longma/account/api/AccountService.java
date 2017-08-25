package com.pengshuang.longma.account.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("account-service")
public interface AccountService {

    @RequestMapping(value = "/account/token", method = RequestMethod.GET)
    String getToken(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    );
}
