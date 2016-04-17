package com.example.app3.domain;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
	
	public Customer(){
		
	}
	
	public Customer(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
}
