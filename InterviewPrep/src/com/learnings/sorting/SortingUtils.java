package com.learnings.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
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
	
	public static int[] generateRandomIntegers() {
		
		int[] numbersToSort = new Random().ints(10,1000).limit(10).toArray();
		System.out.println("Input Array of ints :" + Arrays.toString(numbersToSort));
		return numbersToSort;
		
	}
	
}
