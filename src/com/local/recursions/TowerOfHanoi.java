package com.local.recursions;


/***
 * 
 * @author gaurav's
 *
 *<p> a popular backtrack and recursive example
 *    which helps in better understanding of recursions and backtracking.<p>
 */
public class TowerOfHanoi {

	public static void main(String[] args) {
		
		// 3 is total number of elements
		// A is the tower where all elements lies initially
		// B is the tower where all elements needs to be moved
		// C is the extra tower which helps in swapping the elements.
		towerOfHanoi(3, 'A', 'B', 'C');
		
	}

	
	
	public static void towerOfHanoi(int ele, char tower1, char tower2, char tower3){
		
		if(ele== 1) {
			System.out.println("move element "+ele+ " from " +tower1 +" --> "+tower2);
			return;
		}
		//this will help to move the n-1 element to helper tower --recursively
		towerOfHanoi(ele-1, tower1, tower3, tower2);
		System.out.println("move element "+ele+ " from " +tower1 +" --> "+tower2);
		
		// this will backtrack the n-1 element from aux tower to initial tower  --> backtrack
		towerOfHanoi(ele-1, tower3, tower2, tower1);
	}
}
