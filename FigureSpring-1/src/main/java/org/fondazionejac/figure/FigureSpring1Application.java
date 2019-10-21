package org.fondazionejac.figure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@Configuration
//@ComponentScan
@SpringBootApplication
@EntityScan("org.fondazionejac.figure.entities")
@EnableJpaRepositories(basePackages="org.fondazionejac.figure.repository")
//@EnableAutoConfiguration
public class FigureSpring1Application {

	public static void main(String[] args) {
		SpringApplication.run(FigureSpring1Application.class, args);
	}

}
