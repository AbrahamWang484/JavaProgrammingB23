package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("whats your hourly rate?");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int hrsInWeek = input.nextInt();

        System.out.println("How many weeks do you work in a year?");
        int weeksinYear = input.nextInt();

        double salary = hourlyRate*hrsInWeek*weeksinYear;
        System.out.println("salary = " + salary);
    }
}
/*
ask the user to enter:
    1.salary
    2.how many hours do you work in week
    3.how many week s do you work in a year
 */