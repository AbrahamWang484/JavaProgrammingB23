package day22_Recap;

import java.util.Scanner;

public class warmUpTask1A {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String answer="";
        do {
            System.out.println("Enter two numbers:");
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            System.out.println("Sum :"+(num1+num2));
            System.out.println("Do you want to continue?");
            answer=scan.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid input, do you want to continue?");
                answer=scan.next().toLowerCase();
            }
        }while (answer.equals("yes"));
        System.out.println("Thank you using our calculator");
        scan.close();
    }
}
/*
1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */