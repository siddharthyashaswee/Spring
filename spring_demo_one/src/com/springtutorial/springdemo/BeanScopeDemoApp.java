package com.springtutorial.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * In this example, bean scopes singleton and prototype are discussed
 * Also init and destroy methods for a bean are discussed
 * 
 * By default each bean is singleton - only one instance, same reference will be returned
 * 
 * 4 more scopes :  prototype - new instance for each container request, destroy method not called
 * 					request - scoped to a HTTP web request - only used in web apps
 * 					session - scoped to a HTTP web session - only used in web apps
 * 					global-session - scoped to a global HTTP web session - only used in web apps
 * 
 * Look at the order of the print statements in order to carefully observe the order of execution of various methods.
 */

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve singleton bean from spring container
		TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
		TrackCoach alphaCoach = context.getBean("myCoach", TrackCoach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same location: "+result);
		
		System.out.println("Memory location for theCoach: "+ theCoach.toString());
		System.out.println("Memory location for alphaCoach: "+ alphaCoach.toString());
		
		// retrieve prototype bean from spring container
		Coach prototypeCoach = context.getBean("myPrototypeCoach", Coach.class);
		System.out.println("Memory location for prototypeCoach: "+ prototypeCoach.toString());
		System.out.println(prototypeCoach.getDailyWorkout());
		
		context.close();

	}

}
