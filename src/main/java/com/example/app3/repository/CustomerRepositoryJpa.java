package com.example.app3.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.app3.domain.Customer;

public interface CustomerRepositoryJpa extends JpaRepository<Customer, Integer>{
	@Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
	Page<Customer> findAllOrderByName(Pageable pageable);
//	List<Customer> findAllOrderByName();



//	Native Query 를 쓰고 싶을 경우..
//	@Query(value="SELECT id, first_name, last_name FROM customer ORDER BY first_name, last_name", nativeQuery = true)
//	List<Customer> findAllOrderByName();
}
