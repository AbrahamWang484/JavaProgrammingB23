package day24_ArraysContinue;

import java.util.Arrays;

public class WarmupTask4_ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reversedArray= new int[array.length];

        //print array starting from first element
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for (int i = array.length - 1,j=0; i >= 0; i--,j++){//i is the index numbers of array starting from last index
            //j is the index numbers of reversedarray starting from 0
            //here, in condition , no need give the true or flase to j, due to i & j has same numbers rang
            reversedArray[j]=array[i];
        }
            System.out.print(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));
    }


}
/*
4. Write a program that can reverse an array of integers
		ex:
			array = {1,2,3,4,5};

		output:
			reversedArray = {5,4,3,2,1};
 */