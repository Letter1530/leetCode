package org.engine.temp;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class CloudLatitudeTest {

    @Test
    public void testOddEven() {

        Integer[] my_list = new Integer[]{1, 2, 3, 4};
//        Integer[] my_list = new Integer[]{5, 7, 9};

        int calculateRes = 1;
        int finalRes = 0;

        for (Integer i : my_list) {
            calculateRes = 	calculateRes * i;
            finalRes += i;
        }

        log.info("res:{}", calculateRes / 2 == 1 ? 0 : calculateRes);

        if (calculateRes % 2 == 1) {
            finalRes = 0;
        }
        log.info("finalRes:{}", finalRes);
    }

    @Test
    public void testFindCorrectPassword() {

        String[] passwords = new String[]{"P@sswORD1", "20passWORD20", "PASS6word"};
        String checkString = "4dro6";

        int upperCaseCount = Integer.parseInt(checkString.substring(0, 1));
        String latestChar = new StringBuilder(checkString.substring(1, 4)).reverse().toString();
        int digitsCount = Integer.parseInt(checkString.substring(4, 5));

        log.info("1:{}, 2:{}, 3:{}", upperCaseCount, latestChar, digitsCount);

        String correctPsw = "" ;
        for (String psw : passwords) {
            if (!latestChar.equals(psw.substring(psw.length() - 3))) {
                continue;
            }

            int digitRes = Arrays.stream(psw.replaceAll("[^0-9]+", " ").trim().split(" "))
                    .filter(StringUtils::isNotBlank)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
            if (digitsCount != digitRes) {
                continue;
            }

            int upperCaseRes = (int) psw.chars().filter(Character::isUpperCase).count();
            if (upperCaseCount != upperCaseRes) {
                continue;
            }

            correctPsw = psw;
            break;
        }
        log.info("correctPsw:{}", correctPsw);
    }

    /*
    Test3 : simple factory, singleton.
     */
}
