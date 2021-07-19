package day24_ArraysContinue;

import java.util.Arrays;

public class WarmupTask1_PrintFirst3Ch {
    public static void main(String[] args) {
        String[] classmate={"wang","zhang","liu","Syed","Muhammad","Yuliang","Machao","Yasin","Yasmi","Jamilla"};
// how to print the array, use Array Utility import
        System.out.println(Arrays.toString(classmate));
//print first 3 letters use subString function
        for (int i = 0; i < classmate.length; i++) {
            System.out.println(classmate[i].substring(0,3));
        }
    }
}
/*
1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name
 */