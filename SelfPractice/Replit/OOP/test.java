package Replit.OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<String>(Arrays.asList("Ab","cc","dd"));
        ArrayList<String> list2= new ArrayList<String>(Arrays.asList("Bb","qq","ww"));
        ArrayList<String> list3= new ArrayList<String>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}
