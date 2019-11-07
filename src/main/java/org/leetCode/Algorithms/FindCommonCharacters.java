package org.leetCode.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FindCommonCharacters {

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
	 * Runtime: 8 ms, faster than 41.27% of Java online submissions for Find Common Characters.
	 * Memory Usage: 37 MB, less than 100.00% of Java online submissions for Find Common Characters.
	 * @param A
	 * @return
	 * @Description
	 * Analysis:
	 * Time: O(n), where n is the total number of characters in A;
	 * extra space: O(1), excludes output/return space.
	 * 
	 * Q & A:
	 * Q: What does ++cnt[c - 'a']; mean?
	 * A: count the frequency of chars in String str.
	 * 
	 *  c : cnt[c - 'a']
	 * 'a': cnt['a' - 'a'] = cnt[0]
	 * 'b': cnt['b' - 'a'] = cnt[1]
	 * 'c': cnt['c' - 'a'] = cnt[2]
	 * ...
	 * 'z': cnt['z' - 'a'] = cnt[25]
	 * if char c represents 'x', then cnt[c - 'a'] = cnt[23]. That is, when encountering char 'x', we increase cnt[23] by 1.
	 * Therefore, after traversal of all chars in String str, we have the frequency (number of occurrence) of each char in cnt.
	 * @author rock 
	 */
    public static List<String> submit1(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26]; 
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String str : A) {
            int[] cnt = new int[26];
            str.chars().forEach(c -> ++cnt[c - 'a']); // count each char's frequency in string str.
            for (int i = 0; i < 26; ++i) { count[i] = Math.min(cnt[i], count[i]); } // update minimum frequency.
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) { ans.add("" + c); }
        }
        return ans;
    }
    
    /**
     * Runtime: 9 ms, faster than 34.26% of Java online submissions for Find Common Characters.
     * Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Find Common Characters.
     * @param A
     * @return
     * @Description Java8 stream
     * @author rock
     */
    public static List<String> commonChars(String[] A) {
        int[] count = new int[26]; 
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String str : A) {
            int[] cnt = new int[26];
            str.chars().forEach(c -> ++cnt[c - 'a']); // count each char's frequency in string str.
            IntStream.range(0, 26).forEach(i ->  count[i] = Math.min(cnt[i], count[i])); // update minimum frequency.
        }
        List<String> ans = new ArrayList<>();
        IntStream.range('a', 'z' + 1).forEach(c ->  ans.addAll(Collections.nCopies(count[c - 'a'], "" + (char)c)));
        return ans;
    }
}
