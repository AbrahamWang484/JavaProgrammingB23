package day60_Functional_Interface;

import Replit.Methods.LimitString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        list = list.stream().map(p -> (p % 2 != 0) ? p * 2 : p * 3).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("-------------------------------");
        List<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"));
        days = days.stream().map(p -> p.substring(0, 1)).collect(Collectors.toList());
        System.out.println(days);

        List<String> names1 = new ArrayList<>(Arrays.asList("java", "python", "ruby", "c#", "c++"));
        names1 = names1.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
        System.out.println(names1);

        System.out.println("---------------------------------");
        //distinct()  remove the duplicate element
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 5, 3, 7, 4, 3));
        nums = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(nums);

        Integer[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 2, 4, 5, 6, 7};
        arr = Arrays.asList(arr).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);//why here [0]???????
        System.out.println("****" + Arrays.toString(arr));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 1, 4, 5, 6, 7, 8));
        numbers = numbers.stream().distinct().filter(p -> p > 5).collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println("---------------------------------");
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Wang Yuliang", "Oz Hu", "Ma Lan", "Christan Sha", "John Jason", "Muhammad Ali", "Ma Ayesha"));
        students = students.stream().map(p -> p.charAt(0) + "." + p.charAt(p.indexOf(" ") + 1)).collect(Collectors.toList());
        System.out.println(students);



    }
}
