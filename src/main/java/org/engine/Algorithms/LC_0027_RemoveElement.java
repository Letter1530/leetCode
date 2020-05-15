package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LC_0027_RemoveElement {

    /**
     * Given an array nums and a value val, remove all instances of that value
     * in-place and return the new length. Do not allocate extra space for another
     * array, you must do this by modifying the input array in-place with O(1) extra
     * memory. The order of elements can be changed. It doesn't matter what you
     * leave beyond the new length.
     * <p>
     * Example 1:
     * Given nums = [3,2,2,3], val = 3,
     * Your function should return length = 2,
     * with the first two elements of nums being 2.
     * It doesn't matter what you leave beyond the returned length.
     * <p>
     * Example 2:
     * Given nums = [0,1,2,2,3,0,4,2], val = 2,
     * Your function should return length = 5,
     * with the first five elements of nums containing 0, 1, 3, 0, and 4.
     * Note that the order of those five elements can be arbitrary.
     * It doesn't matter what you leave beyond the returned length.
     *
     * @return void
     * @Author BugDeveloper
     * @Description
     * @Date 下午 12:12 2020/5/15
     * @Param [args]
     **/
    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 3};
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        log.info("ans:{}", removeElement(nums, 2));
    }

    /*
     * Runtime: 0 ms, faster than 100% of Java online submissions for Remove Duplicates from Sorted Array.
     * Memory Usage: 38.1 MB, less than 5.05% of Java online submissions
     * for Remove Duplicates from Sorted Array.
     */
    public static int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
