package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        // >>>>>>>>>>>toString
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(array);

        System.out.println(Arrays.toString(array)); //int cannot directly print, must convert to String can print

        String[] array2 = new String[5];// create one empty String array

        System.out.println(array2); //here, array2 can directly print due to String dataType

        System.out.println(Arrays.toString(array2));//null

        double[] nums = new double[5];

        System.out.println(Arrays.toString(nums));//0.0

        // >>>>>>>>>>>>>>>>sort(): sorts the elements of the array in ascending order

        String[] students = {"Boburbek", "Aysu", "Abbos", "Sabir"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students); // the array is sorted in ascending order (a to z

        System.out.println(Arrays.toString(students));


        int[] numbers = {9, 10, 4, 1, 3, -1, 0, 1, 2};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println("Minimum number: " + numbers[0]);
        System.out.println("Maximum Number: " + numbers[numbers.length - 1]);

        char[] chars = {'z', 'b', 'k', 'a', 'c', 'y', 'x'};
        System.out.println(Arrays.toString(chars));

        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));





    }


}
