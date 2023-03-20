package com.interfa.test;

public class StringSample {

	
	
	
	public static int Testing(String s1,String s2) {
		int n=s1.length();
		int m=s2.length();
		int count= m/n;
		StringBuilder s=new StringBuilder();
		for(int i=0;i<count;i++) {
			s.append(s1);
			
		}
		if(s.toString().contains(s2)) {
			return count;
		}
		s.append(s1);
		if(s.toString().contains(s2)) {
			return count+1;
		}
		return -1;
	}
	public static void main(String args[]) {
		int result=Testing("a","aa");
		System.out.println("Result is ::::"+ result);
	}
	

}
