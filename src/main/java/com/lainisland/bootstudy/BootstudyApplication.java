package com.lainisland.bootstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication( exclude = DataSourceAutoConfiguration.class)
public class BootstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstudyApplication.class, args);
		log.info("Server Start");
	}

}
