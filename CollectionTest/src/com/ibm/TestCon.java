package com.ibm;

public class TestCon {

	TestCon(double d)
	{
		this(10);
		System.out.println("Double-arg Constructor");
		}
	TestCon(int d)
	{
		this();
		System.out.println("Int-Arg Constructor");
	}
	 TestCon() {
		 System.out.println("No-Arg Constructor");
	}
	 public static void main(String[] args) {
//		TestCon t1 = new TestCon(10.5);
		TestCon t2 = new TestCon(9);
//		TestCon t3 = new TestCon(10.5);
	}
}
