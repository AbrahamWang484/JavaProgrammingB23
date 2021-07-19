package day25_ForEachLoop;

import java.util.Arrays;

public class exeWarmUp2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {5,6};
        int length1=arr1.length;
        int length2= arr2.length;

        int[] arr3=new int[arr1.length+ arr2.length];
        int j=0;
        for (int each : arr1) {
            arr3[j++]=each;
        }
        for (int each : arr2) {
            arr3[j++]=each;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
/*
	2. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4};
			arr2 = {5,6};

		output
			arr3 = {1,2,3,4,5,6}
 */