package day26_MultiDimensionalArray;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr2D= { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
               //each1D[]=  0           1                2
        int[][] arr2DA= new int[arr2D.length][arr2D.length];

        int i =0;//index for each1D
        for(int[]  each1D  :  arr2D ){
            //each1D[i++]=each1D;
            System.out.println();
        }
        arr2D[arr2D.length-1]=arr2D[0];

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("---------------------------");
        //int[][] arr2D= { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        // output:         3 2 1       8 7 6 5 4      13 12 11 10 9
/*
        for (int[] each1D : arr2D) {
            for (int each : each1D) {
                System.out.print(each+" ");
            }
            System.out.println();

 */

        }
    }

/*
Given:
		int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3

           task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */
