package com.interview.array.dp;

public class BurstBallon {
	public static int burstBallon(int[] arr,int[][] dp,int start,int n) {
		//System.out.println(start+" "+n);
		if(dp[start][n]>0) {
			return dp[start][n];
		}
		if(start>n) {
			return dp[start][n]=0;
		}
		 
		int coins=0;
		for(int i=start;i<=n;i++) {
			//System.out.println(start+" "+i+" "+n);
			int l=burstBallon(arr,dp,start,i-1);
			int r=burstBallon(arr,dp,i+1,n);
			int value=arr[start-1]*arr[n+1]*arr[i]+l+r;
			coins=Math.max(coins, value);
		}
		return dp[start][n]=coins;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,5,8};
		
		int[] new_arr=new int[arr.length+2];
		new_arr[0]=new_arr[new_arr.length-1]=1;
		for(int i=1;i<new_arr.length-1;i++) {
			new_arr[i]=arr[i-1];
		}
		
		int[][]dp=new int[new_arr.length][new_arr.length];
		for(int  i=0;i<new_arr.length;i++) {
			for(int j=0;j<new_arr.length;j++) {
				dp[i][j]=0;	
			}
			
			System.out.println(new_arr[i]);
		}
		int n=new_arr.length;
		int length=arr.length;
		int start=1;
		int val=burstBallon(new_arr,dp,start,n-2);
		System.out.println(val);
	}
}
