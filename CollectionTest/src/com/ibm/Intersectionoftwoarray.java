package com.ibm;

public class Intersectionoftwoarray {

	public static void main(String[] args) {
		int[] firstArray = {1,4,5,6,7,8};
		int[] secondArray = {1,7,8};
		interSectionOfArrays(firstArray, secondArray);
	}
	public static void interSectionOfArrays(int[] firstArray ,int[] secondArray) {
		int i=0, j=0;
		int m = firstArray.length;
		int n = secondArray.length;
		
		while(i<m && i<n) {
			if(firstArray[i]<secondArray[j]) {
				i++;
			}else if(secondArray[j]<firstArray[i]) {
				j++;
			}else {
				System.out.println(secondArray[j++]+ " ");
				i++;
			}
			
		}
	}
 }
