package com.interfa.test;

public class StringTestRev {

	
	public static void main(String[] args) {
		String str = "Hello World";
		String revStr = reverseString(str);
		System.out.println("reversed String is " + revStr);
	}

	public static String reverseString(String str) {
		if(str.length()<=1) {
			return str;
		} else {
			/*
			 * char firstChar = str.charAt(0); String rem = str.substring(1); String rev =
			 * reverseString(rem); return rev + firstChar;
		
			 */
			int lastSapce = str.lastIndexOf(' ');
			if(lastSapce == -1) {
				return str;
			}
			return reverseString(str.substring(0,lastSapce)) + " "+str.substring(lastSapce +1);
			
		}
	}
	
	//output : olleH dlroW 
	 // dlroW olleH
}
