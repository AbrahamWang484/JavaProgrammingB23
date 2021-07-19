package day19_Loops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        String result ="";
//remove the duplicates logic
        if (word.length()==5) {
            // if the charAt(0) did not contained the letter is true, then concatenate it.
            if (!result.contains("" + word.charAt(0))) {
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(1))) {
                result += word.charAt(1);
            }
            if (!result.contains("" + word.charAt(2))) {
                result += word.charAt(2);
            }
            if (!result.contains("" + word.charAt(3))) {
                result += word.charAt(3);
            }
            if (!result.contains("" + word.charAt(4))) {
                result += word.charAt(4);
            }


        }else if (word.length()>5) {
            result ="Too long";
        }else { //word.length()<5
            result ="Too short";
        }
        System.out.println("result = " + result);
    }
}
/*
 ask the user to enter a word. the word must be five characters long and print the word without the duplicated characters,
 but if the word is less than five characters long, print "Too Short." and if the word is more than five characters long,
 print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc
 */
//for remove the duplicates see summary:
// https://www.javatpoint.com/java-program-to-remove-duplicate-characters-from-a-string