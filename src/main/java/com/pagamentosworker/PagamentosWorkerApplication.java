package com.pagamentosworker;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class PagamentosWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentosWorkerApplication.class, args);
	}

}
