package com.interview.graph;

public class App {
	public static void main(String[] args) {
		int n=30;
		Graph graph=new Graph(30);
	    //position of knight initially
		int pos_x=1;
		int pos_y=1;
	    
		
		//position of target to reach
		int target_x=30;
		int target_y=30;
		
		int min=graph.minStepToTarget(graph,pos_x,pos_y,target_x,target_y);
		System.out.println("hello world");
		System.out.println(min);
	}
	 
//	System.out.println(min);
}
