package com.interview.array.dp;

public class JosephusProblem {
	static int josephus(int n,int k) {
		if(n==1) {
			return 1;
		}else {
			return (josephus(n-1,k)+k-1)%n+1;
		}
	}
	public static void main(String[] args) {
		int n=7;
		int k=3;
		int ans=josephus(n,k);
		System.out.println(ans);
	}
}
