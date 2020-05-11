package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LC_0014_LongestCommonPrefix {

    /**
     *
     *  Write a function to find the longest common prefix string amongst an array of strings.
     *  If there is no common prefix, return an empty string "".
     *
     *  Example 1:
     *  Input: ["flower","flow","flight"]
     *  Output: "fl"
     *
     *  Example 2:
     *  Input: ["dog","racecar","car"]
     *  Output: ""
     *  Explanation: There is no common prefix among the input strings.
     *
     * @Author BugDeveloper
     * @Description
     * @Date 下午 05:19 2020/5/11
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"aca", "cba"};
//        String[] strs = ["dog", "racecar", "car"];
        String[] strs = {"bcdef", "bcde", "bc"};
        log.info("ans:[{}]", longestCommonPrefix(strs));
    }

    /*
     * Runtime: 0 ms, faster than 100% of Java online submissions for Longest Common Prefix.
     * Memory Usage: 37.5 MB, less than 91.23% of Java online submissions
     * for Longest Common Prefix.
     */
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";

        String res = strs[0];
        int i = 1;
        while (i < strs.length) {
            if (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            } else {
                i++;
            }
        }
        return res;
    }
}
