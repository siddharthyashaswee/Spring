package com.springtutorial.springdemo;

public class RandomCoach implements Coach {

	private RandomFortuneService randomFortuneService;
	
	public RandomFortuneService getRandomFortuneService() {
		return randomFortuneService;
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	//methods from the interface
	@Override
	public String getDailyWorkout() {
		return "do random workout";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

}
