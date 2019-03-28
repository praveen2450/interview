package com.interview.design.patterns.creational.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		shapeFactory.getShape("circle");
		shapeFactory.getShape("Rectangle");
	}
}
