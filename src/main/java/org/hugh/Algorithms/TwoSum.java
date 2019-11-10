package org.hugh.Algorithms;

public class TwoSum {
	/*
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9,
	 * 
	 * return [0, 1].
	 */

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(nums, target));
	}

	/*
	 * Runtime: 23 ms, faster than 23.22% of Java online submissions for Two Sum.
	 * Memory Usage: 37.1 MB, less than 98.95% of Java online submissions for Two
	 * Sum.
	 */
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (j < nums.length) {
					if (nums[i] + nums[j] == target) {
						nums[0] = i;
						nums[1] = j;
						break;
					}
				}
			}
		}
		int[] ans = { nums[0], nums[1] };
		return ans;
	}

}
