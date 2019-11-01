package org.hugh.leetcode.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {

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
		int[] i = { 10, 186, -49, 176, 118, 167, -61, 189, 6, -24, 7, -93, 71, 112, 187, 45, -36, 38, 82, 108, -46, 112,
				51, 165, -37, 159, 1, -53, 7, 38, 90, 181, -23, 91, -42, 172, -95, 130, 84, 149, -47, 68, 126, -67, 175,
				22, 121, 131, 84, 114, 60, 64, 182, -75, -17, -71, 69, -92, 103, -91, -91, 86, 126, 166, 33, -36, -80,
				-37, 118, -80, -18, 127, 36, -71, -82, -82, 144, 12, 57, 149, 71, 91, -83, -100, -30, 45, 186, 16, -51,
				-72, -83, 107, 140, -97, -93, 1, 12, 189, -61, -50, 180, 98, 96, -29, 193, 167, 57, -45, 16, 6, -76, 4,
				109, -23, 22, 144, 190, -97, 193, -51, -99, -79, -47, 142, 107, 175, 109, 121, 190, 90, 34, 32, 63, -24,
				41, -53, 41, 89, 130, -18, -99, 103, 86, 127, -30, 102, 32, -49, 181, -60, 114, 60, -29, 182, -75, 168,
				96, 51, 33, 142, 108, 69, 10, -57, 166, 48, 82, 161, -17, -50, 102, 63, -45, 140, 180, 176, -95, 36,
				-46, 168, 187, 161, -72, -100, -42, 165, -76, -67, 89, 159, 64, 34, 98, 4, -60, 172, -79, 68, 48, 131,
				-57 };
//		int[] i = { 2, 2, 1 };
		// int[] i = {4,1,2,1,2};
		System.out.println(singleNumber(i));
	}

	/**
	 * Runtime: 256 ms, faster than 5.02% of Java online submissions for Single Number.
	 * Memory Usage: 40.7 MB, less than 74.08% of Java online submissions for Single Number.
	 * for Single Number.
	 */
	public static int singleNumber(int[] nums) {
		List<Integer> smList = new ArrayList<>();
		for (int num : nums) {
			smList.add(num);
		}
		int nextBeginIndex = 0;
		boolean isSingle = false;
		while (!isSingle) {
			int count = 0;
			int checkNum = smList.get(nextBeginIndex);
			for (int i = (nextBeginIndex + 1); i < smList.size(); i++) {
				if (checkNum == smList.get(i)) {
					smList.remove(i);
					smList.add(nextBeginIndex + 1, checkNum);
					nextBeginIndex = nextBeginIndex + 2;
					count++;
					break;
				}
			}
			if (nextBeginIndex + 1 == smList.size() || count == 0) {
				isSingle = true;
			}
			if (isSingle) {
				return smList.get(nextBeginIndex);
			}
		}
		return smList.get(smList.size() - 1);
	}

	/**
	 * Runtime: 305 ms, faster than 5.02% of Java online submissions for Single
	 * Number. Memory Usage: 40.4 MB, less than 88.89% of Java online submissions
	 * for Single Number.
	 */
	public static int singleNumberTest(int[] nums) {
		List<Integer> smList = new ArrayList<>();
		for (int num : nums) {
			smList.add(num);
		}
		int checkNum = smList.get(0);
		boolean isSingle = true;
		while (smList.size() > 1) {
			for (int i = 1; i < smList.size(); i++) {
				if (checkNum == smList.get(i)) {
					smList.remove(i);
					i--;
					isSingle = false;
				}
			}
			if (!isSingle) {
				isSingle = true;
				smList.remove(0);
				checkNum = smList.get(0);
			} else {
				return smList.get(0);
			}
		}
		return smList.get(0);
	}

}