package com.speedhome.property.management;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpeedHomeApplication {

	private static final Logger LOGGER = LogManager.getLogger(SpeedHomeApplication.class);
			
	public static void main(String[] args) {
		LOGGER.info("=========================== SpeedHomeApplication -> main() ===========================");
		SpringApplication.run(SpeedHomeApplication.class, args);
	}

}
