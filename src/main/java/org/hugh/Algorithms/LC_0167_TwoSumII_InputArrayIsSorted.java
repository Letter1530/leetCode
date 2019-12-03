package org.hugh.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LC_0167_TwoSumII_InputArrayIsSorted {
	/*
	 * Given an array of integers that is already sorted in ascending order,
	 * find two numbers such that they add up to a specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that they add up to the target,
	 * where index1 must be less than index2.
	 * 
	 * Note:
	 * Your returned answers (both index1 and index2) are not zero-based.
	 * You may assume that each input would have exactly one solution and you may not use the same element twice.
	 * 
	 * Example:
	 * Input: numbers = [2,7,11,15], target = 9
	 * Output: [1,2]
	 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
	 * */
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		System.out.println(twoSum(numbers, target));
	}
	
	/*
	 * Runtime: 2 ms, faster than 31.77% of Java online submissions for Two Sum II - Input array is sorted.
	 * Memory Usage: 37.8 MB, less than 100.00% of Java online submissions
	 * for Two Sum II - Input array is sorted.
	 */
	
	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] ans = new int[2];
		map.put(target - numbers[0], 1);
		for (int i = 1; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				ans[0] = map.get(numbers[i]);
				ans[1] = i + 1;
				return ans;
			} else {
				map.put(target - numbers[i], i + 1);
			}
		}
		return ans;
	}
}
