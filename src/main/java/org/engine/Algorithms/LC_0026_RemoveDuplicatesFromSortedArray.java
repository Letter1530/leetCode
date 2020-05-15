package org.engine.Algorithms;

public class LC_0026_RemoveDuplicatesFromSortedArray {

	/**
	 * Given a sorted array nums, remove the duplicates in-place such that each
	 * element appear only once and return the new length. Do not allocate extra
	 * space for another array, you must do this by modifying the input array
	 * in-place with O(1) extra memory.
	 *
	 * Example 1:
	 * Given nums = [1,1,2],
	 * Your function should return length = 2,
	 * with the first two elements of nums being 1 and 2 respectively.
	 *
	 * Example 2:
	 * Given nums = [0,0,1,1,1,2,2,3,3,4],
	 * Your function should return length = 5,
	 * with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
	 *
	 * @Author BugDeveloper
	 * @Description
	 * @Date 上午 11:51 2020/5/15
	 * @Param [args]
	 * @return void
	 **/
	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		System.out.println(removeDuplicates(nums));
	}
	
	/*
	 * Runtime: 0 ms, faster than 100% of Java online submissions for Remove Duplicates from Sorted Array.
	 * Memory Usage: 41.1 MB, less than 27.13% of Java online submissions
	 * for Remove Duplicates from Sorted Array.
	 */
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
