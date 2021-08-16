package day37_CustomClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {
       int result= method4('z',"zebra");
        System.out.println(result);
    }
    public static int method4(char c, String s){
        if (s.contains(""+c)){
            return 1;
        }else {
            return 0;
        }
    }
}
