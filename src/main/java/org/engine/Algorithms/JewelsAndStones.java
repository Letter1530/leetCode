package org.engine.Algorithms;

public class JewelsAndStones {

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
		System.out.println(submit2("ngm", "kxg"));
		// System.out.println(submit1("aA", "aAAbbbb"));
	}

	/**
	 * Runtime: 1 ms, faster than 94.51% of Java online submissions for Jewels and Stones. Memory
	 * Usage: 34.4 MB, less than 100.00% of Java online submissions for Jewels and Stones.
	 * 
	 * @param J
	 * @param S
	 * @return
	 * @Description
	 * @author Letter1530(Engine) 2019年10月30日
	 */
	public static int submit2(String J, String S) {

		int count = 0;
		char js[] = J.toCharArray();

		if (js.length >= 1) {

			int index = 0;

			for (char s : js) {
				while ((index = S.indexOf(s, index)) != -1) {
					index++;
					count++;
				}
			}
			return count;
		} else {
			return count;
		}
	}

	/**
	 * wrong answer
	 * 
	 * @param J
	 * @param S
	 * @return
	 * @Description
	 * @author Letter1530(Engine) 2019年10月30日
	 */
	public static int submit1(String J, String S) {

		int count = 0;
		char js[] = J.toCharArray();

		if (js.length >= 1) {

			int index = 0;

			for (char s : js) {
				while (S.indexOf(s, index) != -1) {
					index++;
					count++;
				}
			}
			return count;
		} else {
			return count;
		}
	}
}