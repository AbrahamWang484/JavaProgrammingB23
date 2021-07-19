package day13_Scanner;

import java.util.Scanner;

public class ScanName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your first name");
        String firstName =scan.next();
        System.out.println("Enter your last name");
        String lastName =scan.next();

        String fullName = firstName+" "+lastName;
        System.out.println("fullName = " + fullName);

        //for next(), only save first word, you can not save the more than one word, due to memory.
        //for sentence, should use nextLine()

    }
}
