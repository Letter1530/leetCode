package org.sunglin.leetcode.Algorithms;

import java.util.LinkedList;
import java.util.List;


public class FindCommonCharacters {

	/**
	 * Given an array A of strings made only from lowercase letters, return a list of all characters
	 * that show up in all strings within the list (including duplicates). For example, if a
	 * character occurs 3 times in all strings but not 4 times, you need to include that character
	 * three times in the final answer. You may return the answer in any order.
	 * 
	 * Example1: Input: ["bella","label","roller"] Output: ["e","l","l"]
	 * 
	 * Example2: Input: ["cool","lock","cook"] Output: ["c","o"]
	 * 
	 * Note: 1 <= A.length <= 100 1 <= A[i].length <= 100 A[i][j] is a lowercase letter
	 */
	public static void main(String[] args) {
		String aaa = "asasda";
		System.out.println(aaa.substring(0, 1));
		// String[] aStrings = { "bella", "label", "roller" };
		// String[] bStrings = { "cool", "lock", "cook" };
		// String[] cStrings = { "bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc",
		// "ccbdbcba", "cbddaccc",
		// "accdcdbb" };
		// String[] cStrings = { "bbddabab", "cbcddbdd", "bbcadcab" };
		// String[] cStrings = { "bbddabab", "cbcddbdd", };
		String[] dStrings = { "dbaabcba", "cabcdbab", "cdbcbdad", "abadbacc", "bdddddaa", "daddabab", "baaaddaa",
				"dccdaabd" };
		// System.out.println(submit1(aStrings));
		// System.out.println(submit1(bStrings));
		// System.out.println(submit1(cStrings));
		System.out.println(submit1(dStrings));
	}

	public static List<String> submit1(String[] A) {

		List<String> output = new LinkedList<String>();

		char[] a = A[0].toCharArray();

		int check = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < A.length; j++) {
				if (A[j].indexOf(a[i]) == -1) {
					check = 1;
					break;
				} else {
					if (A[j].indexOf(a[i]) == 1) {
						A[j] = A[j].substring(0, 1) + A[j].substring(2, A[j].length());
					} else {
						A[j] = A[j].substring(0, A[j].indexOf(a[i]))
								+ A[j].substring(A[j].indexOf(a[i]) + 1, A[j].length());
					}
					check = 2;
				}

			}
			if (check == 2) {
				output.add(new Character(a[i]).toString());
			}
		}

		return output;
	}
}
