package com.interfa.test;

public class PrimeTest {

	public  static int prime(int n) {
		boolean[] isPrime=new boolean[n];
		int count=0;
		for(int i=2;i*i<n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<n;j+=i) {
					isPrime[j]=false;
				}
			}
		}
		
		for(int k=2; k<n;k++) {
			if(isPrime[k]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=prime(10);
		System.out.println("result   " + result);
	}

}
