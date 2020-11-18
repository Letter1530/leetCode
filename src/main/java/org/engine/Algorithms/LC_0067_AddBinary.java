package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;
import org.utils.StringUtil;

import java.util.Arrays;

@Slf4j
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
//        String a = "1010", b = "1011";
//        String a = "11", b = "1";
//        String a = "111", b = "1";
        String a = "1111", b = "1111";
//        String a = "1110110101", b = "1110111011";
//        System.out.println(addBinary(a, b));
        System.out.println(otherProgramerSolution(a, b));
    }

    /**
     * @author Engine
     * @date 2020/11/17 下午 01:47
     * @description
     * Runtime: 6 ms, faster than 15.41% of Java online submissions for Add Binary.
     * Memory Usage: 39 MB, less than 33.31% of Java online submissions for Add Binary.
     * @param a, b
     * @return java.lang.String
     */
    public static String addBinary(String a, String b) {

        String c = StringUtil.twoStringPlus(a, b);
        log.info("c:{}", c);
        char[] charArray = c.toCharArray();
        boolean binary = false;

        for (int i = charArray.length - 1; i >= 0; i--) {

            if (charArray[i] == '2') {
                charArray[i] = '0';
                binary = true;
            } else if (charArray[i] == '3') {
                charArray[i] = '1';
                binary = true;
            }

            if (binary && i != 0) {
                binary = false;
                charArray[i - 1] = (char) ((int)charArray[i - 1] + 1);
            }
            log.info("char:{}", Arrays.toString(charArray));
        }

        if (binary)
            return "1" + String.valueOf(charArray);
        return new String(charArray);
    }

//---------------------------------------Other Programmer Solution Started---------------------------------------
    /*
     * @author Engine
     * @date 2020/11/17 下午 01:55
     * @description 這做法真的太天才...寫出來的人真的厲害
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Binary.
     * Memory Usage: 37.7 MB, less than 82.07% of Java online submissions for Add Binary.
     * @param [a, b]
     * @return java.lang.String
     */
    public static String otherProgramerSolution(String a, String b) {
        StringBuilder sb = new StringBuilder(); //Google immutability or string vs StringBuilder if you don't know why we use this instead of regular string
        int i = a.length() - 1, j = b.length() -1, carry = 0; //two pointers starting from the back, just think of adding two regular ints from you add from back
        while (i >= 0 || j >= 0) {
            int sum = carry; //if there is a carry from the last addition, add it to carry
            if (j >= 0) sum += b.charAt(j--) - '0'; //we subtract '0' to get the int value of the char from the ascii
            if (i >= 0) sum += a.charAt(i--) - '0';
            log.info("sum:{}", sum);
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            log.info("sb:{}", sb.toString());
            carry = sum / 2; //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
            log.info("carry:{}", carry);
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }
//---------------------------------------Other Programmer Solution Started---------------------------------------
}
