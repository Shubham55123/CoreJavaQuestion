package com.ibm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HSTest {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("India");
		al.add("America");
		al.add("Japan");
		al.add("China");
		al.add("India");

		Collections.sort(al);
		for(String country:al)
			System.out.println(country);
	  }
   }