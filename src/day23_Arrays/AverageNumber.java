package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int[] numbers= new int[scan.nextInt()];// how to use scan for array

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {// used for getting the user inputs and store it into the array
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();//assign user input to the indexes of the array
            sum+= numbers[i];// returns the sum of the elements in the array
        }
        System.out.println("sum = " + sum);
        System.out.println("how many number:"+ numbers.length);
        double average=(double) sum/ numbers.length;
        System.out.println("average = " + average);
    }
}
/*
 4. AverageNumber
    		1. Ask the user how many numbers he/she wanst to enter
    		2. get all the inputs from the user
    		3. return the average number
 */