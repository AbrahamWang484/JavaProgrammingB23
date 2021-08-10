package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExe {
    public static void main(String[] args) {
      String result = LocalDate.of(1989,3,13).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("result = " + result);

        System.out.println(nameOfTheDay(1989,3,13));
    }

    public static String nameOfTheDay(int year, int month, int day){
        String result = LocalDate.of(year,month,day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }
}
