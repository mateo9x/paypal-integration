package com.mateo9x.paypal_integration.interfaces.client;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "paypalClient", url = )
public interface PaypalClient {
}
