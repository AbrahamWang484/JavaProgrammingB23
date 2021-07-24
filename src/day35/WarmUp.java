package day35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        //DateTimeFormatter DF= DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
        LocalDate[] arraysDate=new LocalDate[10];
        String[] array=new String[10];
        LocalDate now= LocalDate.now();
        for (int i = 0; i < arraysDate.length; i++) {
            arraysDate[i]=now.plusDays(i+1);
            //System.out.println(arraysDate[i].format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));
        }
        System.out.println(Arrays.toString(arraysDate));

        //System.out.println(Arrays.toString(array));
        for (LocalDate each : arraysDate) {
            System.out.println(each.format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));
        }
    }

}
/*
1. create an array of LocalDate and has the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday
 */