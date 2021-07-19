package day19_Loops;

import java.util.Scanner;

public class SumOf10Numbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sum =0;

        for (int i=1; i<=10;i++){
            System.out.println("Enter a number:");
            sum +=scan.nextInt();
        }
        System.out.println("SUM = " + sum);
    }
}

/*
ask user to enter a number 10 times . find the sum of 10 numbers
 */