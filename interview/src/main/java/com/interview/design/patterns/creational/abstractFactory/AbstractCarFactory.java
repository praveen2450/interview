package com.interview.design.patterns.creational.abstractFactory;

public class AbstractCarFactory {
	private AbstractCarFactory() {
		
	}
	public static Car getCar(CarType carType) {
		Location location=Location.DEFAULT;
		Car car=null;
		switch(location)
		{
		case INDIA:
			IndiaCarFactory indiaCarFactory=new IndiaCarFactory();
			car=indiaCarFactory.getCar(carType);
			break;
		case DEFAULT:
			DefaultCarFactory defaultCarFactory=new DefaultCarFactory();
			car=defaultCarFactory.getCar(carType);
			break;
		}
		return car;
	}
}
