package com.example.dogtraining;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DogtrainingApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(DogtrainingApplication.class, args);
// 	}

// }

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.dogtraining")
@EnableJpaRepositories(basePackages = "com.example.dogtraining.repository")
@ComponentScan(basePackages = { "com.example.dogtraining.*" })
@EntityScan("com.example.dogtraining.model.*")   
public class DogtrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogtrainingApplication.class, args);
    }
}
