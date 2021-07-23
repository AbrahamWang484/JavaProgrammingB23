package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        String[] names={"John","Dannel","Oz","Wang","Ibrahim"};
        LocalDate[] DOB={
                LocalDate.of(1990,1,1),
                LocalDate.of(1991,1,1),
                LocalDate.of(1992,1,1),
                LocalDate.of(1993,1,1),
                LocalDate.of(1994,1,1),
        };
        int index = 0;
        LocalDate youngest = DOB[0];

        for (int i = 0; i < 5; i++) {
            if (DOB[i].isAfter(DOB[0])){
                youngest=DOB[i];
                index = i;
            }
            if (DOB[i].isLeapYear()){
                System.out.println(names[i] +" 's birth year is leap year");
            }
        }
        System.out.println(names[index]+" is youngest, his birthday is "+ DOB[index]);

        System.out.println("--------------------");
        DateTimeFormatter DF=DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" was born on "+DOB[i].format(DF));
        }
    }

}
/*
Task:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains thier DofB

    3. find out who is the youngest person

    4. find out who was born on leap year
 */