package com.tedu.sp05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sp05EurekaApplication {

	//历史
	//456
	public static void main(String[] args) {
		SpringApplication.run(Sp05EurekaApplication.class, args);
	}

}
