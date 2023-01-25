package com.ibm;

public class Studentt {

	String name;
	int rollNo;
	String className;
	
	 Studentt(String name,int rollNo,String className) {
		 this.name=name;
		 this.rollNo=rollNo;
		 this.className=className;
	}
	 public void printData() {
		 System.out.println("Name      = "+name);
		 System.out.println("RollNo    = "+rollNo);
		 System.out.println("ClassName = "+className);
	 }
	 public static void main(String[] args) {
		Studentt st = new Studentt("Shubham", 1011, "B.tech");
		st.printData();
	}
	
}
