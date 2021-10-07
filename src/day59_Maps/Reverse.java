package day59_Maps;

import day58_Maps.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        String a ="abcccddges";
        String reverse="";
        for (int i =a.length()-1;i>=0;i--){
            reverse+=a.charAt(i);
    }
        System.out.println(reverse);

        List<String> list= new ArrayList<>(Arrays.asList(a.split("")));
        Collections.reverse(list);
        System.out.println(list);
        System.out.println((list.toArray()).toString());
    }
}
