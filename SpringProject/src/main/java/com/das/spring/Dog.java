package com.das.spring;

import org.springframework.stereotype.Component;

@Component
public class Dog {

	String dog = "Stamper";

	public void printDogName() {
		System.out.println("Dog name is " + dog);
	}

}
