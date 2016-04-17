package com.example.app3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.app3.domain.Customer;

public interface CustomerRepositoryJpa extends JpaRepository<Customer, Integer>{

}
