package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file 
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are same 
		
		boolean result =(theCoach==alphaCoach);
		
		//print result
		
		System.out.println("\n pointing "+result);
		
		System.out.println("\n memory location theCoach  "+theCoach);
		
		System.out.println("\n memory location alphaCoach  "+alphaCoach);
		
		//close context 
		context.close();
		
		

	}

}
