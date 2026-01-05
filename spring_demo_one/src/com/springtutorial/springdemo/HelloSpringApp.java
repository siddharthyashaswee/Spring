package com.springtutorial.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class shows construction and setter injection demo
 */


public class HelloSpringApp {

	public static void main(String[] args) {
		
		//create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//get a bean, already built with all dependencies by spring, see applicationContext.xml
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("theCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(coach.getDailyWorkout()); // this is object's own functionality
		System.out.println(coach.getDailyFortune()); // this dependency used constructor injection
		
		System.out.println(coach2.getDailyWorkout()); // this is object's own functionality
		System.out.println(coach2.getDailyFortune()); // this dependency used constructor injection
		
		CricketCoach coach3 = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach3.getDailyWorkout()); // this is object's own functionality
		System.out.println(coach3.getDailyFortune()); // this dependency used setter injection
		
		System.out.println(coach3.getTeam()); //this attribute is injected from the sport.properties file
		System.out.println(coach3.getEmailAddress()); //using only "Coach.class" will not access these attributes unique to CricketCoach

		Coach coach4 = context.getBean("randomCoach", Coach.class); 
		System.out.println(coach4.getDailyWorkout()); //just another bean with a random fortune service
		System.out.println(coach4.getDailyFortune());
		
		context.close();

	}

}
