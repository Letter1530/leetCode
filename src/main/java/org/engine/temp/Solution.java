package org.engine.temp;

import org.apache.commons.lang3.StringUtils;
import org.utils.StringUtil;

import java.util.Arrays;

public class Solution {

    public int mostWordsFound(String[] sentences) {

        int res = 0;
        for (String sentence : sentences) {

//            int tempRes = 0;

            int tempRes = (int) Arrays.stream(sentence.split(" "))
                    .filter(StringUtils::isNotBlank)
                    .count();
//            for (String word : sentence.split(" ")) {
//                if (StringUtils.isNotBlank(word)) {
//                    tempRes++;
//                }
//            }

            if (tempRes > res) {
                res = tempRes;
            }
        }
        return res;
    }
}
