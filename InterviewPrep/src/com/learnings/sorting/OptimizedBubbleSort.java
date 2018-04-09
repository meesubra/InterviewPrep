package com.learnings.sorting;

import java.util.Arrays;

public class OptimizedBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbersToSort = SortingUtils.getInputNumbers();
		
		sort(numbersToSort);
	}
	
	public static void sort(int[] numbersToSort) {
		int n = numbersToSort.length;
		boolean isSwapped;
		
		for(int i = 0; i < n-1; i++) {
			isSwapped = false;
			for(int j = i; j < n; j++) {
				if(numbersToSort[i] > numbersToSort[j]) {
					SortingUtils.swap(numbersToSort,i,j);
					isSwapped = true;
				}
			}			
			if(isSwapped == false)
				break;
			System.out.println(Arrays.toString(numbersToSort));
		}
		System.out.println(Arrays.toString(numbersToSort));
	}
}
