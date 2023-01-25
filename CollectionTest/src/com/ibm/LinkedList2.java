package com.ibm;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		  ll.add("Ravi");  
          ll.add("Vijay");  
          ll.add("Ajay");  
          ll.add("Anuj");  
          ll.add("Gaurav");  
          ll.add("Harsh");  
          ll.add("Virat");  
          ll.add("Gaurav");  
          ll.add("Harsh");  
          ll.add("Amit");  
          System.out.println(ll);
          ll.remove("Vijay");
          System.out.println(ll);
          ll.remove(0);
          System.out.println(ll);
      	LinkedList<String> ll2 = new LinkedList<>();
      	 ll2.add("Ravi");  
         ll2.add("Hanumat"); 
         System.out.println(ll2);
         ll.addAll(ll2);
         System.out.println(ll);
         ll.removeAll(ll2);
         System.out.println(ll);
         ll.removeFirst();
         System.out.println(ll);
         ll.removeLast();
         System.out.println(ll);
         ll.removeFirstOccurrence("Anuj");
         System.out.println(ll);
         ll.removeLastOccurrence("Harsh");
         System.out.println(ll);
         ll.clear();
         System.out.println(ll );
	}
}
