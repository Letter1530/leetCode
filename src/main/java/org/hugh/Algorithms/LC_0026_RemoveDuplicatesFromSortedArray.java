package org.hugh.Algorithms;

public class LC_0026_RemoveDuplicatesFromSortedArray {
	/*
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
	 */
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		System.out.println(removeDuplicates(nums));
	}
	
	/*
	 * Runtime: 1 ms, faster than 97.70% of Java online submissions for Remove Duplicates from Sorted Array.
	 * Memory Usage: 40.9 MB, less than 79.26% of Java online submissions
	 * for Remove Duplicates from Sorted Array.
	 */
	public static int removeDuplicates(int[] nums) {
		int length = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] < nums[i]) {
                nums[length] = nums[i];
                length++;
			}
		}
		return length;
	}
}
