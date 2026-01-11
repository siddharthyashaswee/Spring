package com.springtutorial.springdemo;

import org.springframework.stereotype.Component;

@Component //needs to be scanned, in order to be injected
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
