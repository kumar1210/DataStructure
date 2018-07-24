/**
 * 
 */
package com.local.interviewquestions;

/**
 * @author gaurav's
 *
 */
public class PossibleCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] array = {3,5,10};
		for(int i=0;i<1000 ; i++) {
			int recursive  = findCount(array, array.length, i);
			int iterative  = findCount(i);
			System.out.println("Running for "+i +" iterative value : "+iterative +" recursive : "+recursive);
			if( iterative!= recursive)
				System.out.println("Differed for "+i);
		}
	}

	
private static int findCount(int num){
		
		if(num==0)
			return 1;
		int i=0, count=0;
		while(i<5 && num>0){
			if(num%5==0) break;
			num -= 3;
		    i++;
		}
		if(num<0)
		  return 0;
		while(num>=0){
		    count += num/10 +1;
		    num -= 15;
		}
		return count;
	}
	
	private static int findCount(int a[], int len, int n ) {
		
		if (n == 0)
            return 1;
		if (n < 0)
            return 0;
		if (len <=0 && n >= 1)
            return 0;
		
		return findCount( a, len - 1, n ) +
				findCount( a, len, n-a[len-1] );
	}
}
