package com.das.spring;

import org.springframework.stereotype.Component;

@Component
public class Cats implements Animals {

	String cat1 = "Cleo";
	String cat2 = "Monsoon";
	String cat3 = "Toby";

	public void printCatNames() {
		System.out.println("Cat names are " + cat1 + ", " + cat2 + ", " + cat3);
	}

	public void animalScientificGroup() {
		System.out.println("Felidae");
	}
}
