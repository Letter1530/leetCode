package org.hugh.Algorithms;

public class LC_0009_PalindromeNumber {
	/*
	 * Determine whether an integer is a palindrome. An integer is a palindrome when
	 * it reads the same backward as forward.
	 *
	 * Example 1: Input: 121 Output: true
	 *
	 * Example 2: Input: -121 Output: false Explanation: From left to right, it
	 * reads -121. From right to left, it becomes 121-. Therefore it is not a
	 * palindrome.
	 * 
	 * Example 3: Input: 10 Output: false Explanation: Reads 01 from right to left.
	 * Therefore it is not a palindrome.
	 **/

	public static void main(String[] args) {
		int target = 11;
		System.out.println(isPalindrome(target));
	}

	/*
	 * Runtime: 7 ms, faster than 68.59% of Java online submissions for Palindrome
	 * Number. Memory Usage: 35.6 MB, less than 6.14% of Java online submissions for
	 * Palindrome Number.
	 */
	public static boolean isPalindrome(int x) {
		int checkNum = 0;
		int oriNum = x;
		while (x > 0) {
			checkNum = checkNum * 10 + x % 10;
			x /= 10;
		}
		if (checkNum == oriNum) {
			return true;
		} else {
			return false;
		}
	}

}
