package day16_String;

import java.util.Scanner;

public class PrintRestButNotFirst {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String word1= scan.next();
        String word2= scan.next();

        String  result ="";
        if (word1.length()>=2 && word2.length()>=2){
            result = word1.substring(1)+word2.substring(1);
        }else {
            result ="Too Short";
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
