package com.springtutorial.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple java app to show how config with pure java works
 * The config here SportConfigNoComponentScan.java does NOT use @Component scanning
 * SwimCoach.java is the used bean with SadFortuneService as dependency, see config
 */
public class AnnotationJavaConfigNoComponentScanApp {

	public static void main(String[] args) {
		
		System.out.println("Running AnnotationJavaConfigNoComponentScanApp:");

		//no XML needed, just refer to SportConfig.java file, also not ClassPathXmlApplicationContext
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigNoComponentScan.class);
		
		//Access with bead id created in the config class (method name)
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
