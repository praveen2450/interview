package com.interview.design.patterns.creational.factory;

public class Rectangle implements Shape{

	public Rectangle() {
		draw();
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside rectangle");
	}

}
