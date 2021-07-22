package day23_Arrays;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        // initiliazing three object arrays
        Object[] arr1 = new Object[] { 1, 123 };
        Object[] arr2 = new Object[] { 1, 123, 22, 4 };
        Object[] arr3 = new Object[] { 1, 123 };

        // comparing arr1 and arr2
        boolean retval = Arrays.equals(arr1, arr2);
        System.out.println("arr1 and arr2 equal: " + retval);

        // comparing arr1 and arr3
        boolean retval2 = Arrays.equals(arr1, arr3);
        System.out.println("arr1 and arr3 equal: " + retval2);

        System.out.println("---------------------");
        // equals(arr1, arr2)
        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 2, 3};

        int[] num3 = {3, 2, 1};
        int[] num4 = {2, 3, 1};

        boolean r1 = Arrays.equals(num1, num2); //true
        boolean r2 = Arrays.equals(num2, num3);//false

        Arrays.sort(num3); // num3 will be in ascending order, {1,2,3}
        Arrays.sort(num4); // num4 will be in ascending order, {1,2,3}
        boolean r3 = Arrays.equals(num3, num4);

        System.out.println("r1 = " + r1);//true
        System.out.println("r2 = " + r2);//false
        System.out.println("r3 = " + r3);//true
    }
}
//https://www.tutorialspoint.com/java/util/arrays_equals_object.htm