package day34_LocalDateTime_Wrapper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task {
    public static void main(String[] args) {
        DateTimeFormatter format= DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");

        LocalDateTime time = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(time.format(format));

    }
}
/*
1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */