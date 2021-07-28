package day34_LocalDateTime_Wrapper;

import java.util.ArrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {
        short s = 10;
        int num = s;
        Integer num2 = (int)s; //Autoboxing: converting primitive value to wrapper class value
        Integer num3 = num;
        // int need casting to Integer
        char ch = '@';
        Character ch2 = (Character) ch; // Autoboxing


        Byte b1 = 10;
        //Byte can directly wrapped to byte
        byte b2 = b1;  // unboxing
        short b3 = b1;  // unboxing
        int b4 = b1; // unboxing
        int sum = b4 + 1;

        long b5 = b1; // unboxing
        float b6 = b1; // unboxing
        double b7 = b1; // unboxing

        System.out.println("------------------------------------------------");

        byte c1 = 10;

        Byte c2 = c1; // Autoboxing,


        //  Short c3 = c1; //Short wrapper class only accepts short primitive
        //  Integer c4 = c1; //Integer wrapper class only accepts int primitive
        //  Long c5 = c1; //Long wrapper class only accepts long primitive
        // Float c6 = c1;
        //  Double c7 = c1;
        System.out.println(c2);



    }
}
