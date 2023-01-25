package com.ibm;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.push("BMW");  
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar"); 
		Iterator<String> iterator = stk.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
			
			
		}
	}
 }
