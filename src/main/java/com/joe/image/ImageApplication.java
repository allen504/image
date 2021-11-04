package com.joe.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ImageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = new SpringApplicationBuilder(ImageApplication.class).headless(false).run(args);

		try {

			LoadEditDisplay led = new LoadEditDisplay("C:\\Users\\15044\\Pictures\\Camera Roll\\joe.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
