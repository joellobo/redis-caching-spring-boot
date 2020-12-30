package com.hardik.mcgonagall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class McgonagallApplication {

	public static void main(String[] args) {
		SpringApplication.run(McgonagallApplication.class, args);
	}

}
