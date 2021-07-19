package day31_Recap;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
//        int[] reversedArray=new int[array.length];
//        for (int i = array.length-1, j=0; i >= 0; i--) {
//            reversedArray[j++]=array[i];//
//        }
        System.out.println(Arrays.toString(reversedIntArray(array)));
    }

    public static int[] reversedIntArray(int[] array) {
        int[] reversedIntArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reversedIntArray[j++] = array[i];//
        }
        return reversedIntArray;
    }
}
/*
6. create a return method named reverse that accepts one integer array then returns the reversed array
			ex:
				 array = {1,2,3,4,5}

				 reverse(array) ==> {5,4,3,2,1}
There are two ways to have a solution for the problem:

1. Reverse an array in space.

Step 1. Swap the elements at the start and the end index.

Step 2. Increment the start index decrement the end index.

Step 3. Iterate Step 1 and Step 2 till start index < end index

For this, the time complexity will be O(n) and the space complexity will be O(1)

Sample code for reversing an array in space is like:

public static int[] reverseAnArrayInSpace(int[] array) {
    int startIndex = 0;
    int endIndex = array.length - 1;
    while(startIndex < endIndex) {
        int temp = array[endIndex];
        array[endIndex] = array[startIndex];
        array[startIndex] = temp;
        startIndex++;
        endIndex--;
    }
    return array;
}
2. Reverse an array using an auxiliary array.

Step 1. Create a new array of size equal to the given array.

Step 2. Insert elements to the new array starting from the start index, from the given array starting from end index.

For this, the time complexity will be O(n) and the space complexity will be O(n)

Sample code for reversing an array with auxiliary array is like:

public static int[] reverseAnArrayWithAuxiliaryArray(int[] array) {
    int[] reversedArray = new int[array.length];
    for(int index = 0; index < array.length; index++) {
        reversedArray[index] = array[array.length - index -1];
    }
    return reversedArray;
}
 */