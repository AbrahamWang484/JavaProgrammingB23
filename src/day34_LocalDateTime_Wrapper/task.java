package day34_LocalDateTime_Wrapper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task {
    public static void main(String[] args) {
        DateTimeFormatter df= DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");

        LocalDateTime time = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(time.format(df));//星期二, 01:00 下午, 十一月/24/2020

    }
}
/*
1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */