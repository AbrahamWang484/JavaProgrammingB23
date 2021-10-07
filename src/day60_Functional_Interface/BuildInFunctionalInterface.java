package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildInFunctionalInterface {
    public static void main(String[] args) {

        //create a function that can check if the number is even;
        Predicate<Integer> isEven = p -> p % 2 == 0 ? true : false;
        boolean r1 = isEven.test(101);
        System.out.println(r1);

// create a funciton that can check if a string is palindrome
        DataFunction<String> reverseString = (s) -> new StringBuffer(s).reverse().toString();
        Predicate<String> isPalindrome = p -> reverseString.accept(p).equalsIgnoreCase(p);
        boolean r2 = isPalindrome.test("level");
        System.out.println(r2);

//removeIf(Predicate)
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       // Predicate<Integer> isOdd=p -> p%2!=0?true:false;
       // list.removeIf(isOdd);
        list.removeIf( p-> p%2!=0?true:false); //for one time use
        System.out.println(list);

        System.out.println("------------------------");
        List<String> list1 = new ArrayList<>(Arrays.asList("level","apple","civic","teacher"));
        list1.removeIf(isPalindrome);
        System.out.println("list1 = " + list1);

        System.out.println("------------------------");
        //create a function that can print the String 3 times
        Consumer<String> printThreeTimes = s -> System.out.println(s+s+s );
        printThreeTimes.accept("Wang");

        System.out.println("------------------------");
        //Create a function that can print each Character of a list of string
        Consumer<List<String>> printEach= l -> {
            for (String s : l) {
                System.out.println(s);
            }
        };
        printEach.accept(list1);

        System.out.println("------------------------");
        //forEach()
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        for (Integer each : list2) {
//            System.out.println(each*2);
//        }
        list2.forEach(n -> System.out.println(n*2));

        System.out.println("------------------------");
        List<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("java","wang","c","java","wood","good"));
        //print each unique elements
        Predicate<String> isUnique= p-> Collections.frequency(words,p)==1;
        isUnique.test("java");
        words.forEach(p->{ if( isUnique.test(p)) System.out.println(p);
        });

        System.out.println("------------------------");
        //create function that can print array of integer in descending order
        Consumer<int[]> printInDescendingOrder= p->{
            Arrays.sort(p);
            for (int i = p.length - 1; i >= 0; i--) {
                System.out.print(p[i]+" ");
            }
        };
        int[] arr={1,3,5,2,1,6};
        printInDescendingOrder.accept(arr);


        System.out.println();
        System.out.println("------------------------");
        //print out the odd number
        List<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7,8,9));
        nums.forEach(p-> {if (p%2!=0) System.out.print(p+" ");});


    }
}
