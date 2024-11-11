package com.example.SpringBootApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Estamos en el test de la aplicación...");
		assertEquals(true,true);
	}

}
