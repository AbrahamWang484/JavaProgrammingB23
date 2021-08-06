package day40_CustomClass_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {

    public static int a = 11; // if initilization can be done 1 line,  do  not use block
    // public static Excel excelData =

    public static ArrayList<String> list = new ArrayList<>();

    static{ // first to run, ONLY runs one time
        list.addAll(Arrays.asList("A", "B", "C"));

    }




/*
    public static void main(String[] args) {
        list.addAll(Arrays.asList("A", "B", "C"));
    }
*/




}