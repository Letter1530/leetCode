package org.hugh.Algorithms;

import java.awt.color.ICC_Profile;

public class LC_0053_MaximumSubarray {
	/*
	 * Given an integer array nums, 
	 * find the contiguous subarray (containing at least one number) 
	 * which has the largest sum and return its sum.
	 * 
	 * Example:
	 * Input: [-2,1,-3,4,-1,2,1,-5,4],
	 * Output: 6
	 * Explanation: [4,-1,2,1] has the largest sum = 6.
	 * */
	
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(nums));
	}
	
	/*
	 * Runtime: 44 ms, faster than 6.87% of Java online submissions for MaximumSubarray.
	 * Memory Usage: 40.2 MB, less than 5.63% of Java online submissions
	 * for MaximumSubarray.
	 */
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int maxSum = nums[0];
		int start = 0;
		while (start < nums.length) {
			for (int i = start; i < nums.length; i++) {
				sum += nums[i];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			start++;
			sum = 0;
		}
		return maxSum;
	}
}
