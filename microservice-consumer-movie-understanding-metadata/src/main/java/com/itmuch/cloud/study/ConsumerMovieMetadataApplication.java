package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 微服务启动类
 * User: monkey
 * Date: 2018-11-07 11:26
 */
@SpringBootApplication
@EnableDiscoveryClient //申明是Eureka Client
public class ConsumerMovieMetadataApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieMetadataApplication.class, args);
    }

}
