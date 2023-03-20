package com.interfa.test;

public class IntefaceTest implements A,B,C {

	public static void main(String[] args) throws RuntimeException {
	
		
		IntefaceTest test = new IntefaceTest();
		test.m1();
		test.display();
		test.show();
	}

	@Override
	public void m1() {
		System.out.println("I from m1()..");
		
	}

	@Override
	public void show() {

System.out.println("inside show().");
		
	}

	@Override
	public void display() {
		System.out.println("inside display()..");
		
	}

}
