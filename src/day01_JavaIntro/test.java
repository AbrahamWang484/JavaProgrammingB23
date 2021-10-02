package day01_JavaIntro;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Random;

public class test {
    public static void main(String[] args) {

        Calendar myCal = Calendar.getInstance();

        Random myRandom = new Random();
        BigDecimal Value1 = new BigDecimal(3.44442f);
        System.out.println(Value1);
        System.out.println("myRandom = " + myRandom);
        System.out.println("myCal = " + myCal.toString());
    }
}
