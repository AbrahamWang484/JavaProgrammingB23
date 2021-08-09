package day31_Recap;


import java.util.Arrays;

public class MergeTwoIntArray {
    public static void main(String[] args) {
       int[]a = {1,2,3,4};
       int[]b = {4,16,1,2,3,22};

        System.out.println(Arrays.toString( mergeTwoArrays(a,b)));
//        System.out.println(Arrays.toString(c(a,b)));

    }
    public static int[] mergeTwoArrays(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        return c;
    }
}
/*
4. create a return method named merge that can merger two arrays of integers
 */