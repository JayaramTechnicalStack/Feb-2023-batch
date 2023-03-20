package com.interfa.test;

import java.util.HashMap;
import java.util.Map;

public class IntegerTest {
public static int [] twoSum(int[] nums, int target) {
	Map<Integer,Integer> m=new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		int c=target-nums[i];
		if(m.containsKey(c)) {
			return new int[] {
					m.get(c),i};
			}
		m.put(nums[i], i);
		}
	return nums;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,5,6};
		int target=7;
		int result[]=twoSum(num,target);
		System.out.println("result :::" + result);

	}

}
