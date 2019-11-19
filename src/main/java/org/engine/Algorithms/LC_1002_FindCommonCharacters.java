package org.engine.Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_1002_FindCommonCharacters {

	/**
	 * Given an array A of strings made only from lowercase letters, return a list
	 * of all characters that show up in all strings within the list (including
	 * duplicates). For example, if a character occurs 3 times in all strings but
	 * not 4 times, you need to include that character three times in the final
	 * answer. You may return the answer in any order.
	 * 
	 * Example1: 
	 * Input: ["bella","label","roller"] 
	 * Output: ["e","l","l"]
	 * 
	 * Example2:
	 * Input: ["cool","lock","cook"]
	 * Output: ["c","o"]
	 * 
	 * Note:
	 * 1 <= A.length <= 100
	 * 1 <= A[i].length <= 100
	 * A[i][j] is a lowercase letter
	 */
	public static void main(String[] args) {
		String[] aStrings = {"bella", "label", "roller"};
//		String[] aStrings = { "cool", "lock", "cook" };
		System.out.println(submit1(aStrings));
	}

	/**
	 * Runtime: 9 ms, faster than 34.26% of Java online submissions for Find Common Characters.
	 * Memory Usage: 38.3 MB, less than 62.07% of Java online submissions for Find Common Characters.
	 * @param A
	 * @return
	 * @Description
	 * @author Letter1530(Engine) 2019年11月5日
	 */
	public static List<String> submit1(String[] A) {

		List<String> list = new ArrayList<String>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : A[0].toCharArray()) {
			map.put(c, countMatches(A[0], c));
		}
		System.out.println("map:"+map);
		for (int i = 1; i < A.length; i++) {
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				
				int x = countMatches(A[i], entry.getKey());
				
				if (entry.getValue() > x)
					map.put(entry.getKey(), x);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				list.add(String.valueOf(entry.getKey()));
			}
		}
		return list;
	}
	
    public static int countMatches(CharSequence str, char ch) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int count = 0;
        // We could also call str.toCharArray() for faster look ups but that would generate more garbage.
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
