package com.ibm;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println("initial list of elements: "+hm);
		hm.put(100, "Shubham");
		hm.put(101, "Vijay"); 
		hm.put(102, "Rahul");
		
		System.out.println("After Invoking put() method");
	           	
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.putIfAbsent(103, "Mohan");
		System.out.println("After invoking putIfabsent() method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<>();
		map.put(104, "Kalu");
		map.putAll(hm);
		System.out.println("After invoking putAll() method");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
 }