package day18_Recap;


import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        String email= new Scanner(System.in).next();//only use for one time, if for more than 2 times, please assign the virable.

        int indexOf_ =email.indexOf("_");//returns the index number of the underscore from the email
        int indexOfAt=email.indexOf("@");//returns the index number of the @ from the email
        String firstName=email.substring(0,indexOf_);
        String lastName=email.substring(indexOf_+1,indexOfAt);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String remaining= email.substring(indexOfAt);
        System.out.println(remaining);

        System.out.println(lastName+"_"+firstName+remaining);


    }
}
/*
1. EmailTask1:
			Assume that email address is constructed by person's first name and followed by an underscore and last name.
			Write a program that can swap first name with last name in the email (Separated by an underscore).
			If the email doesn't contain an underscore print the given input email.

			Ex:
				input: mike_tyson@gmail.com
				output: tyson_mike@gmail.com
 */
