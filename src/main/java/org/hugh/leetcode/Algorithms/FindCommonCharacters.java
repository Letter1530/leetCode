package org.hugh.leetcode.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	/**
	 * Given an array A of strings made only from lower case letters, return a list
	 * of all characters that show up in all strings within the list (including
	 * duplicates). For example, if a character occurs 3 times in all strings but
	 * not 4 times, you need to include that character three times in the final
	 * answer. You may return the answer in any order.
	 * 
	 * Example1: Input: ["bella","label","roller"] Output: ["e","l","l"]
	 * 
	 * Example2: Input: ["cool","lock","cook"] Output: ["c","o"]
	 * 
	 * Note: 1 <= A.length <= 100 1 <= A[i].length <= 100 A[i][j] is a lower case
	 * letter
	 */
	public static void main(String[] args) {
		String[] aStrings = { "acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab",
				"addcaccd" };
//		String[] aStrings = { "bella", "label", "roller" };
//		String[] aStrings = {"cool", "lock", "cook"};
		System.out.println(findCommonCharacters(aStrings));
	}

	public static List<String> findCommonCharacters(String[] A) {
		List<String> chList = new ArrayList<>();
		int index = 0;
		int length = A[0].length();
		for (int i = 1; i < A.length; i++) {
			if (A[i].length() < length) {
				length = A[i].length();
				index = i;
			}
		}
		char[] arrayJ = A[index].toCharArray();
		for (char ch : arrayJ) {
			int count = 0;
			boolean notFound = true;
			for (int i = 0; i < A.length; i++) {
				int thiscount = count;
				char[] arrayK = A[i].toCharArray();
				for (char ch1 : arrayK) {
					if (ch == ch1) {
						count++;
						notFound = false;
					}
				}
				if(thiscount == count) {
					notFound =true;
					break;
				}
			}
			if (!notFound) {
				if (count != 0 && (count % A.length == 0 || (count / A.length) >= 1)) {
					List<String> chList1 = chList;
					if ((count / A.length) >= 1) {
						int countChar = (count / A.length);
						int checkCount = 0;
						for (String str : chList1) {
							if (str.equals(String.valueOf(ch))) {
								checkCount++;
							}
						}
						if (countChar > checkCount) {
							chList.add(String.valueOf(ch));
						}
					} else {
						chList.add(String.valueOf(ch));
					}
				}
			}
		}
		return chList;
	}
}
