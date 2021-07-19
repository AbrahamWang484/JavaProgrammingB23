package day22_Recap;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Enter two numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("sum: " + (num1 + num2));

            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {//not yes || not no
                System.out.println("Invalid input, Do you want to continue?");
                answer = scan.next().toLowerCase();
            }


        } while (answer.equals("yes"));

        System.out.println("THank you using our calculator");

        scan.close();
    }
}
/*
1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */