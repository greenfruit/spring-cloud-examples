package com.andy.springcloud.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: andy
 * Date: 2018/1/27
 * Time: 20:04
 *
 * 指定端口方式：继承EmbeddedServletContainerCustomizer类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Producer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Producer.class, args);
    }

}
