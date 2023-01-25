 package com.ibm;

 public class FindAvgValue {

	public static void main(String[] args) {
		int arr[] = new int [] {10,20,30,40,50};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count +=arr[i];
	    	}
		int res=count/arr.length;
		System.out.println(res);
   	}
 }