package com.dell.ecomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sprig Boot : Java-based Spring configuration, component scanning are auto
 * configured.
 * 
 * @SpringBootApplication : this annotation allow spring auto configuration.
 * @SpringBootApplication = @Configuration + @ComponentScan
 *                        + @EnableAutoConfiguration
 * @Configuration : -> enable Java-based configuration
 * @ComponentScan :-> enable component scanning. Scanning a different bean file
 * @EnableAutoConfiguration :-> enable Spring Boot's auto-configuration feature.
 */
@SpringBootApplication
public class Phase3WebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3WebServiceApplication.class, args);
	}

}
