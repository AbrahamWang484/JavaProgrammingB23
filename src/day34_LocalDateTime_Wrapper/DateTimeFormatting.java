package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        //"MMM/dd/YYYY" or "MMMM/dd/YYYY"
        //"MMM/dd/YYYY E" OR "MMM/dd/YYYY EEEE" E FOR FULL NAME OF WEEK DAY
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");//here is default format for Moth/day/year
        LocalDate today = LocalDate.now();
        String todayStr = DF.format(today);
        System.out.println(today); //2021-07-22

        System.out.println(today.format(DF));//07/22/2021
        System.out.println(todayStr);//07/22/2021
        System.out.println(DF.format(today));////07/22/2021

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);//15:53:35.149
        System.out.println(currentTime.format(TF));//03:53 AM

        // 12 hours format with am or pm
        DateTimeFormatter TF1 = DateTimeFormatter.ofPattern("hh:mm a"); //here a for AM or PM
        LocalTime time1 = LocalTime.of(17, 25);
        System.out.println(time1.format(TF1));//05:25 PM

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE hh:mm");
        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);//2021-07-22T15:53:35.167
        System.out.println(a.format(DTF));//July/22/2021 Thursday 03:53

        System.out.println("----------------------");
        //Tuesday, 1:00 pm, Nov/24/2020
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime time2 = LocalDateTime.of(2021, 7, 23, 13, 0);

        System.out.println(time2);//2021-07-23T13:00
            System.out.println(time2.format(format)); //Friday, 01:00 PM, July/23/2021

        // what day is 2022-01-01
        String result = LocalDate.of(2022, 2, 28).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("result = " + result);//result = Monday
        System.out.println(nameOfTheDay(2025, 5, 28)); //Wednesday


    }

    public static String nameOfTheDay(int year, int month, int day) {
        String result = LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }
}



