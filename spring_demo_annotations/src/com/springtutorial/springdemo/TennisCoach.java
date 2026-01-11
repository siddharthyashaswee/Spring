package com.springtutorial.springdemo;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PostMapping;

@Component("thatSillyCoach") 
// this is the name of the bean for this class
// if no name given, inferred from class name as "tennisCoach"
public class TennisCoach implements Coach {
	
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
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("doing startup stuff");
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("doing clean up stuff");
//	}
}
