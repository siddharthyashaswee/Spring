package com.springtutorial.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = { "today is a sunny day", "today is a rainy day", "today is a cold day" };

	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//return one of the three fortunes at random
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}
