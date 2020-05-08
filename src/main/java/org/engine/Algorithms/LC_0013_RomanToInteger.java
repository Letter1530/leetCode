package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class LC_0013_RomanToInteger {

    /*
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
     * and M.
     *
     * Given a roman numeral, convert it to an integer. Input is guaranteed to be
     * within the range from 1 to 3999.
     *
     * Example 1:
     * Input: "III"
     * Output: 3
     *
     * Example 2:
     * Input: "IV"
     * Output: 4
     *
     * Example 3:
     * Input: "IX"
     * Output: 9
     *
     * Example 4:
     * Input: "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     *
     * Example 5:
     * Input: "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    public static void main(String[] args) {
//        String num = "III";
//        String num = "IV";
//        String num = "IX";
//        String num = "LVIII";
        String num = "MCMXCIV";
        System.out.println(romanToInt(num));
    }

    /*
     * Runtime: 7 ms, faster than 20.81% of Java online submissions for Roman to Integer.
     * Memory Usage: 40.2 MB, less than 5.48% of Java online submissions for Roman to Integer.
     */
    public static int romanToInt(String s) {

        String[] arr1 = {"C", "D", "I", "L", "M", "V", "X"};
        int[] arr2 = {100, 500, 1, 50, 1000, 5, 10};

        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            String RN1 = s.substring(i, i + 1);
            String RN2 = "";

            int position1 = Arrays.binarySearch(arr1, RN1);
            int position2 = 0;

            int num1 = arr2[position1];
            int num2 = 0;

            if (i < s.length() - 1) {
                RN2 = s.substring(i + 1, i + 2);
                position2 = Arrays.binarySearch(arr1, RN2);
                num2 = arr2[position2];
            }

            if (!"".equals(RN2))
                if (num1 < num2)
                    res = res - num1;
                else
                    res = res + num1;
            else
                res = res + num1;
        }
        return res;
    }
}
