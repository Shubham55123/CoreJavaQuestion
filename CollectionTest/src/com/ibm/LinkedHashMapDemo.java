package com.ibm;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap();
		lhm.put("100", "Shubham");
		lhm.put("102", "Sumit");
		lhm.put("103", "Mohit"); 
		//System.out.println(lhm);
		for(Map.Entry map :lhm.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}
