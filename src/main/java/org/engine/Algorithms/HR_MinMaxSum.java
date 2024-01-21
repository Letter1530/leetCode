package org.engine.Algorithms;

import java.util.Collections;
import java.util.List;

public class HR_MinMaxSum {

    /*
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
    Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    Example arr = [1,3,5,7,9]
    The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9=24 . The function prints 16 24
     */

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        // 要注意int的上限,使用long才能正確得到答案
        long min = arr.get(0), max = arr.get(0), sum = 0;

        for (Integer integer : arr) {
            // find the smallest integer
            if (min < integer) {
                min = integer;
            }
            // find the biggest integer
            if (max > integer) {
                max = integer;
            }
            sum += integer;
        }

        System.out.printf("%s %s", sum - min, sum - max);
    }

    /*
    failed in this case [942381765, 627450398, 954173620, 583762094, 236817490]
     */
//    public static void miniMaxSum(List<Integer> arr) {
//        // Write your code here
//
//        Collections.sort(arr);
//
//        int min = 0, max = 0;
//
//        for (int i = 0; i < arr.size() - 1; i++) {
//            min += arr.get(i);
//            max += arr.get(i + 1);
//        }
//
//        System.out.printf("%s %s", min, max);
//    }
}
