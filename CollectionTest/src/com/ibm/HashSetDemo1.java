package com.ibm;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		
		System.out.println(hs);
		
		hs.remove("Three");
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Six");
		hs1.add("Seven");
		hs.addAll(hs1);
		System.out.println("Update List :" + hs);
		hs.removeAll(hs1);
		System.out.println("Remove All :" + hs);
		}
		
	}

