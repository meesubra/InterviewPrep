package com.learnings.sorting;

import java.util.Scanner;
import java.util.stream.Stream;

public class SortingUtils {

	/**
	 * Given an array, swap the elements in the given indices.
	 * @param arrNumber
	 * @param fromIndex
	 * @param toIndex
	 */
	public static void swap(int[] arrNumber, int fromIndex, int toIndex) {
		int temp = arrNumber[fromIndex];
		arrNumber[fromIndex] = arrNumber[toIndex];
		arrNumber[toIndex] = temp;
	}
	/**
	 * 
	 */
	public static int[] getInputNumbers() {
		Scanner s=new Scanner(System.in);
		int[] numbersToSort = Stream.of(s.nextLine().split(",")).mapToInt(i -> Integer.parseInt(i)).toArray();
		s.close();
		return numbersToSort;
	}
	
}
