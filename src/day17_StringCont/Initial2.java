package day17_StringCont;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        String initial = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        System.out.println("initial = " + initial);
        System.out.println("fullName = " + fullName);

        scan.close();
    }
}
/*
2. write a program that can return the initials of the user
	            ex:
	                cybertek
	                school
	            output:
	                C.S
 */