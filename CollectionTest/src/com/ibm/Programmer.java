package com.ibm;

public class Programmer extends Employe {

	int bouns = 10000;
	
	public static void main(String[] args) {
		Programmer pro = new Programmer();
		System.out.println("Programmer salary is:"+ pro.bouns);
		System.out.println("Bouns is Programmer is :"+pro.salary);
	}
	
}
