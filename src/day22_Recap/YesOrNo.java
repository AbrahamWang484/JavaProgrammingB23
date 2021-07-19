package day22_Recap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        //condition
        while (!(answer.equals("yes") && answer.equals("no"))) {// to make the user enter yes or no
            System.out.println("Invalid entry, please try again");
        }

        if (answer.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("RIP");
        }

        scan.close();

    }
}
//1. consider the answer is valid, to make sure user enter the yes or no; 2.then write the statement about yes and no.
/*
3. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
if the answer is yes, print "Congrats."
if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no

 */