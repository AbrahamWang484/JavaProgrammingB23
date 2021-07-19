package day22_Recap;

import java.util.Locale;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String answer="";

        do{
            System.out.println("Enter two numbers:");
            int n1 =scan.nextInt();
            int n2 =scan.nextInt();

            System.out.println("Addition: "+(n1+n2));

            System.out.println("Do you want to continue?");
            answer=scan.next().toLowerCase();

            while(!(answer.equals("yes")||answer.equals("no"))){// to make sure user will only enters Yes or No
                System.out.println("Do you want to continue?");
                answer=scan.next().toLowerCase();
            }

             /*
            System.out.println("Do you want to continue?");
            answer= scan.next().toLowerCase();

            //nested loop>>>>>>>when check the answer is valid or not, use nested loop, which means loop in loop
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid Answer, Please re-enter!");
                System.out.println("Do you want to continue?");
                answer=scan.next().toLowerCase();
            }

            */

        } while(answer.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using our calculator");
        scan.close();
    }
}
/*
1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */