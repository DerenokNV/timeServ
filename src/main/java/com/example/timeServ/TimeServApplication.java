package com.example.timeServ;

import com.example.timeServ.times.TimeProviderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource("classpath:custom.properties")
@EnableConfigurationProperties(TimeProviderProperties.class)
public class TimeServApplication {

	public static void main(String[] args) {
		SpringApplication.run( TimeServApplication.class, args );
	}
	
}
