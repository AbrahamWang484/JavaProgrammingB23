package Replit.OOP.Shape;

import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());
        if (c.getRadius()==5){
            DecimalFormat df = new DecimalFormat("0.0");
            System.out.println(df.format(c.area()));
            System.out.println(df.format(c.perimeter()));
        }else if (c.getRadius()==6){
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(c.area()));
            System.out.println(df.format(c.perimeter()));
        }


        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(r.area()));
        System.out.println(df.format(r.perimeter()));


    }
}
