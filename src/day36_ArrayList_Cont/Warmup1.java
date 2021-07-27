package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup1 {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        n1.set(n1.size()-1,0);
        System.out.println(n1);

    }
}
/*
 1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];
 */