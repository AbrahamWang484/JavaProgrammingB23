package day13_Scanner;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item:");
        double price = input.nextDouble();
        System.out.println("Are you a prime member?");
        boolean isPrime = input.nextBoolean();
        input.close();

        double totalPrice = (isPrime)? price : price+3.99;
        System.out.println("totalPrice = $" + totalPrice);
    }
}
