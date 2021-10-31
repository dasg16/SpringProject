package com.das.spring;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animals {

	String dog = "Stamper";

	public void printDogName() {
		System.out.println("Dog name is " + dog);
	}

	public void animalScientificGroup() {
		System.out.println("Canis lupus");
	}

}
