package com.barani.moviereviewsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages= {"com.barani.moviereviewsystem"})
public class MovieReviewSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewSystemApplication.class, args);
	}

}
