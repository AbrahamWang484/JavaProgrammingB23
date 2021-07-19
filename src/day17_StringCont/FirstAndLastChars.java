package day17_StringCont;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();

        scan.close();

        String first = word.substring(0, 1);
        String last = word.substring(word.length() - 1);

        if (first.equalsIgnoreCase(last)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        System.out.println("-------------------------");
        //method 2
        String first1 = word.substring(0, 1).toLowerCase();
        String last1 = word.substring(word.length() - 1).toLowerCase();

        if (first1.equals(last1)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
/*
write a program that can check if the first and last characters of the string are same
	            ex:
	                level
	            output:
	                same
 */
