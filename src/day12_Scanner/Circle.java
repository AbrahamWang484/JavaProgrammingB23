package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radium of circle");
        double radium = input.nextDouble();

        double perimeter = 2*Math.PI*radium;
        double area= Math.PI*Math.pow(radium,2);

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
/*
Circle: find the area and perimeter of circle
 */