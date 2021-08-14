package Replit.Methods;

import java.util.Scanner;

public class Countletters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        //step 1 =get unique letter
        String removeDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!removeDup.contains("" + str.charAt(i))) {
                removeDup += str.charAt(i);
            }
        }
        //step2 use each letter to find the frequency
        String result = "";
        for (int j = 0; j < removeDup.length(); j++) {
            char ch = removeDup.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i))
                    frequency++;
            }
            result += frequency +""+ ch; //step3 format output
        }
        return result;
    }
}


/*
        Write a method **countLetters** that can count letters in a given string and return a new string in the given format:

        ```
        number of letters + letter
        ```

        Example:

        ```
        input: countLetters("aaabbcccc");

        output: "3a2b4c"

 */