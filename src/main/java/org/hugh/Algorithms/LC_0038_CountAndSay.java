package org.hugh.Algorithms;

public class LC_0038_CountAndSay {
	/*
	 * The count-and-say sequence is the sequence of integers with the first five terms as following:
	 * 1.     1
	 * 2.     11
	 * 3.     21
	 * 4.     1211
	 * 5.     111221
	 * 
	 * 1 is read off as "one 1" or 11.
	 * 11 is read off as "two 1s" or 21.
	 * 21 is read off as "one 2, then one 1" or 1211.
	 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
	 * 
	 * Example 1:
	 * Input: 1
	 * Output: "1"
	 * 
	 * Example 2:
	 * Input: 4
	 * Output: "1211"
	 * */
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(countAndSay(n));
	}
	
	/*
	 * Runtime: 16 ms, faster than 7.59% of Java online submissions for Count and Say.
	 * Memory Usage: 36.7 MB, less than 52.63% of Java online submissions
	 * for Count and Say.
	 */
	public static String countAndSay(int n) {
		String str = "1"; /*第一次字串*/
		String lastStr = str; /*最後一次字串*/
		int count = 1; /*計數 n*/
		int lastStrCount = 0;
		int countNum = 0; /*該數字的次數*/
		while (count < n) {
			String newStr = "";
			String strNum = lastStr.split("")[0]; /*最後一次字串的第一個字元*/
			for (String thisStr : lastStr.split("")) {
				lastStrCount++;
				if (strNum.equals(thisStr)) {
					countNum++;
				}
				if (!strNum.equals(thisStr)) {
					newStr = newStr + countNum + strNum;
					strNum = thisStr;
					countNum = 1;
				}
				if (lastStrCount == lastStr.length()) {
					newStr = newStr + countNum + strNum;
					lastStrCount = 0;
					countNum = 0;
				}
			}
			count++;
			lastStr = newStr;
		}
		return lastStr;
	}
}
