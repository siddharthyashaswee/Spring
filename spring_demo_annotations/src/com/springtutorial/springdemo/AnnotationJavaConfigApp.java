package com.springtutorial.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple java app to show how config with pure java works
 * The config here SportConfig.java uses @Component scanning
 */
public class AnnotationJavaConfigApp {

	public static void main(String[] args) {
		
		System.out.println("Running AnnotationJavaConfigApp:");

		//no XML needed, just refer to SportConfig.java file, also not ClassPathXmlApplicationContext
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("thatSillyCoach",TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		SwimCoachProperties swimCoach = context.getBean("swimCoachProperties", SwimCoachProperties.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getInfo());
		
		context.close();
	}

}
