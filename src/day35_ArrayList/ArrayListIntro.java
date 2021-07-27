package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int[] nums = new int[10]; // size is 10 fixed
        System.out.println(Arrays.toString(nums));
        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(nums[2]); // 0

        System.out.println("----------------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>(); // size is 0
        numbers.add(10); // autoboxing,
        numbers.add(0, 20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(15);
        numbers.add(20);

        System.out.println(numbers);//[20, 10, 30, 40, 15, 20]
        System.out.println(numbers.get(2));//30

        System.out.println(numbers.size());//6

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");//20 10 30 40 15 20 20
        }
        System.out.println();
        for (Integer each : numbers) {
            System.out.print(each+" ");//20 10 30 40 15 20
        }

    }
}

