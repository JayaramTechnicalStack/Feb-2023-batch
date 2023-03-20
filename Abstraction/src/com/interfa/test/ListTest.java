package com.interfa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Given two list-of-lists of numbers, write a method to add the values of each list from first list to values of list 
from another list into a list-of-lists.
Example:
list1 = [[1, 2], [-2, 4]];
list2 = [[4, -6], [9, -3]]; Then the expected list-of-lists would be:

list3 = [[5, -4], [7, 1]]; (or) list1 = [[4, 2, 5], [2, 7, 1]];

list2 = [[8, -7, 2], [-4, 1, 3]]; Then the expected list-of-lists would be:
list3 = [[12, -5, 7], [-2, 8, 4]];
*/

public class ListTest<T> {
	
	public static <T extends Number> List<List<T>> addLists(List<List<T>> list1 ,List<List<T>> list2){
		
		if(list1.size() != list2.size()) {
			throw new IllegalArgumentException("List Must have same size");
		}
		
		List<List<T>> result = new ArrayList<List<T>>();
		for(int i =0; i<list1.size() ; i++) {
			List<T> sublist1 = list1.get(i);
			List<T> sublist2 = list2.get(i);
			if(sublist1.size() != sublist2.size()) {
				throw new IllegalArgumentException("SubList Must have same size");
			}
			List<T> subResult = new ArrayList<T>();
			
			for(int j=0; j<sublist1.size();j++) {
				T value1 =sublist1.get(j);
				T value2 =sublist2.get(j);
				Number sum = value1.doubleValue() + value2.doubleValue();
				subResult.add((T) sum);
			}
			result.add(subResult);
		}
		return result ;
		
	}
	public static void main(String[] args) {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1,2), Arrays.asList(-2,4));
		List<List<Integer>> list2 = Arrays.asList(Arrays.asList(4,-6), Arrays.asList(9,-3));
		List<List<Integer>> list3 = addLists(list1, list2);
		System.out.println(list3);
	}
}
