package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务启动类
 * User: monkey
 * Date: 2018-11-07 11:14
 */
@SpringBootApplication
@EnableDiscoveryClient //申明是一个Eureka Client
public class ProviderUserMetadataApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserMetadataApplication.class, args);
    }

}
