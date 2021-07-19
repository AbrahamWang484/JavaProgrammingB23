package June.Replit.String;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word= scan.nextLine();//you
        String sentence= scan.nextLine();//I love you

        boolean iscontain= sentence.contains(word);
        System.out.println(iscontain);
    }
}
/*
Write a program that will verify if the **sentence** contains **word**. Print out the result as a boolean value.
 */