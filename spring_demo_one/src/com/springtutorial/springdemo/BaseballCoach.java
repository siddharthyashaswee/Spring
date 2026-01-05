package com.springtutorial.springdemo;


public class BaseballCoach implements Coach {

	private FortuneService fortuneService; //dependency for BaseballCoach
	
	// inject dependency via constructor injection, see applicationContext.xml
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}