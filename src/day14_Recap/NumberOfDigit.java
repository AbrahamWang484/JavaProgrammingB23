package day14_Recap;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int n =input.nextInt();
        input.close(); //if not close, the scanner function will still working, so the memory still has data inside
        if(n>=1 && n<=100000){
            if(n<=9){
                System.out.println("1 digit");
            }else if (n<=99){
                System.out.println("2 digit");
            }else if (n<=999){
                System.out.println("3 digit");
            }else if (n<9999){
                System.out.println("4 digit");
            }else if (n<99999){
                System.out.println("5 digit");
            }else {
                System.out.println("6 digit");
            }
        }else {
            System.out.println("Invalid Number");

        }
    }
}
/*
Given a number(int) determine and print how many digits it has.
            - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

            Ex: 124 --> 3 digits
                13213 --> 5 digits
                883218 --> Invalid number
                23 --> 2 digits
                9 --> one digit
                15 --> 2 digits
 */