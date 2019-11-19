package org.engine.Algorithms;

import java.util.Arrays;


public class LC_0136_SingleNumber {

	/**
	 * Given a non-empty array of integers, every element appears twice except for one. Find that
	 * single one.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without
	 * using extra memory?
	 * 
	 * Example 1: Input: [2,2,1] Output: 1
	 * 
	 * Example 2: Input: [4,1,2,1,2] Output: 4
	 */
	public static void main(String[] args) {
		int[] i = { 2, 2, 1 };
		// int[] i = {4,1,2,1,2};
		System.out.println(submit1(i));
	}

	/**
	 * 
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number. Memory
	 * Usage: 38.6 MB, less than 98.52% of Java online submissions for Single Number.
	 * 
	 * @param nums
	 * @return
	 * @Description
	 * @author Letter1530(Engine) 2019年10月30日
	 */
	public static int submit1(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res ^= nums[i];
		}
		return res;
	}

	/**
	 * Runtime: 35 ms, faster than 7.15% of Java online submissions for Single Number. Memory Usage:
	 * 38.3 MB, less than 98.52% of Java online submissions for Single Number.
	 * 
	 * @param nums
	 * @return
	 * @Description
	 * @author Letter1530(Engine) 2019年10月30日
	 */
	public static int submit2(int[] nums) {
		return Arrays.stream(nums).reduce(0, (x, y) -> x ^ y);
	}
}