package com.cloud.shopping.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class ShoppingEurekaApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShoppingEurekaApplication.class, args);
	}
}
