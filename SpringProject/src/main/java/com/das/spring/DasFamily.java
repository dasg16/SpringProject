package com.das.spring;

import org.springframework.stereotype.Component;

@Component
public class DasFamily {

	public DasFamily() {
		System.out.println("Creating the obj ");
	}

	public DasFamily(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public DasFamily(Dog dog) {
		this.dog = dog;
	}

	private int numberOfMembers;

	private int numberOfRooms;

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	// @Autowired
	private Cats cats;

	private Dog dog;

	public Cats getCats() {
		return cats;
	}

	public void setCats(Cats cats) {
		this.cats = cats;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public void printWelcome() {
		System.out.println("Welcome to the family");
		cats.printCatNames();
		dog.printDogName();

	}
}
