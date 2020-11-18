package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LC_0058_LengthOfLastWord {

    /*
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
     * return the length of last word in the string.
     * If the last word does not exist, return 0.
     *
     * Note: A word is defined as a character sequence consists of non-space characters only.
     *
     * Example:
     * Input: "Hello World"
     * Output: 5
     * */
    public static void main(String[] args) {
//        String string = "Hello World";
//        String string = "Hello World ";
//        String string = "Hello World       ";
		String string = "";
//        String string = "  ";
        System.out.println(lengthOfLastWord(string));
    }

    /**
     * @author Engine
     * @date 2020/11/4 下午 02:06
     * @description
	 * Runtime: 0 ms, faster than 100% of Java online submissions for Length of Last Word.
	 * Memory Usage: 38.9 MB, less than 17.02% of Java online submissions for Length of Last Word.
     * @param s
     * @return int
     */
    public static int lengthOfLastWord(String s) {

        while (s.lastIndexOf(" ") == s.length() - 1 && s.length() != 0) {
            s = s.substring(0, s.length() - 1);
        }
		if (s.length() == 0)
			return 0;
        int i = s.lastIndexOf(" ");
        return i == s.length() ? 0 : s.length() - i - 1;
    }
}
