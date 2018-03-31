package com.local.recursions;

public class PossibleBinaries {

	static char []str ={'0', '0', '0', '0'};
	
	public static void main(String[] args) {
		
		//System.out.println(str);
		printBinary(str.length);
		
	}

	
	public static void printBinary(int n) {
		
		if(n==0) {
			System.out.println(str);
			return;
		}
		str[n-1] = '0';
		printBinary(n-1);
		str[n-1] ='1';
		printBinary(n-1);
	}
	
}
