package com.springtutorial.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PostMapping;

/**
 * This class acts as both a singleton and a prototype bean 
 * based on which bean is created by the App.
 * The prototype scoped beans MUST implement the DisposableBean interface. 
 * This interface defines a "destroy()" method which can be overridden here. 
 * For prototype beans this should be used instead of the @PreDestroy annotation.
 */

@Component("thatSillyCoach") 
// this is the name of the bean for this class
// if no name given, inferred from class name as "tennisCoach"
//@Scope("singleton") //by default, no need to specify explicitly
@Scope("prototype")//gives different beans for each created
public class TennisCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	
	//NOTE::
	//As of Spring Framework 4.3, an @Autowired annotation on such a constructor 
	//is no longer necessary if the target bean only defines one constructor to begin with. 
	//However, if several constructors are available, 
	//at least one must be annotated to teach the container which one to use.	
	
	@Autowired 
	//if many implementations of FortuneService is present use Qualifier like shown here
	//Exmaple here shows a Qualifier used with a constructor
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
//	@Autowired 
//	//scan all components, check which one uses FortuneService
//	//then automatically inject this as a dependency
//	//if many implementations use Qualifier like shown above
//	//below will work if we comment above constructor and have only one constructor
//	//also we need to have only one implementation of the FortuneService
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct//called for both singleton and prototype beans
	//runs before bean creation to initialize things
	//no-arg, return allowed but cannot capture
	//method can have any access modifier (public, protected, private)
	public void doMyStartUpStuff() {
		System.out.println("doing startup stuff for "+ this.toString());
	}
	
	@PreDestroy//called for singleton but not prototype beans
	//runs after bean creation to destroy things
	//no-arg, return allowed but cannot capture
	//method can have any access modifier (public, protected, private)
	public void doMyCleanUpStuff() {
		System.out.println("doing clean up stuff for" + this.toString());
	}

	//if implemented, it will run with both singleton and prototype beans
	@Override
	public void destroy() throws Exception {
		System.out.println(">> TennisCoach: inside custom destroy() for "+ this.toString());
	}
}
