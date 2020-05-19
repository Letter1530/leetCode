package org.engine.Algorithms;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class LC_0035_SearchInsertPosition {

    /**
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * <p>
     * Example 1:
     * Input: [1,3,5,6], 5
     * Output: 2
     * <p>
     * Example 2:
     * Input: [1,3,5,6], 2
     * Output: 1
     * <p>
     * Example 3:
     * Input: [1,3,5,6], 7
     * Output: 4
     * <p>
     * Example 4:
     * Input: [1,3,5,6], 0
     * Output: 0
     *
     * @return void
     * @Author BugDeveloper
     * @Description
     * @Date 下午 12:39 2020/5/19
     * @Param [args]
     **/
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
//        int target = 5;
//        int target = 2;
        int target = 7;
//        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    /*
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Search Insert Position.
     * Memory Usage: 40.4 MB, less than 5.41% of Java online submissions
     * for Search Insert Position.
     */
    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 0)
            return 0;

        int i = Arrays.binarySearch(nums, target); // 如果nums裡面找的到target就直接回傳了
        if (i < 0) {
        	int y = 0;
        	for (int x : nums) { // NOTE:這邊可以這樣寫是因為題目已經說nums是由小到大排序的
        		if (x > target) { // 找出nums裡第一個比target大的int
        			y = x;
					break;
				}
			}
        	if (y != 0)
        		i = Arrays.binarySearch(nums, y);
        	else
        		i = nums.length; // i = nums.length是因為nums裡面可能每個值都比target小,所以nums.length就是target應該在的地方
		}
        return i;
    }

}
