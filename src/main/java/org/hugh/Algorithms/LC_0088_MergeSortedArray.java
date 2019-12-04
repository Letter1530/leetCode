package org.hugh.Algorithms;

public class LC_0088_MergeSortedArray {
	/*
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	 * Note:
	 * The number of elements initialized in nums1 and nums2 are m and n respectively.
	 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
	 * 
	 * Example:
	 * Input:
	 * nums1 = [1,2,3,0,0,0], m = 3
	 * nums2 = [2,5,6],       n = 3
	 * 
	 * Output: [1,2,2,3,5,6]
	 * */
	
	public static void main(String[] args) {
		//E04 I GIVE UP
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		System.out.println(merge(nums1, m, nums2, n));
	}
	
	/*
	 * Runtime: ?? ms, faster than ??% of Java online submissions for Merge Sorted Array.
	 * Memory Usage: ?? MB, less than ??% of Java online submissions
	 * for Merge Sorted Array.
	 */
	
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				for (int j = i; j < m; j++) {
					if (m == nums1.length)
						break;
					if (nums2[i] < nums1[j]) {
						nums1[m] = nums1[j];
						nums1[j] = nums2[i];
						m++;
					}
					
				}
			}
			
		}
		for (int i : nums1)
			System.out.print(i + " ");
		return nums1;
	}
}
