package com.cice.springzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;


@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class CiceSpringZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiceSpringZuulApplication.class, args);
	}
}
