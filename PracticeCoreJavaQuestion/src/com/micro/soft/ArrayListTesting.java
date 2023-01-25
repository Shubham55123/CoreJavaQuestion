package com.micro.soft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTesting {

	public static void main(String args[]){  
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(876);
//		list.add(456);
//		list.add(247);
//		list.add(896);
//		list.add(3445);
//		System.out.println(list);
////		Iterator<Integer> itr = list.iterator();
////		while(itr.hasNext()) {
////			System.out.println(itr.next());
////		  }
//		// Second way for iteration of ArrayList
//		for(Integer interger:list) {
//			System.out.println(interger);
//		}
		
//		 ArrayList<String> al=new ArrayList<String>();  
//		  al.add("Mango");  
//		  al.add("Apple");  
//		  al.add("Banana");  
//		  al.add("Grapes");  
//		  	System.out.println("Returning Element : " + al.get(0));
//		  	al.set(1, "Dates");
//		  	for(String fruits : al) {
//		  		System.out.println(fruits);
//		  	}
		  //Creating a list of fruits  
		  ArrayList<String> list1=new ArrayList<String>();  
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes");  
		  //Sorting the list  
		  Collections.sort(list1);
		  for(String fruits :list1) {
			  System.out.println(fruits);
		  }
	   }  
    }
 		