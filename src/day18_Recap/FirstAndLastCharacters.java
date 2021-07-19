package day18_Recap;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your two words");
        String word1 = scan.next();//"one"
        String word2 = scan.next();//"eight ==>oneeight

       /* if (word1.charAt(word1.length()-1)==word2.charAt(0)){
            //last character of word1     == first character of word2
            System.out.println(word1+word2.substring(1));
        }else   {
            System.out.println(word1+word2);
        }

        */
        System.out.println("-----------------------");
        //if (word1.toLowerCase().endsWith(word2.substring(0,1).toLowerCase()))
        if (word1.substring(word1.length() - 1).equalsIgnoreCase("" + word2.charAt(0))) {
            System.out.println(word1 + word2.substring(1));

        } else {
            System.out.println(word1 + word2);


        }
    }
}
/*
2. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */