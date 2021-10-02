package day13_Scanner;

import java.util.Scanner; //java.util.* will include everything in the package, it will degrade the

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int cents = input.nextInt();//225,300
        input.close();
        int dollars = cents/100;//2,3
        int remainder = cents%100;//25,0

        if (cents>=0){//if the input is valid
            if(remainder == 0){
                System.out.println(cents+" cents equal to: "+dollars+" dollars");
            }else{
                System.out.println(cents+" cents equal to: "+dollars+" dollars and "+remainder+" cents");
            }
        }else{
            System.err.println("Invalid input");
        }

    }
}
/*
1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
			Ex:
				Enter cents
				225

				output:
				225 cents equal to: 2 dollars and 25 cents

				Enter cents
				300 cents equal to: 3 dolloars
 */
