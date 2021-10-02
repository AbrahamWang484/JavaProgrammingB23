package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building Number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();// nextLine used after other next(), first should clear "enter"key

        System.out.println("Enter your Street Address:");
        String address = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your Zip code:");
        String zipCode = scan.next();

        scan.nextLine();// clear the memory;

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();//nextLine() used any other methoed, shoule first clear the momery

        String shippinginfo =fullName+ "\n"+buildingNumber+" "+address+"\n"+cityName+", "+state+" "+ zipCode;
        System.out.println(shippinginfo);

        scan.close();

    }
}
/*
shipping info as following:
builder number nextInt
Street add nextLline
city name nextLIne
State Next
zip code next
full name

Print the shipping info of the person
ex:
aysu ahmadil
2935 Jones Branch Drive
Mclean, VA 22012

 */
