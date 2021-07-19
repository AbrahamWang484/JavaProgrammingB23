package day28_Methods;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }


    public static String mergeStrings(String one, String two) {
        String result = "";
        int max = 0;

        if (one.length() > two.length()) {
            max = one.length();
        } else {
            max = two.length();
        }
        for (int i = 0; i < max; i++) {
            if (i < one.length()) {
                result += one.charAt(i);
            }
            if (i < two.length()) {
                result += two.charAt(i);
            }
        }
        return result;


    }
}


