package com.cloud.shopping.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心
 * @author xiaocaiyidie
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ShoppingDiscoveryApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShoppingDiscoveryApplication.class, args);
	}
}
