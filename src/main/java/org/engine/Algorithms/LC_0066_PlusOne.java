package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class LC_0066_PlusOne {

    /*
     * Given a non-empty array of digits representing a non-negative integer,
     * plus one to the integer.
     * The digits are stored such that the most significant digit is at the head of the list,
     * and each element in the array contain a single digit.
     * You may assume the integer does not contain any leading zero,
     * except the number 0 itself.
     *
     * Example 1:
     * Input: [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     *
     * Example 2:
     * Input: [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * */
    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
        int[] digits = {1, 2, 9};
//        int[] digits = {9};
//        int[] digits = {9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    /**
     * @author Engine
     * @date 2020/11/5 下午 05:44
     * @description
     * Runtime: 0 ms, faster than 100% of Java online submissions for Plus One.
     * Memory Usage: 37.8 MB, less than 6.47% of Java online submissions for Plus One.
     * @param digits
     * @return int[]
     */
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
