package com.javagraphql.demo;

import com.coxautodev.graphql.tools.SchemaParserDictionary;
import com.javagraphql.demo.model.UserInput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	SchemaParserDictionary schemaParserDictionary() {
		return new SchemaParserDictionary()
				.add(UserInput.class);
	}

}
