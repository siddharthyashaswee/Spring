package com.springtutorial.springdemo;

import org.springframework.beans.factory.DisposableBean;

/**
 * This class acts as both a singleton and a prototype bean 
 * based on which bean is created by the App.
 * The prototype scoped beans MUST implement the DisposableBean interface. 
 * This interface defines a "destroy()" method which can be overridden here. 
 */
public class TrackCoach implements Coach, DisposableBean  {

	private FortuneService fortuneService; // dependency
	
	public TrackCoach() { // constructor with no dependency, used in plain java App
	}
	
	// inject dependency via constructor injection, see applicationContext.xml
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ fortuneService.getFortune();
	}
	
	//init method for bean, must be no arg
	//method can have any access modifier (public, protected, private)
	public void doMyStartUpStuff() {
		System.out.println("init-method : Memory location for coach: "+ this.toString());
		System.out.println("initializing bean");
	}
	
	//destroy method for bean, must be no arg
	//method can have any access modifier (public, protected, private)
	public void doMyCleanUpStuff() {
		System.out.println("destroy-method : Memory location for coach: "+ this.toString());
		System.out.println("destroying bean with doMyCleanUpStuff");
	}

	//if implemented, it will run with both singleton and prototype beans
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy from DisposableBean interface : Memory location for coach: "+ this.toString());
		System.out.println("destroying bean with destroy from DisposableBean interface");
	}

}
