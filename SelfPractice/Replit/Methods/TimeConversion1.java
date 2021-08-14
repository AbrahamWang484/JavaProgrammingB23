package Replit.Methods;

import java.util.Scanner;

public class TimeConversion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion1(scan.nextLine().toLowerCase());
    }

    public static void timeConversion1(String s) {
        //write your code here
        if (s.contains("pm")) {
            String[] pm = s.split(":");//hh:mm:ssPM
            String hours = pm[0];
            int hour = Integer.parseInt(hours);//function convert String to int
            String minute = pm[1];
            String second = pm[2].substring(0, 2);

            if (hour == 12) {
                System.out.println("12:" + minute + ":" + second);
            } else {  //2:22:22pm>>14:22:22
                System.out.println(hour + 12 + ":" + minute + ":" + second);
            }
        }
        if (s.contains("am")) {
            String[] am = s.split(":");
            String hours = am[0];
            String minute = am[1];
            String second = am[2].substring(0, 2);

            if (hours.contains("12")) {
                System.out.println("00:" + minute + ":" + second);
            } else {
                System.out.println(hours+ ":" + minute + ":" + second);
            }
        }
    }
}/*
    Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.
hh:mm:ssPM  2
        Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
        Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

        The **timeConversion** method should convert and print the given number (String argument)

        ```
        Input: 07:05:45PM

        Output: 19:05:45
        ```
        12:00:00AM>>>00:00:00
        12:00:00PM>>>12:00:00

        ```
        Input: 07:15:55AM

        Output: 07:15:55

 */
