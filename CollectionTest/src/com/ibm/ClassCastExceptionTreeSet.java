package com.ibm;

import java.util.TreeSet;

public class ClassCastExceptionTreeSet {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		TreeSet<Employee> ts = new TreeSet<>();
		ts.add(obj1);
		ts.add(obj2);
		  
		System.out.println("The program has been executed successfully.");  
	 }
  }