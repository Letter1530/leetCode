package org.hugh.Algorithms;

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
		System.out.println(strStr1(haystack, needle));
	}
	
	/*
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
	 * Memory Usage: 37.9 MB, less than 67.17% of Java online submissions
	 * for Remove Duplicates from Sorted Array.
	 */
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	
	/*
	 * Runtime: 2 ms, faster than 53.60% of Java online submissions for Remove Duplicates from Sorted Array.
	 * Memory Usage: 37.9 MB, less than 70.23% of Java online submissions
	 * for Remove Duplicates from Sorted Array.
	 */
	public static int strStr1(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		for (int i = 0; i < haystack.length(); i++) {
			if (i + needle.length() <= haystack.length()) {
				if (haystack.substring(i, i + needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}
}
