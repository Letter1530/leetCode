package org.hugh.Algorithms;

public class LC_0125_ValidPalindrome {
	/*
	 * Given a string, determine if it is a palindrome,
	 * considering only alphanumeric characters and ignoring cases.
	 * 
	 * Note:
	 * For the purpose of this problem, we define empty string as valid palindrome.
	 * 
	 * Example 1:
	 * Input: "A man, a plan, a canal: Panama"
	 * Output: true
	 * 
	 * Example 2:
	 * Input: "race a car"
	 * Output: false
	 * */
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	/*
	 * Runtime: 16 ms, faster than 26.64% of Java online submissions for Valid Palindrome.
	 * Memory Usage: 37.6 MB, less than 100.00% of Java online submissions
	 * for Valid Palindrome.
	 */
	
	public static boolean isPalindrome(String s) {
		char[] ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
		for (int i = 0; i < ss.length / 2; i++) {
			if (ss[i] != ss[ss.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
