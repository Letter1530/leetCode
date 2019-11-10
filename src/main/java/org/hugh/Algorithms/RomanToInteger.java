package org.hugh.Algorithms;

import java.util.HashMap;

public class RomanToInteger {
	/*
	 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
	 * and M.
	 * 
	 * Given a roman numeral, convert it to an integer. Input is guaranteed to be
	 * within the range from 1 to 3999.
	 * 
	 * Example 1:
	 * Input: "III" 
	 * Output: 3 
	 * 
	 * Example 2:
	 * Input: "IV" 
	 * Output: 4 
	 * 
	 * Example 3:
	 * Input: "IX" 
	 * Output: 9 
	 * 
	 * Example 4:
	 * Input: "LVIII" 
	 * Output: 58 
	 * Explanation: L = 50, V= 5, III = 3. 
	 * 
	 * Example 5:
	 * Input: "MCMXCIV" 
	 * Output: 1994 
	 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	 */
	
	public static void main(String[] args) {
		String num = "IX";
		System.out.println(romanToInt(num));
	}

	/*
	 * Runtime: 9 ms, faster than 12.62% of Java online submissions for Roman to Integer.
	 * Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Roman to Integer.
	 */
	public static int romanToInt(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", -2);
		map.put("IX", -2);
		map.put("XL", -20);
		map.put("XC", -20);
		map.put("CD", -200);
		map.put("CM", -200);
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.substring(i, i + 1))) {
				ans += map.get(s.substring(i, i + 1));
			}
			if (i <= s.length() - 2 && map.containsKey(s.substring(i, i + 2))) {
				ans += map.get(s.substring(i, i + 2));
			}
		}
		return ans;
	}
}
