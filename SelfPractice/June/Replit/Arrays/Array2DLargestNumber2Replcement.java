package June.Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Arrays2DLargestNumber2Replcement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        int largestNum = arr[0][0];
        int[][] newArr = new int[rows][cols];
//step 1: find out largest number use if statement        //  0        1
        //                                                   0 1 2   0 1 2
        for (int i = 0; i < arr.length; i++) {           //[[1,2,3],[4,5,6]]
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>largestNum){
                    largestNum=arr[i][j];
                }
            }
        }

//        for (int[] arr1D : arr) {
//            for (int element : arr1D) {
//                if (element > largestNum)
//                    largestNum = element;
//            }
//        }

        //System.out.println(largestNum);

//step 2: replace all the elements with largest number.
        for (int i = 0; i < arr.length; i++) {  // 1D array>>>> 2 D array contains 2-1=1 D array
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = largestNum;
            }
        }

        System.out.println(Arrays.deepToString(arr));
        /*
        int max = arr[0][0];

        for (int[] arr1D : arr) {
            for (int element : arr1D) {
                if (element > max) {
                    max = element;
                }
            }
        }

        for (int[] arr1D : arr) {
            for (int element : arr1D) {
                element = max;
            }System.out.println(Arrays.toString(arr1D));
        }
        //FINAL PRINT

        System.out.println(Arrays.deepToString(arr));

         */
    }
}
/*
Given a 2d array of ints, find the biggest number(integer) and replace all array values on biggest number in the array then print an array.


Example:

```
Given values: [[1, 2, 3], [5, 33, 9]]

output: [[33, 33, 33], [33, 33, 33]]
```
 */