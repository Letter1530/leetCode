package org.hugh.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class LC_0066_PlusOne {
	/*
	 * Given a non-empty array of digits representing a non-negative integer,
	 * plus one to the integer.
	 * The digits are stored such that the most significant digit is at the head of the list,
	 * and each element in the array contain a single digit.
	 * You may assume the integer does not contain any leading zero,
	 * except the number 0 itself.
	 * 
	 * Example 1:
	 * Input: [1,2,3]
	 * Output: [1,2,4]
	 * Explanation: The array represents the integer 123.
	 * 
	 * Example 2:
	 * Input: [4,3,2,1]
	 * Output: [4,3,2,2]
	 * Explanation: The array represents the integer 4321.
	 * */
	
	public static void main(String[] args) {
		int[] digits = {9, 9};
		System.out.println(plusOne(digits));
	}
	
	/*
	 * Runtime: 0 ms, faster than 100% of Java online submissions for Plus One.
	 * Memory Usage: 35.2 MB, less than 97.58% of Java online submissions
	 * for Plus One.
	 */
	public static int[] plusOne(int[] digits) {
		int[] newDigits = new int[digits.length + 1];
		for (int i = digits.length - 1; i >= 0; i--) {
			newDigits[i + 1] = digits[i];
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				newDigits[i + 1] = digits[i];
				return digits;
			} else {
				digits[i] = 0;
				newDigits[i + 1] = 0;
				if (i == 0) {
					newDigits[i] = 1;
					return newDigits;
				}
			}
		}
		return newDigits;
	}
	
	/*
	 * Runtime: 9 ms, faster than 9.85% of Java online submissions for Plus One.
	 * Memory Usage: 36.5 MB, less than 97.58% of Java online submissions
	 * for Plus One.
	 */
	public static int[] plusOne1(int[] digits) {
        List<Integer> dIntegers = new ArrayList<Integer>();
		for (int i : digits) {
			dIntegers.add(i);
		}
		for (int i = dIntegers.size() - 1; i >= 0; i--) {
			if (dIntegers.get(i) < 9) {
				dIntegers.set(i, dIntegers.get(i) + 1);
				break;
			} else {
				dIntegers.set(i, 0);
				if (i == 0) {
					dIntegers.add(i, 1);
				}
			}
		}
		int[] newDigits = new int[dIntegers.size()];
		for (int i = 0; i < dIntegers.size(); i++) {
			newDigits[i] = dIntegers.get(i);
			System.out.println(dIntegers.get(i));
		}
		return newDigits;
    }
}
