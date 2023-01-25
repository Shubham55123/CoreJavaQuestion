package com.micro.soft;

import java.util.Iterator;
import java.util.Vector;

public class VectorTesting {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Shubham");
		v.add("Mohan");
		v.add("Shyam");
		v.add("Jonu");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	 }
  }
