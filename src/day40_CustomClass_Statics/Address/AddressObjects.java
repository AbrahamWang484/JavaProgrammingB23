package day40_CustomClass_Statics.Address;

import java.util.Scanner;

public class AddressObjects {
    public static void main(String[] args) {
        Address  address= new Address();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();

        scan.nextLine();
        System.out.println("Enter your Street Name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your city Name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state Name:");
        String state = scan.nextLine();

        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();

        address.setInfo(buildingNumber,streetName,cityName,state,zipCode);

        System.out.println(address);





    }
}
