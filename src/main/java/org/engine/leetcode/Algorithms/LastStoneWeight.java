package org.engine.leetcode.Algorithms;

import java.util.Arrays;


public class LastStoneWeight {

	/**
	 * We have a collection of rocks, each rock has a positive integer weight. Each turn, we choose
	 * the two heaviest rocks and smash them together. Suppose the stones have weights x and y with
	 * x <= y. The result of this smash is:
	 * 
	 * If x == y, both stones are totally destroyed; If x != y, the stone of weight x is totally
	 * destroyed, and the stone of weight y has new weight y-x. At the end, there is at most 1 stone
	 * left. Return the weight of this stone (or 0 if there are no stones left.)
	 * 
	 * Example 1:
	 * 
	 * Input: [2,7,4,1,8,1] Output: 1 Explanation: We combine 7 and 8 to get 1 so the array converts
	 * to [2,4,1,1,1] then, we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then, we
	 * combine 2 and 1 to get 1 so the array converts to [1,1,1] then, we combine 1 and 1 to get 0
	 * so the array converts to [1] then that's the value of last stone.
	 * 
	 * Note:
	 * 
	 * 1 <= stones.length <= 30 1 <= stones[i] <= 1000
	 */
	public static void main(String[] args) {
		int[] stones = { 2, 7, 4, 1, 8, 1 };
		System.out.println(submit1(stones));
	}

	/**
	 * Runtime: 16 ms, faster than 34.22% of Java online submissions for Last Stone Weight. Memory
	 * Usage: 36.3 MB, less than 100.00% of Java online submissions for Last Stone Weight.
	 * 
	 * @param stones
	 * @return
	 * @Description
	 * @author Letter1530(Engine) 2019年10月30日
	 */
	public static int submit1(int[] stones) {

		int res = 0;

		if (stones.length > 1) {
			for (int i = stones.length - 1; i >= 0; i--) {

				Arrays.sort(stones);
				System.out.println("排序完stones:" + Arrays.toString(stones));
				res = stones[stones.length - 1] - stones[stones.length - 2];
				System.out.println("res:" + res);
				if (res != 0) {
					stones[stones.length - 1] = 0;
					stones[stones.length - 2] = res;
				} else {
					stones[stones.length - 1] = 0;
					stones[stones.length - 2] = 0;
				}
				System.out.println("stones:" + Arrays.toString(stones));
			}
		} else if (stones.length == 1) {
			res = stones[0];
		}
		return res;
	}
}