package com.ibm;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<>();
		vec.add("Lion");
		//vec.add("Lion");
		vec.add("Tiger");
		vec.add("Dog");
		vec.add("Elephant");

		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec);
		vec.addElement("Cat");
		vec.addElement("Rat");

		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec);
		
		
		if (vec.contains("Lion")) {
			System.out.println("Lion is Present at the index " +vec.indexOf("Lion"));
		}
		else
		{
			System.out.println("Tiger is not present in the list");
		}
		
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
	}
}
