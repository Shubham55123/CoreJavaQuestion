package com.micro.soft;

public class TestUlternateCharacter {
		
		 static void convertOpposite(StringBuffer str) {
			//int in = str.length();
			
			for (int i = 0; i < str.length(); i++) {
				Character c = str.charAt(i);
				if(Character.isLowerCase(c))
					str.replace(i, i+1, Character.toUpperCase(c) + "");
				else 
					str.replace(i, i+1, Character.toLowerCase(c) + "");
			}
		 }
		 public static void main(String[] args) {
		StringBuffer str = new StringBuffer("SgKDjfheKHJGjhkHG");
		convertOpposite(str);
		System.out.println(str);
	}
 }