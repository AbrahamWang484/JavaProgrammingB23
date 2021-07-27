package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup2 {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < n1.size(); i++) {
            if (n1.get(i)%2!=0){
                n1.set(i, n1.get(i) * 2);
            }
        }
        System.out.println(n1);
    }
}
//not sugeest to add one more ArrayList,it will increase the memory

/*
 2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */