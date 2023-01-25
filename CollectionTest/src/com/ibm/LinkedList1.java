package com.ibm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Shubham");
		l1.add("Vansh");
		l1.add("Virat");
		l1.add("Sanket");
		System.out.println(l1);
         l1.add(1, "Mohan");
         System.out.println(l1);
         
         LinkedList<String> l2 = new LinkedList<>();
         l2.add("Ram");
         l2.add("Shyam");
         l1.addAll(l2);
         
         LinkedList<String> l3 = new LinkedList<>();
         l3.add("Nagin");
         l3.add("Jugnu");
         l1.addAll(l3);
         System.out.println(l1);
         l1.addFirst("Lokesh");
         System.out.println(l1);
         l1.addLast("Zungu");
	}
 }