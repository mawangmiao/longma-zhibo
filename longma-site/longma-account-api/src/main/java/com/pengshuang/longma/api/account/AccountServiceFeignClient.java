package com.pengshuang.longma.api.account;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "account-service", fallback = AccountServiceFeignClientFallback.class)
public interface AccountServiceFeignClient extends AccountService {
}
