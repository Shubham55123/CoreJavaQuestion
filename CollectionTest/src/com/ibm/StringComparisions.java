package com.ibm;

public class StringComparisions {

	public static void main(String[] args) {

      String s1 = "Java";
      String s2 = "Language";
      
      System.out.println(s1+s2); //JavaLanguage
      System.out.println(s1+10); //Java10
      System.out.println(s1+10+20+30); //Java102030
      System.out.println(10+20+30+s1);  //60Java
      System.out.println(10+s1+20);   //10Java20
      System.out.println(s1+20/10);  //Java2
     // System.out.println(s1+10-20); Error throw
      
      
	} 
 }
