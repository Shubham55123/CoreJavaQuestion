package com.ibm;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(1, "Mango");
		
		System.out.println("Iterating HashMap.....");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	 }
  }