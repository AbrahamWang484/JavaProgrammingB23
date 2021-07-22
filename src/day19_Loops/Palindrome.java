package day19_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //racecar

        String word= new Scanner(System.in).next().toLowerCase();
        String reverseWord="";

        for (int i= word.length()-1;i>=0;i--){
            reverseWord += word.charAt(i);
        }
//for case sensitive
        boolean isPalindrome = word.equals(reverseWord);

        System.out.println("isPalindrome = " + isPalindrome);

        if (isPalindrome){
            System.out.println(word+" is palindrome");
        }else{
            System.out.println(word+" is not palindrome");
        }

//level, mom

    }
}
