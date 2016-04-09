package com.example.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {

	@Autowired
	ArgumentResolver argumentResolver;
	@Autowired
	Calculator calculator;
	
	public void run(){
		System.out.print("a b : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result=" + result);
	}
}
