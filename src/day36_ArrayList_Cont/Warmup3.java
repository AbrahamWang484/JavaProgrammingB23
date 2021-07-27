package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup3 {
    public static void main(String[] args) {
        ArrayList<String> n1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> n2 = new ArrayList<>(Arrays.asList("D", "E", "F", "G"));
        n1.addAll(n2);
        System.out.println(n1);
    }
}
/*
 3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */