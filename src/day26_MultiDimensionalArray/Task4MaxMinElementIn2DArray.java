package day26_MultiDimensionalArray;

public class Task4MaxMinElementIn2DArray {
    public static void main(String[] args) {
        int[][] array = {{10, 20, 30}, {40, 50, 60, 70, 80}};

        int max = array[0][0];
        int min = array[0][0];
        int sum=0;
        int count=0;
        for (int[] array1D : array) {
            for (int element : array1D) {
                count++;
                sum+=element;
                if (element > max)
                    max = element;
                if (element < max) ;
                    min = element;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println("Average:"+(sum/(double)count));
    }
}
/*
 4 write a program that can find the maximum & minimum number from any two dimensional array
                {{10,20,30},{40,50,60,70,80}};
                max: 80
                min: 10
                sum
                average
 */