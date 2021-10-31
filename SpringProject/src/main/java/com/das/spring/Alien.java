package com.das.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Alien {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("alien.xml");

		DasFamily dasFamily = (DasFamily) applicationContext.getBean("DasFamily");
//		dasFamily.printWelcome();
		dasFamily.numberOfMembers = 6;
		System.out.println(dasFamily.numberOfMembers);

		DasFamily dasFamily2 = (DasFamily) applicationContext.getBean("DasFamily");
		System.out.println(dasFamily2.numberOfMembers);

	}
}
