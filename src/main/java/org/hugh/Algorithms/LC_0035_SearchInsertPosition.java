package org.hugh.Algorithms;

public class LC_0035_SearchInsertPosition {
	/*
	 * Given a sorted array and a target value, return the index if the target is found.
	 * If not, return the index where it would be if it were inserted in order.
	 * 
	 * Example 1:
	 * Input: [1,3,5,6], 5
	 * Output: 2
	 * 
	 * Example 2:
	 * Input: [1,3,5,6], 2
	 * Output: 1
	 * 
	 * Example 3:
	 * Input: [1,3,5,6], 7
	 * Output: 4
	 * 
	 * Example 4:
	 * Input: [1,3,5,6], 0
	 * Output: 0
	 * */
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}
	
	/*
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
	 * Memory Usage: 38.8 MB, less than 100.00% of Java online submissions
	 * for Search Insert Position.
	 */
	public static int searchInsert(int[] nums, int target) {
		if (nums.length == 0) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}

}
