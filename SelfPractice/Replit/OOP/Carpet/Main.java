package Replit.OOP.Carpet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0");
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println(df.format(c.totalPrice));

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println(df.format(c2.totalPrice));


    }
}
