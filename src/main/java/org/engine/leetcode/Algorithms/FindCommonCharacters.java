package org.engine.leetcode.Algorithms;

import java.util.List;

public class FindCommonCharacters {

	/**
	 * Given an array A of strings made only from lowercase letters, return a list
	 * of all characters that show up in all strings within the list (including
	 * duplicates). For example, if a character occurs 3 times in all strings but
	 * not 4 times, you need to include that character three times in the final
	 * answer. You may return the answer in any order.
	 * 
	 * Example1: 
	 * Input: ["bella","label","roller"] 
	 * Output: ["e","l","l"]
	 * 
	 * Example2:
	 * Input: ["cool","lock","cook"]
	 * Output: ["c","o"]
	 * 
	 * Note:
	 * 1 <= A.length <= 100
	 * 1 <= A[i].length <= 100
	 * A[i][j] is a lowercase letter
	 */
	public static void main(String[] args) {
		String[] aStrings = {"bella", "label", "roller"};
//		String[] aStrings = {"cool", "lock", "cook"};
		System.out.println(submit1(aStrings));
	}
	
	public static List<String> submit1(String[] A) {
		
		return null;
	}
}
