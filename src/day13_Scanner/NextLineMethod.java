package day13_Scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your job title:");
        String jobTitle = input.nextLine();
        input.close();

        System.out.println("jobTitle = " + jobTitle);

    }
}
