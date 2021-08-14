package Replit.OOP.Value;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Value v = new Value(in.nextInt()); //val
        System.out.println(v.getVal());//val
        System.out.println(v.wasModified());//false
        v.setVal(in.nextInt());//
        System.out.println(v.getVal());
        System.out.println(v.wasModified());

    }
}
