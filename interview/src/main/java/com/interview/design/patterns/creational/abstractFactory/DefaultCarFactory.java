package com.interview.design.patterns.creational.abstractFactory;

public class DefaultCarFactory {
	public Car getCar(CarType carType) {
		Car car=null;
		Location location=Location.DEFAULT;
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
		return  car=null;
	}
}
