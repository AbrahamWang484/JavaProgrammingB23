package day12_Scanner;

import java.util.Scanner;

public class ScannerRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the width of rectangle");
        int width = scan.nextInt();
        System.out.println("Enter the longth of rectangle");
        int longth = scan.nextInt();
        scan.close();

        int area =width* longth;
        int perimeter = (width + longth)*2;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
