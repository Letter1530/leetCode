package org.chou.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class LC_0136_SingleNumber {

	/**
	 * Given a non-empty array of integers, every element appears twice except for
	 * one. Find that single one.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 * 
	 * Example 1: Input: [2,2,1] Output: 1
	 * 
	 * Example 2: Input: [4,1,2,1,2] Output: 4
	 */
	public static void main(String[] args) {
//		int[] i = { 2, 2, 1 };
//		int[] i = { 4, 1, 2, 1, 2 };
		int[] i = { 1, 3, 1, -1, 3 };
		System.out.println(submit1(i));
	}

	public static int submit1(int[] nums) {
		List<Integer> name = new ArrayList();
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			name.add(nums[i]);
		}
		for (int i = name.size()-1; i > -1; i--) {
			res = name.get(i);
			System.out.println(res);
			System.out.println();
			name.remove(i);
			if (name.indexOf(res) == -1)
				return res;
			else
				name.add(res);
		}
		return res;
	}
}