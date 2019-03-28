package com.interview.design.patterns.creational.abstractFactory;

public class LuxuryCar implements Car{
	LuxuryCar(Location location){
		drive(location);
	}
	@Override
	public void drive(Location location) {
		System.out.println("Its a Luxury Car:" + location);
		// TODO Auto-generated method stub
		
	}

}
