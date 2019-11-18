package org.hugh.Algorithms;

public class LC_0067_AddBinary {
	/*
	 * Given two binary strings, return their sum (also a binary string).
	 * The input strings are both non-empty and contains only characters 1 or 0.
	 * 
	 * Example 1:
	 * Input: a = "11", b = "1"
	 * Output: "100"
	 * 
	 * Example 2:
	 * Input: a = "1010", b = "1011"
	 * Output: "10101"
	 * */
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}
	
	/*
	 * Runtime: 10 ms, faster than 5.61% of Java online submissions for Add Binary.
	 * Memory Usage: 37.4 MB, less than 7.86% of Java online submissions
	 * for Add Binary.
	 */
	
	public static String addBinary(String a, String b) {
		String[] aArray = a.split("");
		String[] bArray = b.split("");
		String ans = "";
		int lengthSub = 0;
		boolean carry = true;
		if (aArray.length >= bArray.length) {
			lengthSub = aArray.length - bArray.length;
			for (int i = aArray.length - 1; i >= 0; i--) {
				if (i == aArray.length - 1) {
					carry = false;
				}
				if (aArray[i].equals("0")) {
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "1" + ans;
							carry = false;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
				}
				if (aArray[i].equals("1")) {
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "0" + ans;
							carry = true;
						} else if (carry) {
							ans = "1" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
				}
				if (i == 0 && carry) {
					ans = "1" + ans;
				}
			}
		} else if (aArray.length < bArray.length){
			lengthSub = bArray.length - aArray.length;
			for (int i = bArray.length - 1; i >= 0; i--) {
				if (i == bArray.length - 1) {
					carry = false;
				}
				System.out.println(i);
				if (bArray[i].equals("0")) {
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "1" + ans;
							carry = false;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
				}
				if (bArray[i].equals("1")) {
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "0" + ans;
							carry = true;
						} else if (carry) {
							ans = "1" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
				}
				if (i == 0 && carry) {
					ans = "1" + ans;
				}
			}
		}
		return ans;
	}
}
