package org.hugh.Algorithms;

public class LC_0771_JewelsAndStones {

	/**
	 * You're given strings J representing the types of stones that are jewels, and S representing
	 * the stones you have. Each character in S is a type of stone you have. You want to know how
	 * many of the stones you have are also jewels. The letters in J are guaranteed distinct, and
	 * all characters in J and S are letters. Letters are case sensitive, so "a" is considered a
	 * different type of stone from "A".
	 * 
	 * Example 1: Input: J = "aA", S = "aAAbbbb" Output: 3
	 * 
	 * Example 2: Input: J = "z", S = "ZZ" Output: 0
	 * 
	 * Note: S and J will consist of letters and have length at most 50. The characters in J are
	 * distinct.
	 */
	public static void main(String[] args) {
		System.out.println(jewelsAndStones("ngm", "kxg"));
		// System.out.println(submit1("aA", "aAAbbbb"));
	}

	/**
	 * Runtime: 1 ms, faster than 94.57% of Java online submissions for Jewels and Stones.
	 * Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Jewels and Stones.
	 */
	public static int jewelsAndStones(String J, String S) {

		int count = 0;
		char j[] = J.toCharArray();
		char s[] = S.toCharArray();
		for(char jc : j) {
			for(char js :s) {
				if(jc == js) {
					count++;
				}
			}
		}
		return count;
	}

}