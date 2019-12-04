package org.hugh.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LC_0070_ClimbingStairs {
	/*
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * Each time you can either climb 1 or 2 steps.
	 * In how many distinct ways can you climb to the top?
	 * 
	 * Note: Given n will be a positive integer.
	 * 
	 * Example 1:
	 * Input: 2
	 * Output: 2
	 * Explanation: There are two ways to climb to the top.
	 * 1. 1 step + 1 step
	 * 2. 2 steps
	 * 
	 * Example 2:
	 * Input: 3
	 * Output: 3
	 * Explanation: There are three ways to climb to the top.
	 * 1. 1 step + 1 step + 1 step
	 * 2. 1 step + 2 steps
	 * 3. 2 steps + 1 step
	 * */
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(climbStairs(n));
	}
	
	/*
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
	 * Memory Usage: 32.8 MB, less than 5.26% of Java online submissions
	 * for Climbing Stairs.
	 */
	
	public static int climbStairs(int n) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		for (int i = 3; i <= n; i++) {
			map.put(i, map.get(i-2) + map.get(i-1));
		}
		return map.get(n);
	}
}
