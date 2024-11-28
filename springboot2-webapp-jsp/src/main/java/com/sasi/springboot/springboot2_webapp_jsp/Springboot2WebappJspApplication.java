package com.sasi.springboot.springboot2_webapp_jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Springboot2WebappJspApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Springboot2WebappJspApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Springboot2WebappJspApplication.class, args);
	}

}
