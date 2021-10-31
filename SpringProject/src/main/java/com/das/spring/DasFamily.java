package com.das.spring;

import org.springframework.stereotype.Component;

@Component
public class DasFamily {

	int numberOfMembers;

	public DasFamily() {
		System.out.println("Creating the obj ");
	}

//	@Autowired
//	Cats cats;

	public void printWelcome() {
		System.out.println("Welcome to the family");

	}

//	public void displayNames() {
//		cats.printCatNames();
//	}
}
