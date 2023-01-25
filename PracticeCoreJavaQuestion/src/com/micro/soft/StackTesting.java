package com.micro.soft;

import java.util.Iterator;
import java.util.Stack;

public class StackTesting {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Java");
		stack.push("Python");
		stack.push("PHP");
		stack.push("C++");
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
