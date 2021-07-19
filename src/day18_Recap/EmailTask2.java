package day18_Recap;

import java.util.Locale;
import java.util.Scanner;


public class EmailTask2 {
    public static void main(String[] args) {

        String email=new Scanner(System.in).next();

        int indexof_=email.indexOf("_");
        int indexOfAt= email.indexOf("@");
        int indexOfDot= email.indexOf(".");

        String firstName=email.substring(0,indexof_);
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();//by grouping it using charAt()
        System.out.println("firstName = " + firstName);

        String lastName=email.substring(indexof_+1,indexOfAt);//federighi
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();//how to make first letter is capitcal
        System.out.println("lastName = " + lastName);

        String domain= email.substring(indexOfAt+1,indexOfDot).toLowerCase();
        System.out.println("domain = " + domain);






    }
}
/*
2. EmailTask2:
		Assume that email address is constructed by person's first name and followed by an underscore and last name.
		Write a program that will print out information about user based on email. Print first name, last name, and domain.
	   	First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

   			Ex:
   				input:
   					craig_federighi@apple.com

				Output:
					First name: Craig
					Last name: Federighi
					Domain: apple
 */
