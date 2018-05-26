/**
 * 
 */
package com.local.interviewquestions;

import java.util.Scanner;

import com.local.implementation.LinkListStack;

/**
 * @author gaurav's
 *
 */
public class BalancingBrackets {
	
	private static char MIDDLE_LB = '{';
	private static char LOWER_LB  = '(';
	private static char UPPER_LB  = '[';
	
	private static char MIDDLE_RB = '}';
	private static char LOWER_RB  = ')';
	private static char UPPER_RB  = ']';
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter your choice : \n 1. balance Braces \n");
		Scanner in = new Scanner(System.in);
		String choice = in.next();
		//if(choice.)
		
		System.out.println("Brackets are balanced or not : " + checkBrackets(choice.trim()));
		
		in.close();
		
	}

	private static boolean checkBrackets(String choice) {

		LinkListStack<Character> stack = new LinkListStack<>();
		boolean check = true;
		for(int i =0; i<choice.length();  i ++) {
			char value = choice.charAt(i);
			if(MIDDLE_LB ==value ||  LOWER_LB == value || UPPER_LB == value) {
				stack.push(value);
			} else if(!stack.isStackEmpty()) {
				char topElement = stack.pop();
				if(MIDDLE_RB == value ) {
					if(!(MIDDLE_LB == topElement)) {
						check = false;
						break;
					}
				} else if(LOWER_RB == value) {
					if(!(LOWER_LB == topElement)) {
						check = false;
						break;
					}
				} else if(UPPER_RB == value) {
					if(!(UPPER_LB == topElement)) {
						check = false;
						break;
					}
				}
			} else {
				check =false;
				break;
			}
				
		}
		return check;
	}

}
