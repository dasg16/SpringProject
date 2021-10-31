package com.das.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class BeanFactoryDepreciated {
	public static void main(String[] args) {
		System.out.println("I am here");

		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		DasFamily dasFamily = (DasFamily) beanFactory.getBean("DasFamily");
		dasFamily.printWelcome();

	}
}
