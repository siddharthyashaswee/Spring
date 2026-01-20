package com.springtutorial.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("thatSillyCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same location: "+result);
		
		
		context.close();
	}
}
