package org.engine.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LC_0001_TwoSum {

	/*
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
	 * 2 + 7 = 9, return [0, 1].
	 */
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(nums, target));
	}

	/*
	 * Runtime: 21 ms, faster than 24.43% of Java online submissions for Two Sum.
	 * Memory Usage: 37.5 MB, less than 98.95% of Java online submissions for Two Sum.
	 */
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == target - nums[j]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("end of function");
	}

	/*
	 * Runtime: 2 ms, faster than 98.94% of Java online submissions for Two Sum.
	 * Memory Usage: 37.1 MB, less than 98.95% of Java online submissions for Two Sum.
	 */
	public static int[] theBestSolution(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i);
		}
		return result;
	}
}
