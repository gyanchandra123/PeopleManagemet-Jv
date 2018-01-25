package com.infotech.app.springBootlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootloggerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootloggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootloggerApplication.class, args);
		LOGGER.error("message log at ERROR level");
		LOGGER.warn("message log at WARN level");
		LOGGER.info("message log at INFO level");
		LOGGER.debug("message log at DEBUG level");
	}

	@RequestMapping("/")
	public String welcome() {
		return "Hello world";
	}

}
