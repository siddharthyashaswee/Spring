package com.springtutorial.springdemo;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		Coach theCoachSetter = context.getBean("tennisCoachSetter",Coach.class);
		System.out.println(theCoachSetter.getDailyWorkout());
		System.out.println(theCoachSetter.getDailyFortune());
		
		Coach theCoachField= context.getBean("tennisCoachField",Coach.class);
		System.out.println(theCoachField.getDailyWorkout());
		System.out.println(theCoachField.getDailyFortune());
				
		context.close();
	}

}
