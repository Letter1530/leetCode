package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class LC0002AddTwoNumbersTest {

    private final LC_0002_AddTwoNumbers lc0002 = new LC_0002_AddTwoNumbers();

    @Test
    public void addTwoNumbers() {

        // Sample1
//        int[] arr1 = {2, 4, 3};
//        int[] arr2 = new int[]{5, 6, 4};
        // Sample2
//        int[] arr1 = {0};
//        int[] arr2 = new int[]{0};
        // Sample3
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = new int[]{9,9,9,9};

        LC_0002_AddTwoNumbers.ListNode l1 = lc0002.convertor(arr1);
        LC_0002_AddTwoNumbers.ListNode l2 = lc0002.convertor(arr2);

        LC_0002_AddTwoNumbers.ListNode res = lc0002.addTwoNumbers(l1, l2);

        List<Integer> finalRes = new ArrayList<>();
        while (res.hasNext()) {
            finalRes.add(res.getVal());
            res = res.getNext();
        }
        finalRes.add(res.getVal());

        log.info("res:{}", finalRes.stream().mapToInt(Integer::intValue).toArray());
    }
}