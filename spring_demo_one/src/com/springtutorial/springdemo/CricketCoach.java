package com.springtutorial.springdemo;

/**
 * This class shows setter injection in a bean
 */

public class CricketCoach implements Coach {

	private FortuneService fortuneService; //dependency
	
	private String emailAddress; //attributes set from applicationContext through sport.properties file
	private String team;
	
	//no-arg constructor is overridden only for debug purposes
	public CricketCoach() {
		System.out.println("inside cricketCoach no-arg constructor.");
	}

	// setter injection, see applicationContext.xml
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("inside setter method setFortuneService.");
		this.fortuneService = thefortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	//setter injection from the sport.properties file
	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter method setEmailAddress.");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//overridden methods from the interface Coach
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just do Cricket: " + fortuneService.getFortune();
	}

}
