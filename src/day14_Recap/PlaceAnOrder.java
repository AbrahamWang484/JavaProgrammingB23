package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = input.nextLine();
        System.out.println("Enter the Price:");
        double price= input.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity =input.nextInt();
        double totalPrice = price * quantity;
        System.out.println("Enter your first name");
        String firstName =input.next();
        input.close();

        System.out.println(firstName+", your order for "+quantity+" "+ productName+" has been places. Your Total is "+totalPrice+".");

    }

    }

/*
PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */