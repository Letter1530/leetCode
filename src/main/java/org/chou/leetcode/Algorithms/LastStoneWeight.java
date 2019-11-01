package org.chou.leetcode.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {

	/**
	 * We have a collection of rocks, each rock has a positive integer weight. Each
	 * turn, we choose the two heaviest rocks and smash them together. Suppose the
	 * stones have weights x and y with x <= y. The result of this smash is:
	 * 
	 * If x == y, both stones are totally destroyed; If x != y, the stone of weight
	 * x is totally destroyed, and the stone of weight y has new weight y-x. At the
	 * end, there is at most 1 stone left. Return the weight of this stone (or 0 if
	 * there are no stones left.)
	 * 
	 * Example 1:
	 * 
	 * Input: [2,7,4,1,8,1] Output: 1 Explanation: We combine 7 and 8 to get 1 so
	 * the array converts to [2,4,1,1,1] then, we combine 2 and 4 to get 2 so the
	 * array converts to [2,1,1,1] then, we combine 2 and 1 to get 1 so the array
	 * converts to [1,1,1] then, we combine 1 and 1 to get 0 so the array converts
	 * to [1] then that's the value of last stone.
	 * 
	 * Note:
	 * 
	 * 1 <= stones.length <= 30 1 <= stones[i] <= 1000
	 */
	public static void main(String[] args) {
		int[] stones = { 2, 7, 4, 1, 8, 1 };
		System.out.println(submit1(stones));
	}

	public static int submit1(int[] stones) {
		List<Integer> bag = new ArrayList();
		int period = 0;
		for (int i = 0; i < stones.length; i++) {
			bag.add(stones[i]);
		}
		for (int i = bag.size() - 1; i > -1; i--) {
			if (i < 0)
				break;
			period = bag.get(i);
			System.out.println(period);
			System.out.println();
			bag.remove(i);
			if (bag.contains(period)) {
				bag.remove(new Integer(period));
				System.out.println("??陣列:" + bag);
				i--;
			} else {
				bag.add(period);
			}
		}
		Collections.sort(bag);
		System.out.println("最終陣列:" + bag);

		return 0;
	}
}