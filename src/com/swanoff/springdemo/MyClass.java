package com.swanoff.springdemo;

public class MyClass {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
