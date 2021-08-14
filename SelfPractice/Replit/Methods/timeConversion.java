package Replit.Methods;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());


    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String hour=s.split(":")[0];
        int hourInt=Integer.parseInt(hour); //use parseInt() convert String to Int
        String mint=s.split(":")[1];
        String second=s.split(":")[2].substring(0,2);

        if (s.toLowerCase().contains("am")) {
            if(hourInt==12){
                System.out.println("00:"+ mint + ":" + second);
            }else {
                System.out.println(hour + ":" + mint + ":" + second);
            }

        }else{
            if(hourInt==12){
                System.out.println("12:"+ mint + ":" + second);
            }else{
                System.out.println(hourInt+12+ ":" + mint + ":" + second);
            }

        }


    }
}
/*
    Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

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