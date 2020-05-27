package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LC_0038_CountAndSay {

    /**
     * The count-and-say sequence is the sequence of integers with the first five terms as following:
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 1 is read off as "one 1" or 11.
     * 11 is read off as "two 1s" or 21.
     * 21 is read off as "one 2, then one 1" or 1211.
     * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
     * <p>
     * Example 1:
     * Input: 1
     * Output: "1"
     * <p>
     * Example 2:
     * Input: 4
     * Output: "1211"
     *
     * @return void
     * @Author BugDeveloper
     * @Description
     * @Date 下午 01:31 2020/5/19
     * @Param [args]
     **/
    public static void main(String[] args) {
//        int n = 1;
//    	int n = 2;
    	int n = 3;
//    	int n = 4;
//    	int n = 5;
//    	int n = 6;
//    	int n = 7;
//        int n = 8;
        log.info("Ans:{}", countAndSay(n));
    }

    /*
     * Runtime: ?? ms, faster than ??% of Java online submissions for Count and Say.
     * Memory Usage: ?? MB, less than ??% of Java online submissions
     * for Count and Say.
     */
    public static String countAndSay(int n) {

        String res = "";

        for (int i = 1; i <= n; i++) {
            log.info("進來");
            if ("".equals(res)) {
            	res = "1";
            } else {
                for (int j = 0; j < res.length(); j++) {
                    String a = res.substring(j, j + 1);
                    log.info("a:{}", a);
                    String b = "";
                    if ("1".equals(a)) {
                        b = "11";
                    } else if ("2".equals(a)) {
                        b = "12";
                    }

                    res = b + res.substring(j + 1);
                }
            }
        }
        return res;
    }
}
