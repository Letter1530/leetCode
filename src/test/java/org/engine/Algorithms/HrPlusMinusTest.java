package org.engine.Algorithms;

import org.junit.Test;

import java.util.Arrays;

public class HrPlusMinusTest {

    @Test
    public void plusMinus() {

        Integer[] arr = new Integer[]{-4, 3, -9, 0, 4, 1};

        HR_PlusMinus.plusMinus(Arrays.asList(arr));
    }
}