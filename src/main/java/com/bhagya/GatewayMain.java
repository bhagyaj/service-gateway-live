package com.bhagya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayMain {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain.class, args);
    }
}
