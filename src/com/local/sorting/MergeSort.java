/**
 * 
 */
package com.local.sorting;

import java.util.Arrays;

/**
 * <code> Implementation of merge sort </code>
 * 
 * @author gaurav's
 *
 */

public class MergeSort {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] input = {5, 23, 7, 39, 12, 41, 2, 1, 99};
		System.out.println("Array Values before sorting is : "+Arrays.toString(input));
		
		int [] sortedArray = mergeSort(input, 0, input.length-1);
		System.out.println("Array Values after sorting is : "+Arrays.toString(sortedArray));
		
	}

	
	public static int[] mergeSort(int [] input, int start, int last) {
		
		if (start < last) {
			int mid  = (last+start)/2;
			
			mergeSort(input, start, mid);
			mergeSort(input, mid+1, last);
			mergeArray(input, start, mid, last);
		}
		return input;
	}
	
	public static int[] mergeArray(int [] array, int start, int mid, int last) {
		
		int l_len=(mid-start)+1, r_len = (last-mid);
		int [] r_array = new int[r_len];
		int [] l_array = new int[l_len];
		int i=0, j=0;
		
		for(j=0; j<l_len; j++) {
			l_array[j] = array[start+j];
		}
		for(j=0; j<r_len; j++ ) {
			r_array[j] = array[mid+j+1];
		}
		
		System.out.print("start : "+ start +" mid : "+ mid + " last : "+last);
		System.out.print(" Left array : "+Arrays.toString(l_array) + " right array : "+Arrays.toString(r_array));
		i=0; j=0;
		int k = start;
		for (; i< l_len && j< r_len; k++) {
			if(l_array[i] <=r_array[j]) {
				array[k] = l_array[i];
				i++;
			} else {
				array[k] = r_array[j];
				j++;
			}
		}
		
		while(i<l_len) {
			array[k] = l_array[i];
			i++;
			k++;
		} 
		
		while(j<r_len){
			array[k] = r_array[j];
			j++;
			k++;
		}
		System.out.println( " Arrays after sorted : "+ Arrays.toString(array));
		return array;
	}
}
