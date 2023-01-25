package com.ibm;

import java.util.Arrays;

public class FillArray {

	public static void main(String[] args) {
		String [] arr = new String[5];
		Arrays.fill(arr, "Java");
		Arrays.fill(arr, "php");
		Arrays.fill(arr, ".net");
		Arrays.fill(arr, "c#");
		Arrays.fill(arr, "python");
		for (String values : arr) {
			System.out.println(values);
		}
	}
}
