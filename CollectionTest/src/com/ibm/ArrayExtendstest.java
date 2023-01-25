package com.ibm;

public class ArrayExtendstest {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4};
		int[] extendArray = new int[7];
		
		extendArray[4]=5;
		extendArray[5]=6;
		extendArray[6]=7;
		
		System.arraycopy(intArray, 0, extendArray, 0, intArray.length);
		for(int value : extendArray) {
			System.out.print(value+ " ");
		}
		
		
//		int [] intArray = {10,20,30};
//		int [] extendArray = new int[5];
//		extendArray[3]=40;
//		extendArray[4]=50;
//		System.arraycopy(intArray, 0, extendArray, 0, intArray.length);
//		for( int value : extendArray) {
//			System.out.print(value+ " ");
//		}
	}
}
