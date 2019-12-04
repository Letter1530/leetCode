package org.hugh.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LC_0121_BestTimeToBuyAndSellStock {
	/*
	 * Say you have an array for which the ith element is the price of a given stock on day i.
	 * If you were only permitted to complete at most one transaction
	 * (i.e., buy one and sell one share of the stock),
	 * design an algorithm to find the maximum profit.
	 * 
	 * Note that you cannot sell a stock before you buy one
	 * 
	 * Example 1:
	 * Input: [7,1,5,3,6,4]
	 * Output: 5
	 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
	 * Not 7-1 = 6, as selling price needs to be larger than buying price.
	 * 
	 * Example 2:
	 * Input: [7,6,4,3,1]
	 * Output: 0
	 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
	 * */
	
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	
	/*
	 * Runtime: 7 ms, faster than 17.19% of Java online submissions for Best Time to Buy and Sell Stock.
	 * Memory Usage: 37.2 MB, less than 100.00% of Java online submissions
	 * for Best Time to Buy and Sell Stock.
	 */
	public static int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		Map<String, Integer> map = new HashMap<>();
		map.put("max", prices[0]);
		map.put("min", prices[0]);
		map.put("thisProfit", 0);
		map.put("maxProfit", 0);
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < map.get("min") && prices[i] < prices[i - 1]) {
				map.put("thisProfit", map.get("max") - map.get("min"));
				if (map.get("thisProfit") > map.get("maxProfit")) {
					map.put("maxProfit", map.get("thisProfit"));
				}
				map.put("max", prices[i]);
				map.put("min", prices[i]);
			}
			if (prices[i] > map.get("max")) {
				map.put("max", prices[i]);
				map.put("thisProfit", map.get("max") - map.get("min"));
				if (map.get("thisProfit") > map.get("maxProfit")) {
					map.put("maxProfit", map.get("thisProfit"));
				}
			}
		}
		return map.get("maxProfit");
	}
}
