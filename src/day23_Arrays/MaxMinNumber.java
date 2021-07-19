package day23_Arrays;

public class MaxMinNumber {
    public static void main(String[] args) {
        int[] number={10, 5, 4 ,5, 77,55};
        int max =number[0];
        int min =number[0];

        for (int i = 0; i < number.length; i++) {
            int each =number[i];
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
// write a program that can find the maxium && minmum number from an array of integers.
//ex: array={10, 5, 4 ,5, 77,55}
//output:400

/*
>>>how to come true the function to compare each data in the array
compare each number[i] with first number in the array number[0];
use if loop, to filter out.
 */