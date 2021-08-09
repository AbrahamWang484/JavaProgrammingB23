package day32_MethodOverloading;

import java.util.Arrays;

public class RemoveElementAccIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        array = removeElement(array, 3);
        System.out.println(Arrays.toString(array));
    }

    //remove the specific index element from int array
    public static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    //remove the specific index element from double array
    public static double[] removeElement(double[] array, int index) {
        double[] newArray = new double[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    //remove the specific index element from String array
    public static String[] removeElement(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    //remove the specific index element from char array
    public static char[] removeElement(char[] array, int index) {
        char[] newArray = new char[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }
}
