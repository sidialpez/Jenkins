package com.example.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("Este es mi primer ejercicio con DevOps");
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		logger.info("Vamos por el segundo log...");
		logger.info("Vamos por el tercer log...");
		logger.info("Vamos por el cuarto log...");
	}


}
