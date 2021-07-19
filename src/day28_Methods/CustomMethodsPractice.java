package day28_Methods;

import java.util.Locale;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        grade(101);
        reverseString("Yuliang Wang");
        uniqueElementFromArray(new String[]{"apple", "apple", "orange", "orange", "cybertek school"});
        isPalindrome("solos");
        removeDuplicate("aaabbbcccdddfffeeekkjj");
        maxNumber(new int[]{1,2,3,4,5,6,7});
        minNumber(new int[]{1,2,3,4,5,6,7});

    }

    public static void grade(int score) {
        if (score>100 || score <0){ //presetting
            System.out.println("Invalid number");
            return; // exit the current method
        }

        if (score >= 90) {
            System.out.println("Your grade is A");
        } else if (score >= 80) {
            System.out.println("Your grade is B");
        } else if (score >= 70) {
            System.out.println("Your grade is C");
        } else if (score >= 60) {
            System.out.println("Your grade is D");
        } else{
            System.out.println("Your grade is F");
        }
    }

    public static void reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void uniqueElementFromArray(String[] array) {
        for (String each : array) {
            int count = 0;
            for (String element : array) {
                if (element.equals(each))
                    count++;
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }

    public static void isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (reverse.equals(word)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void removeDuplicate(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i)))
                result+=""+str.charAt(i);
        }
        System.out.println(result);
    }

    public static void maxNumber(int[] array){
        int maxNumber=array[0];
        for (int each : array) {
            if(each>maxNumber)
                maxNumber=each;
        }
        System.out.println(maxNumber);
    }

    public static void minNumber(int[] array){
        int minNumber=array[0];
        for (int each : array) {
            if(each<minNumber)
                minNumber=each;
        }
        System.out.println(minNumber);
    }
}
/*
6.calculate thee garde of the student based on the score
7.create a method that can reverse any String
8.write a method that can print out the unique elements from an array of string
9.write a method that can check if a string is palindrome, print true if it's  otherwise print false
 10. write a method that can remeove the duplicates from the string
            "abababa"
            "ab"

    11. wirte a method that can print out the maximum number from any array of integers

    12. wirte a method that can print out the minimum number from any array of integers
 */