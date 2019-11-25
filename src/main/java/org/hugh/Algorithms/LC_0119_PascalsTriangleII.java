package org.hugh.Algorithms;

import java.util.LinkedList;
import java.util.List;

public class LC_0119_PascalsTriangleII {
	/*
	 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
	 * Note that the row index starts from 0.
	 * 
	 * Example:
	 * Input: 3
	 * Output: [1,3,3,1]
	 * */
	
	public static void main(String[] args) {
		int rowIndex = 5;
		System.out.println(getRow(rowIndex));
	}
	
	/*
	 * Runtime: 2 ms, faster than 7.72% of Java online submissions for Pascal's Triangle II.
	 * Memory Usage: 33.8 MB, less than 6.17% of Java online submissions
	 * for Pascal's Triangle II.
	 */
	
	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> ans = new LinkedList<>();
		List<Integer> tempList = null;
		while (ans.size() <= rowIndex) {
			tempList = new LinkedList<>();
			if (ans.size() == 0) {
				tempList.add(1);
			} else if (ans.size() == 1) {
				tempList.add(1);
				tempList.add(1);
			} else {
				for (int i = 0; i <= ans.size(); i++) {
					if (i == 0 || i == ans.size()) {
						tempList.add(1);
					} else {
						tempList.add(ans.get(ans.size()-1).get(i) + ans.get(ans.size()-1).get(i - 1));
					}
				}
			}
			ans.add(tempList);
		}
		return ans.get(rowIndex);
	}
}
