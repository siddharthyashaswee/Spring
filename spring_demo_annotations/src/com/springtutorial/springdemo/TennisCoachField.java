package com.springtutorial.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * This example shows how to inject dependencies using fields
 * There isn't even a need to define the setter methods
 */
@Component
public class TennisCoachField implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	//no need to even define setter methods if using @Autowired
	//Qualifier used in a field
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley field.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
