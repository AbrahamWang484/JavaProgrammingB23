package day13_Scanner;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your Salary:");
        int salary = scan.nextInt();

        System.out.println("Enter your gender");
        String gender = scan.next();

        scan.nextLine();//if nextLIne() is used after any other methods of scanner, we need to give
        // one more nextLine method to clear the scanner memory

        System.out.println("Enter your full name:");
        String fullName =scan.nextLine();


        System.out.println("Enter your job title:");
        String jobTitle= scan.nextLine();
        scan.close();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("jobTitle = " + jobTitle);
    }
}
