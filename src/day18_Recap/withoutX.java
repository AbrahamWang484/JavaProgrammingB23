package day18_Recap;

import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter a word:");
        String word =scan.next();

        //  if (word.charAt(0)=='x');
        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
        scan.close();

        System.out.println("---------------");

        String sentence ="I love Java programming language";

        //java or Java==> has Java
        //otherwise ==> does not hava Java

        if (sentence.toLowerCase().contains("java")){
            System.out.println("Has Java");
        }else {
            System.out.println(" Does not have Java");
        }

        System.out.println("---------------");

        String s1 ="I love cats and dogs";
        // boolean lovesCats = s1.equalsIgnoreCase("cats");//verifies if s1 IS "cats
        boolean lovesCats1=s1.toLowerCase().contains("cats");//verifies if s1 HAS "cats"


    }
}
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */