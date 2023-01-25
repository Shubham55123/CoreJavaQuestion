package com.ibm;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1001, "Shubham");
		lhm.put(1002, "Sumit");
		lhm.put(1003, "Vansh");
		lhm.put(1004, "Ranna");
		
		System.out.println(lhm);
		
		lhm.remove(1002);
		
		System.out.println(lhm);
	}
}
