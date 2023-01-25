package com.ibm;

public class DemoArray1 {

	public static void main(String[] args) {
		int[] intArray = {10,30,20,45,67};
		findLargestAndSmallestInArray(intArray);
	}
	public static void findLargestAndSmallestInArray(int[] intArray) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int values : intArray) {
			 
			if(values>largest) {
				largest=values;
			}
			if(values<smallest) {
				smallest=values;
			}
		}
		System.out.println("Largest Number :=>>" + largest);
		System.out.println("Smallest Number :=>>" + smallest);
	}
}
