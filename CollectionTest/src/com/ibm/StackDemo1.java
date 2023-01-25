package com.ibm;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		boolean empty = stk.isEmpty();
		System.out.println("Is the Stack empty:" +empty);
		
		stk.push(100);
		stk.push(200);
		stk.push(300);
		stk.push(400);
		stk.push(500);
		System.out.println("Element in Stack :"+stk);
		Integer peek = stk.peek();
		System.out.println("Element on peek :" +peek);
		int search = stk.search(300);
		System.out.println("Location of Searching Element :"+search);
		int size = stk.size();
		System.out.println("The Stack size is :"+size);
		
		boolean empty2 = stk.isEmpty();
		System.out.println("Is the Stack Empty :"+empty2);
	}
}
