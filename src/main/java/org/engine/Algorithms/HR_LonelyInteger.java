package org.engine.Algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HR_LonelyInteger {

    /*
    Given an array of integers, where all elements but one occur twice, find the unique element.
    Example a = [1,2,3,4,3,2,1]
    The unique element is 4.
     */

    /*
     * Complete the 'lonelyInteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here

        Map<String, Integer> map = new HashMap<>();

        for (Integer i : a) {

            String key = String.valueOf(i);

            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, 2);
            }
        }

        String key = map.entrySet().stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findAny()
                .orElseThrow(RuntimeException::new);

        return Integer.parseInt(key);
    }

    public static int mostVoteSolution(List<Integer> a) {

        int x = 0;
        // 利用XOR來找出唯一存在的int
        for (int iter : a) {
            x ^= iter;
        }

        return x;
    }

    public static int betterSolution(List<Integer> a) {

        for (Integer num : a) {
            if (a.lastIndexOf(num) == a.indexOf(num)) {
                return num;
            }
        }
        throw new RuntimeException("Can't find the unique element");
    }
}
