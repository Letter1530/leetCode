package org.engine.Algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class HR_PlusMinus {

    /*
    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
    Print the decimal value of each fraction on a new line with  places after the decimal.
    Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
     */
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int positive = 0, zero = 0, negative = 0;

        for (Integer i : arr) {
            if (i > 0) {
                positive++;
            } else if (i == 0) {
                zero++;
            } else {
                negative++;
            }
        }

        BigDecimal arrSize = BigDecimal.valueOf(arr.size());

        BigDecimal posRes = BigDecimal.valueOf(positive).divide(arrSize, 6, RoundingMode.HALF_UP);
        BigDecimal zeroRes = BigDecimal.valueOf(zero).divide(arrSize, 6, RoundingMode.HALF_UP);
        BigDecimal negRes = BigDecimal.valueOf(negative).divide(arrSize, 6, RoundingMode.HALF_UP);

        System.out.println(posRes);
        System.out.println(zeroRes);
        System.out.println(negRes);
    }
}
