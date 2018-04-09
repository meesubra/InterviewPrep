package com.learnings.sorting;

import java.util.Arrays;
/**
 * Recursion Idea.

    Base Case: If array size is 1, return.
    Do One Pass of normal Bubble Sort. This pass fixes last element of current subarray.
    Recur for all elements except last of current subarray.

 * @author msubrama
 *
 */
public class RecursiveBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbersToSort = SortingUtils.generateRandomIntegers();
		
		sort(numbersToSort);
	}
	
	public static void sort(int[] numbersToSort) {
		
		RecurBubbleSort(numbersToSort,numbersToSort.length);
		System.out.println(Arrays.toString(numbersToSort));
	}
	
	public static void RecurBubbleSort(int[] numbersToSort, int length) {
		
		if(length == 1)
			return;
		
		for(int i = 0; i < length - 1; i++) {
			if(numbersToSort[i] > numbersToSort[i+1]) {
				SortingUtils.swap(numbersToSort, i, i+1);
			}
		}
		System.out.println(Arrays.toString(numbersToSort));
		RecurBubbleSort(numbersToSort,length-1);
	}


}
