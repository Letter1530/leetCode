package org.hugh.Algorithms;

public class LC_0058_LengthOfLastWord {
	/*
	 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
	 * return the length of last word in the string.
	 * If the last word does not exist, return 0.
	 * 
	 * Note: A word is defined as a character sequence consists of non-space characters only.
	 * 
	 * Example:
	 * Input: "Hello World"
	 * Output: 5
	 * */
	
	public static void main(String[] args) {
		String string = " ";
		System.out.println(lengthOfLastWord(string));
	}
	
	/*
	 * Runtime: 2 ms, faster than 12.32% of Java online submissions for Length of Last Word.
	 * Memory Usage: 36.2 MB, less than 100.00% of Java online submissions
	 * for Length of Last Word.
	 */
	public static int lengthOfLastWord(String s) {
		if (s.split(" ").length != 0) {
			return s.split(" ")[s.split(" ").length-1].length();
		}
		return 0;
	}
}
