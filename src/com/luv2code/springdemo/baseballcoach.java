package com.luv2code.springdemo;

public class baseballcoach implements Coach  {
	
	//define a private field for the dependency 
	
	private FortuneService fortuneService;
	
	//define a constructor  for the dependency injection
	public baseballcoach (FortuneService theFortuneService) {
		fortuneService =theFortuneService ;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 min on practies";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService .getFortune();
	}

}
