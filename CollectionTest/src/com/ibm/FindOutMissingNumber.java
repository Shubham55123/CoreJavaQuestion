package com.ibm;

public class FindOutMissingNumber {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,7,8,9,10};
		findMissingNumber(arr);
	 }
	public static void findMissingNumber(int[] arr) {
		int n = 10;
		int arrElementSum=0;
		int totalNumberSum = n*(n+1)/2;
		for (int i = 0; i < arr.length; i++) {
			arrElementSum+=arr[i];
		}
		
		int missingNum = totalNumberSum-arrElementSum;
		System.out.println("Missing Number : = " +missingNum);
	}
 }
