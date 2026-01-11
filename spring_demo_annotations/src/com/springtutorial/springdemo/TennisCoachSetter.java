package com.springtutorial.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * This example shows how to autowire a dependency using a setter injection
 * Also shows how a random method can also be used to autowire dependencies
 */
@Component
public class TennisCoachSetter implements Coach {
	
	private FortuneService fortuneService; //define a dependency

	//only a default constructor, not really required
	//for debug purposes only
	public TennisCoachSetter() {
		System.out.println("TenisCoachSetter class inside the default constructor");
	}
	
	@Autowired //inject the dependency via @Autowired
	@Qualifier("happyFortuneService") //only required if many implementations of the interface available
	//setter for FortuneService, Qualifier used with a setter
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TenisCoachSetter inside the setter injection.");
		this.fortuneService = fortuneService;
	}
	
	@Autowired //inject the dependency via @Autowired
	@Qualifier("happyFortuneService") //only required if many implementations of the interface available
	//just a random method can also be used to autowire beans
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TenisCoachSetter inside the doSomeCrazyStuff() injection.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley. Setter";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() +" Setter";
	}
}
