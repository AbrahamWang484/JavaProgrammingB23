package day20_WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int result = 0;
        //How to create the infinite number for loop
        for (int i = 0; i == 0; ){ //for( ; ; ;){
            System.out.println("Enter a number");
            int n= scan.nextInt();

            if (n<0){ // if user entered a negative number
                break;
            }

            result += n ; //not include the negative number , should place after the if statement

        }
        System.out.println("result = " + result);

        scan.close();
    }
}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */