package day60_Functional_Interface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class BuildInFunctionalInterface2 {
    public static void main(String[] args) {
        //create a function that can reverse a String
        Function<String, String> reverseString = p -> new StringBuilder(p).reverse().toString();
        System.out.println("reverseString.apply(\"Cybertek\") = " + reverseString.apply("Cybertek"));

        //create a function that can check if the String is palindrome
        Function<String, Boolean> isPalindrome = p -> {
            String r = reverseString.apply(p);
            return r.equalsIgnoreCase(p);
        };
        System.out.println("isPalindrome.apply(\"level\") = " + isPalindrome.apply("level"));
        //create a function that can return the maximum number from array of integers
        Function<Integer[], Integer> maxNumber = p -> {
            Arrays.sort(p);
            return p[p.length - 1];
        };
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("MaxNumberFrom Array = " + maxNumber.apply(arr));

        //create a function that can return the maximum number from ArrayList of integers
        Function<ArrayList<Integer>, Integer> maxNumberFromList = p -> {
            Collections.sort(p);
            return p.get(p.size() - 1);
        };
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println("maxNumberFromList.apply(list) = " + maxNumberFromList.apply(list));

        System.out.println("------------------------------------");
        //BiConsumer<>
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Wang", 31);
        map.put("Ma", 15);
        map.put("Abraham", 22);
        map.put("Ivan", 24);
        map.put("Osama", 55);
        map.forEach((k,v)->{
            System.out.println(k+"'s age : "+v);
        });
        System.out.println("--------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //create a function atah can repeat the given String for the given number of times
        BiConsumer<String, Integer> printMultipleTimes=(s,n)->{
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
        };
        printMultipleTimes.accept("java",3);




    }
}
