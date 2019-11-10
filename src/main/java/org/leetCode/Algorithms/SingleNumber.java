package org.leetCode.Algorithms;

public class SingleNumber {

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
	 * @Description 用XOR應該是最佳解
	 * @author Letter1530(Engine) 2019年10月30日
	 */
	public static int submit1(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res ^= nums[i];
		}
		return res;
	}
}