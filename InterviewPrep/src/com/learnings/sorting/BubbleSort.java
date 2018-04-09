package com.learnings.sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
/**
 * Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based 
 * algorithm in which each pair of adjacent elements is compared and the elements are swapped 
 * if they are not in order. This algorithm is not suitable for large data sets as its average 
 * and worst case complexity are of O(n2) where n is the number of items.
 * @author msubrama
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] numbersToSort = Stream.of(s.nextLine().split(",")).mapToInt(i -> Integer.parseInt(i)).toArray();
		s.close();
		
		int n = numbersToSort.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = i; j < n; j++) {
				if(numbersToSort[i] > numbersToSort[j]) {
					swap(numbersToSort,i,j);
				}
			}
			System.out.println(Arrays.toString(numbersToSort));
		}
		System.out.println(Arrays.toString(numbersToSort));
	}

	public static void swap(int[] arrNumber, int fromIndex, int toIndex) {
		int temp = arrNumber[fromIndex];
		arrNumber[fromIndex] = arrNumber[toIndex];
		arrNumber[toIndex] = temp;
	}

}
