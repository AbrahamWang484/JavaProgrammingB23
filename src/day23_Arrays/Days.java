package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days ={"Mon","Tue","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);
    }
}
/*
Print the day of week
 */
