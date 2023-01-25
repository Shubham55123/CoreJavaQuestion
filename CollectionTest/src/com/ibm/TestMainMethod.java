package com.ibm;

public class TestMainMethod {

//	final static synchronized strictfp public void main(String... shubham) {
//		System.out.println("Hello");
//	}
	
	//Overloading method is possible but jvm called String[] main method always....
//	public static void main(String[] args) {
//		System.out.println("String[]");
//	}
//	public static void main(int[] args) {
//		System.out.println("int[]");
//	}
	
	
	static 
	{
		System.out.println("Static block");
	}
	public static void main(String args[]) {
		System.out.println("Main Block");
	}
 }
