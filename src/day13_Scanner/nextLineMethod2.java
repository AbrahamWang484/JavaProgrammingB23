package day13_Scanner;

import java.util.Scanner;

public class nextLineMethod2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();//accept enter key>>>>must be used before scan.nextLine() to clear the memory

        System.out.println("YOur job title:");
        String jobTitle = input.nextLine();
        input.close();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);


    }
}
