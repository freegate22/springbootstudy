package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.Frontend;


@EnableAutoConfiguration
@ComponentScan
public class App {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)){
			Frontend frontend = context.getBean(Frontend.class);
			frontend.run();
		}
	}
	
	
	@RequestMapping("/")
	String home(){
		return "Hello world BOOT2222";
	}
	
	
}
