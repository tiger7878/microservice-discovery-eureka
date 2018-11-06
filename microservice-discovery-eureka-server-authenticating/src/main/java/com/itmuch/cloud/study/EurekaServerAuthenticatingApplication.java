package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: monkey
 * Date: 2018-11-06 18:24
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAuthenticatingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAuthenticatingApplication.class, args);
    }

}
