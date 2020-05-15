package org.engine.Algorithms;

public class LC_0028_ImplementStrStr {
	
	/**
	 *
	 * Implement strStr().
	 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 *
	 * Example 1:
	 * Input: haystack = "hello", needle = "ll"
	 * Output: 2
	 *
	 * Example 2:
	 * Input: haystack = "aaaaa", needle = "bba"
	 * Output: -1
	 *
	 * Clarification:
	 * What should we return when needle is an empty string?
	 * For the purpose of this problem,
	 * we will return 0 when needle is an empty string.
	 * This is consistent to C's strstr() and Java's .
	 *
	 * @Author BugDeveloper
	 * @Description WTF !? 這題是考記不記得String有indexOf這個方法嗎...
	 * @Date 下午 03:05 2020/5/15
	 * @Param [args]
	 * @return void
	 **/
	public static void main(String[] args) {
//		String haystack = "hello";
//		String needle = "ll";
		String haystack = "aaaaa";
		String needle = "bba";
		System.out.println(strStr(haystack, needle));
	}
	
	/*
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
	 * Memory Usage: 38.2 MB, less than 64.88% of Java online submissions
	 * for Remove Duplicates from Sorted Array.
	 */
//	public static int strStr(String haystack, String needle) {
//		return haystack.indexOf(needle);
//	}

//---------------------------------------Other Programmer Solution Started---------------------------------------
	public static int strStr(String haystack, String needle) {
		for (int i = 0; ; i++) { //這是needle的長度
			for (int j = 0; ; j++) { //這是haystack的長度
				if (j == needle.length()) return i; //這個狀況會發生的時候代表needle已經匹配完haystack的每個字了
				if (i + j == haystack.length()) return -1; //這個狀況會發生的時候代表needle.chart(i)跟haystack每個字都不符合
				if (needle.charAt(j) != haystack.charAt(i + j)) break; //needle.chart(i)跟haystack都不符合的話就跳出這個迴圈
			}
		}
	}
	//這個方法跟indexOf比真的簡短很多,也很神,速度上卻慢一點,沒必要特別寫成這樣,不過寫出這方法的人真的厲害
//---------------------------------------Other Programmer Solution End---------------------------------------
}
