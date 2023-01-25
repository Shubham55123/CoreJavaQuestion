package com.ibm;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		 TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
           
         System.out.println("Head set : "+set.headSet("E"));
         
         System.out.println("SubSet: "+ set.subSet("B", "D"));
         
         System.out.println("TailSet :"+ set.tailSet("C"));
		}
   	}