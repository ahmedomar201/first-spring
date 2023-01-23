package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring configuration fill
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
	Coach theCoach = context.getBean("myCoach",Coach.class);
	
		// call method on the bean 
	System.out.println(theCoach.getDailyWorkout() );
	
	//let's call our methods for fortune 
	System.out.println(theCoach.getDailyWorkout() );
	System.out.println(theCoach.getDailyFortune() );
		
		//close context 
	context.close();

	}

}
