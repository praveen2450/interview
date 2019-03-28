package com.interview.design.patterns.creational.factory;

public class Circle implements Shape {
	public Circle() {
		draw();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside circle");
	}
}
