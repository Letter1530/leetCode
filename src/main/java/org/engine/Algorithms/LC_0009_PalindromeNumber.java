package org.engine.Algorithms;

public class LC_0009_PalindromeNumber {

    /*
     * Determine whether an integer is a palindrome. An integer is a palindrome when
     * it reads the same backward as forward.
     *
     * Example 1: Input: 121 Output: true
     *
     * Example 2: Input: -121 Output: false Explanation: From left to right, it
     * reads -121. From right to left, it becomes 121-. Therefore it is not a
     * palindrome.
     *
     * Example 3: Input: 10 Output: false Explanation: Reads 01 from right to left.
     * Therefore it is not a palindrome.
     *
     * Follow up:
     * Coud you solve it without converting the integer to a string?
     **/
    public static void main(String[] args) {
//		int target = 121;
        int target = -121;

        System.out.println(isPalindrome(target));
    }

    /*
     * Runtime: 7 ms, faster than 73.17% of Java online submissions for Palindrome
     * Number. Memory Usage: 36.1 MB, less than 5.02% of Java online submissions for
     * Palindrome Number.
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int xLength = 0;
            int mirrorX = x;
            while (mirrorX != 0) {
                mirrorX = mirrorX / 10;
                xLength++;
            }

            int halfOfX = 0;
            for (int i = 0; i < xLength / 2; i++) {
                halfOfX = halfOfX * 10 + x % 10;
                x = x / 10;
            }

            if (xLength % 2 == 1)
                x = x / 10;

            return Integer.valueOf(x).equals(halfOfX);
        }
    }

}
