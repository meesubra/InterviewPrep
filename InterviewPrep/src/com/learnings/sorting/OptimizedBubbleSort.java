package com.learnings.sorting;

import java.util.Arrays;

public class OptimizedBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbersToSort = SortingUtils.getInputNumbers();
		
		int n = numbersToSort.length;
		boolean swapped = false;
		
		for(int i = 0; i < n-1; i++) {
			swapped = false;
			for(int j = i; j < n; j++) {
				if(numbersToSort[i] > numbersToSort[j]) {
					SortingUtils.swap(numbersToSort,i,j);
					swapped = true;
				}
			}
			if(swapped == false)
				break;
			System.out.println(Arrays.toString(numbersToSort));
		}
		System.out.println(Arrays.toString(numbersToSort));
	}

}
