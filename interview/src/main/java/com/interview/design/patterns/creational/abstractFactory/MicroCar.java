package com.interview.design.patterns.creational.abstractFactory;

public class MicroCar implements Car{

	public MicroCar(Location location) {
		drive(location);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive(Location location) {
		System.out.println("Its a Micro Car:"+location);
		// TODO Auto-generated method stub
		
	}
	
}
