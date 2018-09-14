/**
 * 
 */
package com.local.interviewquestions;

/**
 * @author gaurav's
 *
 */
public class SquareMatrixTranspose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] array = {{0,1,0,1}, {1,0,1,1}, {1,0,0,1}, {0,1,1,0}};
		//int[][] array1 = {{0,1,0}, {1,0,1}, {1,0,0}, {0,1,1}};
		System.out.println("Before transpose : ");
		printArray(array);
		array = transpose2DArray(array);
		System.out.println("After Transpose : ");
		printArray(array);
	}
	
	
	public static int[][] transpose2DArray (int [][] array) {
		int temp;
		
		for(int row=0, col=0; row<array.length && col < array[0].length; row++, col++) {
			for(int i=0, j=0; i+row<array.length && j+col<array[0].length; i++, j++) {
				temp = array[row][i+row];
				array[row][i+row] = array[j+col][col];
				array[j+col][col] = temp;
			}
		}
		return array;
	}
	
	public static void printArray(int [][] array) {
		
		for(int row=0; row<array.length; row++){
			for(int col = 0; col<array[row].length; col++){
				System.out.print(array[row][col]+" ");
			}
			System.out.print("\n");
		}
	}

}
