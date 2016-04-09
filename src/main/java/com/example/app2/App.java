package com.example.app2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.app2.domain.Customer;
import com.example.app2.service.CustomerService;


@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner{
	
	@Autowired
	CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		customerService.save(new Customer(1,"Nobita","Nobi"));
		customerService.save(new Customer(2,"Takeshi","Goda"));
		customerService.save(new Customer(3,"Suneo","Honekawa"));
		
		new ArrayList<>().forEach(System.out::println);
	}

}
