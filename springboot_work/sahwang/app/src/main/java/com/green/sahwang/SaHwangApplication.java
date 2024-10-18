package com.green.sahwang;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SaHwangApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaHwangApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
        return new ModelMapper();
	}
}
