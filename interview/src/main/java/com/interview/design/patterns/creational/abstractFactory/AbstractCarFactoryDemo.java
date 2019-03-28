package com.interview.design.patterns.creational.abstractFactory;

public class AbstractCarFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractCarFactory abstractCarFactory=new AbstractCarFactory();
		AbstractCarFactory.getCar(CarType.MICRO);
		AbstractCarFactory.getCar(CarType.MINI);
		AbstractCarFactory.getCar(CarType.LUXURY);
	}

}
