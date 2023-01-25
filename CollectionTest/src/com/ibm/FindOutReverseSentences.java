package com.ibm;

public class FindOutReverseSentences {

	public static void main(String[] args) {
		String strMsg = "Hello I am a Java Developer";
		strMsg = " "+strMsg;
		String word = "";
		int length = strMsg.length();
		for (int i = length-1; i>=0; i--) {
			char charAt = strMsg.charAt(i);
			if(charAt == ' ') {
				System.out.print(word + " ");
				word = " ";
			}else {
				word = charAt+word;
			}
		}
	}
}
