package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.repository.MovieRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.example.*")
@EnableSwagger2
public class EntertainmentAppApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EntertainmentAppApplication.class, args);
		
	}

}
