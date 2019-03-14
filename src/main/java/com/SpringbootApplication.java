package com;

import com.config.Student;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app  = new SpringApplication(SpringbootApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
