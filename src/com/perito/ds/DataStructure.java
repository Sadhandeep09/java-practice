package com.perito.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataStructure {

	public static void findPairs(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + "and " + arr[j]);
					return;
				}
			}
		}
		System.out.println("not found");
	}

	public static int findDuplicates(int[] arr) {

		/*
		 * List<Integer> l1 = new ArrayList<Integer>(); for (Integer integer : arr) { if
		 * (l1.contains(integer)) { System.out.println(integer); } else {
		 * l1.add(integer); } }
		 */

		// create a visited array of size n+1
        // we can also use map instead of visited array
        boolean visited[] = new boolean[arr.length + 1];
 
        // for each element of the array mark it as visited and
        // return the element if it is seen before
        for (int value : arr) {
            // if element is seen before
            if (visited[value]) {
                return value;
            }
 
            // mark element as visited
            visited[value] = true;
        }
 
        // no duplicate found
        return -1;
	}
	
	
	public static void printFibonacci(int count) {
		int i1 = 0;
		int i2 = 1;
		int i3;
		for (int i = 2; i < count; i++) {
			i3 = i1 + i2;
			System.out.println(i3);
			i1 = i2;
			i2 = i3;
		}
		
		
		
	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 9, 4, 7, 7, 4, 3 };
		// findPairs(arr, 10);
	//	findDuplicates(arr);
		printFibonacci(10);

	}

}
