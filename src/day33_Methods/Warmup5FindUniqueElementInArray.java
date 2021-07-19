package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4};
        int[] result = {};

        for (int each : array) {
            if (frequency(array, each) == 1) {
               result = ArraysUtility.addElement(result,each);
            }
        }
        System.out.println(Arrays.toString(result));
    }


    public static int[] unique(int[] array){
        int[] result = {};

        for (int each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static double[] unique(double[] array){
        double[] result = {};

        for (double each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static String[] unique(String[] array){
        String[] result = {};

        for (String each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static char[] unique(char[] array){
        char[] result = {};

        for (char each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    public static int frequency ( int[] array, int num){
        int frequency = 0;
        for (int each : array) {
            if (each == num)
                frequency++;
        }
        return frequency;
    }
    public static int frequency ( double[] array, double num){
            int frequency = 0;
            for (double each : array) {
                if (each == num)
                    frequency++;
            }
            return frequency;
        }
    public static int frequency (String[]array, String word){
            int frequency = 0;
            for (String each : array) {
                if (each.contains(word))
                    frequency++;
            }
            return frequency;
        }
    public static int frequency ( char[] array, char ch){
            int frequency = 0;
            for (char each : array) {
                if (each == ch)
                    frequency++;
            }
            return frequency;
        }


}
/*
Task5:
        1. create a method that can return the unique elements from the array of integers
            Ex:
                int[] array = {1,1,2,3,3,4};

                unique(array) ==> {2, 4};

    2. create a method that can return the unique elements from the array of double

    3. create a method that can return the unique elements from the array of String

    4. create a method that can return the unique elements from the array of char
 */