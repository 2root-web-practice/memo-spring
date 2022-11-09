package com.memospring.memospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoSpringApplication.class, args);
	}

}
