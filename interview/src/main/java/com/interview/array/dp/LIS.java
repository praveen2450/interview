package com.interview.array.dp;

public class LIS {

	public static int lis(int[] A,int start,int end,int prev) {
		
		if(start==end) {
			return 0;
		}
		int excl=lis(A,start+1,end,prev);
		int incl=0;
		if(A[start]>prev) {
			incl=1+lis(A,start+1,end,A[start]);
		}
		System.out.println(start+" "+end+" "+prev+" "+Math.max(incl, excl));
		return Math.max(incl, excl);
	}
	public static int longestIncreasingSequence(int[]arr,int[]dp,int start,int end,int prev) {
		if(start==0) {
			return dp[start]=1;
		}
		if(dp[start]!=-1) {
			return dp[start];
		}
	    int maxSeq=1;
	    for(int i=start-1;i>-1;i--) {
	    	if(arr[i]<arr[start])
	    	maxSeq=Math.max(maxSeq,1+longestIncreasingSequence(arr,dp,i,end,prev));
	    }
		return maxSeq;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		int[] dp=new int[A.length+2];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		int val=lis(A,0,A.length,Integer.MIN_VALUE);
		int new_val=longestIncreasingSequence(A,dp,0,A.length,Integer.MIN_VALUE);
		System.out.println(new_val);
	}

}
