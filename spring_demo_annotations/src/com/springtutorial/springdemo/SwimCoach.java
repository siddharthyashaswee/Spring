package com.springtutorial.springdemo;

/**
 * Java class only, no component Scan here
 */
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "do daily swimming.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
