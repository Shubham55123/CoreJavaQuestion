package com.ibm;

import java.util.Arrays;

public class SecondLargestInArrayExample2 {
     
	public static int getSecondLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total-2];
	}

		+							A		`	QQ		
	public static void main(String[] args) {
		int[] a = {10,5,24,60,16,32};
		System.out.println("second Largest : "+getSecondLargest(a, 6));
	}
}
