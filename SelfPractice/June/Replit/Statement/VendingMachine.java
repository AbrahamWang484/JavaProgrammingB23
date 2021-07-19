package June.Replit.Statement;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int amount =scan.nextInt(),quarters, dimes, nickels, pennies; // e.g. amount =66

        if (amount<0 || amount>100){
            System.out.println("Invalid cents amount");
        }else{
            quarters=amount/25; // 66/25 =2 r 16;
            int afterQuatersRemaining=amount%25; //16cents remaining
            dimes=afterQuatersRemaining/10;//16/10=1 dimes r 6 cents
            int afterDimesRemaining=afterQuatersRemaining%10;// 6 cents
            nickels=afterDimesRemaining/5;//6/5=1 nickels r 1 cent
            pennies=afterDimesRemaining%5;//1 pennies
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");
        }
    }
}
/*
Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

  1. The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after

In valid cases print the change in this format:
Your change is x quarters, x dimes, x nickels, and x pennies

```
Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies

```
 */