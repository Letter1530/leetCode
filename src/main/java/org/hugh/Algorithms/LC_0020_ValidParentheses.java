package org.hugh.Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC_0020_ValidParentheses {
	/*
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * Example 1:
	 * Input: "()"
	 * Output: true
	 * 
	 * Example 2:
	 * Input: "()[]{}"
	 * Output: true
	 * 
	 * Example 3:
	 * Input: "(]"
	 * Output: false
	 * 
	 * Example 4:
	 * Input: "([)]"
	 * Output: false
	 * 
	 * Example 5:
	 * Input: "{[]}"
	 * Output: true
	 */
	
	public static void main(String[] args) {
		String str = "{[]}";
		System.out.println(isValid(str));
	}
	
	/*
	 * Runtime: 11 ms, faster than 5.13% of Java online submissions for Valid Parentheses.
	 * Memory Usage: 35.7 MB, less than 21.52% of Java online submissions
	 * for Valid Parentheses.
	 */
	public static boolean isValid(String s) {
		if(s.equals("")) {
			return true;
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("(", 1);
		map.put(")", -1);
		map.put("[", 2);
		map.put("]", -2);
		map.put("{", 3);
		map.put("}", -3);
		List<String> sList = new ArrayList<>();
		int index = 0;
		for (String str: s.split("")) {
			sList.add(str);
			if (map.get(sList.get(index)) < 0 && sList.size() > 1) {
				if (map.get(sList.get(index)) + map.get(sList.get(index - 1)) != 0) {
					return false;
				} else {
					sList.remove(index);
					sList.remove(index - 1);
					index-= 2;
				}
			}
			index++;
		}
		if (sList.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
