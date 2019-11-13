package org.hugh.Algorithms;

public class LC_0014_LongestCommonPrefix {
	/*
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * 
	 * Example 1:
	 * Input: ["flower","flow","flight"]
	 * Output: "fl"
	 * 
	 * Example 2:
	 * Input: ["dog","racecar","car"]
	 * Output: ""
	 * Explanation: There is no common prefix among the input strings.
	 * */
	
	public static void main(String[] args) {
		String[] strs = {"aca","cba"};
		System.out.println(longestCommonPrefix(strs));
	}

	/*
	 * Runtime: 1 ms, faster than 74.44% of Java online submissions for Longest Common Prefix.
	 * Memory Usage: 36.4 MB, less than 100% of Java online submissions
	 * for Longest Common Prefix.
	 */
	public static String longestCommonPrefix(String[] strs) {
		String ans = "";
		if (strs.length > 0) {
			int index = 0;
			int length = strs[0].length();
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() < length) {
					length = strs[i].length();
					index = i;
				}
			}
			for (int i = 0; i < strs[index].length(); i++) {
				char prefix = strs[index].charAt(i);
				int count = 0;
				for (String thisStr : strs) {
					if (prefix == thisStr.toCharArray()[i]) {
						count++;
					}
				}
				if (count == strs.length) {
					ans += prefix;
				} else {
					break;
				}
			}
		}
		return ans;
	}
}
