package day33_Methods;

import java.util.Arrays;

public class reverseMethod {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reversedArray(array)));

        char[] chars = {'A', 'B', 'C'};
        chars = reversedArray(chars);
        System.out.println(Arrays.toString(chars));
    }
    //create a method that can reverse an array of integer
    public static int[] reversedArray(int[] array){
        int[] reversedArray=new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;
    }
    //create a method that can reverse an array of double
    public static double[] reversedArray(double[] array){
        double[] reversedArray=new double[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;
    }
    //create a method that can reverse an array of String
    public static String[] reversedArray(String[] array){
        String[] reversedArray=new String[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;
    }
    //create a method that can reverse an array of char
    public static char[] reversedArray(char[] array){
        char[] reversedArray=new char[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;
    }
    
}
/*
Task 1:
    1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char
 */