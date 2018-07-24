package com.tuto.tutoWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages={
"com.tuto.dao", "com.tuto.tutoWS", "com.tuto.model"})
public class TutoWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoWsApplication.class, args);
	}
}
