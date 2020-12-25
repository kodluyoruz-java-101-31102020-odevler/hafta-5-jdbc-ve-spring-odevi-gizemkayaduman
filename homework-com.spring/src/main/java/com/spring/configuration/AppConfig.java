package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.ConsoleApplication;
import com.spring.data.exporter.SalaryJsonConverter;

@Configuration
@ComponentScan(basePackages = {
		"com.spring.basics.dto",
		"com.spring.basics.aspect",
		"com.spring.basics.data.exporter",
		"com.spring.basics.model.dao.impl",
		"com.spring.basics.model.service.impl"
})
public class AppConfig {

	@Bean("sJsonConverter")
	public SalaryJsonConverter createSalaryJsonConverter() {
		
		return new SalaryJsonConverter();
	}
	
	@Bean("consoleApplication")
	public ConsoleApplication createConsoleApplication() {
		
		return new ConsoleApplication();
	}
	
}
