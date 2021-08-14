package Replit.Methods;

import java.util.Scanner;

public class PrintUniqueNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

//    public static void printUniqueNumbers(int[] nums){
//        //WRITE YOUR CODE HERE
//
//
//    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for (int each : nums) { // getting each elements
            if(  frequency(nums, each)  == 1   ){ // unique element
                System.out.println(each);
            }
        }

    }
    public static int frequency(int[] array, int element){
        int count = 0;

        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }
}
/*
Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints. Every single unique int should be printed from the new line.`
Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */