package com.springtutorial.springdemo;

/**
 * Simple java class no @Component scan here
 */
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
