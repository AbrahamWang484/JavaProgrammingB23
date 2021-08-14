package Replit.String;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();

        if ((length) % 2 != 0) {
            if (length >= 3) {
                String middleLetter = "" + word.charAt((length - 1) / 2);
                System.out.println(middleLetter);
            } else if (length == 1) {
                String letter = "" + word + word + word;
                System.out.println(letter);
            }
        } else {
            if (length >= 4) {
                String middleTwoLetter = "" + word.charAt(length / 2 - 1) + word.charAt(length / 2);
                System.out.println(middleTwoLetter);
            } else if (length == 2) {
                String twicecharacter = "" + word + word;
                System.out.println(twicecharacter);
            }
        }
    }
}
/*
You have a word, do the following:

1. When word has odd number of characters and:

 - 3 or more characters, print middle letter

      oak ==> a

      javav ==> v

- Single character, print that character 3 times

      # ==> ###

      q ==> qqq

2. When word has **even number of characters and:

 - 4 or more characters**, print the middle 2 characters

     java ==> av

     apples ==> pl

     #$%^&* ==> %^

 - 2 characters,** print those 2 characters twice

      @@ ==>@@@@

      $$ ==>$$$$
      hi ==> hihi
 */
