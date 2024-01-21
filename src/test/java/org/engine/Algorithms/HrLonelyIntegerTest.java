package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class HrLonelyIntegerTest {

    @Test
    public void lonelyInteger() {

        Integer[] arr = new Integer[]{1,2,3,4,3,2,1};

        int res = HR_LonelyInteger.lonelyInteger(Arrays.asList(arr));

        log.info("res:{}", res);
    }
}