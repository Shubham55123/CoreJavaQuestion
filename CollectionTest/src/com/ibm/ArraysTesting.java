package com.ibm;

import java.util.Arrays;

public class ArraysTesting {

	public static void main(String[] args) {
		int a[] = {10,39,5,23,10,34};
		int b = a.length;
		System.out.println(b);
		Arrays.sort(a);
		System.out.println("Largest Number :" + a[b-1]);
		
		}
 	}
 
