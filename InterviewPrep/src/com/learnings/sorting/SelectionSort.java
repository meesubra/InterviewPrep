package com.learnings.sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int[] numbersToSort = Stream.of(s.nextLine().split(",")).mapToInt(i -> Integer.parseInt(i)).toArray();
		s.close();
		
		int n = numbersToSort.length;
		int minIndex = 0;
		for(int i = 0; i < n-1; i++) {
			minIndex = i;
			for(int j = i; j < n; j++) {
				if(numbersToSort[j] < numbersToSort[minIndex]) {
					minIndex = j;
				}
			}
			swap(numbersToSort,i,minIndex);
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
