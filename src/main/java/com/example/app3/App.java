package com.example.app3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

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
		
		Pageable pageable = new PageRequest(0,3);
//		Page<Customer> page = customerRepository.findAll(pageable);
		Page<Customer> page = customerRepository.findAllOrderByName(pageable);
		System.out.println("한 페이지당 데이터 수=" + page.getSize());
		System.out.println("현재 페이지 =" + page.getNumber());
		System.out.println("전체 페이지 =" + page.getTotalPages());
		System.out.println("전체 데이터 =" + page.getTotalElements());
		page.getContent().forEach(System.out::println);
//		customerRepository.findAll().forEach(System.out::println);
//		customerRepository.findAllOrderByName().forEach(System.out::println);
		
		
	}

}
