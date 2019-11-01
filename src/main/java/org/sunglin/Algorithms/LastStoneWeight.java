package org.sunglin.Algorithms;

public class LastStoneWeight {
	/**
	 * Runtime: 1 ms, faster than 96.22% of Java online submissions for Last Stone Weight. Memory
	 * Usage: 33.9 MB, less than 100.00% of Java online submissions for Last Stone Weight.
	 */
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
		int[] stones2 = { 1 };
		int[] stones3 = { 2, 2 };
		int[] stones4 = { 1, 3 };
		int[] stones5 = { 1, 9, 3 };
		System.out.println("1=" + submit1(stones));
		System.out.println("2=" + submit1(stones2));
		System.out.println("3=" + submit1(stones3));
		System.out.println("4=" + submit1(stones4));
		System.out.println("5=" + submit1(stones5));

		System.out.println("1_1=" + submit2(stones));
		System.out.println("2_1=" + submit2(stones2));
		System.out.println("3_1=" + submit2(stones3));
		System.out.println("4_1=" + submit2(stones4));
		System.out.println("5_1=" + submit2(stones5));
	}

	public static int submit1(int[] stones) {
		// 判斷長度只有1的
		if (stones.length == 1) {
			return stones[0];
		}

		// 排序
		for (int x = 1; x < stones.length; x++) {
			for (int y = 0; y < stones.length; y++) {
				if (stones[x] > stones[y]) {
					int temp = stones[x];
					stones[x] = stones[y];
					stones[y] = temp;
				}
			}
		}

		while (true) {
			int temp = 0;
			if (stones[0] - stones[1] <= 0) {
				temp = stones[0];
				stones[0] = 0;
				if (stones[1] - temp >= 0) {
					stones[1] = stones[1] - temp;
				} else {
					stones[1] = 0;
				}

			} else if (stones[0] - stones[1] > 0) {
				temp = stones[0];
				stones[0] = stones[0] - stones[1];
				if (stones[1] - temp >= 0) {
					stones[1] = stones[1] - temp;
				} else {
					stones[1] = 0;
				}

			}

			for (int x = 1; x < stones.length; x++) {
				for (int y = 0; y < stones.length; y++) {
					if (stones[x] > stones[y]) {
						temp = stones[x];
						stones[x] = stones[y];
						stones[y] = temp;
					}
				}
			}

			if (stones[1] == 0) {
				return stones[0];
			} else if (stones[0] == 0) {
				return 0;
			}
		}

	}

	public static int submit2(int[] stones) {
		// 判斷長度只有1的
		if (stones.length == 1) {
			return stones[0];
		}

		// 排序
		for (int x = 1; x < stones.length; x++) {
			for (int y = 0; y < stones.length; y++) {
				if (stones[x] > stones[y]) {
					int temp = stones[x];
					stones[x] = stones[y];
					stones[y] = temp;
				}
			}
		}

		while (true) {
			int temp = stones[0];
			stones[0] = 0;
			stones[1] = temp - stones[1];

			for (int x = 1; x < stones.length; x++) {
				for (int y = 0; y < stones.length; y++) {
					if (stones[x] > stones[y]) {
						temp = stones[x];
						stones[x] = stones[y];
						stones[y] = temp;
					}
				}
			}

			if (stones[1] == 0) {
				return stones[0];
			} else if (stones[0] == 0) {
				return 0;
			}
		}

	}
}
