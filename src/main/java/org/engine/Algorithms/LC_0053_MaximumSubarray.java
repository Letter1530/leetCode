package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LC_0053_MaximumSubarray {

    /*
     * Given an integer array nums,
     * find the contiguous subarray (containing at least one number)
     * which has the largest sum and return its sum.
     *
     * Example:
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * */
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] nums = {6, -7, 4};
        System.out.println(maxSubArray(nums));
    }

    /*
     * Runtime: 0 ms, faster than 100% of Java online submissions for MaximumSubarray.
     * Memory Usage: 39.1 MB, less than 7.63% of Java online submissions
     * for MaximumSubarray.
     */
    /**
     * @author Engine
     * @date 2020/11/4 下午 01:40
     * @description
     * Runtime: 0 ms, faster than 100% of Java online submissions for MaximumSubarray.
     * Memory Usage: 39.1 MB, less than 7.63% of Java online submissions for MaximumSubarray.
     * @param nums
     * @return int
     */
    public static int maxSubArray(int[] nums) {

        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
