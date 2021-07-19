package day19_Loops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int min= 2147483647;// any user entered number will be less than 2147483647

        for (int i=0;i<5;i++){
            System.out.println("enter the number");
            int n = scan.nextInt();//100 300 5000 300 10

            if (n<min){
                min=n;//we will only replace min value if the user entered number is smaller
            }
        }
        System.out.println("min = " + min);

scan.close();

    }
}
/*
ask user to enter a number for 5 times,  then return the minimum number
 */
