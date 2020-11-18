package org.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUtil {

    public static String twoStringPlus(String a, String b) {

        String largerString, smallerString;
        if (a.length() > b.length()) {
            largerString = a;
            smallerString = b;
        } else {
            largerString = b;
            smallerString = a;
        }
        int largerLength = Math.max(a.length(), b.length());
        int smallerLength = Math.min(a.length(), b.length());

        String[] arr = new String[largerLength];
        int j = 1;
        boolean overTen = false;
        for (int i = largerLength - 1; i >= 0; i--) {

            int largerChar = Integer.parseInt(largerString.charAt(i) + "");
            int smallerChar = 0;
            if (j <= smallerLength)
                smallerChar = Integer.parseInt(smallerString.charAt(smallerLength - j) + "");

            int finalChar = largerChar + smallerChar;
            if (overTen)
                finalChar++;

            if (finalChar > 9) {
                arr[i] = String.valueOf(finalChar - 9);
                overTen = true;
            } else {
                arr[i] = String.valueOf(finalChar);
                overTen = false;
            }
            j++;
        }

        if (arr.length == 0)
            return null;

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        if (overTen)
            return "1" + sb.toString();
        return sb.toString();
    }
}
