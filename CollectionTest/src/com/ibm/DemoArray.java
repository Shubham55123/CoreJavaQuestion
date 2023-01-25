package com.ibm;

public class DemoArray {

	public static void main(String[] args) {
		int[] intArray = {10,30,20,40,50};
		extendArrayafterInitilization(intArray);
	}
	public static void extendArrayafterInitilization(int[] intArray) {
		int[] extended = new int[8];
		extended[5]=60;
		extended[6]=70;
		extended[7]=80;
		
		System.arraycopy(intArray, 0, extended, 0, intArray.length);
		for(int values : extended) {
			System.out.println(values+" ");
		}
	 }
  }
