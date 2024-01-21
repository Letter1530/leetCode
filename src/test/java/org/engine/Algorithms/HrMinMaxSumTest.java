package org.engine.Algorithms;

import org.junit.Test;

import java.util.Arrays;

public class HrMinMaxSumTest {

    @Test
    public void miniMaxSum() {

//        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
//        Integer[] arr = new Integer[]{942381765, 627450398, 954173620, 583762094, 236817490};
        Integer[] arr = new Integer[]{256741038, 623958417, 467905213, 714532089, 938071625}; // expect result [2063136757 2744467344]

        HR_MinMaxSum.miniMaxSum(Arrays.asList(arr));
    }
}