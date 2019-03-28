package com.interview.misc;

import java.util.Deque;

import java.util.HashSet;
import java.util.LinkedList;

public class Test {
	     //help me
	         	   
	public static void main(String args[]) {
		int []nums= {2,3,1,1,4};
		//int []nums= {2,0};
		 int[] helper=new int[nums.length];
	        int n=nums.length;
	        helper[n-1]=1;
	        
	       
	        	for(int i=n-2;i>=0;i--) {
	        		int j=i;
	        		int k=0;
	        		int min=Integer.MAX_VALUE;
	        		while(j<=n-1 && k<=nums[i]) {
	        			System.out.println("j:"+j+" i:"+i+" k:"+k);
	        			System.out.println(helper[j]+" min:"+min);
	        			if(helper[j]<min ) {
	        				min=helper[j];
	        				//break;
	        				System.out.println("min:"+min);
	        			}
	        			j++;
	        			k++;
	        		}
	        		
	        		helper[i]=min+1; 
	        		System.out.println("i:"+i+" helper["+i+"]:"+helper[i]);
	        	}
	        
	        //
	        
	        System.out.println(helper[0]);
	    }
	
}
