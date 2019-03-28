package com.interview.design.patterns.creational.abstractFactory;

public class MiniCar implements Car{
	public MiniCar(Location location) {
		drive(location);
	}
	@Override
	public void drive(Location location) {
	
		System.out.println("Its a Mini Car:" + location);
	}
	
}
