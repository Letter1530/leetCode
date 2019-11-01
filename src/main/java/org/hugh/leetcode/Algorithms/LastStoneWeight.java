package org.hugh.leetcode.Algorithms;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println(lastStoneWeight(stones));
	}
	
	/**
	 * Runtime: 2 ms, faster than 43.45% of Java online submissions for Last Stone Weight.
	 * Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Last Stone Weight.
	 */
	public static int lastStoneWeight(int[] stones) {
        List<Integer> swList = new ArrayList<>();
		for (int is : stones) {
			swList.add(is);
		}
		Integer big = 0;
		Integer small = 0;
		while (swList.size() > 1) {
			int biggestIndex = 0;
			int sexondBigIndex = 0;
			if (swList.get(0) < swList.get(1)) {
				biggestIndex = 1;
				sexondBigIndex = 0;
				big = swList.get(1);
				small = swList.get(0);
			} else {
				biggestIndex = 0;
				sexondBigIndex = 1;
				big = swList.get(0);
				small = swList.get(1);
			}

			if (swList.size() > 2) {
				for (int i = 2; i < swList.size(); i++) {
					if (swList.get(i) >= big) {
						small = big;
						big = swList.get(i);
						sexondBigIndex = biggestIndex;
						biggestIndex = i;
					}
					if (swList.get(i) >= small && swList.get(i) < big) {
						small = swList.get(i);
						sexondBigIndex = i;
					}
				}
			}
			if(biggestIndex > sexondBigIndex) {
				swList.remove(biggestIndex);
				swList.remove(sexondBigIndex);
			}else {
				swList.remove(sexondBigIndex);
				swList.remove(biggestIndex);
			}
			swList.add(big - small);
			big = 0;
			small = 0;
		}
        return swList.get(0);
    }
}
