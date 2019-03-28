package com.interview.design.patterns.creational.abstractFactory;

public class CarFactory {
	public Car getCar(CarType carType) {
		Location location=Location.INDIA;
		Car car=null;
		switch(carType)
		{
		case MICRO:
			car= new MicroCar(location);
			break;
		case MINI:
			car=new MiniCar(location);
			break;
		case LUXURY:
			car=new LuxuryCar(location);
			break;
		}
		return car;
	}
}	
