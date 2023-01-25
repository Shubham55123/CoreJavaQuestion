package com.ibm;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		lhs.add(null);
		System.out.println(lhs);

        lhs.remove("Four");
        System.out.println(lhs);
	}
}
