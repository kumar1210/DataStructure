/**
 * 
 */
package com.local.interviewquestions;

import com.local.implementation.LinkListStack;

/**
 * @author gaurav's
 *
 */
public class PrintStackPattern {
	
	public PrintStackPattern() {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] input  = {1, 2, 3, 4, 5, 6};
		int [] output = {3, 2, 5, 6, 4, 1};
		LinkListStack<Integer> stack = new LinkListStack<Integer>();
		int i=0;int j=0;
		while( (j < output.length) || (i < input.length)) {
			if(stack.isStackEmpty() || stack.top() != output[j]) {
				stack.push(input[i]);
				System.out.print("S");
				i++;
			} else if (stack.top() == output[j]) {
				System.out.print("X");
				j++; 
				stack.pop();
			}
		}
		try {
			stack.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
