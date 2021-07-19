package day25_ForEachLoop;

import java.util.Arrays;

public class warmUp2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int newArrayLength = arr1Length + arr2Length;

        int[] arr3 = new int[newArrayLength]; // get new arr3 match same capacity

        int j = 0;                            //set j as index number for arr3
        for (int i = 0; i < arr1.length; i++) { //for arr1
            arr3[j++] = arr1[i];   //retrieves each element from aar1 and assign to the index of arr3
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];//retrieves each element from aar2 and assign to the index of arr3
       //arr3[arr1Length+i]
        }
        System.out.println(Arrays.toString(arr3));
    }
}
/*
2. write a program that can merge two arrays of integers
        Ex:
            2. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6};

        output
            arr3 = {1,2,3,4,5,6}
            arr2 = {5,6};

        output
            arr3 = {1,2,3,4,5,6}
 */
