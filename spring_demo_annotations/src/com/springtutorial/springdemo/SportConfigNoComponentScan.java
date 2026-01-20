package com.springtutorial.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Setup with pure java config for spring beans(default singleton)
 * Analogous to applicationContext.xml
 * In this case  NO @Component scan is used
 * Each bean is defined individually, simple java classes are wrapped into beans.
 */

@Configuration //marker t   hat this is a configuration file
public class SportConfigNoComponentScan {

	@Bean //can also inject bean dependencies like this
	//id of bean dependency is the name of the method
	public FortuneService sadFortuneService() {
		FortuneService sadFortuneService  = new SadFortuneService(); //create a new instance
		return sadFortuneService; //return the instance as a bean 
	}
	
	@Bean // defines a bean with method name "swimCoach" as the bean id
	public Coach swimCoach(){
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());//create a new instance of SwimCoach, 
		//FortuneService dependency injected from above method sadFortuneService()
		return mySwimCoach; //return the instance as a bean with id swimCoach
	}
}

/**
 * You can use @Bean to make an existing third-party class available to your Spring framework application context.
 * For example a Java class can be made into a bean in a spring app, without actually modifying it (adding @Component).
 * We can now share/reuse this bean in other areas of our Spring app by using dependency injection and @Autowired.
 * No need for each service to create a new instance every time. 
 */