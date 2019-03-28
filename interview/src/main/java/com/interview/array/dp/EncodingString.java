package com.interview.array.dp;

public class EncodingString {
	static void encode(char[] input) {
		 int i=1;
		 while(i<input.length) {
			 int count=1;
			 while(i<input.length&&input[i]==input[i-1]) {
				 count++;
                 if(count>2) {
				    input[i-1]=' ';	 
				 }
				 i++;	 
			 }
			 if(count>1) {
				 if(count>2) {
					 //shift
					 input[i-1]=' ';
				 }
				 int j=i-count+1;	 
				 input[j]=(char)(48+count);
			 }
			 
			 System.out.println(i-count+1+" i="+i+" "+input[i-1]+" "+count);
			 i++;
		 }
		
		 int j=0;
		 System.out.println(input);
		 for(i=0,j=0;i<input.length;i++,j++) {
			 if(input[i]!=' ') {
				 input[j]=input[i];
			 }else
				 j--;
		 }	 
		 for(i=j;i<input.length;i++) {
			 input[i]=' ';
			 
		 }
		
		 //deal with case 1
		 boolean prev=false;
		 int n=input.length-1;
		 System.out.println(input);
		 char c=input[0];
		 //code to add 1
		// if(i>0 && input[i]!=' '&& )
		 for(i=n,j=n;i>=0;i--,j--) {
			 
			 if(input[i]==' ') {
				 j++;
			 }else if(j>=0){
				 int val=input[i];
				 int nval=input[i+1];
				 if((val<48||val>57)&&(nval<48||nval>57)) {
					// System.out.println(val);
					 input[j]='1';
					 j--;
				 }
				 input[j]=input[i];
			 }
		 }
		 System.out.println();
		 System.out.println(input);
		 
		  
		 
	}
	
	public static void main(String[] args) {
		//StringBuffer input=new StringBuffer("aacccdddefj");
		String arr="aaaaabcdddde";
		char []input= {'a','a','c','c','c','d','d','d','e','f','j'};
		encode(arr.toCharArray());
	}
}
