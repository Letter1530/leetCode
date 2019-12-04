package org.hugh.Algorithms;

import java.util.LinkedList;
import java.util.List;

public class LC_0118_PascalsTriangle {
	/*
	 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
	 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
	 * 
	 * Input: 5
	 * Output:
	 * [
	 *      [1],
	 *     [1,1],
	 *    [1,2,1],
	 *   [1,3,3,1],
	 *  [1,4,6,4,1]
	 * ]
	 * */
	
	public static void main(String[] args) {
		int numRows = 7;
		System.out.println(generate(numRows));
	}
	
	/*
	 * Runtime: 1 ms, faster than 24.58% of Java online submissions for Pascal's Triangle.
	 * Memory Usage: 34.2 MB, less than 7.23% of Java online submissions
	 * for Pascal's Triangle.
	 */
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new LinkedList<>();
		List<Integer> tempList = null;
		while (ans.size() < numRows) {
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
		return ans;
	}
}
