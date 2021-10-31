package com.das.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Alien {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("alien.xml");

		DasFamily dasFamily = (DasFamily) applicationContext.getBean("DasFamily");
		dasFamily.printWelcome();
		System.out.println(dasFamily.getNumberOfRooms());

	}
}
