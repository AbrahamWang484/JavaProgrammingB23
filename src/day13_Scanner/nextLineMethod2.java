package day13_Scanner;

import java.util.Scanner;

public class nextLineMethod2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();//enter key

        System.out.println("YOur job title:");
        String jobTitle = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);


    }
}
