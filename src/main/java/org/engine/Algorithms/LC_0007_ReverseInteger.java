package org.engine.Algorithms;

public class LC_0007_ReverseInteger {

    /*
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
     * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     *
     * Example 1: Input: 123 Output: 321
     *
     * Example 2: Input: -123 Output: -321
     *
     * Example 3: Input: 120 Output: 21
     */
    public static void main(String[] args) {
//		int num = 1534236469;
        int num = -2147483648;
        System.out.println(reverseInt(num));
    }

    /*
     * Runtime: 1 ms, faster than 100% of Java online submissions for Reverse
     * Integer. Memory Usage: 33.5 MB, less than 11.66% of Java online submissions
     * for Reverse Integer.
     * 這題我這樣寫應該是最佳解
     */
    public static int reverseInt(int x) {

        int response = 0;

        while (x != 0) {
            if ((Integer.MAX_VALUE / 10 < response && x > 0) || (Integer.MIN_VALUE / 10 > response && x < 0)) {
                response = 0;
                break;
            } else {
                response = response * 10 + x % 10;
                x = x / 10;
            }
        }
        return response;
    }
}
