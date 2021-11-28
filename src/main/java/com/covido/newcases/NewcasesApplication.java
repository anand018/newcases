package com.covido.newcases;

import com.covido.newcases.dto.ConfigProperties;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
@OpenAPIDefinition(info = @Info(title = "Covido - New Cases API", version = "1.0", description = "New Covid Cases"))
public class NewcasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewcasesApplication.class, args);
	}

}
