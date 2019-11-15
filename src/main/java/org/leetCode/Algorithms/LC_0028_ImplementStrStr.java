package org.leetCode.Algorithms;

public class LC_0028_ImplementStrStr {
	/*
	 * Implement strStr().
	 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 * 
	 * Example 1:
	 * Input: haystack = "hello", needle = "ll"
	 * Output: 2
	 * 
	 * Example 2:
	 * Input: haystack = "aaaaa", needle = "bba"
	 * Output: -1
	 * 
	 * Clarification:
	 * What should we return when needle is an empty string?
	 * For the purpose of this problem,
	 * we will return 0 when needle is an empty string.
	 * This is consistent to C's strstr() and Java's .
	 * */
	
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
	}
	
	/*
	 * Runtime: ?? ms, faster than ??% of Java online submissions for Remove Duplicates from Sorted Array.
	 * Memory Usage: ?? MB, less than ??% of Java online submissions
	 * for Remove Duplicates from Sorted Array.
	 */
	public static int strStr(String haystack, String needle) {
		return -1;
	}
}
