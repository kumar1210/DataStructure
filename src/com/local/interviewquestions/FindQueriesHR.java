/**
 * 
 */
package com.local.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gaurav's
 * 
 * <p> Question : There is a collection of input strings and a collection of query strings. 
 * 	   For each query string, determine how many times it occurs in the list of input strings.
 * 	   For example, given input strings= [ab, abc, ab] and queries =[ab, abc, bc] , we find 2 instances of ab, 1 of abc and 0 of bc. For each query, 
 * 	   we add an element to our return array, results [2, 1, 0].
 *
 */
public class FindQueriesHR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] strings = {"aba", "baba", "aba", "xzxb"};
		String [] queries = {"aba", "xzxb", "ab"};

		Map<String, Integer> queriesMap = new LinkedHashMap<String, Integer>();
		for (String key : queries) {
			queriesMap.put(key, 0);
		}
		
		int val=0;
		for (String key : strings) {
			if(queriesMap.containsKey(key)) {
				val = queriesMap.get(key)+1;
				queriesMap.put(key, val);
			}
		}
		System.out.println(queriesMap.toString());
		int [] arr = new int[queries.length];
		for(int i =0; i< queries.length; i++) {
			arr[i] = queriesMap.get(queries[i]).intValue();
		}
		System.out.println(Arrays.toString(arr));
	}

}
