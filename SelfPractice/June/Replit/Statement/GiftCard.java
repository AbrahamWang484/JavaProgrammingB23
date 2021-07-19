package June.Replit.Statement;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String item = scan.nextLine().toLowerCase();
        int balance=100;

        if(item.equals("Laptop")||item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equals("Blanket")){
            System.out.println("Thank you for your purchase! ");
            balance = 100-60;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            balance =100-15;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("Hat")) {
            System.out.println("Thank you for your purchase! ");
            balance =100 - 25;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("Headphones")) {
            System.out.println("Thank you for your purchase! ");
            balance =100 - 30;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("Pants")) {
            System.out.println("Thank you for your purchase! ");
            balance =100 - 50;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("Pillow")) {
            System.out.println("Thank you for your purchase! ");
            balance =100 -40;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("Socks")) {
            System.out.println("Thank you for your purchase! ");
            balance =100 - 5;
            System.out.println("Your current balance is: "+balance+"$");
        }else if(item.equals("USB cable")) {
            System.out.println("Thank you for your purchase! ");
            balance =100 - 10;
            System.out.println("Your current balance is: "+balance+"$");
        }else{
            System.out.println("Invalid item!");
        }
    }
}
