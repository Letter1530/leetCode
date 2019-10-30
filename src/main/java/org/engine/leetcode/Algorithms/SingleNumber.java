package org.engine.leetcode.Algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


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
		int[] j = { 4, 1, 2, 1, 2 };
		System.out.println(submit1(i));
		System.out.println(submit1(j));
		System.out.println(submit2(i));
		System.out.println(submit2(j));
	}

	public static int submit1(int[] nums) {
		int res = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}

		for (int i = 0; i < map.size(); i++) {
			for (int j = 0; j < nums.length; j++) {
				if (map.get(nums[j]) == 1) {
					return nums[j];
				}
			}
		}

		return res;
	}

	public static int submit2(int[] nums) {
		List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}

		System.out.println("list=" + list.toString());

		return list.get(0);
	}
}
