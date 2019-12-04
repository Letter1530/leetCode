package org.hugh.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LC_0168_ExcelSheetColumnTitle {
	/*
	 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
	 * 
	 * For example:
	 *     1 -> A
	 *     2 -> B
	 *     3 -> C
	 *     ...
	 *     26 -> Z
	 *     27 -> AA
	 *     28 -> AB
	 * 
	 * Example 1:
	 * Input: 1
	 * Output: "A"
	 * 
	 * Example 2:
	 * Input: 28
	 * Output: "AB"
	 * 
	 * Example 3:
	 * Input: 701
	 * Output: "ZY"
	 * */
	
	public static void main(String[] args) {
		int n = 26;
		System.out.println(convertToTitle(n));
	}
	
	/*
	 * Runtime: ?? ms, faster than ??% of Java online submissions for Excel Sheet Column Title.
	 * Memory Usage: ?? MB, less than ??% of Java online submissions
	 * for Excel Sheet Column Title.
	 */
	
	public static String convertToTitle(int n) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");map.put(2, "B");map.put(3, "C");map.put(4, "D");map.put(5, "E");map.put(6, "F");
		map.put(7, "G");map.put(8, "H");map.put(9, "I");map.put(10, "J");map.put(11, "K");map.put(12, "L");
		map.put(13, "M");map.put(14, "N");map.put(15, "O");map.put(16, "P");map.put(17, "Q");map.put(18, "R");
		map.put(19, "S");map.put(20, "T");map.put(21, "U");map.put(22, "V");map.put(23, "W");map.put(24, "X");
		map.put(25, "Y");map.put(26, "Z");map.put(0, "Z");
		String ansStr = "";
		while (n > 0) {
			ansStr = map.get(n%26) + ansStr;
			if (n%26 == 0 && n < 26){
				ansStr = map.get(n/26 - 1) + ansStr;
            }
			if (n <= 26) {
				break;
			}
			n/=26;
			if (n < 26) {
				n--;
			}
		}
		return ansStr;
	}
}
