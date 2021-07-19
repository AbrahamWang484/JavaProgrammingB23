package day22_Recap;

import java.util.Scanner;

public class warmupTask2A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println("Welcome to hotel! Would you want to reservation?");
        String answer = scan.nextLine().toLowerCase();

        while (!(answer.equals("yes")|| (answer.equals("no")))) { // its ||, not &&, to avoid others unwanted answer
            System.out.println("Invalid input, please try again, Would you like to make a reservation?");
            answer = scan.next().toLowerCase();
        }


        while (answer.equals("yes")) {
            System.out.println("Please select the bed type:");
            String bedType = scan.nextLine().toLowerCase();//>>>>>>>>>>>>>>>>> no need to clear the memory?

            if (bedType.equals("king bed")) {
                totalPrice += 120;
            } else if (bedType.equals("queen bed")) {
                totalPrice += 100;
            } else if (bedType.equals("single bed")) {
                totalPrice += 80;
            } else {
                System.out.println("Invalid input, Please select right room type");
            }

            System.out.println("Do you want to reserve another room?");
            answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("yes") || (answer.equals("no")))) {// its ||, not &&, to avoid others unwanted answer
                System.out.println("Invalid input, please try again");
                answer = scan.next().toLowerCase();
            }

        }

        System.out.println("Total Price is: $"+totalPrice);
    }

}
/*
2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
 */