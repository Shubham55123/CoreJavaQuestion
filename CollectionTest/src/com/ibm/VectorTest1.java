package com.ibm;

import java.util.Vector;

public class VectorTest1 {

	public static void main(String[] args) {
		Vector<Integer> vec  = new Vector<>();
		vec.add(100);
		vec.add(200);
		vec.add(300);
		vec.add(400);
		vec.add(500);
		vec.add(600);
		vec.add(700);
		System.out.println("Values in vector: " +vec);
		System.out.println("Remove first occourence of element 200: " + vec.remove((Integer)200));
		System.out.println("Values in vector: " +vec);
		System.out.println("Remove element at index 4 :"+ vec.remove(4));
		System.out.println("Value in Vector After Remove "+vec);
		vec.removeElementAt(4);
		System.out.println("Value in Vector After Remove "+vec);
		
		System.out.println("Hash Code Of this Vector :"+vec.hashCode());
		
		System.out.println("Element at index 1 is = "+vec.get(1));
	}
 }