package com.example.app3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.app3.domain.Customer;
import com.example.app3.repository.CustomerRepositoryJpa;

@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner{
	
	@Autowired
	CustomerRepositoryJpa customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//데이터 추가
		Customer created = customerRepository.save(new Customer(null, "Hidetosh","Dekisuki"));
		System.out.println(created+" is created!");
		customerRepository.findAll().forEach(System.out::println);
		
		
		
	}

}
