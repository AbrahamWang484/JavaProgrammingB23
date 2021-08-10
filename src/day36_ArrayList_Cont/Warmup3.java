package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup3 {
    public static void main(String[] args) {
        ArrayList<String> n1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        n1.addAll(Arrays.asList("D", "E", "F", "G"));
        System.out.println(n1);

        int[] numbers = {1,2,3,4};

        ArrayList<Integer> list = new ArrayList<>();
      //  list.addAll(Arrays.asList(numbers)); compiler error, due to numbers is int,not Integer
//only can use for each loop to add into ArrayList
        for (int each :
                numbers) {
            list.add(each);
        }
        System.out.println(list);



    }
}
/*
 3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */