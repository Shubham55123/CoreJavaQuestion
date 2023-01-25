package com.ibm;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Shubham", 23);
		Student s2 = new Student(102, "Aditya", 24);
		Student s3 = new Student(103, "Rahul", 26);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
		    Student st=(Student)iterator.next(); 
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
   }
 }