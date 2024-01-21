package org.engine.Algorithms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HR_TimeConversion {

    /*
    Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    Note: 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
    Example s = 12:01:00PM, res = 12:01:00. s = 12:01:00AM, res = 00:01:00
     */

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        String[] timeSplit = s.split(":");
        String letter = timeSplit[2].substring(2);
        String hour = "";

        if ("PM".equals(letter)) {
            Integer tempInt = Integer.parseInt(timeSplit[0]) + 12;
            if (tempInt == 24) {
                hour = "12";
            } else {
                hour = String.valueOf(tempInt);
            }
        } else {
            if ("12".equals(timeSplit[0])) {
                hour = "00";
            } else {
                hour = timeSplit[0];
            }
        }

        return hour + s.substring(2, s.length() - 2);
    }

    /*
    The most vote solution
     */
    private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    public static String mostVoteSolution(String s) {
        try {
            return TWENTY_FOUR_TF.format(TWELVE_TF.parse(s));
        } catch (ParseException e) {
            return s;
        }
    }
}
