package day13_Scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = input.nextDouble();
        double km = miles * 1.609;
        input.close();

        System.out.println(miles +" miles equal to "+km+" kilometers");

    }
}
/*
convert the mile to km
 */