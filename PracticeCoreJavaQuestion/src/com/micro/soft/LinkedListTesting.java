package com.micro.soft;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTesting {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ram");
		list.add("Mohan");
		list.add("Sohan");
		list.add("Rohan");
		list.add("Dohan");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
