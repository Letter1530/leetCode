package org.hugh.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

	/*
	 * Given a 32-bit signed integer, reverse digits of an integer.
	 *
	 * Example 1: Input: 123 Output: 321
	 *
	 * Example 2: Input: -123 Output: -321
	 *
	 * Example 3: Input: 120 Output: 21
	 */

	public static void main(String[] args) {
		int num = 1534236469;
		System.out.println(reverseInt(num));
	}

	/*
	 * Runtime: 2 ms, faster than 24.10% of Java online submissions for Reverse
	 * Integer. Memory Usage: 34.3 MB, less than 5.55% of Java online submissions
	 * for Reverse Integer.
	 */
	public static int reverseInt(int x) {
		String string = "";
		int num = x;
		if (x < 0) {
			num = num * -1;
		}
		while (num > 0) {
			string = string + num % 10;
			num /= 10;
		}
		try {
			num = Integer.parseInt(string);
			if (x < 0) {
				num = num * -1;
			}
			return num;
		} catch (Exception e) {
			return 0;
		}
	}
}
