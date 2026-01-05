package com.springtutorial.springdemo;

/*plain old main class of a Java Application, 
no spring here, just to test setup*/

public class MyApp {

	public static void main(String[] args) throws Exception {

		Coach myCoach = new TrackCoach();

		System.out.println(myCoach.getDailyWorkout());
	}

}

