package com.springtutorial.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;
/**
 * Returns a random fortune from three fortunes
 */
@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = { "today is a sunny day", "today is a rainy day", "today is a cold day" };

	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}
