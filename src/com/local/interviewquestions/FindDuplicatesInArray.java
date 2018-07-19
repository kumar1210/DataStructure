/**
 * 
 */
package com.local.interviewquestions;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class FindDuplicatesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1,6,3,1,3,6,6};
		printDuplicates(array, array.length);
	}

	
	public static void printDuplicates(int [] array, int num) {
		
		int index=0;
		for(int i =0; i<num; i++) {
			index = array[i]%num;
			array[index] =array[index]+num;
		}
		
		for (int i =0; i<num; i++) {
			//LocalPrinter.printer("Array Element : "+array[i] + " divide value : "+(array[i]/num) + " modulus : "+array[i]%num);
			if((array[i]/num)>0){
				LocalPrinter.printer("Duplicate Element is : "+ i);
			}
		}
		
	}
}
