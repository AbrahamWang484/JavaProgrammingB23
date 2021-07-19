package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your First Name:");
        char firstName = scan.next().charAt(0);

        System.out.println("Enter your Last Name:");
        char lastName = scan.next().charAt(0);
        scan.close();


      /*
        char f= firstName.charAt(0);
        char l= lastName.charAt(0);


       */
        String initial = firstName+" . "+lastName;
        System.out.println("initial = " + initial);
    }
}
/*
ask user to enter:
 1. first name
 2. last name
 then print the initials

 ex: Daniel John
 */