/**
 * 
 */
package com.local.interviewquestions;

/**
 * @author gaurav's
 *
 */
public class SortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a = {5,6,1,2,3,4};
		
		System.out.println("Iteration result : "+ findMinIterateEach(a));
		System.out.println("Comparison result : "+ findMinCompare(a));

	}
	
	/***
	 * method which takes O(N) time
	 * @param array
	 * @return
	 */
	public static int findMinIterateEach(int []array) {
		
		int marker = array[0];
		for (int i=1; i<array.length; i++) {
			if(marker > array[i])
				marker =array[i];
		}
		return marker;
	}
	
	/***
	 * 
	 * comparing with previous and next element 
	 * also O(N) worst case but better than iteration case.
	 * @param array
	 * @return
	 */
	public static int findMinCompare(int [] array) {
		
		int marker = array[0] , size = array.length;
		
		if(size >=2) {
			if(marker <array [1] && marker < array[size-1]) {
				return marker ;
			} else if (array[size-1] <array[size-2] && array[size-1] <array[0]){
				return array[size-1];
			} 
			for(int i=1, j=2; j<size; i++, j++) {
				if(array[i-1]> array[i] && array[i]< array[j]) {
					marker= array[i];
					break;
				}
			}
		}
		return marker;
		
	}

}
