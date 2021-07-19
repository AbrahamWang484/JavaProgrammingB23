package day22_Recap;

import java.util.Scanner;

public class warmupTask3A {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer=scan.nextLine().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("Invalid input, Please re-enter the right answer");
            answer=scan.nextLine().toLowerCase();
        }

        if (answer.equals("yes")){
            System.out.println("Congrates!");
        }else {
            System.out.println("Please become excellent. Then come back try again");
        }

    }
}
/*
3. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
if the answer is yes, print "Congrats."
if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no

 */