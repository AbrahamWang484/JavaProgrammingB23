package day29_ReturnMethods;

import java.util.Arrays;

public class returnMethod {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(maxNumberInArray1(array));
        System.out.println(maxNumberInArray2(array, array.length));
        System.out.println(minNumberInArray1(array));
        System.out.println(minNumberInArray2(array, array.length));

    }

    public static int maxNumberInArray1(int[] array) { //find the max number in size=n's array
        int max = array[0];
        for (int each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int maxNumberInArray2(int[] array, int n) {
        Arrays.sort(array);
        return array[n - 1];
    }

    public static int minNumberInArray1(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int minNumberInArray2(int[] array, int n){
        Arrays.sort(array);
        return array[0];

    }
}
 /*
 Maximum number in array
 Minimum number in array
  */