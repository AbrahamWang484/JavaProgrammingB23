package day16_String;

import java.util.Scanner;

public class PrintLast3digit {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System. in);

        System.out.println("Enter a String:");
        String word= scan.next();

        String result ="";
        if (word.length()==0){ // word.isEmpty()
            result ="String is empty";
        }else if (word.length()>3){
            result= word.substring(word.length()-3);
        }else {
            result = word;
        }
        System.out.println(result);
        scan.close();
    }
}
/*
 write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
