package com.micro.soft;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBookExample {

	public static void main(String[] args) {
		List<Book> list = new LinkedList<Book>();
		Book b1 = new Book(101, "Data Structure", "Yashwant Kentahn", "NCP", 3);
		Book b2 = new Book(102, "Clean Code", "Movender Dwjhegj", "MCP", 6);
		Book b3 = new Book(103, "Reasoning", "Gtubhlin Kuntahn", "GTP", 8);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b :list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
