package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;

@Slf4j
public class HrTimeConversionTest {

    @Test
    public void timeConversion() {

//        String s = "07:05:45PM";
//        String s = "12:05:45PM";
//        String s = "12:05:45AM";
//        String s = "12:40:22AM";
//        String s = "12:45:54PM";
        String s = "01:45:54PM";

        String res = HR_TimeConversion.timeConversion(s);

        log.info("res:{}", res);
    }

    @Test
    public void test() {
        Integer[] arr = new Integer[]{0, 2, 9, 4, 3, 5, 1};
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.printf(String.valueOf(list.get(list.size() / 2)));
    }

    @Test
    public void test1() {

//        String[] arr = new String[]{"apples 5 1", "oranges 6 1"};
//        String[] arr = new String[]{"bread -1;1", "milk - 2;1"};
//        String[] arr = new String[]{"butter M N", "milk 1 1"};
        String[] arr = new String[]{"cucumber - 2 10"};

        List<Map<String, String>> list = new ArrayList<>();

        for (String str : arr) {

            String[] tempArr = str.replaceAll("[^0-9]+", " ").split(" ");

            int i = tempArr.length - 1;
            String key = "", val = "";
            while(i >= 0) {

                if (StringUtils.isNotBlank(tempArr[i])) {

                    if ("".equals(val)) {
                        val = tempArr[i];
                    } else {
                        key = tempArr[i];

                        Map<String, String> map = new HashMap<>();
                        map.put(key, val);
                        list.add(map);

                        val = "";
                    }
                }
                i--;
            }
        }

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (Map<String, String> map : list) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int itemSum = Integer.parseInt(entry.getKey()) * Integer.parseInt(entry.getValue());
                sb.append(itemSum).append("+");
                sum += itemSum;
            }
        }
        System.out.printf(sb.substring(0, sb.length() - 1) + "=" + sum);
    }

    @Test
    public void test2() {

        int n = 3, k = 2;
//        Integer[] arr = new Integer[]{5, 6 ,7};
        Integer[] arr = new Integer[]{5, 6 ,7};

        int sumMin = 0, sumMax = 0, sum = 0;
        List<Integer> minList = new ArrayList<>(Arrays.asList(arr));
        List<Integer> maxList = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < k; i++) {

            int min = arr[0], index = 0;

            for (Integer integer : minList) {
                if (min < integer) {
                    index = minList.indexOf(integer);
                    min = integer;
                }
                if (i == 0) {
                    sum += integer;
                }
            }
            sumMin += min;
            minList.remove(index);
        }

        for (int i = 0; i < k; i++) {

            int max = arr[0], index = 0;

            for (Integer integer : maxList) {
                if (max > integer) {
                    index = maxList.indexOf(integer);
                    max = integer;
                }
            }
            sumMax += max;
            maxList.remove(index);
        }
        System.out.println(sum - sumMax + " " + (sum - sumMin));
    }

    @Test
    public void test3() {

        List<String> list = new ArrayList<>();
        list.add("100,Robin,HR");
        list.add("200,Mary,AdminServices");
        list.add("101,Peter,AdminServices");
 
        list.stream().filter(s -> s.contains("1")).sorted().forEach(System.out::println);
    }
}